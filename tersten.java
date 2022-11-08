import java.util.Scanner;

class tersten {
        public static void main(String[] args) {
                Scanner scannerInput = new Scanner(System.in);
                System.out.print("sayi gir:");
                int sayi = scannerInput.nextInt();
                String string_sayi = String.valueOf(sayi);
                String sayiters = "";
                for(int i=string_sayi.length()-1;i>=0;i--){
                        sayiters+=string_sayi.charAt(i);
                }

                System.out.println(sayiters);
                int tersten_sayi = Integer.parseInt(sayiters);
                System.out.println(tersten_sayi);
        }

}