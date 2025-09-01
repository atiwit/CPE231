package th.ac.kmutt.cpe.algorithm.atiwit;

import th.ac.kmutt.cpe.algorithm.atiwit.searching.*;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        System.out.printf("สวัสดี");

        ArrayList<Integer> arr = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            arr.add(100 + i);
        }

        SearchContext<Integer> solver = new SearchContext<Integer>(new LinearSearch<>());
        int answer = solver.executeSearch(arr, 100);
        System.out.println(arr);
        System.out.println(answer);
    }
}
