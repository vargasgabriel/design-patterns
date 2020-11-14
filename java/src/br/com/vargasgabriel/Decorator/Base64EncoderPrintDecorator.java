package br.com.vargasgabriel.Decorator;

import java.nio.charset.StandardCharsets;
import java.util.Base64;

public class Base64EncoderPrintDecorator extends PrintDecorator {

    public Base64EncoderPrintDecorator(Print source) {
        super(source);
    }

    @Override
    public void print(String text) {
        super.print(Base64.getEncoder().encodeToString(text.getBytes(StandardCharsets.UTF_8)));
    }


}
