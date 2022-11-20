package lecture03;

import java.util.Scanner;

public class Exercise3_3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("1つ目の整数を入力：");
        String s1 = input.next();
        System.out.println("2つ目の整数を入力：");
        String s2 = input.next();

         int s11 = Integer.parseInt(s1);
         int s22 = Integer.parseInt(s2);

         int ans = s11 + s22;
        System.out.println(s11 + " + " + s22 + " = " + ans);
        }
    }
