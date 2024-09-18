package com.example.backend.Control;

import com.example.backend.Model.dat;
import com.example.backend.REpo.rep;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;



@RestController
@RequestMapping("/users")
public class cont {

    @Autowired
    private rep repo;
    @GetMapping
    public List<dat> getAllUsers() {
        return repo.findAll();
    }

    @PostMapping
    public dat createUser(@RequestBody dat User) {
        return repo.save(User);
    }
}
