import java.util.Scanner;

class metrecevir {
        public static void main(String[] args) {
                Scanner scannerInput = new Scanner(System.in);
                System.out.print("metre gir:");
                int metre = scannerInput.nextInt();
                System.out.print("santimetre icin 1, desimetre icin 2 gir:");
                int secim = scannerInput.nextInt();
                if(secim==1){
                        System.out.println("cm:"+(metre*100));
                }

                else if(secim==2){
                        System.out.println("dm:"+(metre*10));
                }

                else{
                        System.out.println("gecersiz secim");
                }

        }

}