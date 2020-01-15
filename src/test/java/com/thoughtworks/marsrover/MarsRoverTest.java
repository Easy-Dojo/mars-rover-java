package com.thoughtworks.marsrover;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MarsRoverTest {

    @Test
    public void should_return_00E_when_execute_given_init_state_00N_command_R() {
        MarsRover marsRover = new MarsRover(0, 0, Direction.N);

        MarsStatus marsStatus = marsRover.execute("R");

        assertEquals(new MarsStatus(0, 0, Direction.E), marsStatus);
    }

    @Test
    public void should_return_00S_when_execute_given_init_state_00E_command_R() {
        MarsRover marsRover = new MarsRover(0, 0, Direction.E);

        MarsStatus marsStatus = marsRover.execute("R");

        assertEquals(new MarsStatus(0, 0, Direction.S), marsStatus);
    }

    @Test
    public void should_return_00W_when_execute_given_init_state_00S_command_R() {
        MarsRover marsRover = new MarsRover(0, 0, Direction.S);

        MarsStatus marsStatus = marsRover.execute("R");

        assertEquals(new MarsStatus(0, 0, Direction.W), marsStatus);
    }

    @Test
    public void should_return_00N_when_execute_given_init_state_00W_command_R() {
        MarsRover marsRover = new MarsRover(0, 0, Direction.W);

        MarsStatus marsStatus = marsRover.execute("R");

        assertEquals(new MarsStatus(0, 0, Direction.N), marsStatus);
    }

    @Test
    public void should_return_00W_when_execute_given_init_state_00N_command_L() {
        MarsRover marsRover = new MarsRover(0, 0, Direction.N);

        MarsStatus marsStatus = marsRover.execute("L");

        assertEquals(new MarsStatus(0, 0, Direction.W), marsStatus);
    }

    @Test
    public void should_return_00S_when_execute_given_init_state_00W_command_L() {
        MarsRover marsRover = new MarsRover(0, 0, Direction.W);

        MarsStatus marsStatus = marsRover.execute("L");

        assertEquals(new MarsStatus(0, 0, Direction.S), marsStatus);
    }

    @Test
    public void should_return_00E_when_execute_given_init_state_00S_command_L() {
        MarsRover marsRover = new MarsRover(0, 0, Direction.S);

        MarsStatus marsStatus = marsRover.execute("L");

        assertEquals(new MarsStatus(0, 0, Direction.E), marsStatus);
    }

    @Test
    public void should_return_00N_when_execute_given_init_state_00E_command_L() {
        MarsRover marsRover = new MarsRover(0, 0, Direction.E);

        MarsStatus marsStatus = marsRover.execute("L");

        assertEquals(new MarsStatus(0, 0, Direction.N), marsStatus);
    }

    @Test
    public void should_return_00S_when_execute_given_init_state_00N_command_LL() {
        MarsRover marsRover = new MarsRover(0, 0, Direction.N);

        MarsStatus marsStatus = marsRover.execute("LL");

        assertEquals(new MarsStatus(0, 0, Direction.S), marsStatus);
    }

}
