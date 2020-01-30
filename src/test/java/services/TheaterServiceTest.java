package services;

import com.springboothackathon.SpringBootApplication;
import com.springboothackathon.models.Theater;
import com.springboothackathon.repository.TheaterRepository;
import com.springboothackathon.services.TheaterService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.core.Is.is;
import static org.mockito.Mockito.when;

@SpringBootTest(classes = SpringBootApplication.class)
public class TheaterServiceTest {

    @MockBean
    private TheaterRepository repository;

    @Autowired
    private TheaterService service;

    @Test
    public void getAllTheatersReturnsTheTheaters() throws Exception {
        //arrange
        List<Theater> theaters = new ArrayList<>();
        Theater theater = new Theater();
        theaters.add(theater);

        when(this.repository.getAllTheaters()).thenReturn(theaters);

        //act
        List<Theater> result = service.getAllTheaters();
        //assert

        assertThat(result.size(), is(equalTo(theaters.size())));
    }

}
