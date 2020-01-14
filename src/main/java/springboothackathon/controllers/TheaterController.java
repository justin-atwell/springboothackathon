package springboothackathon.controllers;


import models.Theater;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/theaters")
public class TheaterController {
    @GetMapping()
    public Theater[] getTheaters() {
        return null;
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
