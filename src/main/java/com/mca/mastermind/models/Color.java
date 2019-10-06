package com.mca.mastermind.models;

/**
 * Class enum color
 * 
 * @author luisca
 *
 */
public enum Color {

    RED("r"),
    BLUE("b"),
    YELLOW("y"),
    GREEN("g"),
    ORANGE("o"),
    PURPLE("p");

    private String color;

    private Color(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public static Color getColor(String color) {
        for (Color colorEnum : Color.values()) {
            if (color.equals(colorEnum.getColor())) {
                return colorEnum;
            }
        }
        return null;
    }

    public static int length() {
        return Color.values().length;
    }

    public static String allInitials() {
        String result = "";
        for (Color colors : values()) {
            result += colors.getColor();
        }
        return result;
    }
}
