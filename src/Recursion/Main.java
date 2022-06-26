/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Recursion;

/**
 *
 * @author JiaWen
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println(rev("String"));
        System.out.println(sum(3));
        printDigit(4567);
        substituteAI("Astronaut");
        permuteString("ABCD");
        System.out.println(exponent(10,3));

    }

    public static String rev(String str) {
        if (str.length() == 1) {
            return str;
        } else {
            return str.charAt(str.length() - 1) + rev(str.substring(0, str.length() - 1));
        }
    }

    public static int sum(int N) {
        if (N == 1) {
            return 1;
        } else {
            return N + sum(N - 1);
        }
    }

    public static void printDigit(int num) {
        String str = Integer.toString(num);

        if (str.length() == 1) {
            System.out.println(str);
        } else {
            System.out.print(str.charAt(0) + " ");
            printDigit(Integer.parseInt(str.substring(1, str.length())));
        }
    }

    public static void substituteAI(String str) {
        int length = str.length();

        if (length == 1) {
            System.out.println(str);
        } else {
            if (str.charAt(0) == 'a') {
                char[] charArr = str.toCharArray();
                charArr[0] = 'i';
                str = String.valueOf(charArr);
            }
            System.out.print(str.charAt(0));
            substituteAI(str.substring(1, str.length()));
        }
    }

    public static void permuteString(String str) {
        permuteString("", str);
    }

    public static void permuteString(String candidate, String remaining) {
        if (remaining.length() == 0) {
            System.out.println(candidate);
        }

        for (int i = 0; i < remaining.length(); i++) {
            String newCandidate = candidate + remaining.charAt(i);
            String newRemaining = remaining.substring(0, i) + remaining.substring(i + 1);
            permuteString(newCandidate, newRemaining);
        }
    }

    public static long exponent(int x, int m) {
        if (m == 0) {
            return 1;
        } else if (m > 0) {
            return x * exponent(x, m - 1);
        } else {
            return 1 / exponent(x, -m);
        }
    
    }
    
}
