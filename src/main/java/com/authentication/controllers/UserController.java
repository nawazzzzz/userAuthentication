package com.authentication.controllers;
import com.authentication.model.dtos.JwtRequest;
import com.authentication.model.dtos.JwtResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/user")
public class UserController {

    @PostMapping("/login")
    public ResponseEntity<JwtResponse> userLogin(@RequestBody JwtRequest request) {

        return new ResponseEntity<>(HttpStatus.OK);
    }


}
