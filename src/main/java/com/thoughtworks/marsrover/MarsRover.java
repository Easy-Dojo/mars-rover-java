package com.thoughtworks.marsrover;

public class MarsRover {

    private final MarsStatus status;

    public MarsRover(Integer x, Integer y, String direction) {
        this.status = MarsStatus.from(x, y, direction);
    }

    public MarsStatus execute() {
        return new MarsStatus(0, 0, "E");
    }
}
