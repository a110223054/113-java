public class Student {
    private String ID, name;

    public Student(){
        new Student("Unknow","未知");
    }
    public Student(String ID){
        new Student(ID,"未知");
    }
    public Student(String ID, String name){
        this.ID= ID;
        this.name = name;
    }

    public String getID() {
        return ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void printData(){
        System.out.printf("%s %s",ID,name);
    }
}
