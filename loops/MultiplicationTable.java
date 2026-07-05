import java.util.Scanner;
publiv class MultiplicationTable{
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        
        System.out.println("Enter your number: ");
        int number = scanner.nextInt();
        int i= 1;
        int answer = 0;
        
        for (i=1; i<=10; i++){
            answer = number*i;
            System.out.println(number + "x" + i + "=" + answer);
        } 
    
    scanner.close();
    }
}
