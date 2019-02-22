
package atividadeheranca;

public class Fornecedor extends Pessoa {
    private float vcredito;
    private float vdebito;
    public Fornecedor(){}
    public Fornecedor (String testenome, String testeendereço,String testetelefone,float testevcredito,float testevdebito){
        this.vcredito = testevcredito;
        this.vdebito = testevdebito;
    }

  
    public float getVcredito() {
        return vcredito;
    }

    
    public void setVcredito(float vcredito) {
        this.vcredito = vcredito;
    }

    
    public float getVdebito() {
        return vdebito;
    }

    public void setVdebito(float vdebito) {
        this.vdebito = vdebito;
    }
    public void obterSaldo(){
       
       float saldo = vcredito - vdebito;
       System.out.println("Saldo Obtido\n"+saldo);
        }
    
}
