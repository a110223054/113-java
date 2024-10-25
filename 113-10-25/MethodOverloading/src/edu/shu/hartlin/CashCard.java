package edu.shu.hartlin;

public class CashCard {
    private String number;
    private int balance;
    private int bonus;
    private final int BONUSCASH = 10;

    //方法的身分辨識 = 方法名稱 + 參數個數 + 參數型態
    public CashCard() {
        setNumber("Unknown");
    }

    public CashCard(String number) {
        setNumber(number);
    }

    public CashCard(String number, int balance) {
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
        if (balance > 0) {
            this.balance = balance;
        } else {
            System.out.println("格式不符");
        }
    }

    public void setBonus(int bonus) {
        if (bonus > 0) {
            this.bonus = bonus;
        } else {
            System.out.println("格式不符");
        }
    }

    public void store(int money) {
        topup(money);
    }

    public void store(String number, int money) {
        if (this.number.equals(number)) {
            topup(money);
        } else {
            System.out.println("卡號不符");
        }
    }

    private void topup(int money) {
        if (money > 0) {
            this.balance += money;
            if (money >= 1000) {
                this.bonus += money / 1000;
            }
        } else {
            System.out.println("保存された値が不十分です");
        }
    }

    public void charge(String number, int money) {
        if (this.number.equals((number))) {
            deduction(money);
        }else {
            System.out.println("卡號不符");
        }
    }
    public void charge(String number, int money, int bonus){
        if (this.number.equals((number))) {
            exchange(bonus);
            deduction(money);
        }else {
            System.out.println("卡號不符");
        }
    }
    private void  deduction(int money){
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
    private int exchange(int bonus) {
        if (bonus > 0 && this.bonus >= bonus) {
            this.bonus -= bonus;
            setBalance((this.balance + bonus * BONUSCASH));
        } else {
            System.out.println("點數不足");
        }
        return this.bonus;
    }
}