package model1;

import java.math.BigDecimal;

public class Funcionario {
    protected String nome;
    protected String cargo;
    protected Integer funcional;
    protected BigDecimal salario;

    public Funcionario (String nome, String cargo, Integer funcional, BigDecimal salario) {
        this.nome = nome;
        this.cargo = cargo;
        this.funcional = funcional;
        this.salario = salario;

    }

    public String getNome(){return this.nome;}
    public void setNome(String nome) {this.nome = nome;}

    public String getCargo(){return this.cargo;}
    public void setCargo(String cargo){this.cargo = cargo;}

    public Integer getFuncional(){return this.funcional;}
    public void setFuncional(Integer funcional){this.funcional = funcional;}

    public BigDecimal getSalario() {return this.salario;}
    public void setSalario(BigDecimal salario) {this.salario = salario;}


    public BigDecimal calcularPLR(){
        return salario.multiply(BigDecimal.valueOf(3));
    }

    public BigDecimal calcularFerias(){
        return salario.multiply(BigDecimal.valueOf(1.3));
    }

}

