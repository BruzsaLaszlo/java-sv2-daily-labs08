package day04;

import org.junit.jupiter.api.Test;

import java.nio.file.Path;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FootballTableTest {


    Path path = Path.of("src/main/resources/football.dat");

    FootballTable ft = new FootballTable(path);


    @Test
    void getTeams() {

        assertEquals(20, ft.getTeams().size());

    }

    @Test
    void findSmallestDifferentInGoals() {

        assertEquals("Aston_Villa", ft.findSmallestDifferentInGoals());

    }

}