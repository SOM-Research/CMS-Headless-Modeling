package edu.uoc.som.cmsdiscover.generator;

import com.google.common.collect.Iterables;
import edu.uoc.som.cmsdiscover.generator.Template;
import java.io.ByteArrayInputStream;
import java.util.Map;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
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
  private Template template = new Template();
  
  private EPackage thePackage;
  
  private Resource model;
  
  private EPackage modelPackage;
  
  public void doGenerate(final EPackage input, final IFolder srcGenFolder) {
    try {
      if (((input != null) && (input instanceof EPackage))) {
        this.thePackage = ((EPackage) input);
        final Iterable<EClass> eClasses = Iterables.<EClass>filter(this.thePackage.getEClassifiers(), EClass.class);
        final Function1<EClass, String> _function = (EClass it) -> {
          return it.getName();
        };
        final Iterable<String> classesName = IterableExtensions.<EClass, String>map(eClasses, _function);
        final EMap<String, String> sourceCmsInformation = this.thePackage.getEAnnotations().get(0).getDetails();
        InputOutput.<String>println("Generating");
        for (final EClass modelClass : eClasses) {
          {
            final EList<EClass> superClasses = modelClass.getESuperTypes();
            final EMap<String, String> classAnnotation = modelClass.getEAnnotations().get(0).getDetails();
            for (final Map.Entry<String, String> detail : sourceCmsInformation) {
              classAnnotation.put(detail.getKey(), detail.getValue());
            }
            final CharSequence content = this.template.generateEntitiesClasses(modelClass, classAnnotation, superClasses);
            String _name = modelClass.getName();
            String _plus = (_name + ".java");
            final IFile resultFile = srcGenFolder.getFile(_plus);
            byte[] _bytes = content.toString().getBytes();
            ByteArrayInputStream _byteArrayInputStream = new ByteArrayInputStream(_bytes);
            NullProgressMonitor _nullProgressMonitor = new NullProgressMonitor();
            resultFile.create(_byteArrayInputStream, IResource.FORCE, _nullProgressMonitor);
          }
        }
      }
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
