package com.example.thymeleaf.controller;

import com.example.thymeleaf.model.Doctor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class DoctorController {

    @GetMapping("/doctor")
    public String doctor(@RequestParam(required=false, defaultValue="0") int number,
                         @RequestParam(required=false, defaultValue="John Smith") String name, Model model) {
        model.addAttribute(new Doctor(number, name));

        return "doctor.html";
    }
}
