package com.langhanz.workshopmongodb.resources;

import com.langhanz.workshopmongodb.domain.User;
import com.langhanz.workshopmongodb.services.UserService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping(value = "/users")
public class UserResources {

    private UserService service;

    @GetMapping
    public ResponseEntity<List<User>> findAll(){

        List<User> list = service.findAll();
        return ResponseEntity.ok().body(list);
    }
}
