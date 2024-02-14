package ArraysVetores.src.application10.entities;


public class Alunos {
    public String nome;
    public double PrimeiraNota;
    public double SegundaNota;

    public Alunos() {
    }

    public Alunos(String nome, double primeiraNota, double segundaNota) {
        this.nome = nome;
        this.PrimeiraNota = primeiraNota;
        this.SegundaNota = segundaNota;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPrimeiraNota() {
        return PrimeiraNota;
    }

    public void setPrimeiraNota(double primeiraNota) {
        this.PrimeiraNota = primeiraNota;
    }

    public double getSegundaNota() {
        return SegundaNota;
    }

    public void setSegundaNota(double segundaNota) {
        this.SegundaNota = segundaNota;
    }

    public double media() {
        return (PrimeiraNota + SegundaNota)/2;
    }
}