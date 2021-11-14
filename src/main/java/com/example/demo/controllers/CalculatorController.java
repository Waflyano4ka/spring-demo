package com.example.demo.controllers;

import com.example.demo.models.Actions;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/calculator")
public class CalculatorController {
    @GetMapping("")
    public String calculate(Model model){
        return "calculator";
    }

    @PostMapping("")
    public String calculate(
            @RequestParam String input1,
            @RequestParam String input2,
            @RequestParam String action,
            Model model){

        Actions actions = new Actions(input1, input2, action);

        model.addAttribute("input1", input1);
        model.addAttribute("input2", input2);
        model.addAttribute("action", action);
        model.addAttribute("result", actions.Calcualte());
        return "calculator";
    }
}
