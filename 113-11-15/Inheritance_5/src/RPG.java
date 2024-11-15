public class RPG {
    public static void main(String[] args) {
        demoSwordsMan();
        demoMagician();
    }

    static void demoSwordsMan() {
        var swordsMan = new SwordsMan();
        swordsMan.setName("Justin");
        swordsMan.setLevel(1);
        swordsMan.setBlood(200);
        System.out.println(swordsMan.toString());
        drawFight(swordsMan);
    }

    static void demoMagician() {
        var magician = new Magician();
        magician.setName("Monica");
        magician.setLevel(1);
        magician.setBlood(100);
        System.out.println(magician);
        drawFight(magician);
    }

    static void drawFight(Role role) {
        if(role instanceof SwordsMan){
            System.out.print(role.getName());
            role.fight();
        } else if (role instanceof Magician) {
            System.out.print(role.getName());
            role.fight();
            ((Magician)role).cure();
        } else {
            System.out.println("該角色無法戰鬥");
        }
    }
}