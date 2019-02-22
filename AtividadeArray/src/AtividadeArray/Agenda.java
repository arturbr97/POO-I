
package AtividadeArray;

import java.util.ArrayList;

public class Agenda {
     ArrayList<Agenda> listaAgenda = new ArrayList<>();
    private String nome;
    private String fone;
    public Agenda(){}
    public Agenda(String testenome, String testefone){
        this.nome = testenome;
        this.fone = testefone;
        
    }
    public String getnome(){
        return this.nome;
        
    }
    public String getfone(){
        return this.fone;
        
    }
    public void setnome(String testenome){
        this.nome= testenome;
        
        }
    public void setfone(String testefone){
        this.fone = testefone;
    }

   
    public void adicionarContato(Agenda Teste){
        listaAgenda.add(Teste);
    }
    public void removerContato(Agenda Teste){
        listaAgenda.remove(Teste);
    }
    public void imprimirAgenda(){
        int i;
        for(i = 0 ; i<listaAgenda.size();i++){
            System.out.println("-------------------------\n");
            System.out.println(" Nome = "+listaAgenda.get(i).getnome());
            System.out.println(" Telefone = "+listaAgenda.get(i).getfone());
            System.out.println(" Posição = "+i);
            System.out.println("\n-------------------------");
            
        }
    
}
    

   
             
}
