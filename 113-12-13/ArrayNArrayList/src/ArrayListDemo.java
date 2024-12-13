import java.util.ArrayList;

public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList

        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");

        String fruit = list.get(1);
        System.out.println("第二個元素是:" + fruit);
        
        list.set(1, "Blueberry");
        System.out.println("ArrayList內容: " + list);

        list.remove(0);
        System.out.println("刪除後的ArrayList: " + list);

        list.size();
        System.out.println("ArrayList大小: " + list);


    }
}
