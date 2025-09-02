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

        for (int i = 0; i < n_text; i++) {
            if (text.charAt(i) == A) {
                for (int j = i + 1; j < n_text; j++) {
                    if (text.charAt(j) == B && (j - i + 1) >= p) { // เช็คว่าต้องให้มากกว่าหรือเท่ากับ p
                        ans++;
                    }
                }
            }
        }
        System.out.println(ans);
    }

}
