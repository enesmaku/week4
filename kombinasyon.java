import java.util.Scanner;

class kombinasyon {
        public static int faktoriyel( int sayi) {
                int carp = 1;
                for(int i=1;i<=sayi;i++){
                        carp*=i;
                }

                return carp;
        }

        public static void main(String[] args) {
                Scanner scannerInput = new Scanner(System.in);
                System.out.print("eleman sayisi gir:");
                int n = scannerInput.nextInt();
                System.out.print("alinacak kombinasyon sayisi:");
                int r = scannerInput.nextInt();
                int sonuc = faktoriyel(n)/(faktoriyel(r)*faktoriyel(n-r));
                System.out.println("sonuc:"+sonuc);
        }

}