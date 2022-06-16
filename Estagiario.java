package model1;

import java.math.BigDecimal;

public class Estagiario extends Funcionario{

    public Estagiario(String nome, String cargo, Integer funcional,BigDecimal salario) {
        super(nome, cargo, funcional, salario);
    }

    public BigDecimal calcularPLR(){
        return salario.multiply(BigDecimal.valueOf(2));
    }


}

