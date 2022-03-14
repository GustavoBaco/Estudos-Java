/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aula4;

import java.util.Scanner;

/**
 *
 * @author gmanc
 */
public class Aula4 {

    public static void main(String[] args) {
        Corretora corretora = new Corretora();
        Scanner scanner = new Scanner(System.in);

        corretora.agencia = "1524";
        corretora.numero = 152426;
        corretora.titular = "Samuel";
        corretora.saldo = 100000;
        int opcao = 0;
        do {
            System.out.println("Escolha uma opção: 1 - Depositar | 2 - Sacar | 3 - Investimento | 4 - Sair");
            opcao = scanner.nextInt();
            switch (opcao) {
                case 1:
                    System.out.print("Informe o valor a depositar: ");
                    double saldo = scanner.nextDouble();
                    corretora.Depositar(saldo);
                    corretora.Imprimir();
                    break;
                case 2:
                    System.out.print("Informe o valor a sacar: ");
                    saldo = scanner.nextDouble();
                    corretora.Sacar(saldo);
                    corretora.Imprimir();
                    break;
                case 3:
                    System.out.print("Informe o valor a investir: ");
                    saldo = scanner.nextDouble();
                    corretora.Imprimir();
                    break;
            }
        } while (opcao != 4);

    }
}
