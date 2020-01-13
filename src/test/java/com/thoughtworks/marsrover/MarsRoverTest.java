package com.thoughtworks.marsrover;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MarsRoverTest {

    @Test
    public void should_return_00E_when_execute_given_init_state_00N_command_R() {
        MarsRover marsRover = new MarsRover(0, 0, "N");

        MarsStatus marsStatus = marsRover.execute();
        assertEquals(new MarsStatus(0, 0, "E"), marsStatus);

    }
}
