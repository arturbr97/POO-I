
package atividadeheranca;

import java.util.Scanner;
public class Teste {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);        
      
        Pessoa p1 = new Pessoa ();
        Fornecedor f1 = new Fornecedor();
        Empregado e1 = new Empregado();
        p1.setNome("Artur");
        System.out.println("Cliente Cadastrado");
        System.out.println("Nome "+p1.getNome());
        p1.setEndereço("Picos");
        System.out.println("Endereço "+p1.getEndereço());
        p1.setTelefone(" 89 94525394");
        System.out.println("Telefone "+p1.getTelefone());
        f1.setVcredito(2000);
        System.out.println("Valor de Credito Disponivel "+f1.getVcredito());
        f1.setVdebito(100);
        System.out.println("Valor de Debito Disponivel "+f1.getVdebito());
        f1.obterSaldo();
       
        
        e1.setCodSetor(2015);
        System.out.println("Codigo de Setor "+e1.getCodSetor());
        e1.setSalarioBase(6550.00f);
        System.out.println("Salario Base "+e1.getSalarioBase());
        e1.setImposto(15f);
        System.out.println("Imposto "+e1.getImposto());
        
        e1.CalcularSalario();
        
        
        
    }
    
}
