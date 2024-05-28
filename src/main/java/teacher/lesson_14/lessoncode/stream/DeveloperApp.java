package teacher.lesson_14.lessoncode.stream;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class DeveloperApp {
    public static void main(String[] args) {

        List<Developer> developers = getDeveloperList();

        System.out.println("JUNIOR developers:");
        List<Developer> juniorDevs = developers.stream()
                .filter(developer -> Level.JUNIOR == developer.getLevel())
                .toList();
        juniorDevs.forEach(System.out::println);
        System.out.println();

        //sort by age ascending
        System.out.println("Developers list sorted by age ascending:");
        List<Developer> developersListSortedAsc = developers.stream()
                .sorted(Comparator.comparing(Developer::getAge))
                .toList();
        developersListSortedAsc.forEach(System.out::println);
        System.out.println();

        //oldest developer
        System.out.println("Oldest developer:");
        developers.stream()
                .max(Comparator.comparing(Developer::getAge))
                .ifPresent(System.out::println);
        System.out.println();

        //youngest developer
        System.out.println("Youngest developer:");
        developers.stream()
                .min(Comparator.comparing(Developer::getAge))
                .ifPresent(System.out::println);
        System.out.println();

        //youngest MIDDLE dev
        System.out.println("Youngest MIDDLE dev: ");
        Optional<String> youngestMidDev = developers.stream()
                .filter(developer -> Level.MIDDLE == developer.getLevel())
                .min(Comparator.comparing(Developer::getAge))
                .map(Developer::getName);
        youngestMidDev.ifPresent(System.out::println);
        System.out.println();

        //group by level
        Map<Level, List<Developer>> devsMap = developers.stream()
                .collect(Collectors.groupingBy(Developer::getLevel));

        devsMap.forEach((level, dev1) -> {
            System.out.println(level);
            dev1.forEach(System.out::println);
            System.out.println();
        });

    }

    private static List<Developer> getDeveloperList() {
        return List.of(
                new Developer("Janis", 30, Level.MIDDLE),
                new Developer("Raivis", 23, Level.MIDDLE),
                new Developer("Jura", 35, Level.SENIOR),
                new Developer("Laura", 20, Level.INTERN),
                new Developer("Kristan", 18, Level.INTERN),
                new Developer("Igor", 40, Level.ARCHITECT),
                new Developer("Anna", 27, Level.SENIOR),
                new Developer("Julija", 24, Level.SENIOR),
                new Developer("Liene", 38, Level.ARCHITECT),
                new Developer("John", 22, Level.JUNIOR),
                new Developer("Semjon", 17, Level.ARCHITECT)
        );
    }
}
