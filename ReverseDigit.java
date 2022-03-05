package Dsa;

import java.util.Scanner;

public class ReverseDigit {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();

        while(n!=0){
            int digit=n%10;
            n=n/10;
            System.out.println(digit);

        }
        
    }
    
}
