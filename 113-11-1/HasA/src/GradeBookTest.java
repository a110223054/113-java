public class GradeBookTest {
    public static  void  main(String[] args){
        final int number_of_student = 3;
        Student[] students = new Student[3];
        students[0] = new Student("A110221001","桐谷和人");
        students[1] = new Student("A110221002","亞斯娜");
        students[2] = new Student("A110221003","克萊茵");
        GradeBook gradeBook = new GradeBook("愛恩葛朗特",students,number_of_student);
        gradeBook.processStudentsGrades();
        gradeBook.displayGradeReport();
    }


}
