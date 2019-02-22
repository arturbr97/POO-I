
package atividadeextra;


public class AtividadeExtra {

    
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("Michael Jackson", "240");
        Cliente cliente2 = new Cliente();
        cliente2.setNome("Cyndi Lauper");
        cliente2.setCpf("987");
        
        System.out.println("Temos dois clientes: ");
        System.out.printf("Cliente 1: nome: %s; cpf: %s \n", cliente1.getNome(), cliente1.getCpf());
        System.out.printf("Cliente 2: nome: %s; cpf: %s \n", cliente2.getNome(), cliente2.getCpf());
        System.out.println("Cada cliente quer criar sua propria conta em nosso banco!");
        
        Conta conta1 = new Conta(5000, cliente1);
        Conta conta2 = new Conta();
        conta2.setSaldo(0);
        conta2.setCliente(cliente2);
        
        System.out.println("As novas contas são: ");
        System.out.printf("Conta 1: dono: %s; saldo: %s \n", conta1.getCliente().getNome(), conta1.getSaldo());
        System.out.printf("Conta 2: dono: %s; saldo: %s \n", conta2.getCliente().getNome(), conta2.getSaldo());
        
        System.out.println("Michael quer ajudar sua amiga Cyndi lhe emprestando 1000: ");
        int ajuda = 1000;
        conta1.saque(ajuda);
        conta2.deposito(ajuda);
        System.out.println("O estado das contas agora é o seguinte: ");
        System.out.printf("Conta 1: dono: %s; saldo: %s \n", conta1.getCliente().getNome(), conta1.getSaldo());
        System.out.printf("Conta 2: dono: %s; saldo: %s \n", conta2.getCliente().getNome(), conta2.getSaldo());
        
        System.out.println("Vamos ver se Cyndi está feliz: ");
        if (conta2.getSaldo() == ajuda) 
            System.out.println("Cyndi está feliz!");
        else
            System.out.println("Cyndi não está feliz!");
        
    }
    }
    

