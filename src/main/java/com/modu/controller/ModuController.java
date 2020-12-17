package com.modu.controller;

import com.modu.domain.build.BuildRepository;
import com.modu.domain.capital.CapitalRepository;
import com.modu.domain.cost.Cost;
import com.modu.domain.cost.CostRepository;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Optional;

@Controller
public class ModuController {
	private final CapitalRepository capitalRepository;
	private final BuildRepository buildRepository;
	private final CostRepository costRepository;

	public ModuController(CapitalRepository capitalRepository, BuildRepository buildRepository, CostRepository costRepository) {
		this.capitalRepository = capitalRepository;
		this.buildRepository = buildRepository;
		this.costRepository = costRepository;
	}

	@GetMapping
	public String getModuForm(Model model) {
		model.addAttribute("capitals", capitalRepository.findAll(Sort.by(Sort.Direction.ASC, "name")));
		model.addAttribute("build", buildRepository.findAll());

		return "index";
	}

	@GetMapping("cost")
	@ResponseBody
	public Cost getCost(@RequestParam Long capitalId, @RequestParam Long buildId) {
		Optional<Cost> optionalCost = costRepository.findByCapitalIdAndBuildId(capitalId, buildId);

		return optionalCost.get();
	}

}
