package br.com.vargasgabriel;

import br.com.vargasgabriel.Decorator.Base64EncoderPrintDecorator;
import br.com.vargasgabriel.Decorator.Print;
import br.com.vargasgabriel.Decorator.TextPrint;

public class Main {

    public static void main(String[] args) {
        decoratorPattern();
    }

    private static void decoratorPattern() {
        String text = "decorator pattern";
        PrintDecorator(text, false);
        PrintDecorator(text, true);
    }

    private static void PrintDecorator(String text, boolean enabledBase64Encoder) {
        Print print = new TextPrint();
        if (enabledBase64Encoder)
            print = new Base64EncoderPrintDecorator(print);

        print.print(text);
    }
}
