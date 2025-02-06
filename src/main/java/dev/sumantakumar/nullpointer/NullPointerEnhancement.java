package dev.sumantakumar.nullpointer;

public class NullPointerEnhancement {
    public static void main(String[] args) {
        String str = Math.random() > 0.5 ? null : "Hello World";
        System.out.println(str.toUpperCase());
    }
}
