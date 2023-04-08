package identity;

import java.text.DecimalFormat;

public class Student {
    private  static  int autoId;
    private double average;
    private final int id;
    private String name;
    private double scoreMath;
    private double scoreChemistry;
    private double scorePhysic;
    static double sumA = 0;
    static double sumB = 0;
    static double sumC = 0;


    public Student(String name, Double scoreMath, Double scoreChemistry, double scorePhysic, double average) {
        this.id = ++autoId;
        this.name = name;
        this.scoreMath = scoreMath;
        this.scoreChemistry = scoreChemistry;
        this.scorePhysic = scorePhysic;
        this.average =  (scoreChemistry+scoreMath+scorePhysic)/3;
    }
    public String type(double score){
        this.average = score;
        String type;
        if(score<6.5) {
            type= "C";
            sumC = ++sumC;
        } else if (score >= 6.5 && score<8) {
            type ="B";
            sumB = ++sumB;
        } else {
            type ="A";
            sumA = ++sumA;
        }
        return type;
    }
    public static double getSumA() {
        return sumA;
    }
    public static double getSumB() {
        return sumB;
    }
    public static double getSumC() {
        return sumC;
    }
    @Override
    public String toString() {
        DecimalFormat df = new DecimalFormat("#.##");
        return
                "Ten hoc sinh la: '" + name + '\'' +
                "\nDiem trung binh la: " +df.format(average)
                +"\nXep loai: "+ type(average);
    }
}

