package com.duolingo.utilities;

import java.util.Scanner;

public class InputUtils {
    private static Scanner scanner = new Scanner(System.in);

    public static int readInt(String message) {
        System.out.print(message);
        while (!scanner.hasNextInt()) {
            System.out.println("Ingresa un número entero válido");
            System.out.print(message);
            scanner.next();
        }
        return scanner.nextInt();
    }

    public static String readString(String string) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'readString'");
    }
}
