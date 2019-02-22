/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista.pkg6.vetores;
import java.util.*;
public class Q3 {
    public static void main(String[] args) {
        int reajuste;  
        int salario[], salreaj[], quantsal;
        System.out.println("Qual vai ser a quantidade de salario que o Sr vai reajusta ");
        quantsal = new Scanner (System.in) .nextInt();
        salario = new int [quantsal];
        salreaj = new int [quantsal];
        for(int i=0 ; i < quantsal; i++){
            System.out.println("Entre com os salarios");
            salario [i] = new Scanner (System.in) .nextInt();
        }
        System.out.println("Entre com a taxa de reajuste");
        reajuste = new Scanner (System.in) .nextInt();
        for(int i=0; i <quantsal; i++){
            salreaj[i] = ((salario[i] * reajuste)/100) + salario[i]; 
            System.out.println("Os salarios reajustado é:" +salreaj[i]);
        }
 
    }
 
}
    

