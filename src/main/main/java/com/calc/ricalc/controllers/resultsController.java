package com.calc.ricalc.controllers;

import com.calc.ricalc.entity.res;
import com.calc.ricalc.repository.resRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


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
