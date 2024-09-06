package util;

public class Sala {
    private Lampada lampada;
    private Interruptor interruptor;

    public Sala(Lampada lampada, Interruptor interruptor) {
        this.lampada = lampada;
        this.interruptor = interruptor;
        interruptor.conectarLampada(lampada);
    }

    public Lampada getLampada() {
        return lampada;
    }

    public Interruptor getInterruptor() {
        return interruptor;
    }

    public void ligarInterruptor() {
        interruptor.ligar();
    }

    public void desligarInterruptor() {
        interruptor.desligar();
    }
}
