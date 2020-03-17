package com.kodilla.stream.beautifier;

public class PoemBeautifier {
    public void beautify(String text, PoemDecorator poemDecorator){
        //
        String decoration = poemDecorator.decorate(text);
        System.out.println("\nOrigina tekst: " + text + "\nText after decoration: " + decoration);
    }
}
