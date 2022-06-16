package model1;

import java.math.BigDecimal;

public class Main1 {

  public static void main(String[] args){
          UsuarioFunc usuariofunc = new UsuarioFunc("funcionario", 1234);
          Gerente funcionario = new Gerente("Pedro", "Gerente", 123654, BigDecimal.valueOf(6000));
          BigDecimal plr = funcionario.calcularPLR();

      System.out.println("Olá " + funcionario.getNome() + " você está, " + usuariofunc.logarfuncio());
      System.out.println("Cargo: " + funcionario.getCargo());


      System.out.println("O pagamento referente as férias do funcionario " + funcionario.getNome() + " é de: " + funcionario.calcularFerias() + " e o valor de sua PLR será de: " + plr);

      System.out.println(usuariofunc.deslogarfunc());

          UsuarioFunc usuariofunc1 = new UsuarioFunc("funcionario1", 4567);
          Estagiario funcionario1 = new Estagiario("Alex", "Estagiario", 456820, BigDecimal.valueOf(2500));
          BigDecimal plr1 = funcionario1.calcularPLR();

      System.out.println("\nOlá " + funcionario1.getNome() + " você está, " + usuariofunc1.logarfuncio());
      System.out.println("Cargo: " + funcionario1.getCargo());

      System.out.println("O pagamento referente as férias do funcionario " + funcionario1.getNome() + " é de: " + funcionario1.calcularFerias() + " e o valor de sua PLR será de: " + plr1);

      System.out.println(usuariofunc1.deslogarfunc());

  }


}
