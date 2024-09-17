package com.springtest.testexam.Controller;

import com.springtest.testexam.Entity.ApplicationUser;
import com.springtest.testexam.Entity.InsurancePolicy;
import com.springtest.testexam.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping
    public ApplicationUser addUser(@RequestBody ApplicationUser user) {
        return userService.addUser(user);
    }

    @PostMapping("/apply")
    public String applyForInsurance(ApplicationUser user, InsurancePolicy insurancePolicy){
        return userService.applyForInsurance(user,insurancePolicy);
    }
}
