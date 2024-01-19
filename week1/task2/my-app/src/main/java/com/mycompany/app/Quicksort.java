package com.mycompany.app;

import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Quicksort {
    public static List<Integer> quickSort(List<Integer> list) {
        if (list.size() < 2) {
            return list;
        } else {
            Integer pivot = list.get(0);
            List<Integer> less = list.stream().skip(1).filter(el -> el <= pivot)
            .collect(Collectors.toList());
            List<Integer> greater = list.stream().skip(1).filter(el -> el > pivot)
            .collect(Collectors.toList());
            return Stream.of
                    (
                    quickSort(less).stream(),
                    Stream.of(pivot),
                    quickSort(greater).stream())
                    .flatMap(Function.identity()).collect(Collectors.toList()
                    );
        }
    }
}