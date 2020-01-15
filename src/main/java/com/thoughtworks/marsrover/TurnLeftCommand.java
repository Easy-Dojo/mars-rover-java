package com.thoughtworks.marsrover;

public class TurnLeftCommand implements MarsRoverCommand {
    @Override
    public MarsStatus execute(MarsStatus currentStatus) {
        return new MarsStatus(currentStatus.getX(), currentStatus.getY(), currentStatus.getDirection().getLeftDirection());
    }
}
