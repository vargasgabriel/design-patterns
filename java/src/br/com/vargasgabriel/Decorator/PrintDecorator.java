package br.com.vargasgabriel.Decorator;

public class PrintDecorator implements Print {

    private final Print source;

    public PrintDecorator(Print source) {
        this.source = source;
    }

    @Override
    public void print(String text) {
        source.print(text);
    }
}
