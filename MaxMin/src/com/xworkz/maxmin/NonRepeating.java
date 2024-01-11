package com.xworkz.maxmin;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class NonRepeating {

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 1, 2, 5}; // You can provide your array directly

        int[] nonRepeatingElements = findNonRepeatingElements(array);

        System.out.print("Non-repeating elements: ");
        Arrays.stream(nonRepeatingElements).forEach(element -> System.out.print(element + " "));
    }

    private static int[] findNonRepeatingElements(int[] array) {
        Map<Integer, Long> frequencyMap = Arrays.stream(array)
                .boxed()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        return frequencyMap.entrySet().stream()
                .filter(entry -> entry.getValue() == 1)
                .mapToInt(Map.Entry::getKey)
                .toArray();
    }
}
