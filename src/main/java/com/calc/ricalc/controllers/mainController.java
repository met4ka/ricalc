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
public class mainController {

    @Autowired
    private resRepository resRepository;

    @GetMapping("/")
    public String main(Model model) {
        return "main";
    }
    @PostMapping("/")
    public String res(@RequestParam String fn, @RequestParam String sn, @RequestParam String method, @RequestParam String user, Model model) {
        res res = new res(fn, sn, method, user);
        resRepository.save(res);
        return "redirect:/";
    }
}
