package edu.shu.hartlin;

public class CashCard {
    private String number;
    private int balance;
    private int bonus;
    //方法的身分辨識 = 方法名稱 + 參數個數 + 參數型態
    public CashCard(){
        setNumber("Unknown");
    }
    public CashCard(String number){
        setNumber(number);
    }
    public CashCard(String number, int balance){
        setNumber(number);
        setBalance(balance);
    }
    public CashCard(String number, int balance, int bonus) {
        setNumber((number));
        setBalance(balance);
        setBonus(bonus);
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

    public void setNumber(String number) {
        this.number = number;
    }

    public void setBalance(int balance) {
        if(balance > 0){
            this.balance = balance;
        }else {
            System.out.println("格式不符");
        }
    }

    public void setBonus(int bonus) {
        if(bonus > 0){
            this.bonus = bonus;
        }else {
            System.out.println("格式不符");
        }
    }

    public void store(int money) {
        if (money > 0) {
            this.balance += money;
            if (money >= 1000) {
                this.bonus += money / 1000;
            }
        } else {
            System.out.println("保存された値が不十分です");
        }
    }

    public void charge(int money) {
        if (money > 0) {
            if (money <= this.balance) {
                this.balance -= money;
            } else {
                System.out.println("残高不足");
            }
        } else {
            System.out.println("控除額が足りない");
        }
    }

    public int exchange(int money) {
        if (bonus > 0) {
            this.bonus -= bonus;
        }
        return this.bonus;
    }
}