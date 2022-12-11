package lecture06;

import java.util.Scanner;
import java.util.InputMismatchException;

public class Exercise6_1 {
    public static void main(String[] args) {
        try{
            Scanner input = new Scanner(System.in);
            System.out.println("小数値を入力してください：");
            double n = input.nextDouble();
            System.out.println("入力した値：" + n);
        }catch(InputMismatchException e){
            System.out.println("エラー");
        }
    }
}
