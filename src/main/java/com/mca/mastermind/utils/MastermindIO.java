package com.mca.mastermind.utils;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import com.mca.mastermind.models.Color;

public class MastermindIO {

    private static BufferedReader bufferedReader = new BufferedReader(
            new InputStreamReader(System.in));

    public static String readString() {
        String input = null;
        try {
            input = bufferedReader.readLine();
        } catch (Exception ex) {
            writeFormatError("de cadena de caracteres");
        }
        return input;
    }

    public static List<Color> readCombination() {
        List<Color> listColor = new ArrayList<>();
        String input = null;
        try {
            input = bufferedReader.readLine();
        } catch (Exception ex) {
            writeFormatError("de cadena de caracteres");
        }
        input.chars().mapToObj(i -> (char) i).forEach(
                color -> listColor.add(Color.getColor(color.toString())));
        return listColor;
    }

    public static int readInt() {
        int input = 0;
        try {
            input = Integer.parseInt(bufferedReader.readLine());
        } catch (Exception ex) {
            writeFormatError("integer");
        }
        return input;
    }

    public static void writeln() {
        System.out.println();
    }

    public static void writetab() {
        System.out.print('\t');
    }

    public static void write(String string) {
        System.out.print(string);
    }

    public static void write(MastermindMessages mastermindMessage) {
        System.out.print(mastermindMessage.getMessage());
    }

    public static void writeln(String string) {
        System.out.println(string);
    }

    public static void writeln(MastermindMessages mastermindMessage) {
        System.out.println(mastermindMessage.getMessage());
    }

    public static void writeln(MastermindErrors mastermindErrors) {
        System.out.println(mastermindErrors.getMessage());
    }

    public static void writeError(String title, String msg) {
        writeln("!!!! " + title.toUpperCase() + ": " + msg);
        writeln();
    }

    private static void writeFormatError(String formato) {
        System.out.println("ERROR DE FORMATO! "
                + "Introduzca un valor con formato " + formato + ".");
    }
}
