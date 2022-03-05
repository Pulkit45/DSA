package Dsa;

import java.util.Scanner;

public class GcdandLcm {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n1=scanner.nextInt();
        int n2=scanner.nextInt();

        while(n1%n2!=0){
            int rem=n1%n2;
            n1=n2;
            n2=rem;

        }
    }
    
}













//formula to rember    n1*n2=gcd*lcm