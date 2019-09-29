package com.mca.mastermind.models;

public enum Color {
    r, b, y, g, o, p;

    public Color getRandomColor() {
        return values()[(int) (Math.random() * values().length)];
    }

    public boolean isEqual(String color) {
        return false;
    }
}
