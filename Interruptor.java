package util;

public class Interruptor {
    private String nome;
    private Lampada lampada;

    public Interruptor(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void conectarLampada(Lampada lampada) {
        this.lampada = lampada;
    }

    public void ligar() {
        if (lampada != null) {
            lampada.ligar();
        }
    }

    public void desligar() {
        if (lampada != null) {
            lampada.desligar();
        }
    }
}
