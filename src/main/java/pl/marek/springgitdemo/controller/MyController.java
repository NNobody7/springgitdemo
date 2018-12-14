package pl.marek.springgitdemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MyController {
    @GetMapping({"/", "/home"})
    public String welcome(){
        return "welcome";
    }

    @GetMapping("/car")
    public String car(Model model) {
    model.addAttribute("brand", "Fiat");
    model.addAttribute("model", "Punto");
    return "car"; }
}
