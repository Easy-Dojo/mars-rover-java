package com.thoughtworks.marsrover;

public interface MarsRoverCommand {
    MarsStatus execute(MarsStatus currentStatus);
}
