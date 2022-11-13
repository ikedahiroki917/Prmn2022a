package lecture01;

public class Kadai_01 {
    public static void main(String[] args) {

        //課題1-1
        System.out.println("B2210120 Ikeda Hiroki");

        //課題1-2
        int num1 = 2210120;
        String num2 = "B" + num1;
        System.out.println(num2 + " Ikeda Hiroki");

        //課題1-3
        int age = 20;
        if(age >= 20){
            System.out.println("I am " + age +" years old so I can drink liquor");
        }else{
            System.out.println("I am " + age +" years old so I cannot drink liquor");
        }

        //課題1-4
        int array[] = new int[100];
        int sum = 0;
        for(int i = 0;i < array.length;i++){
            array[i] = i+1;
            if(i % 2 == 0){
                sum = sum + array[i];
            }
        }
        System.out.println(sum);

        //課題1-5
        int[] score = new int[]{41,85,72,38,80};
        int l = min(score);
        int h = max(score);
        double a = average(score);
        for(int j = 0;j < score.length;j++){
            if(score[j] >= 90 && score[j] <= 100){
                System.out.println(j + "番 " + score[j] + "点 " + "秀");
            }else if(score[j] >=80 && score[j] < 90){
                System.out.println(j + "番 " + score[j] + "点 " + "優");
            }else if(score[j] >=70 && score[j] < 80){
                System.out.println(j + "番 " + score[j] + "点 " + "良");
            }else if(score[j] >=60 && score[j] < 70){
                System.out.println(j + "番 " + score[j] + "点 " + "可");
            }else{
                System.out.println(j + "番 " + score[j] + "点 " + "不可");
            }
        }
        System.out.println("");
        System.out.println("最低点：" + l + "点");
        System.out.println("最高点：" + h + "点");
        System.out.println("平均点：" + a + "点");
        System.out.println("");
        System.out.println("");
    }
    static int min(int[] score){
        int min = 0;
        for(int i = 0;i < score.length;i++){
            if(min == 0 || min >= score[i]){
                min = score[i];
            }
        }
        return min;
    }
    static int max(int[] score){
        int max = 0;
        for(int i = 0;i < score.length;i++){
            if(max == 0 || max <= score[i]){
                max = score[i];
            }
        }
        return max;
    }
    static double average(int[] score){
        int sum = 0;
        for(int i = 0;i < score.length;i++){
            sum = sum + score[i];
        }
        double ave = sum / score.length;
        return ave;
    }
}
