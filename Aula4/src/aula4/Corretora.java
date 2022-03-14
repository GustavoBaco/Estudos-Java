/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula4;

/**
 *
 * @author gmanc
 */
public class Corretora {

    public int numero;
    public String agencia;
    public String titular;
    public double saldo;

    public void Depositar(double valor) {

        double soma;

        soma = saldo + valor;

        saldo = soma;
    }

    ;
   
   public void Sacar(double valor) {
        if (saldo < valor) {
            System.out.println("Saldo insuficiente para saque !");
        } else {
            double saque;
            saque = saldo - valor;
            saldo = saque;
        }
    }

    ;
   
   public void Investimento() {

        double investimento;

        investimento = saldo * 1.05;
        saldo = investimento;

    }

    ;
   public void Imprimir() {
        System.out.println("Número: " + this.numero);

        System.out.println("Agência: " + this.agencia);

        System.out.println("Titular: " + this.titular);

        System.out.println("Saldo Total: R$ " + this.saldo);
    }
}
