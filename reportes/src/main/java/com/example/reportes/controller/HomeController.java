/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.reportes.controller;

import java.util.LinkedHashMap;
import java.util.Map;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
 *
 * @author admin
 */
@Controller
public class HomeController {

    @GetMapping("/")
    public String home() {
        return "home";
    }

    @GetMapping("/g1")
    public String g1(Model model) {
        Map<String, Integer> surveyMap = new LinkedHashMap<>();
        surveyMap.put("Java", 40);
        surveyMap.put("Dev oops", 25);
        surveyMap.put("Python", 20);
        surveyMap.put(".Net", 15);
        model.addAttribute("surveyMap", surveyMap);
        return "grafico1";
    }

    @GetMapping("/g2")
    public String g2(Model model) {
        model.addAttribute("pass", 50);
        model.addAttribute("fail", 50);
        return "grafico2";
    }

}
