package edu.uoc.som.cmsdiscover.generator;

import com.google.common.collect.Iterables;
import edu.uoc.som.cmsdiscover.generator.DriverInterface;
import edu.uoc.som.cmsdiscover.generator.DriverTemplate;
import edu.uoc.som.cmsdiscover.generator.EntityTemplate;
import edu.uoc.som.cmsdiscover.generator.GenericEntityTemplate;
import edu.uoc.som.cmsdiscover.generator.PomTemplate;
import edu.uoc.som.cmsdiscover.generator.TestsTemplate;
import java.io.ByteArrayInputStream;
import java.util.Map;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.EMap;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.EcoreResourceFactoryImpl;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.InputOutput;
import org.eclipse.xtext.xbase.lib.IterableExtensions;

@SuppressWarnings("all")
public class CodeGenerator {
  private PomTemplate pomTemplate = new PomTemplate();
  
  private TestsTemplate testsTemplate = new TestsTemplate();
  
  private DriverTemplate driverTemplate = new DriverTemplate();
  
  private DriverInterface interfaceTemplate = new DriverInterface();
  
  private GenericEntityTemplate genericTemplate = new GenericEntityTemplate();
  
  private EPackage thePackage;
  
  private Resource model;
  
  private EPackage modelPackage;
  
  public void doGenerate(final EPackage input, final IFolder srcGenFolder, final IProject project) {
    try {
      if (((input != null) && (input instanceof EPackage))) {
        this.thePackage = ((EPackage) input);
        final Iterable<EClass> eClasses = Iterables.<EClass>filter(this.thePackage.getEClassifiers(), EClass.class);
        final Function1<EClass, String> _function = (EClass it) -> {
          return it.getName();
        };
        final Iterable<String> classesName = IterableExtensions.<EClass, String>map(eClasses, _function);
        final EMap<String, String> sourceCmsInformation = this.thePackage.getEAnnotations().get(0).getDetails();
        this.generateDrivers(input, srcGenFolder);
        InputOutput.<String>println("Generating");
        for (final EClass modelClass : eClasses) {
          {
            final EList<EClass> superClasses = modelClass.getESuperTypes();
            final EMap<String, String> classAnnotation = modelClass.getEAnnotations().get(0).getDetails();
            for (final Map.Entry<String, String> detail : sourceCmsInformation) {
              classAnnotation.put(detail.getKey(), detail.getValue());
            }
            String _name = this.thePackage.getName();
            String _plus = ("generated.middleware." + _name);
            final EntityTemplate template = new EntityTemplate(modelClass, classAnnotation, classesName, _plus);
            final CharSequence content = template.generateEntitiesClasses();
            String _name_1 = modelClass.getName();
            String _plus_1 = (_name_1 + ".java");
            final IFile resultFile = srcGenFolder.getFile(_plus_1);
            byte[] _bytes = content.toString().getBytes();
            ByteArrayInputStream _byteArrayInputStream = new ByteArrayInputStream(_bytes);
            NullProgressMonitor _nullProgressMonitor = new NullProgressMonitor();
            resultFile.create(_byteArrayInputStream, IResource.FORCE, _nullProgressMonitor);
          }
        }
        final IFolder testFolder = project.getFolder("test");
        boolean _exists = testFolder.exists();
        boolean _not = (!_exists);
        if (_not) {
          NullProgressMonitor _nullProgressMonitor = new NullProgressMonitor();
          testFolder.create(true, true, _nullProgressMonitor);
        }
        final IFile testFile = srcGenFolder.getFile("mainTest.java");
        final CharSequence testcontent = this.testsTemplate.getTest();
        byte[] _bytes = testcontent.toString().getBytes();
        ByteArrayInputStream _byteArrayInputStream = new ByteArrayInputStream(_bytes);
        NullProgressMonitor _nullProgressMonitor_1 = new NullProgressMonitor();
        testFile.create(_byteArrayInputStream, IResource.FORCE, _nullProgressMonitor_1);
        final IFile pomFile = project.getFile("pom.xml");
        final CharSequence pomContent = this.pomTemplate.getPom();
        byte[] _bytes_1 = pomContent.toString().getBytes();
        ByteArrayInputStream _byteArrayInputStream_1 = new ByteArrayInputStream(_bytes_1);
        NullProgressMonitor _nullProgressMonitor_2 = new NullProgressMonitor();
        pomFile.create(_byteArrayInputStream_1, IResource.FORCE, _nullProgressMonitor_2);
      }
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  public void generateDrivers(final EPackage input, final IFolder srcGenFolder) {
    try {
      final IFolder driversFolder = srcGenFolder.getFolder("drivers");
      boolean _exists = driversFolder.exists();
      boolean _not = (!_exists);
      if (_not) {
        NullProgressMonitor _nullProgressMonitor = new NullProgressMonitor();
        driversFolder.create(true, true, _nullProgressMonitor);
      }
      final CharSequence interface_ = this.interfaceTemplate.generate(this.thePackage.getName());
      final IFile interfaceFile = driversFolder.getFile("DriverInterface.java");
      byte[] _bytes = interface_.toString().getBytes();
      ByteArrayInputStream _byteArrayInputStream = new ByteArrayInputStream(_bytes);
      NullProgressMonitor _nullProgressMonitor_1 = new NullProgressMonitor();
      interfaceFile.create(_byteArrayInputStream, IResource.FORCE, _nullProgressMonitor_1);
      final CharSequence driver = this.driverTemplate.generateDriver(this.thePackage);
      final IFile resultDriver = driversFolder.getFile("DrupalDriver.java");
      byte[] _bytes_1 = driver.toString().getBytes();
      ByteArrayInputStream _byteArrayInputStream_1 = new ByteArrayInputStream(_bytes_1);
      NullProgressMonitor _nullProgressMonitor_2 = new NullProgressMonitor();
      resultDriver.create(_byteArrayInputStream_1, IResource.FORCE, _nullProgressMonitor_2);
      final CharSequence genericAttribute = this.genericTemplate.generateGenericAttribute(input);
      final IFile resultAttribute = driversFolder.getFile("GenericAttribute.java");
      byte[] _bytes_2 = genericAttribute.toString().getBytes();
      ByteArrayInputStream _byteArrayInputStream_2 = new ByteArrayInputStream(_bytes_2);
      NullProgressMonitor _nullProgressMonitor_3 = new NullProgressMonitor();
      resultAttribute.create(_byteArrayInputStream_2, IResource.FORCE, _nullProgressMonitor_3);
      final CharSequence genericReference = this.genericTemplate.generateGenericReference(input);
      final IFile resultReference = driversFolder.getFile("GenericReference.java");
      byte[] _bytes_3 = genericReference.toString().getBytes();
      ByteArrayInputStream _byteArrayInputStream_3 = new ByteArrayInputStream(_bytes_3);
      NullProgressMonitor _nullProgressMonitor_4 = new NullProgressMonitor();
      resultReference.create(_byteArrayInputStream_3, IResource.FORCE, _nullProgressMonitor_4);
      final CharSequence genericEntity = this.genericTemplate.generateGenericEntity(input);
      final IFile resultEntity = driversFolder.getFile("GenericEntity.java");
      byte[] _bytes_4 = genericEntity.toString().getBytes();
      ByteArrayInputStream _byteArrayInputStream_4 = new ByteArrayInputStream(_bytes_4);
      NullProgressMonitor _nullProgressMonitor_5 = new NullProgressMonitor();
      resultEntity.create(_byteArrayInputStream_4, IResource.FORCE, _nullProgressMonitor_5);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  public EPackage loadModel(final IPath path) {
    final URI uri = URI.createPlatformResourceURI(path.toString(), true);
    Map<String, Object> _extensionToFactoryMap = Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap();
    EcoreResourceFactoryImpl _ecoreResourceFactoryImpl = new EcoreResourceFactoryImpl();
    _extensionToFactoryMap.put("ecore", _ecoreResourceFactoryImpl);
    final ResourceSetImpl resourceSet = new ResourceSetImpl();
    this.model = resourceSet.getResource(uri, true);
    EObject _get = this.model.getContents().get(0);
    this.modelPackage = ((EPackage) _get);
    return this.modelPackage;
  }
}
