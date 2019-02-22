
package lista.pkg6.vetores;
import java.util.*;
public class Q2 {
    public static void main (String[] args){
    int armazena[], valor = 27;
        String aux; //Padroniza a descrição do valor em 2 dígitos
        armazena = new int [5];
        System.out.println("Vetor criado...");
        System.out.println("Iniciando preenchimento...");
        for (int i = 0; i < 5; i++){
            armazena[i] = valor;
            valor++;
        }
        System.out.println("Preenchimento concluído!!!");
        System.out.println("Iniciando Exibição de Valores...");
        for (int x = 0; x < 5; x++){
            aux = "";
            if (x < 10)
                aux = "0";
            System.out.println("Valor " + aux + x + ": " + armazena[x]);
        }
 
    }
 
}
