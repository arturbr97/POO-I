
package atividadepolimorfismo;

import java.util.Scanner;


public class Teste {

    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in); 
       
       Funcionario f1 = new Funcionario();
       Professor p1 = new Professor();
       Relatorio r1 = new Relatorio();
       Reitor r2 = new Reitor();
       
       f1.setNome("Clara");
       System.out.println("Nome "+f1.getNome());
       f1.setSalarioL(3000);
       System.out.println("Salario "+f1.getSalarioL());
       f1.getInfor();
       System.out.println("\n");
       r2.getInfor();
       p1.setNome("Vitoria");
       System.out.println("Nome "+p1.getNome());
       p1.setHoras(20f);
       System.out.println("Horas "+p1.getHoras());
       p1.setSalario(5000);
       System.out.println("Salario "+p1.getSalario());
       p1.getInfor();
       
       p1.getSalarioBruto();
       r2.getInfor();
       
       r1.imprimirRelatorio();
    }
    
}
