public class Submarine implements Swimmer {
    private String name;
    
    public Submarine(String name) {
        this.name = name;
    }
    
    public String getName() {
        return name;
    }
    
    @Override
    public void swim() {
        System.out.printf("潛水艇 %s 潛行%n", name);
    }

    public  void torpedo(){
        System.out.printf("潛水艇 %s 發射魚雷%n", name);
    }
}
