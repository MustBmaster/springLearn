package vn.hoidanit.laptopshop.service;

import org.springframework.stereotype.Service;

//anotation của 1 service
@Service
public class UserService {
    public String showString(){
        return "Test string dài dài 1 tí ";
    }
}
