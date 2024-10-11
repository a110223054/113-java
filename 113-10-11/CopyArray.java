import java.util.Arrays;

public class CopyArray {
    public static void main(String[] args) {
        int[] scores1 = {88, 81, 74, 68, 78, 76, 77, 85, 95, 93};
        int[] scores2 = Arrays.copyOf(scores1, scores1.length);
        int[] scores3 = scores1;
        int[] scores4 = scores1.clone();

        for(var score : scores2) {
            System.out.printf("%3d", score);
        }
        System.out.println();

        //不影響
        scores2[0] = 99;
        for(var score : scores1) {
            System.out.printf("%3d", score);
        }
        System.out.println();

        //會影響
        scores3[0] = 48763;
        for(var score : scores1) {
            System.out.printf("%3d", score);
        }
        System.out.println();

        //不影響
        scores4[0] = 1016;
        for(var score : scores1) {
            System.out.printf("%3d", score);
        }
    }
}
