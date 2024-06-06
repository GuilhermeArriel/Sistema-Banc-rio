package sistemabancario;


public class ContaPoupanca extends Conta {

    private boolean contaAtiva;
    private int rendimento;

    public ContaPoupanca(double saldo, String nome, String endereco, int telefone, int numConta, int cpf) {
        super(saldo, nome, endereco, telefone, numConta, cpf);
        this.rendimento = 2;
    }

    public void abrirContaPoupanca(String t) {
        if (t.equals("CP") || t.equals("cp")) {
            this.setContaAtiva(true);
            System.out.println("Conta poupança criada com sucesso!");
        }
    }

    public void depositar(double d) {
        if (this.getContaAtiva()) {
            this.setSaldo(this.getSaldo() + d);
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
                System.out.println("Saldo insuficiente para saque");
            }
        } else {
            System.out.println("Impossível sacar de uma conta fechada.");
        }
    }

    public void exibirStatusCP() {
        System.out.println("Nome: " + this.getNome());
        System.out.println("Telefone: " + this.getTelefone());
        System.out.println("Endereço: " + this.getEndereco());
        System.out.println("Número da conta: " + this.getNumConta());
        System.out.println("CPF: " + this.getCpf());
        System.out.println("Saldo: R$" + this.getSaldo());
        System.out.println("Taxa de rendimento mensal: " + this.getRendimento() + "%.");
        double calcRendimento = ((this.getRendimento() * this.getSaldo()) / 100) + this.getSaldo();
        System.out.println("Saldo com rendimento: R$" + calcRendimento);
    }

    public boolean getContaAtiva() {
        return contaAtiva;
    }

    public void setContaAtiva(boolean contaAtiva) {
        this.contaAtiva = contaAtiva;
    }

    public int getRendimento() {
        return rendimento;
    }

    public void setRendimento(int rendimento) {
        this.rendimento = rendimento;
    }
}
