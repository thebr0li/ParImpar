import java.util.Scanner;

public class ParImpar {
    private int num;
    private final Scanner sc = new Scanner(System.in);

    public ParImpar() {
        this.num = 0;
    }
     public void run(){
         System.out.println("Ingresa un numero");
         this.num = sc.nextInt();
         if (this.num % 2 == 0){
             System.out.println("El numero " + this.num + " es par");
         }else {
             System.out.println("El numero " + this.num + " es impar");
         }
     }
}
