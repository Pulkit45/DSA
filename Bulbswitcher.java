package Dsa;

import java.util.Scanner;

public class Bulbswitcher {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int count=0;
        for(int i=1;i*i<=n;i++){
            count++;
            System.out.println(i*i); // agr puchna ho kaunse kaunse bulb on hoge
        }
        System.out.println(count);  //how many bulb on hoge
       
    }
    
}

//iss question hai yeh logic hai ki jo jb odd toogle hoga tooh bubl on hoga vrna off hoga
//toogle depend krega factors prr
// jo perefect square hoga uske (2n+1)factors bnege that means hamesha odd
//jo normal squre hoga uske (2n)factors bnege that means hamesha even
//tooh logic yeh hai kii jaise 20 bulb diye hai uske less than jitne perfect square roots hai
//utne bulb on hoge
//(2n+1)factors kaise bna ek baar copy mein dekh lena
