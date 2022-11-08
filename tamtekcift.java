import java.util.Scanner;

class tamtekcift {
        public static void main(String[] args) {
                Scanner scannerInput = new Scanner(System.in);
                System.out.print("n sayisi gir:");
                int n = scannerInput.nextInt();
                int t1 = 0;
                int t2 = 0;
                int t3 = 0;
                for(int i=1;i<=n;i++){
                        t1+=i;
                        if(i%2==0){
                                t3+=i;
                        }

                        else{
                                t2+=i;
                        }

                }

                System.out.println("tam sayilar:"+t1);
                System.out.println("tek sayilar:"+t2);
                System.out.println("cift sayilar:"+t3);
        }

}