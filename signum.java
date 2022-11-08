import java.util.Scanner;
import java.lang.Math;

class signum {
        public static void main(String[] args) {
                Scanner scannerInput = new Scanner(System.in);
                System.out.print("x sayisi gir:");
                int x = scannerInput.nextInt();
                double sonuc = Math.pow(x,2)-(5*x)+3;
                if(sonuc<0){
                        System.out.println("negatif");
                }

                else if(sonuc==0){
                        System.out.println("0");
                }

                else{
                        System.out.println("pozitif");
                }

        }

}