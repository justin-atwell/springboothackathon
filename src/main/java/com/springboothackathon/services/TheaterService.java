package com.springboothackathon.services;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import com.springboothackathon.models.Theater;

import java.util.ArrayList;

@Component
public interface TheaterService {
    ArrayList<Theater> getAllTheaters();
}
