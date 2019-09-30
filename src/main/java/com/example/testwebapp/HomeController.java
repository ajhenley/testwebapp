package com.example.testwebapp;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
    @RequestMapping("/")
    public String myHomePage()
    {
        return "mytemplate";
    }

    @RequestMapping("/add")
    public String adding()
    {
        return "addtemplate";
    }

    @RequestMapping("/var")
    public String showingVariable(Model model)
    {
        model.addAttribute("myvar", "Secret Message");
        model.addAttribute("username", "Octavius");
        model.addAttribute("gpa", 3.145);
        return "showtemplated";
    }

    @RequestMapping("/var2")
    public String showingVariable2(Model model)
    {
        model.addAttribute("myvar", "You are removed from this site");
        model.addAttribute("username", "Octavius");
        model.addAttribute("gpa", "none");
        return "showtemplated";
    }

}
