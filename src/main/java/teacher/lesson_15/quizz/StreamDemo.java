package teacher.lesson_15.quizz;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamDemo {

    public static void main(String[] args) {

        List<String> strings = Arrays.asList("apple", "banana", "pineapple");
        Stream<String> stringStream = strings.stream();
        Stream<Integer> lengthStream = stringStream.map(String::length);

        //short-circuiting operations
        //1. anyMatch
        boolean hasShortWord = strings.stream()
                .anyMatch(s -> s.length() <= 5);

        //2. allMatch
        boolean allLongWords = strings.stream()
                .allMatch(s -> s.length() > 5);

        //3. noneMatch
        boolean noShortWords = strings.stream()
                .noneMatch(s -> s.length() <= 10);

        List<String> names = Arrays.asList("Anna", "Beaty", "Charlie", "Dillan");
        String concatenated = names.stream()
                .map(n -> n.substring(0, 2))
                .reduce("", String::concat);
        System.out.println(concatenated);

    }

}
