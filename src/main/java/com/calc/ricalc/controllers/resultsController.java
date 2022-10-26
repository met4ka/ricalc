package com.calc.ricalc.controllers;

import com.calc.ricalc.models.res;
import com.calc.ricalc.repo.resRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class resultsController {

    @Autowired
    private resRepository resRepository;

    @GetMapping("/results")
    public String results(Model model) {
        Iterable<res> results = resRepository.findAll();
        model.addAttribute("results", results);
        return "results";
    }
}
