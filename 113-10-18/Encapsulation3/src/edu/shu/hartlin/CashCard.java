package  edu.shu.hartlin;

public class CashCard {
    private String number;
    private int balance;
    private int bonus;

    public CashCard(String number, int balance, int bonus) {
        this.number = number;
        this.balance = balance;
        this.bonus = bonus;
    }

    public String getNumber() {
        return number;
    }

    public int getBalance() {
        return balance;
    }

    public int getBonus() {
        return bonus;
    }

    public void setNumber(String number){
        this.number = number;
    }

    public void store(int money){
        if(money > 0){
            this.balance += money;
            if(money >= 1000){
                this.bonus += money/1000;
            }
        }else {
            System.out.println("保存された値が不十分です");
        }
    }

    public void charge(int money){
        if(money > 0){
            if(money <= this.balance){
                this.balance -= money;
            }
            else {
                System.out.println("残高不足");
            }
        }else {
            System.out.println("控除額が足りない");
        }
    }

    public int exchange(int money){
        if(bonus > 0){
            this.bonus -= bonus;
        }
        return this.bonus;
    }
}