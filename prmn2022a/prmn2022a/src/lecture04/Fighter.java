package lecture04;

public class Fighter {
    private int hitPoint;
    private int power;
    private String name;

    public Fighter(int hitPoint,int power,String name){
        this.hitPoint = hitPoint;
        this.power = power;
        this.name = name;
    }
    public void attack(Fighter enemy){
        enemy.hitPoint = enemy.hitPoint - this.power;
        System.out.println(this.name + " は " + enemy.name + " に " + this.power + " ダメージ与えた。");
    }
    public boolean isAlive(){
        if(this.hitPoint > 0){
            return true;
        }else{
            return false;
        }
    }
    public int getHitPoint(){
        return hitPoint;
    }
    public String getName(){
        return name;
    }
}

