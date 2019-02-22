
package atividadepolimorfismo;



public class Professor {
    
     String nome;
     float salario;
     float horas;
   
    public Professor(){}
    public Professor(String testenome, float testesalario,float testehoras){
        this.nome = testenome;
        this.salario = testesalario;
        this.horas = testehoras;
        
    }
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getSalario() {
        return salario;
    }

    
    public void setSalario(float salario) {
        this.salario = salario;
    }

 
    public float getHoras() {
        return horas;
    }

  
    public void setHoras(float horas) {
        this.horas = horas;
    }
    public void getSalarioBruto(){
        this.salario = (this.salario * this.horas * 10/100);
        System.out.println(this.salario);
        
    }
    public void getInfor(){
        System.out.println(this.nome);
        System.out.println(this.salario);
        System.out.println(this.horas);
        }
    public void adicionarProfessor(Professor Teste){
      Professor.add(Teste);
    }
         static void add(Professor Teste) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
