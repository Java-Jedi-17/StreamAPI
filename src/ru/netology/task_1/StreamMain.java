package ru.netology.task_1;

import java.util.Comparator;
import java.util.stream.Stream;

public class StreamMain {
    public static void main(String[] args) {
        Stream.of(1, 2, 5, 16, -1, -2, 0, 32, 3, 5, 8, 23, 4)
                .filter(result -> result > 0)
                .filter(result -> result % 2 == 0)
                .sorted(Comparator.naturalOrder())
                .forEach(System.out::println);
    }
}
