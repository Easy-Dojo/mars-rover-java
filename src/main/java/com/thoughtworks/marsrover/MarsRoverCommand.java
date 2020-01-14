package com.thoughtworks.marsrover;

public interface MarsRoverCommand {
    static MarsRoverCommand form(char aChar) {
        switch (aChar) {
            case 'R':
                return new TurnRightCommand();
            case 'L':
                return new TurnLeftCommand();
            default:
                return null;
        }
    }

    MarsStatus execute(MarsStatus currentStatus);
}
