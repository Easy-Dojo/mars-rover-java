package com.thoughtworks.marsrover;

public class TurnLeftCommand implements MarsRoverCommand {
    @Override
    public MarsStatus execute(MarsStatus currentStatus) {
        return new MarsStatus(0, 0, Direction.W);
    }
}
