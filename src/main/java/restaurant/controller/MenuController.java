//package restaurant.controller;
//
//import com.example.myapp.service.MenuService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.GetMapping;
//
//@Controller
//public class MenuController {
//    @Autowired
//    private MenuService menuService;
//
//    @GetMapping("/fullmenu")
//    public String fullMenu(Model model) {
//        model.addAttribute("menus", menuService.getAllMenus());
//        return "fullmenu"; // Return the name of the HTML template
//    }
//}