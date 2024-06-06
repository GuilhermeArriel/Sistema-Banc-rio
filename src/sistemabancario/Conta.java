package sistemabancario;

public class Conta {
    private double saldo;
    private String nome, endereco;
    private int telefone, numConta, cpf;

    public Conta(double saldo, String nome, String endereco, int telefone, int numConta, int cpf) {
        this.saldo = saldo;
        this.nome = nome;
        this.endereco = endereco;
        this.telefone = telefone;
        this.numConta = numConta;
        this.cpf = cpf;
    }

    public void depositar(double d) {
        this.setSaldo(this.getSaldo() + d);
        System.out.println("Depósito realizado com sucesso!");
    }

    public void sacar(double d) {
        if (this.getSaldo() >= d) {
            this.setSaldo(this.getSaldo() - d);
            System.out.println("Saque realizado.");
        } else {
            System.out.println("Saldo insuficiente para saque.");
        }
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public int getTelefone() {
        return telefone;
    }

    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }

    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public int getCpf() {
        return cpf;
    }

    public void setCpf(int cpf) {
        this.cpf = cpf;
    }
}

