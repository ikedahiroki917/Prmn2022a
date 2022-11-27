package lecture04;

import java.util.ArrayList;

public class ATM {
    private ArrayList<Account> accountList;
    ATM(){
        this.accountList = new ArrayList<>();
    }
    public void registerAccount(String name,String number){             //アカウントの登録
        accountList.add(new Account(name,number));
        System.out.println("アカウントが登録されました。（アカウント名: " + name + " , 口座番号: " + number + "）");
    }
    public boolean existsAccount(String name,String number){            //アカウントが存在するか判断
        for(Account element : accountList){
            if(element.getName() == name && element.getNumber() == number){
                System.out.println("アカウント[名前: " + name + " ,口座番号: " + number + " ]は存在します。");
                return true;
            }
        }
        System.out.println("アカウント[名前: " + name + " ,口座番号: " + number + " ]は存在しません。");
        return false;
    }
    public void deposit(String number,long money){                  //口座に入金
        for(Account element : accountList){
            if(element.getNumber() == number){
                element.setBalance(element.getBalance() + money);
                System.out.println("口座 " + number + " に " + money + " 円入金しました。");
                return;
            }
        }
        System.out.println("口座が見つかりませんでした。");
    }
    public long withdraw(String number,long money){                 //口座からの引出
        for(Account element : accountList){
            if(element.getNumber() == number){
                if(element.getBalance() >= money){
                    element.setBalance(element.getBalance() - money);
                    System.out.print("口座 " + number + " から " + money + " 円引き出しました。");
                    System.out.println("残高は " + element.getBalance() + "円です。");
                    return money;
                }else{
                    System.out.print("口座 " + number + " から " + money + " 円引き出せませんでした。");
                    System.out.println("残高は " + element.getBalance() + "円です。");
                    return 0;
                }
            }
        }
        System.out.println("口座が見つかりませんでした。");
        return 0;
    }
}
