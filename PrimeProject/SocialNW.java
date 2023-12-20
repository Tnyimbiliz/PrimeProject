package PrimeProject;
import java.util.Scanner;

class SocialNW{
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter  number : ");
        int input = scanner.nextInt();

        if(primeChecker(input)){
            System.out.println("Prime");
        }else{
            System.out.println("NOT Prime");
        }

        scanner.close();

    }

    public static boolean primeChecker(int number){
        for(int i=2; i<= (Math.ceil(number/2)); i++){
            if(number%2 == 0){
                return false;
            }
        }
        return true;
    }
}