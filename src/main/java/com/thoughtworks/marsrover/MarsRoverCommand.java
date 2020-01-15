package com.thoughtworks.marsrover;

public interface MarsRoverCommand {
    static MarsRoverCommand form(char aChar) throws InvalidCommandException {
        switch (aChar) {
            case 'R':
                return new TurnRightCommand();
            case 'L':
                return new TurnLeftCommand();
            case 'M':
                return new MoveCommand();
            default:
                throw new InvalidCommandException();
        }
    }

    MarsStatus execute(MarsStatus currentStatus);
}
