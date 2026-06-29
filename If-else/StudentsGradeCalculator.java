import java.util.Scanner;
class StudentGradeCalculator{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter your marks: ");
        int marks = sc.nextInt();
        
        if( marks <0 || marks >100){
            System.out.println("Invalid marks!");
        } else if(marks >= 75){
            System.out.println(" Your grade is: A");
        } else if(marks >= 65){
            System.out.println(" Your grade is: B");
        } else if(marks >= 50){
            System.out.println(" Your grade is: C");
        } else if(marks >= 35){
            System.out.println(" Your grade is: S");
        } else {
            System.out.println(" Your grade is: W");
        }
        
        sc.close();
    }
}
