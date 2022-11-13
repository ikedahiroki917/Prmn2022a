package lecture02;

public class Car {
    int fuel;
    Car(){
        this.fuel = 0;
    }
    void run(){
        if(this.fuel > 0){
            this.fuel = this.fuel - 1;
            System.out.println("燃料を1消費して走りました。");
        }else{
            System.out.println("燃料がありません。");
        }
    }
}
