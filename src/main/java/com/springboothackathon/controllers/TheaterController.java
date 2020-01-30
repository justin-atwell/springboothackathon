package com.springboothackathon.controllers;

import com.springboothackathon.models.Theater;
import com.springboothackathon.services.TheaterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/theaters")
public class TheaterController {

    private final TheaterService service;

    public TheaterController(TheaterService service) {
        this.service = service;
    }

    @GetMapping()
    public List<Theater> getTheaters()
    {
        return service.getAllTheaters();
    }

    @GetMapping("/{id}")
    public Theater findById(@RequestParam("id") int id) {
        return service.getTheaterById(id);
    }

    @RequestMapping(value = "/add", method = {RequestMethod.POST})
    public ResponseEntity add(@RequestBody Theater theater){
          service.addTheater(theater);
          return new ResponseEntity(HttpStatus.CREATED);
    }

    @PutMapping("/{id}")
    public ResponseEntity update(@RequestBody Theater theater){
        service.updateTheater(theater);
        return new ResponseEntity(HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity delete(@RequestBody Theater theater){
        service.deleteTheater(theater);
        return new ResponseEntity(HttpStatus.OK);
    }
}
