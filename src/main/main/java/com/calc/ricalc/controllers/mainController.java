package com.calc.ricalc.controllers;

import com.calc.ricalc.entity.res;
import com.calc.ricalc.repository.resRepository;
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
    public String res(@RequestParam String fn, @RequestParam String sn, @RequestParam String method, @RequestParam String user111, Model model) {
        res res= resRepository.findByUser111(user111);
        if (res==null){
            resRepository.save(new res(fn, sn, method, user111));
        }
        return "redirect:/";
    }
}
