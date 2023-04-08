import identity.Student;

import java.text.DecimalFormat;
import java.util.Scanner;
public class Handle {

    public Student createStudent(Scanner scanner, int i) {
        System.out.println("Nhap ten hoc sinh thu " + (i+1));
        String name = scanner.nextLine();
        double mathPoint;
        do {
            System.out.println("Nhap diem toan: ");
            mathPoint = Double.parseDouble(scanner.nextLine());
        } while (mathPoint < 0 || mathPoint > 10);
        double physicPoint;
        do {
            System.out.println("Nhap diem vat ly: ");
            physicPoint = Double.parseDouble(scanner.nextLine());
        } while (physicPoint < 0 || physicPoint > 10);
        double chemistryPonit;
        do {
            System.out.println("Nhap diem hoa: ");
            chemistryPonit = Double.parseDouble(scanner.nextLine());
        } while (chemistryPonit < 0 || chemistryPonit > 10);
        double average = (mathPoint+physicPoint+chemistryPonit)/3;
        Student student = new Student(name, mathPoint, physicPoint, chemistryPonit, average);
        return student;
    }
    public void displayStudent(Student[] students){
        for (Student student : students) {
            System.out.println(student);
        }
    }
    public static String type(){
        DecimalFormat df = new DecimalFormat("#.##");
        return "Hoc sinh xep loai A chiem: " +df.format (Student.getSumA()/(Student.getSumA()+Student.getSumB()+Student.getSumC())*100) + "%" +
                "\nHoc sinh xep loai B chiem: " +df.format (Student.getSumB()/(Student.getSumA()+Student.getSumB()+Student.getSumC())*100) + "%" +
                "\nHoc sinh xep loai C chiem: " +df.format (Student.getSumC()/(Student.getSumA()+Student.getSumB()+Student.getSumC())*100) + "%" ;
    }
    public Handle() {
    }
}
