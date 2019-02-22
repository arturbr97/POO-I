package lista.pkg6.vetores;
import java.util.*;
public class Q4 {
    public static void main(String[] args) {
        
        String [] nomes;
        int quantPessoas, nPessoa;
 
        System.out.println("Entre com a quantidade de pessoas.");
        quantPessoas = new Scanner(System.in).nextInt();
        nomes   = new String [quantPessoas];
 
        for (int i = 0; i < quantPessoas; i++){
            System.out.println("Entre com os nomes. Nome N°" +i);
            nomes[i] = new Scanner(System.in).nextLine();
        }
        System.out.println("Entre com o N° da pessoa que deseja consultar.");
        nPessoa = new Scanner(System.in).nextInt();
        System.out.println("O Nome da pessoa é:"+(nomes [nPessoa]));
    }
 
}
