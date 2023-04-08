import identity.Student;

import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap so luong hoc sinh: ");
        int n = Integer.parseInt(scanner.nextLine());
        Student[] student = new Student[n];
        Handle handle = new Handle();
       for (int i=0;i<n;i++){
           Student student1 = handle.createStudent(scanner, i);
           student[i] = student1 ;
       }
       handle.displayStudent((student));
        System.out.println(Handle.type());
        }
    }
