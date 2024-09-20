

public class Range {
    public static void main(String[] args) {
        // 自己打的，VS code打開解壓縮的資料夾，裏頭的Range是全空白
        System.out.printf("%d ~ %d%n", 
                Byte.MIN_VALUE, Byte.MAX_VALUE);
        System.out.printf("%d ~ %d%n", 
                Short.MIN_VALUE, Short.MAX_VALUE);
        System.out.printf("%d ~ %d%n", 
                Integer.MIN_VALUE, Integer.MAX_VALUE);
        System.out.printf("%d ~ %d%n", 
                Long.MIN_VALUE, Long.MAX_VALUE);
        
        System.out.printf("%d ~ %d%n", 
                Float.MAX_EXPONENT, Float.MAX_EXPONENT);
        System.out.printf("%d ~ %d%n", 
                Double.MAX_EXPONENT, Double.MAX_EXPONENT);

        System.out.printf("%h ~ %h%n", 
                Character.MIN_VALUE, Character.MAX_VALUE);
        System.out.printf("%b ~ %b%n", 
                Boolean.TRUE, Boolean.FALSE);
    }
}