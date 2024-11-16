package DesafioControleFluxo;

import DesafioControleFluxo.Exception.ParametrosInvalidosException;

import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner terminal = new Scanner(System.in);

        System.out.println("Digite o primeiro parâmetro");
        int parametroUm = Integer.parseInt(terminal.nextLine());

        System.out.println("Digite o segundo parâmetro");
        int parametroDois = Integer.parseInt(terminal.nextLine());

        try {
            contar(parametroUm, parametroDois);
        } catch (ParametrosInvalidosException e) {
            System.out.println(e.getMessage());
        }

    }

    static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {

        if (parametroUm > parametroDois) {
            throw new ParametrosInvalidosException();
        } else {
            int contagem = parametroDois - parametroUm;

            for (int i = 1; i <= contagem; i++) {
                System.out.println("imprimindo o número " + i);
            }
        }
    }
}
