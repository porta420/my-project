
package com.noeldevops.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class FormController {

    @GetMapping("/")
    public String index() {
        return "form";
    }

    @PostMapping("/submit")
    public String submitForm(@RequestParam String name,
                             @RequestParam String country,
                             @RequestParam String relationship,
                             @RequestParam String goals,
                             Model model) {
        model.addAttribute("name", name);
        model.addAttribute("country", country);
        model.addAttribute("relationship", relationship);
        model.addAttribute("goals", goals);
        return "result";
    }
}
