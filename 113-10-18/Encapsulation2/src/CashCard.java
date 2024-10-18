class CashCard {
    String number;
    int balance;
    int bonus;

    CashCard(String number, int balance, int bonus) {
        this.number = number;
        this.balance = balance;
        this.bonus = bonus;
    }

    void store(int money){
        if(money > 0){
            this.balance += money;
            if(money >= 1000){
                this.bonus += money/1000;
            }
        }else {
            System.out.println("保存された値が不十分です");
        }
    }

    void charge(int money){
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

    int exchange(int money){
        if(bonus > 0){
            this.bonus -= bonus;
        }
        return this.bonus;
    }
}