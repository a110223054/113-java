public class Magician extends Role {
    @Override
    public void fight() {
        super.fight();
        System.out.println("魔法射彈");
    }

    public void cure() {
        System.out.println("初級治療");
    }

    @Override
    public String toString(){
        return String.format("魔法師 : %s", super.toString());
    }
}
