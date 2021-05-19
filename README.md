# Headless CMS model extractor

This repository contains a prototype of a tool able to extract the Model from a Wordpress or Drupal CMS by analyzing its API. This tools works over the Eclipse Modeling Framework and generates the concrete model of a CMS instance using Ecore.

The main objective of this tool is to reduce the cost of the integration of Headless CMS in Enterprise IT ecosystems. To achieve this, we have proposed a generic model for Headless CMS 

## Headless CMS generic model

Here is the proposed generic model that serves as central piece of this tool.

![Headless CMS generic model](doc/genericModel.pdf)

### Prerequisites

* The toolkit requires [Eclipse 4.12 (2019-06)](https://download.eclipse.org/eclipse/downloads/drops4/R-4.12-201906051800/) or [above](https://download.eclipse.org/eclipse/downloads/).

* The toolkit requires [EMF 2.10 (2015-01)](http://download.eclipse.org/modeling/emf/emf/builds/release/2.10/index.html) or [above](https://download.eclipse.org/eclipse/downloads/).


## Installation

To install the tool follow this steps:

 - git clone
 - Import the code in your Eclipse Project
 - Set your OpenAPi Specifications in /OpenApiSpecifications or provide your Wordpress URL and credentials 



## Usage and Examples

Here some instructions of the usage and some examples provided.

![New Project Wizard - Step 1](doc/WordpressExample.png)


## Project Content and Credits

