package poly.edu.lab4.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
    @RequestMapping("/home/index")
    public String index(Model model) {
        return "lession4/home/index";
    }

    @RequestMapping("/home/about")
    public String about(Model model) {
        return "lession4/home/about";
    }

}
