package Dsa;

import java.util.Scanner;

public class InverseNumber {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int pos=1;
        int sum=0;

        while(n!=0){
            int digit=n%10;
            int v1=(int) (pos*Math.pow(10,digit-1));
            sum=sum+v1;
            pos++;
            n=n/10;
        }
        System.out.println(sum);
    }
    
}

//lossy conversion means agr bdhe value ko chote mein define kr rhe ho line number 14 mein int lgna zaruri
//hai bcz by default vooh math.pow double mein value leta hai agr int nhii lgege tooh lossy conversion aayega
//double 8 byte ke space leta hai agr int nhii lgege ttoh hum 8 byte ko 4 byte mein dhal rhe hai int se
//hum defined kr rhe hai compiler ko isse 4 byte ki terha lera hoo.
