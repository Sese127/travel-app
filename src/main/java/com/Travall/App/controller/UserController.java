package com.Travall.App.controller;

import com.Travall.App.model.user.IUserRepository;
import com.Travall.App.model.user.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping ("/home")
public class UserController {

    @Autowired
    private IUserRepository userRepository;

    @PostMapping("/users")
    public String createUser(@RequestBody User user ) {
        User dbName = userRepository.findByName(user.getName());
        User dbEmail = userRepository.findByEmail(user.getEmail());

        if ((dbName == null) && (dbEmail == null)) {
          User individu = new User(user.getName(), user.getEmail(), user.getPassword() /* user.getRole() */);
          User createdProfil = userRepository.save(individu);
          return "BRAVO";
        }
        return "rien";
    }

}
