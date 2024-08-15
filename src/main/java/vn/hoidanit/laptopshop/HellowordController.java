package vn.hoidanit.laptopshop;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
    public class HellowordController {
    @GetMapping("/")
    public String index() {
        return "Hello World from Spring Boot!, this is the 2nd time i save without restarting";
    }
    // khởi tạo 2 routes mới
    @GetMapping("/user")
    public String userPage() {
        return "User page ";
    }

    @GetMapping("/admin")
    public String adminPage() {
        return "Admin page";
    }
}
