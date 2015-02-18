# web-application-security

A web application contains resources that can be accessed by many users. These
resources often traverse unprotected, open networks such as the Internet. In such an
environment, a substantial number of web applications rely on security policies, often enforced through
mechanisms and infrastructure of servlet containers, to meet specific requirements such as:

- Authentication: The means by which communicating entities prove to one
another that they are acting on behalf of specific identities that are authorized for
access.

- Access control for resources: The means by which interactions with resources are
limited to collections of users or programs for the purpose of enforcing integrity,
confidentiality, or availability constraints.

- Data Integrity: The means used to prove that information has not been modified
by a third party while in transit.

- Confidentiality or Data Privacy: The means used to ensure that information is
made available only to users who are authorized to access it.

However, putting in place a security policy within a servlet is often an error-prone and time-consuming task 
due to the different ways to enforce it (i.e., declarative, programmatic). 
We propose a Model-based approach that provides an overview of all security constraints enforced in a servlet web application, 
identifying possible misconfigurations and security leaks.

#####Tool

The tool is developed on the Eclipse platform. 
It relies on several tools and technologies from the Model Driven Engineering ecosystem (ATL, MoDisco, Xtext).

- Xtext is used to create a DSL and a metamodel to define security information (constraints and roles)

- MoDisco is used to obtain a model representation of the XML descriptor (web.xml) and Java classes composing the web application

- ATL is used to extract the security information contained in the web application to an homogeneous representation, 
that allows to represent such a information in textual and graphical formats, 
thus easing the understanding of the actual policies enforced
