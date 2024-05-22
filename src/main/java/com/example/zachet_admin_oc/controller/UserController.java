package com.example.zachet_admin_oc.controller;



import com.example.zachet_admin_oc.model.User;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {
    @GetMapping("/get_all_users")
    public List<User> getAllUsers() {
        List usr = new ArrayList<>();
        User user1 = new User(1, "Pustovalov Georgiy");
        usr.add(user1);
        return usr;
    }
}
