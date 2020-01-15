package com.thoughtworks.marsrover;

public class MoveCommand implements MarsRoverCommand {

    @Override
    public MarsStatus execute(MarsStatus currentStatus) {
        switch (currentStatus.getDirection()) {
            case N:
                return new MarsStatus(currentStatus.getX(), currentStatus.getY() + 1, currentStatus.getDirection());
            case E:
                return new MarsStatus(currentStatus.getX() + 1, currentStatus.getY(), currentStatus.getDirection());
            case S:
                return new MarsStatus(currentStatus.getX(), currentStatus.getY() - 1, currentStatus.getDirection());
            case W:
                return new MarsStatus(currentStatus.getX() - 1, currentStatus.getY(), currentStatus.getDirection());
            default:
                return currentStatus;
        }
    }
}
