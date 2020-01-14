package com.springboothackathon.controllers;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;
import com.springboothackathon.models.Theater;
import com.springboothackathon.services.TheaterService;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;

@AutoConfigureMockMvc
@SpringBootTest
public class TheaterControllerTests {
    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private TheaterService service;

    @Test
    public void getTheatersHappyPath() throws Exception {
        Theater theater = new Theater();
        int id = 2;
        theater.setId(id);
        theater.setName("kevin");
        theater.setLatitude(22.3f);
        theater.setLongitude(22.3f);

        List<Theater> theaters = new ArrayList<Theater>();
        theaters.add(theater);

        mockMvc.perform(get("/theaters"));

        verify(service, times(1)).getAllTheaters();
    }

    @Test
    public void getTheatersCallsTheaterService() throws Exception {
        Theater theater = new Theater();
        int id = 2;
        theater.setId(id);
        theater.setName("kevin");
        theater.setLatitude(22.3f);
        theater.setLongitude(22.3f);

        ArrayList<Theater> theaters = new ArrayList<Theater>();
        theaters.add(theater);

        when(service.getAllTheaters()).thenReturn(theaters);

        String result = mockMvc.perform(get("/theaters")).andReturn().getResponse().getContentAsString();

        assertThat(result.contains(theater.getName()));
    }
}
