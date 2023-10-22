import java.util.Scanner;

public class Perulangan {
    public static void main(String[] args) throws Exception {
         Scanner input = new Scanner (System.in);

        String kata, kataPalindrome = "";
        int panjangKata;

        System.out.print(" Masukan kata : ");
        kata = input.nextLine();
        
        panjangKata = kata.length();

        for (int i = panjangKata - 1; i >= 0; i--){
            kataPalindrome = kataPalindrome + kata.charAt(i);

        }
        if  (kata.equals ( kataPalindrome )){
            System.out.println(" kata " + kata + " Merupakan Palindrome " );

        }
        else{
            System.out.println(" kata " + kata + " Bukan Palindrome" );

            input.close();
            
        }
    }
}
