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

        boolean sucesso = conta.Sacar(200.0);
    if(!sucesso){
        System.out.println("Voçê não tem saldo suficiente para sacar");
    }

        conta.Depositar(100.0);
        conta.Depositar(100.0);
        conta.Depositar(100.0);


        if (!conta.Sacar(200.0)){
            System.out.println("Voçê não tem saldo suficiente para sacar");
        }


        if(!conta.Sacar(200.0)){
            System.out.println("Voçê não tem saldo suficiente para sacar");

        }
        System.out.println(conta);


    }
}
