
package atividadeextra;

public class Conta {
    private int Saldo;
    Cliente cliente;
    public Conta(){};
    public Conta(int testeSaldo, Cliente testecliente){
        this.Saldo =  testeSaldo;
        this.cliente = testecliente;
    }
    public int getSaldo(){
        return this.Saldo;
}
    public Cliente getCliente(){
        return this.cliente;
    }
    public void setSaldo(int testeSaldo){
        this.Saldo = testeSaldo;
        
    }
     public void setCliente(Cliente testecliente){
        this.cliente = testecliente;
        
    }
    
    public void deposito(float d){
        this.Saldo = (int) (this.Saldo + d);
        
    }
    
    
    public void saque(float s){
        if( this.Saldo >= s){
            
            this.Saldo = (int) (this.Saldo - s);
        }else{
           
        }
        
    }
    
    
    
    public void atualiza(float p){
        this.Saldo = (int) (this.Saldo + ( this.Saldo * p ));
    }

}
