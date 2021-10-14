import java.io.IOException;
import java.util.Scanner;
 
/**
 *   
 */
public class Main {
 
    public static void main(String[] args) throws IOException {
 
       Scanner in = new Scanner(System.in);
        double a = in.nextDouble();
        double b = in.nextDouble();
        double c = in.nextDouble();
        in.close();
        double delta = Math.pow(b,2)-4*a*c;
        if (2*a != 0 && delta>0){
          System.out.printf("R1 = %.5f\n", (((b*(-1) + (Math.sqrt(delta)))/(2*a))));
          System.out.printf("R2 = %.5f\n", (((b*(-1) - (Math.sqrt(delta)))/(2*a))));
        }
       else{
         System.out.println("Impossivel calcular");
       }

    }
 
}