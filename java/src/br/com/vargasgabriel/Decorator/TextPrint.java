package br.com.vargasgabriel.Decorator;

public class TextPrint implements Print {

    @Override
    public void print(String text) {
        System.out.println(text);
    }
}
