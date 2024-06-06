package sistemabancario;


public class ContaCorrente extends Conta {

    private boolean contaAtiva;

    public ContaCorrente(double saldo, String nome, String endereco, int telefone, int numConta, int cpf) {
        super(saldo, nome, endereco, telefone, numConta, cpf);
    }

    public void abrirContaCorrente(String t) {
        if (t.equals("CC") || t.equals("cc")) {
            this.setContaAtiva(true);
            System.out.println("Conta corrente criada com sucesso!");
        }
    }

    public void depositar(double x) {
        if (this.getContaAtiva()) {
            this.setSaldo(this.getSaldo() + x);
            System.out.println("Depósito realizado com sucesso!");
            System.out.println("Saldo atual: R$" + this.getSaldo());
        } else {
            System.out.println("Impossível depositar, pois não há conta ativa.");
        }
    }

    public void sacar(double d) {
        if (this.getContaAtiva()) {
            if (this.getSaldo() >= d) {
                this.setSaldo(this.getSaldo() - d);
                System.out.println("Saque realizado na conta");
                System.out.println("Saldo atual: R$" + this.getSaldo());
            } else {
                System.out.println("Saldo insuficiente para saque.");
            }
        } else {
            System.out.println("Impossível sacar de uma conta fechada.");
        }
    }

    public void exibirStatusCC() {
        System.out.println("Nome: " + this.getNome());
        System.out.println("Telefone: " + this.getTelefone());
        System.out.println("Endereço: " + this.getEndereco());
        System.out.println("Número da conta: " + this.getNumConta());
        System.out.println("CPF: " + this.getCpf());
        System.out.println("Saldo: R$" + this.getSaldo());
    }

    public boolean getContaAtiva() {
        return contaAtiva;
    }

    public void setContaAtiva(boolean contaAtiva) {
        this.contaAtiva = contaAtiva;
    }
}
