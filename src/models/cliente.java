package models;

public class cliente{
    private String nome;
    private double limiteCartao;

    public cliente(String nome, double limiteCartao) {
        this.nome = nome;
        this.limiteCartao = limiteCartao;;

    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getLimiteCartao() {
        return limiteCartao;
    }

    public void setLimiteCartao(double limiteCartao) {
        this.limiteCartao = limiteCartao;
    }
}
