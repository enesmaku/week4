import java.util.Scanner;
import java.lang.Math;

class paypayda {
        public static void main(String[] args) {
                Scanner scannerInput = new Scanner(System.in);
                System.out.print("pay:");
                int pay = scannerInput.nextInt();
                System.out.print("payda:");
                int payda = scannerInput.nextInt();
                int bolum = pay/payda;
                System.out.println("bolum: "+bolum);
                System.out.print("basamak gir:");
                int istenen_basamak = scannerInput.nextInt();
                int index=1;
                while (bolum > 0){
                    int basamak=bolum % 10;
                    if(index==istenen_basamak){
                        System.out.println(Math.pow(10,istenen_basamak-1)*basamak);
                    }
                    bolum = bolum/10;
                    index+=1;
                }  
        }

}