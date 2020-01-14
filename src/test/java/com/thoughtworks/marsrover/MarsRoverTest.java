package com.thoughtworks.marsrover;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MarsRoverTest {

    @Test
    public void should_return_00E_when_execute_given_init_state_00N_command_R() {
        MarsRover marsRover = new MarsRover(0, 0, "N");

        final TurnRightCommand turnRightCommand = new TurnRightCommand();
        MarsStatus marsStatus = marsRover.execute(turnRightCommand);

        assertEquals(new MarsStatus(0, 0, "E"), marsStatus);
    }

    @Test
    public void should_return_00W_when_execute_given_init_state_00N_command_L() {
        MarsRover marsRover = new MarsRover(0, 0, "N");

        final TurnLeftCommand turnLeftCommand = new TurnLeftCommand();
        MarsStatus marsStatus = marsRover.execute(turnLeftCommand);

        assertEquals(new MarsStatus(0, 0, "W"), marsStatus);
    }
}
