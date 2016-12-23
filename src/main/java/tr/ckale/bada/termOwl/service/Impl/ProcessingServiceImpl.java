package tr.ckale.bada.termOwl.service.Impl;

import java.util.ArrayList;
import java.util.List;

import org.apache.jena.query.Query;
import org.apache.jena.query.QueryExecution;
import org.apache.jena.query.QueryExecutionFactory;
import org.apache.jena.query.QueryFactory;
import org.apache.jena.query.QuerySolution;
import org.apache.jena.query.ResultSet;
import org.apache.jena.rdf.model.RDFNode;
import org.springframework.stereotype.Service;

import tr.ckale.bada.termOwl.service.ProcessingService;

@Service
public class ProcessingServiceImpl implements ProcessingService {

	@Override
	public List<Double> queryOntology(String name) throws Exception {
		List<Double> latLong = new ArrayList<Double>();
		// VirtGraph set = new VirtGraph(VIRTUOSO_URL, VIRTUOSO_USER,
		// VIRTUOSO_PWD);
		Query query = QueryFactory.create(PREFIX + QUERY);
		QueryExecution qexec = QueryExecutionFactory.sparqlService(VIRTUOSO_URL, query);
		ResultSet results = qexec.execSelect();
		Double latitude = 0D;
		Double longitude = 0D;
		while (results.hasNext()) {
			QuerySolution result = results.nextSolution();
			// RDFNode graph = result.get("graph");
			RDFNode s = result.get("s");
			RDFNode p = result.get("property");
			RDFNode o = result.get("value");

			if ((s.toString().toUpperCase().contains(name.toUpperCase()))
					&& ((p.toString().contains("latitude")) || (p.toString().contains("longitude")))) {
				if (p.toString().contains("latitude"))
					latitude = Double.valueOf(o.toString().substring(0, o.toString().indexOf('^')));
				if (p.toString().contains("longitude"))
					longitude = Double.valueOf(o.toString().substring(0, o.toString().indexOf('^')));

			}
		}
		latLong.add(latitude);
		latLong.add(longitude);
		qexec.close();
		return latLong;
	}

}
