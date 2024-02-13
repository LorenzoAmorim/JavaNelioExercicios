package ArraysVetores.src.application9.entities;

public class Pessoas {
    public String name;
    public int idade;

    public Pessoas() {
    }

    public Pessoas(String name, int idade) {
        this.name = name;
        this.idade = idade;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
}
