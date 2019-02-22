
package AtividadeArray;
//import java.util.ArrayList;
import java.util.Scanner;
public class Teste {
public static int soma = 0; //somap = 0;
    
    public static void main(String[] args) {
       // ArrayList<Agenda> listaAgenda = new ArrayList<>();
        Scanner sc = new Scanner(System.in);        
        int op;
        Agenda contatosAgenda = new Agenda();
        
        do{
        System.out.println("-------------------------");
        System.out.println("--- AGENDA TELEFONICA ---");
        System.out.println("-------------------------");
        System.out.println("[1]- Adicionar Contatos ");
        System.out.println("[2]- Listar Todos Contatos");
        System.out.println("[3]- Remover Contatos");
        System.out.println("[4]- Sair");
        System.out.println("-------------------------");
        op = Integer.parseInt(sc.nextLine());
        switch(op){
            case 1 : 
                
                System.out.println("\nDigite o Nome");
                String nome = sc.nextLine();
                System.out.println("Digite o Fone");
                String fone = sc.nextLine();
                contatosAgenda.adicionarContato(new Agenda(nome,fone));
                soma++;
                break;
                
            case 2:contatosAgenda.imprimirAgenda();
                   break;
          case 3:
              
              int testeContato = 0;
              if(soma==0){
              System.out.println("Nenhum Contato Cadastrado");
              
              }
              else{
              
                System.out.println("Digite o Nome do Cliente");
                String nome1 = sc.nextLine();
                for(int i = 0 ; i<contatosAgenda.listaAgenda.size();i++){
                if(contatosAgenda.listaAgenda.get(i).getnome().equals(nome1)){
                contatosAgenda.listaAgenda.remove(i);
                System.out.println("Contato Excluino");
                testeContato = 1;
               
                }
              }
              }
              if (testeContato == 0 ){
                  System.out.println("Contato Não Encotrado");
              }
              break;
              
              case 4 : 
              
        }
        
    }while(op!= 4);
        System.out.println("Digite Numero Válido");
    }
}

