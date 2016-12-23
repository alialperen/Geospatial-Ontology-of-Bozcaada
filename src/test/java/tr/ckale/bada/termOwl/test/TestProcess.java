package tr.ckale.bada.termOwl.test;

import org.junit.Test;

import tr.ckale.bada.termOwl.service.ProcessingService;
import tr.ckale.bada.termOwl.service.Impl.ProcessingServiceImpl;

public class TestProcess {

	@Test
	public final void testQueryOntology() throws Exception {

		ProcessingService service = new ProcessingServiceImpl();
		service.queryOntology("Ayazma");
	}

}
