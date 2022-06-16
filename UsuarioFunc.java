package model1;

public class UsuarioFunc {
    protected String loguin;
    protected Integer senha;

    protected UsuarioFunc usuariofunc;

    protected UsuarioFunc usuariofunc1;

    public UsuarioFunc(String loguin, Integer senha){
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

    public String deslogarfunc(){
        String deslogado = "Deslogado!";
        return deslogado;
    }
}

