
package atividadeheranca;


public class Empregado extends Pessoa {
    private int codSetor;
    private float SalarioBase;
    private float Imposto;
    
    public Empregado(){}
    public Empregado(String testenome, String testeTelefone , String testeendereço, int testecodSetor , float testeSalarioBase, float testeImposto){
        this.codSetor = testecodSetor;
        this.SalarioBase = testeSalarioBase;
        this.Imposto = testeImposto;
        
    }

    
    public int getCodSetor() {
        return codSetor;
    }

    public void setCodSetor(int codSetor) {
        this.codSetor = codSetor;
    }

   
    public float getSalarioBase() {
        return SalarioBase;
    }

    
    public void setSalarioBase(float SalarioBase) {
        this.SalarioBase = SalarioBase;
    }

   
    public float getImposto() {
        return Imposto;
    }

    
    public void setImposto(float Imposto) {
        this.Imposto = Imposto;
    }
    public void CalcularSalario(){
        float salario = SalarioBase - ( Imposto / 100 * SalarioBase)  ;
        System.out.println("Salario Calculado Descontado Imposto "+salario);
    }
    
}
