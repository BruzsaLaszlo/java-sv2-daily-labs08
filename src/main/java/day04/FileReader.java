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

            int diff = max - min;
            if (diff < minDegree) {
                minDay = day;
                minDegree = diff;
            }
        }

        return minDay;
    }


    public String findSmallestDifferent(Path path) throws IOException {

        List<String> lines = Files.readAllLines(path);

        int minDif = 100;
        String minTeam = null;
        for (int i = 1; i < lines.size() - 1; i++) {
            if (i == 18)
                continue;

            String team = lines.get(i).substring(7, 22).trim();
            int f = Integer.parseInt(lines.get(i).substring(43, 45).trim());
            int a = Integer.parseInt(lines.get(i).substring(50, 52).trim());

            int dif = Math.abs(f - a);
            if (dif < minDif) {
                minTeam = team;
                minDif = dif;
            }
        }

        return minTeam;
    }

}
