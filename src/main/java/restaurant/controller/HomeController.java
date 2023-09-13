package restaurant.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
//    @RequestMapping(value = "/index")
    @GetMapping("/")
    public String home(Model model) {
        // Add data to the model
        return "home";
    }

    @GetMapping("/fullmenu")
    public String fullMenu() {
        return "fullmenu"; //
    }

    @GetMapping("/contactus")
    public String contactUs() {
        return "contactus"; //
    }

}
