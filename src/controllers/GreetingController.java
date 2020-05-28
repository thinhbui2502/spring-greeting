package controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class GreetingController {
    @GetMapping("/greeting")
    public String greeting(@RequestParam String name, Model model) {
        model.addAttribute("name", name);
        return "index";
    }

    @GetMapping("/{id}")
    public String showId (@PathVariable int id, ModelMap modelMap) {
        modelMap.addAttribute("student", "hocvienthu " + id);
        return "detail";
    }

    @GetMapping()
    public ModelAndView index () {
        ModelAndView modelAndView = new ModelAndView("home", "class", "C0202");
        modelAndView.addObject("total", "48");
        return modelAndView;
    }
}
