package com.epam.my.test.main;

import com.epam.my.test.foo.Printer;
import com.epam.my.test.some.Something;

public class Main {

    public static void main(String[] args) {
        Printer printer = new Printer();
        printer.print("Hello world");
        Something something = new Something();
        something.bublic();
        NewPrinter newPrinter = new NewPrinter();
    }
}
