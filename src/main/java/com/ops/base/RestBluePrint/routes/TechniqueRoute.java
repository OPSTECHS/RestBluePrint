package com.ops.base.RestBluePrint.routes;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/api/Techniques")
@RestController
public class TechniqueRoute {
	@GetMapping
	public String getTech() {
		return "tech not availble";
	}
}
