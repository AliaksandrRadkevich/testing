package com.epam.my.test.main;

import com.epam.my.test.foo.NewPrinter;
import com.epam.my.test.foo.Printer;

public class Main {

    public static void main(String[] args) {
        Printer printer = new Printer();
        printer.print("Hello world");
        NewPrinter newPrinter = new NewPrinter();
    }
}
