
package atividadepolimorfismo;


public class Relatorio {
    Professor p1 = new Professor();
    Funcionario f1 = new Funcionario();
    
  
     public void imprimirRelatorio(){
         System.out.println("--");
         System.out.println("Salario "+f1.getSalarioL()); 
         System.out.println("Nome "+f1.getNome());
         
         System.out.println("Salario "+p1.getSalario()); 
         System.out.println("Nome "+p1.getNome());
         
     }
     
     }
    

