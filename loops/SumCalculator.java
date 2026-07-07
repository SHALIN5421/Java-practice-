import java.util.Scanner;

public class SumCalculator{
    public static void main(String[]args){
        Scanner sc= new Scanner(System.in);
        
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
         
         if(n < 0){
             System.out.println("invalid number!");
             return;
         }
         
         int sum = 0;
         
         for(int i =1; i<=n; i++){
             sum = sum+i;
         }
         
         System.out.println("Sum of " + n + " is " + sum);
         
         sc.close();
    }
}
