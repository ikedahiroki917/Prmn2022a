package lecture06;

import java.util.Scanner;
import java.util.Random;
import java.util.ArrayList;
import java.util.InputMismatchException;

public class Exercise6_2 {
    public static void main(String[] args) {
        System.out.println("さいころを5つ振りました。");
        System.out.println("何番目のさいころの値を確認しますか？(0~4の数字を入力)");
        Random rand = new Random();
        ArrayList<Integer> diceList = new ArrayList<>();
        for(int i=0 ; i<6 ; i++){
            diceList.add(rand.nextInt(6) + 1);
        }
        try{
            Scanner input = new Scanner(System.in);
            int n = input.nextInt();
            System.out.println(n + "番目のさいころの値は" + diceList.get(n));
        }catch(IndexOutOfBoundsException e){
            System.out.println("ArrayListの範囲外アクセスを確認しました。");
            System.out.println("プログラムを終了します。");
        }catch(InputMismatchException e){
            System.out.println("整数以外の値が入力されました。");
            System.out.println("プログラムを終了します。");
        }
    }
}
