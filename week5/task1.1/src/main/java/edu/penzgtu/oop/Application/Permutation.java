package edu.penzgtu.oop.Application;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Permutation {
    public static <T> List<List<T>> permute(List<T> list) {
        List<List<T>> result = new ArrayList<>();
        permuteHelper(list, new ArrayList<T>(), result);
        return result;
    }

    private static <T> void permuteHelper(List<T> list, List<T> tempList, List<List<T>> result) {
        if (tempList.size() == list.size()) {
            result.add(new ArrayList<>(tempList));
        } else {
            for (int i = 0; i < list.size(); i++) {
                if (tempList.contains(list.get(i))) {
                    continue;
                }
                tempList.add(list.get(i));
                permuteHelper(list, tempList, result);
                tempList.remove(tempList.size() - 1);
            }
        }
    }

    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>(Arrays.asList(1, 2, 3));
        List<List<Integer>> permutations = permute(numbers);
        for (List<Integer> permutation : permutations) {
            System.out.println(permutation);
        }
    }
}

