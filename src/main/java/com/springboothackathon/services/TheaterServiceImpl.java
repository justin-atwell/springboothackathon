package com.springboothackathon.services;

import com.springboothackathon.models.Theater;
import com.springboothackathon.repository.TheaterRepository;
import com.springboothackathon.repository.TheaterRepositoryImpl;

import java.util.ArrayList;
import java.util.List;

public class TheaterServiceImpl implements TheaterService {
   private TheaterRepository theaterRepository;

    public TheaterServiceImpl(TheaterRepository repository){
       this.theaterRepository = repository;
    }

    public List<Theater> getAllTheaters() {
        Theater theater1 = new Theater();
        theater1.setId(23);
        theater1.setName("Joey Chestnut's theater. Hot dogs only");
        theater1.setLatitude(11L);
        theater1.setLatitude(19L);

        ArrayList<Theater> theaters = new ArrayList<Theater>();
        theaters.add(theater1);

        return theaters;
    }

    public Theater getTheaterById(int id) {
        return new Theater();
    }

    public void addTheater(Theater theater) {

    }

    public void updateTheater(Theater theater) {

    }

    @Override
    public void deleteTheater(Theater theater) {

    }
}
