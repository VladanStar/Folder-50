
package kockicebacanje;

import java.util.Scanner;


public class KockiceBacanje {

    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
         int kocka1, kocka2, zbirBacanja, sumaKase=0;
        System.out.println("Koliko novca zelite da ulozite: ");
        sumaKase= input.nextInt();
        int brojac = 1;
       do{
        System.out.println("Bacite kocke: ");
        kocka1 = (int)(Math.random()*6)+1;
        kocka2 = (int)(Math.random()*6)+1;
        zbirBacanja = kocka1 + kocka2;
        
        System.out.println("Zbir bacanja kocki je: " + zbirBacanja);
        if(zbirBacanja == 7){
        
        sumaKase += 300;
        }
        else{
        sumaKase -=100;
        }
           System.out.println("Stanje vase kase: " + sumaKase);
           brojac++;
           
       }while(sumaKase >=100);
        System.out.println("Broj bacanja " +  brojac);
    }
    
    
}
