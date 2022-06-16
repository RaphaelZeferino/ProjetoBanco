package model;

public class Usuario {

    protected String loguin;
    protected Integer senha;

    protected Usuario usuario;

    protected Usuario usuario1;


    public Usuario(String loguin, Integer senha){
        this.loguin = loguin;
        this.senha = senha;
    }

    public String getLoguin (){return this.loguin;}

    public void setLoguin(String loguin) {this.loguin = loguin;}

    public Integer getSenha () {return  this.senha;}

    public void setSenha (Integer senha) {this.senha = senha;}

    public String logarfuncio(){
        String logado = "logado!";
        return logado;
    }

    public String deslogar(){
        String deslogado = "Deslogado";
        return deslogado;
    }

}

