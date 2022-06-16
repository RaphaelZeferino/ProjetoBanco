package model;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args){
        Cliente cliente = new Cliente("Paulo",123584l,19931012,15587456900l);
        Usuario usuario = new Usuario("cliente", 1234);
        ContaCorrente conta = new ContaCorrente(54353L, 43);

        System.out.println("Olá " + cliente.getNome() + " você está, " + usuario.logarfuncio());
        System.out.println("O limite de credito da conta corrente é " + conta.getLimiteCredito());

        conta.deposita(BigDecimal.valueOf(50));
        conta.saque(BigDecimal.valueOf(20));
        conta.transferencia(BigDecimal.valueOf(12));
        conta.pedirLimiteCredito();

        System.out.println("O saldo da conta corrente é " + conta.getSaldo());
        System.out.println("O novo limite de credito da conta corrente é " + conta.getLimiteCredito());


        ContaPoupanca contaPoupanca = new ContaPoupanca(7856L, 43);

        contaPoupanca.deposita(BigDecimal.valueOf(100));
        System.out.println("O saldo da conta poupança é: " + contaPoupanca.getSaldo());
        contaPoupanca.renderJuros(1.1);
        System.out.println("O saldo da conta poupança atualizado é: " + contaPoupanca.getSaldo());


        System.out.println(cliente.getNome() + ", você esta: " + usuario.deslogar());



        Cliente cliente1 = new Cliente("Andre",689571l,19921025,28965201468l);
        Usuario usuario1 = new Usuario("cliente1", 4567);
        ContaCorrente conta1 = new ContaCorrente(45632L, 4550);


        System.out.println("\nOlá " + cliente1.getNome() + " você está, " + usuario1.logarfuncio());
        System.out.println("O limite de credito da conta corrente é " + conta1.getLimiteCredito());

        conta1.deposita(BigDecimal.valueOf(100));
        conta1.saque(BigDecimal.valueOf(20));
        conta1.transferencia(BigDecimal.valueOf(25));
        conta1.pedirLimiteCredito();

        System.out.println("O saldo da conta corrente é " + conta1.getSaldo());
        System.out.println("O novo limite de credito da conta corrente é " + conta1.getLimiteCredito());


        ContaPoupanca contaPoupanca1 = new ContaPoupanca(23516L, 4550);

        contaPoupanca1.deposita(BigDecimal.valueOf(200));
        System.out.println("O saldo da conta poupança é: " + contaPoupanca1.getSaldo());
        contaPoupanca1.renderJuros(1.1);
        System.out.println("O saldo da conta poupança atualizado é: " + contaPoupanca1.getSaldo());

        System.out.println(cliente1.getNome() + ", você esta: " + usuario.deslogar());

    }
}
