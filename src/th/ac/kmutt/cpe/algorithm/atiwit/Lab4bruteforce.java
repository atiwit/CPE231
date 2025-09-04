//Atiwit 67070501048 
package th.ac.kmutt.cpe.algorithm.atiwit;

import th.ac.kmutt.cpe.algorithm.atiwit.searching.*;

import java.util.ArrayList;
import java.util.Scanner;

public class Lab4bruteforce {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine().trim();
        char A = sc.next().charAt(0);
        char B = sc.next().charAt(0);
        int p = sc.nextInt();

        int n_text = text.length();
        int ans = 0;

        ArrayList<Integer> posA = new ArrayList<>();
        ArrayList<Integer> posB = new ArrayList<>();

        for (int i = 0; i < n_text; i++) {
            if (text.charAt(i) == A)
                posA.add(i);
            if (text.charAt(i) == B)
                posB.add(i);
        }

        SearchContext<Integer> context = new SearchContext<Integer>(new LinearSearch<Integer>());

        for (int i : posA) {
            for (int j : posB) {
                int idx = context.executeSearch(posB, j);
                if (idx != -1 && j > i && (j - i + 1) >= p) {
                    ans++;
                }
            }
        }

        System.out.println(ans);
        sc.close();
    }

}
