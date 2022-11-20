package lecture03;

import java.util.Scanner;
import java.util.ArrayList;

public class Exercise3_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<String> strings = new ArrayList<String>();
        System.out.println("何行分入力しますか？");
        int n = input.nextInt();
        for(int i=0 ; i<n ; i++){
            System.out.println(i+1 + "行目：");
            String s = input.next();
            strings.add(s);
        }
        System.out.println("入力した文字列：");
        for(String text:strings){
            System.out.println("[" + strings.indexOf(text) +  "] " + text);
        }
    }
}
