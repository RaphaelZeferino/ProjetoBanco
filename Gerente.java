package model1;

import java.math.BigDecimal;

public class Gerente extends Funcionario{

    public Gerente(String nome, String cargo, Integer funcional, BigDecimal salario) {
        super(nome, cargo, funcional, salario);
    }

    public BigDecimal calcularPLR(){
        return salario.multiply(BigDecimal.valueOf(4));
    }


}

