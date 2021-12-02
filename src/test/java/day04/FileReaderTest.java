package day04;

import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.nio.file.Path;

import static org.junit.jupiter.api.Assertions.*;

class FileReaderTest {

    @Test
    void findSmallestTemperatureSpreadTest() throws IOException {

        Path path = Path.of("./src/main/resources/weather.dat");

        int actual = new FileReader().findSmallestTemperatureSpread(path);

        assertEquals(14,actual);

    }
}