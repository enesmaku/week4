import java.util.Scanner;

class tambolenler {
        public static void main(String[] args) {
                Scanner scannerInput = new Scanner(System.in);
                System.out.print("a sayisi gir:");
                int a = scannerInput.nextInt();
                for(int i=1;i<=a;i++){
                        if(a%i==0){
                                System.out.println(i);
                        }

                }

        }

}