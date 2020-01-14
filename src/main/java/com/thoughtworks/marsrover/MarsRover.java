package com.thoughtworks.marsrover;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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

    public MarsStatus execute(String commandString) {
        List<MarsRoverCommand> marsRoverCommands = parseCommand(commandString);
        marsRoverCommands.forEach(marsRoverCommand -> this.status = marsRoverCommand.execute(status));
        return status;
    }

    private List<MarsRoverCommand> parseCommand(String commandString) {
        List<MarsRoverCommand> result = new ArrayList<>();
        char[] chars = commandString.toCharArray();
        for (char aChar : chars) {
            result.add(MarsRoverCommand.form(aChar));
        }
        return result;
    }
}
