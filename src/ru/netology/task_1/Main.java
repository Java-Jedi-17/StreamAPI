package ru.netology.task_1;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 5, 16, -1, -2, 0, 32, 3, 5, 8, 23, 4);
        for (int result : list) {
            Collections.sort(list);
            if ((result > 0) && (result % 2 == 0)) {
                System.out.println(result);
            }
        }
    }
}