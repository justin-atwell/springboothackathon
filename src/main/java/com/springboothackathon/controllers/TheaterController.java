package com.springboothackathon.controllers;

import org.springframework.web.bind.annotation.*;
import com.springboothackathon.models.Theater;
import com.springboothackathon.services.TheaterService;

import java.util.ArrayList;

@RestController
@RequestMapping(value = "/theaters")
public class TheaterController {

    private final TheaterService service;

    public TheaterController(TheaterService service) {
        this.service = service;
    }
    @GetMapping()
    public ArrayList<Theater> getTheaters()
    {
        return service.getAllTheaters();
    }

    @GetMapping("/{id}")
    public Theater findById(@PathVariable("id") int id) {
        return null;
    }

    @PostMapping()
    public String add(@PathVariable("id") int id){
        return "";
    }

    @PutMapping("/{id}")
    public String update(@PathVariable("id") int id){
        return "";
    }

    @DeleteMapping("/{id}")
    public String delete(@PathVariable("id") int id){
        return "";
    }
}
