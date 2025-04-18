package com.noeldevops.demo.controller;

import com.noeldevops.demo.model.Person;
import com.noeldevops.demo.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class WebController {

    @Autowired
    private PersonRepository personRepository;

    @GetMapping("/")
    public String showForm(Model model) {
        model.addAttribute("person", new Person());
        return "form";
    }

    @PostMapping("/submit")
    public String submitForm(@ModelAttribute Person person, Model model) {
        personRepository.save(person);
        model.addAttribute("people", personRepository.findAll());
        return "result";
    }
}
