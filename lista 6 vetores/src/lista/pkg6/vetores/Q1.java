
package lista.pkg6.vetores;
import java.util.*;
public class Q1 {
    public static void main(String[] args) {
      
        int inteiros[], qtde = 0;
        System.out.println("Entre com a quantidade de numeros:");
        qtde = new Scanner(System.in).nextInt();
        inteiros = new int [qtde]; 
        for (int i = 0; i < qtde; i++){
            System.out.println("Entrada numero: " + i);
            System.out.println("Entre com um numero inteiro:");
            inteiros[i] = new Scanner(System.in).nextInt();
        }
        for (int x = qtde; x > 0; x--){
            System.out.println("Entrada numero: " + x);
            System.out.println(inteiros[x-1]);
        }
 
    }
 
}
    

