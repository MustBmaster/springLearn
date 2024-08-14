package vn.hoidanit.laptopshop;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
    public class HellowordController {
    @GetMapping("/")
    public String index() {
        return "Hello World from Spring Boot!";
        
    }
}
