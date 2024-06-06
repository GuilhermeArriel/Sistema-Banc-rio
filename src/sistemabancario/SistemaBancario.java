package sistemabancario;

import java.util.Scanner;
public class SistemaBancario {

    public static void main(String[] args) {
        int resp = 5;
        String opcao;
        Scanner entrada = new Scanner(System.in);
        double d;
        double saldo;
        String nome, endereco;
        int numConta, cpf, telefone;

        ContaCorrente conta1 = null;
        ContaPoupanca conta2 = null;


        System.out.println("===============================================");
        System.out.println("=========Bem-vindo ao Sistema Bancário=========");
        System.out.println("===============================================");
        
        while(true) {
            System.out.println("Digite - [1] para cadastrar conta.");
            System.out.println("Digite - [2] para consultar conta.");
            System.out.println("Digite - [3] para depositar dinheiro.");
            System.out.println("Digite - [4] para sacar dinheiro.");
            System.out.println("Digite - [5] para sair.");
            resp = entrada.nextInt();
            entrada.nextLine(); 

            switch (resp) {
                case 1:
                    System.out.println("Você quer criar uma Conta Corrente ou Conta Poupança? [CC/CP]");
                    opcao = entrada.nextLine();
                    if (opcao.equals("CC") || opcao.equals("cc")) {
                        System.out.println("Digite o saldo: ");
                        saldo = entrada.nextDouble();
                        

                        System.out.println("Digite o nome: ");
                        nome = entrada.nextLine();

                        System.out.println("Digite o endereço: ");
                        endereco = entrada.nextLine();

                        System.out.println("Digite o telefone: ");
                        telefone = entrada.nextInt();
                        entrada.nextLine();

                        System.out.println("Digite o número da conta que deseja: ");
                        numConta = entrada.nextInt();

                        System.out.println("Digite o seu CPF: ");
                        cpf = entrada.nextInt();

                        conta1 = new ContaCorrente(saldo, nome, endereco, telefone, numConta, cpf);
                        conta1.abrirContaCorrente("CC");

                    } else if (opcao.equals("CP") || opcao.equals("cp")) {
                        System.out.println("Digite o saldo: ");
                        saldo = entrada.nextDouble();
                        entrada.nextLine();

                        System.out.println("Digite o nome: ");
                        nome = entrada.nextLine();

                        System.out.println("Digite o endereço: ");
                        endereco = entrada.nextLine();

                        System.out.println("Digite o telefone: ");
                        telefone = entrada.nextInt();
                        entrada.nextLine(); 

                        System.out.println("Digite o número da conta que deseja: ");
                        numConta = entrada.nextInt();

                        System.out.println("Digite o seu CPF: ");
                        cpf = entrada.nextInt();

                        conta2 = new ContaPoupanca(saldo, nome, endereco, telefone, numConta, cpf);
                        conta2.abrirContaPoupanca("CP");
                    }
                    break;

                case 2:
                    System.out.println("Digite o número da conta: ");
                    numConta = entrada.nextInt();
                   
                    if (conta1 != null && conta1.getNumConta() == numConta) {
                        conta1.exibirStatusCC();
                    } else if (conta2 != null && conta2.getNumConta() == numConta) {
                        conta2.exibirStatusCP();
                    } else {
                        System.out.println("Conta não encontrada.");
                    }
                    break;

                case 3:
                    System.out.println("Digite o número da conta: ");
                    numConta = entrada.nextInt();
                    System.out.println("Digite o valor a depositar: ");
                    d = entrada.nextDouble();
                    if (conta1 != null && conta1.getNumConta() == numConta) {
                        conta1.depositar(d);
                    } else if (conta2 != null && conta2.getNumConta() == numConta) {
                        conta2.depositar(d);
                    } else {
                        System.out.println("Conta não encontrada.");
                    }
                    break;

                case 4:
                    System.out.println("Digite o número da conta: ");
                    numConta = entrada.nextInt();
                    System.out.println("Digite o valor a sacar: ");
                    d = entrada.nextDouble();
                    if (conta1 != null && conta1.getNumConta() == numConta) {
                        conta1.sacar(d);
                    } else if (conta2 != null && conta2.getNumConta() == numConta) {
                        conta2.sacar(d);
                    } else {
                        System.out.println("Conta não encontrada.");
                    }
                    break;

                case 5:
                    System.out.println("Obrigado!");
                    entrada.close();
                    System.exit(0);
                    break;

                default:
                    System.out.println("Opção inválida!");
                    break;
            }
        }
    }
}
