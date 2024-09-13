package Banco;

import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        int numero;
        String agencia;
        String nomeCliente;
        double saldo;

        System.out.println("Bem-vindo ao sistema bancário Louise's Company");
        System.out.println("Por favor, digite seu nome: ");
        nomeCliente = sc.nextLine();

        System.out.println("Perfeito " + nomeCliente + ", agora digite o número da sua agência: ");
        agencia = sc.nextLine();

        System.out.println("Certo, qual seria o número desejado para sua conta?");
        numero = Integer.parseInt(sc.nextLine());

        System.out.println("E estamos falando de uma conta com quantos milhões?");
        saldo = sc.nextDouble();

        System.out.println(nomeCliente + ", obrigada por criar uma conta em nosso banco, sua agência é " + agencia + ", o número da sua conta é: " + numero + " e seu saldo de " + saldo + " já está disponível para saque.");

    }
}
