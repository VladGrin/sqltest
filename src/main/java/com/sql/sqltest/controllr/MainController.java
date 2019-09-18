package com.sql.sqltest.controllr;

import com.sql.sqltest.domain.User;
import com.sql.sqltest.repo.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
@AllArgsConstructor
public class MainController {

    private UserRepository userRepository;

    @GetMapping
    public String hello() {
        return userRepository.findAll().toString();
    }

    @GetMapping("/add")
    public String helloName(@RequestParam(required = false) String name,
                            @RequestParam(required = false) int age) {
        userRepository.save(new User(name, age));
        return "SUCCESS";
    }
}
