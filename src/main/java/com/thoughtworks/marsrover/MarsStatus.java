package com.thoughtworks.marsrover;

import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode
@Data
public class MarsStatus {

    private final Direction direction;
    private final Integer x;
    private final Integer y;

    public MarsStatus(Integer x, Integer y, Direction direction) {
        this.x = x;
        this.y = y;
        this.direction = direction;
    }

    public static MarsStatus from(Integer x, Integer y, Direction direction) {
        return new MarsStatus(x, y, direction);
    }
}
