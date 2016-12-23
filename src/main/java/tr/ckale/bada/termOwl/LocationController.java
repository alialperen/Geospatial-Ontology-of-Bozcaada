package tr.ckale.bada.termOwl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import tr.ckale.bada.termOwl.service.ProcessingService;

@Controller
public class LocationController {

	@Autowired
	ProcessingService processingService;

	@RequestMapping("/ara")
	public String ara	(@RequestParam(value = "locationName", required = true) String name, Model model) throws Exception {
		List<Double> list = processingService.queryOntology(name);
		model.addAttribute("latitude", list.get(0));
		model.addAttribute("longitude", list.get(1));
		model.addAttribute("name",name);
		return "map";
	}

}
