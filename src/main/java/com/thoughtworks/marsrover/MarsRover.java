package com.thoughtworks.marsrover;

import java.util.Arrays;

public class MarsRover {

    private MarsStatus status;

    public MarsRover(Integer x, Integer y, String direction) {
        this.status = MarsStatus.from(x, y, direction);
    }

    public MarsStatus execute(MarsRoverCommand... marsRoverCommands) {
        Arrays.stream(marsRoverCommands).forEach(marsRoverCommand -> {
            this.status = marsRoverCommand.execute(status);
        });

        return status;
    }
}
