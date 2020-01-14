package com.thoughtworks.marsrover;

import java.util.Arrays;

public enum Direction {
    N(0), E(1), S(2), W(3);

    private int code;

    Direction(int code) {
        this.code = code;
    }

    public int getCode() {
        return code;
    }

    public static Direction valueOf(int code) {
        return Arrays.stream(Direction.values()).filter(direction -> direction.code == code).findFirst().orElse(null);
    }

    public Direction getRightDirection() {
        return Direction.valueOf((this.code + 1) % 4);
    }

    public Direction getLeftDirection() {
        return Direction.valueOf((this.code + 3) % 4);
    }

}
