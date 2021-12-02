package day04;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FootballTable {

    private final List<Team> teams;


    public FootballTable(List<Team> teams) {
        this.teams = teams;
    }

    public FootballTable(Path path) {
        teams = new ArrayList<>();
        readDataLinesFrom(path).forEach(this::addTeam);
    }

    public List<Team> getTeams() {
        return List.copyOf(teams);
    }

    public String findSmallestDifferentInGoals() {
        return teams.stream()
                .min(this::compareByGoalDifferent)
                .orElseThrow().name();
    }

    private int compareByGoalDifferent(Team a, Team b) {
        int aDif = Math.abs(a.ga() - a.gf());
        int bDif = Math.abs(b.ga() - b.gf());
        if (aDif < bDif) {
            return -1;
        } else if (aDif > bDif) {
            return 1;
        } else {
            return 0;
        }
    }

    private List<String> readDataLinesFrom(Path path) {
        try {
            return Files.readAllLines(path).stream()
                    .map(String::trim)
                    .filter(line -> Character.isDigit(line.charAt(0)))
                    .map(s -> s
                            .replaceAll("[.-]", "")
                            .replaceAll("\\s+", " "))
                    .toList();
        } catch (IOException e) {
            throw new IllegalStateException("nincs ilyen file: " + path, e);
        }
    }


    private void addTeam(String line) {

        String[] split = line.split("\\s");
        List<Integer> numbers = Arrays.stream(split)
                .filter(s -> s.chars().allMatch(Character::isDigit))
                .map(Integer::parseInt)
                .toList();

        teams.add(new Team(
                        numbers.get(0),
                        split[1],
                        numbers.get(1),
                        numbers.get(2),
                        numbers.get(3),
                        numbers.get(4),
                        numbers.get(5),
                        numbers.get(6),
                        numbers.get(7)
                )
        );

    }

}
