package day04;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class FileReader {

    public int findSmallestTemperatureSpread(Path path) throws IOException {

        List<String> lines = Files.readAllLines(path);

        int minDegree = 100;
        int minDay = 0;
        for (int i = 2; i < lines.size() - 1; i++) {
            int day = Integer.parseInt(lines.get(i).substring(2, 4).trim());
            int max = Integer.parseInt(lines.get(i).substring(6, 8).trim());
            int min = Integer.parseInt(lines.get(i).substring(12, 14).trim());
            if (max - min < minDegree) {
                minDay = day;
                minDegree = max - min;
            }
        }

        return minDay;
    }

}
