package com.thoughtworks.marsrover;

import lombok.EqualsAndHashCode;

@EqualsAndHashCode
public class MarsStatus {

    private final String direction;
    private final Integer x;
    private final Integer y;

    public MarsStatus(Integer x, Integer y, String direction) {
        this.x = x;
        this.y = y;
        this.direction = direction;
    }

    public static MarsStatus from(Integer x, Integer y, String direction) {
        return new MarsStatus(x, y, direction);
    }
}
