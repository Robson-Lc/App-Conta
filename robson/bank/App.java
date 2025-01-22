package robson.bank;

import java.util.Scanner;

public class App {

    public static void main (String[]args){
    Scanner scanner = new Scanner(System.in);

        //criar uma conta (Agencia, conta, nome) *
        // limitar o nome = 12 caracteres        *
        // sacar valores
        // limitar saque de acordo com o saldo
        //depositar
        //informar para o usuario as operacões (saque, deposito)


    Conta conta = new Conta("0011 ", "1234", "Nu Internacional");

    while(true){
        System.out.println("Escolha uma opção:  D= Depósito, S= saque, E= sair da conta");
        String operacao = scanner.nextLine();

        if(operacao.equals("D") || operacao.equals("d")){
            System.out.println("Qual o valor do depósito?");
            double valor = scanner.nextDouble();
            conta.Depositar(valor);
        }else if (operacao.equals("S") || operacao.equals("s")){
            System.out.println("Qual o valor do saque?");
            double valor = scanner.nextDouble();
            if(!conta.Sacar(valor)){
                System.out.println("Saldo insuficiente! Seu saldo é R$" + valor);
            }
        }else if(operacao.equals("E") || operacao.equals("e")){
            System.out.println("Finalizando operação");
            break;
        }else{
            System.out.println("Comando inválido, tente novamente");
        }
            scanner = new Scanner(System.in);
    }


    }
}
