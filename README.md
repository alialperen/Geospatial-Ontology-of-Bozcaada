# TERM Project
## The Project
	This project is a maven project. 
	To get required libraries for the project please right click-Maven-Update Project...
	Names of required libraries can be found in dependencies tags in pom.xml.
	To compile the project virtuoso libraries must be added to java build path. 
	The libraries can be found in virtuosoJars folder. (virtuoso doesnt have any maven dependencies)
	Besides this project is a Spring Boot project. While runnig it establishes a Tomcat Server on localhost port 8080.
	Project tries to reach Virtuoso server on port 8890.
	geolocaiton.owl must added to virtuoso server on geolocation endpoint.
* src
	* tr.ckale.bada.termOwl
		- Application.java (for Runnig Spring Boot also the project)
		- LocationController.java (to process web requests)
	* tr.ckale.bada.termOwl.model
		-JaxB beans (POJO)
	* tr.ckale.bada.termOwl.model.Impl
		- Protege model classes
	* tr.ckale.bada.termOwl.service
		- Processing Service Interface
	* tr.ckale.bada.termOwl.service.Impl
		- Implement of Processing Service Interface
	* tr.ckale.bada.termOwl.test
		- Junit test of the service
* bin
	- class files
* src/main/resources
	- static
		- index.html. - query screen
	- templates
		- map.html.   - result screen
* owlData
	- ontology file
