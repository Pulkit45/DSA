package Dsa;

import java.util.Scanner;

import javax.naming.directory.SchemaViolationException;

public class CountDigit {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();

        int count=0;

        while(n!=0){
            n=n/10;
            count++;

        }
        System.out.println(count);
    }
    
}
