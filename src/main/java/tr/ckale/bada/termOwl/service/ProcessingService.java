package tr.ckale.bada.termOwl.service;

import java.util.List;

public interface ProcessingService {
	public static final String JAXP_SCHEMA_LANGUAGE = "http://java.sun.com/xml/jaxp/properties/schemaLanguage";
	public static final String JAXP_SCHEMA_LOCATION = "http://java.sun.com/xml/jaxp/properties/schemaSource";
	public static final String W3C_XML_SCHEMA = "http://www.w3.org/2001/XMLSchema";
	public static final String JAXB_MODEL_PACKAGE = "tr.ckale.bada.termOwl.model";
	public static final String OWL_FILE_PATH = ".\\owldata\\geolocation.owl";
	public static final String IRI = "http://www.semanticweb.org/alperen/ontologies/2016/11/geolocation";
	public static final String VIRTUOSO_URL = "http://localhost:8890/sparql";// "jdbc:virtuoso://localhost:1111";
	public static final String VIRTUOSO_USER = "dba";
	public static final String VIRTUOSO_PWD = "dba";
	public static final String QUERY = "SELECT DISTINCT ?s ?property ?value WHERE { ?o1 rdf:type ?class . ?s rdf:type ?o1;?property ?value}";
	public static final String PREFIX = "PREFIX geo: <http://www.semanticweb.org/alperen/ontologies/2016/11/geolocation#>"
			+ "PREFIX owl: <http://www.w3.org/2002/07/owl#>"
			+ "PREFIX rdf: <http://www.w3.org/1999/02/22-rdf-syntax-ns#>"
			+ "PREFIX xsd: <http://www.w3.org/2001/XMLSchema#>" + "PREFIX xml: <http://www.w3.org/XML/1998/namespace>"
			+ "PREFIX rdfs: <http://www.w3.org/2000/01/rdf-schema#>";

	public List<Double> queryOntology(String name) throws Exception;

}
