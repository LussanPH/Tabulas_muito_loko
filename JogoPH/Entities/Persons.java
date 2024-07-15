package Entities;

public class Persons {
    protected String cor;
    protected int nJogada;
    protected int casa;
    protected int status;

    public Persons(String cor, int nJogada, int casa, int status){
        this.cor = cor;
        this.nJogada = nJogada;
        this.casa = casa;
        this.status = status;
    }

    public int getCasa() {
        return casa;
    }
    public void setCasa(int casa) {
        this.casa = casa;
    }
    public String getCor() {
        return cor;
    }
    public int getStatus() {
        return status;
    }
    public int getnJogada() {
        return nJogada;
    }
    public void setStatus(int status) {
        this.status = status;
    }
    public void setnJogada(int nJogada) {
        this.nJogada = nJogada;
    }

    /**Jogar dado */
}
