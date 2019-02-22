/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista.pkg6.vetores;

/**
 *
 * @author Artur Pereira
 */
import java.util.*;
public class Q5 {
    public static void main(String[] args) {
        
        int qtde = 0, continua = 1;
        String nomes[], telefones[];
        String nome = "", fone = "";
        System.out.println("Preparando para alimentar base de dados...");
        System.out.println("Entre com a quantidade de registros: ");
        qtde = new Scanner(System.in).nextInt();
        nomes = new String[qtde];
        telefones = new String[qtde];
        for (int i = 0; i < qtde; i++){
            System.out.println("Entre com o nome e em seguida com o telefone do Reg. No.: " + i);
            nomes[i] = new Scanner(System.in).next();
            telefones[i] = new Scanner(System.in).next();
        }
        System.out.println("Base de dados concluída!");
        System.out.println("Entrando no modo de consulta...");
 
        while (continua == 1){
            fone = "não encontrado";
            System.out.println("Entre com o nome da pessoa a ser consultada: ");
            nome = new Scanner(System.in).next(); 
            for (int x = 0; x < qtde; x++){
                if (nomes[x].equalsIgnoreCase(nome)){
                    fone = telefones[x];
                }
            }
            System.out.println("Resultado da Consulta: '" + fone + "'");
            continua = 0;
            System.out.println("Para fazer uma nova consulta, entre com o valor 1:");
            continua = new Scanner(System.in).nextInt();
        }
        System.out.println("");
        System.out.println("Programa Finalizado!");
    }
 
}
    

