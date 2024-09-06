package util;

public class Lampada {
    private String nome;
    private boolean estado; // true para ligada, false para desligada

    public Lampada(String nome) {
        this.nome = nome;
        this.estado = false; // Inicialmente desligada
    }

    public String getNome() {
        return nome;
    }

    public boolean isLigada() {
        return estado;
    }

    public void ligar() {
        estado = true;
    }

    public void desligar() {
        estado = false;
    }
}
