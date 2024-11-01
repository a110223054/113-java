import com.sun.source.tree.BreakTree;

import java.util.Scanner;

public class GradeBook {
    private String courseName;
    private Student[] students;
    private double[] grades;
    private int numberOfStudents;

    public GradeBook(String courseName, Student[] students, int numberOfStudents) {
        this.courseName = courseName;
        this.students = students;
        this.numberOfStudents = numberOfStudents;
        this.grades = new double[numberOfStudents];
        displayMessage();
    }

    public void displayMessage() {
        System.out.printf("歡迎使用 %s 成績系統\n", courseName);
    }

    public void processStudentsGrades() {
        Scanner input = new Scanner(System.in);
        System.out.println("輸入學生成績: ");
        for (int i = 0; i < numberOfStudents; i++) {
            students[i].printData();
            System.out.print(" 的成績: ");
            grades[i] = input.nextDouble();
        }
    }

    private double getMaxinum() {
        double max = grades[0];
        for (int i = 1; i < numberOfStudents; i++) {
            if (grades[i] > max)
                max = grades[i];
        }
        return max;
    }

    private double getMixinum() {
        double mix = grades[0];
        for (int i = 1; i < numberOfStudents; i++) {
            if (grades[i] < mix)
                mix = grades[i];
        }
        return mix;
    }

    public double getAverage() {
        double sum = 0;
        for (int i = 0; i < numberOfStudents; i++) {
            sum += grades[i];
        }
        return sum / numberOfStudents;
    }

    public void displayGradeReport() {
        System.out.println("成績報告: ");
        System.out.println("學號\t\t 姓名\t\t 成績");
        System.out.println("---------------------------");
        for (int i = 0; i < numberOfStudents; i ++){
            students[i].printData();
            System.out.printf(" %.1f\n",grades[i]);
        }
        System.out.println("---------------------------");
        System.out.printf("最高分: %.1f\n", getMaxinum());
        System.out.printf("最低分: %.1f\n", getMixinum());
        System.out.printf("平均分: %.1f\n", getAverage());
    }
}
