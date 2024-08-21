package vn.hoidanit.laptopshop.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


import vn.hoidanit.laptopshop.service.UserService;

//mô hình MVC
@Controller
public class UserController {
    //dependency inject userService 
    private UserService userService;

    //constructor tạo tự động với righclick+ source action
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @RequestMapping("/")
    public String getHomepage(Model model) {
        String test = this.userService.showString();
        // đây là code khi chưa cấu hình view enggine
        // return "home.html";

        model.addAttribute("var",test);
        return "home";
    }

}

// mô hình RESTful
// @RestController
// public class UserController {
//     //dependency inject userService 
//     private UserService userService;

//     //constructor tạo tự động với righclick+ source action
//     public UserController(UserService userService) {
//         this.userService = userService;
//     }

//     @GetMapping("/")
//     public String getUserName() {
//         return this.userService.showString();
//     }
// }

