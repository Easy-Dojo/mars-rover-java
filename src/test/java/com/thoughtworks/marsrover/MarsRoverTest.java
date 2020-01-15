package com.thoughtworks.marsrover;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MarsRoverTest {

    @Test
    public void should_return_00E_when_execute_given_init_state_00N_command_R() throws InvalidCommandException {
        MarsRover marsRover = new MarsRover(0, 0, Direction.N);

        MarsStatus marsStatus = marsRover.execute("R");

        assertEquals(new MarsStatus(0, 0, Direction.E), marsStatus);
    }

    @Test
    public void should_return_00S_when_execute_given_init_state_00E_command_R() throws InvalidCommandException {
        MarsRover marsRover = new MarsRover(0, 0, Direction.E);

        MarsStatus marsStatus = marsRover.execute("R");

        assertEquals(new MarsStatus(0, 0, Direction.S), marsStatus);
    }

    @Test
    public void should_return_00W_when_execute_given_init_state_00S_command_R() throws InvalidCommandException {
        MarsRover marsRover = new MarsRover(0, 0, Direction.S);

        MarsStatus marsStatus = marsRover.execute("R");

        assertEquals(new MarsStatus(0, 0, Direction.W), marsStatus);
    }

    @Test
    public void should_return_00N_when_execute_given_init_state_00W_command_R() throws InvalidCommandException {
        MarsRover marsRover = new MarsRover(0, 0, Direction.W);

        MarsStatus marsStatus = marsRover.execute("R");

        assertEquals(new MarsStatus(0, 0, Direction.N), marsStatus);
    }

    @Test
    public void should_return_00W_when_execute_given_init_state_00N_command_L() throws InvalidCommandException {
        MarsRover marsRover = new MarsRover(0, 0, Direction.N);

        MarsStatus marsStatus = marsRover.execute("L");

        assertEquals(new MarsStatus(0, 0, Direction.W), marsStatus);
    }

    @Test
    public void should_return_00S_when_execute_given_init_state_00W_command_L() throws InvalidCommandException {
        MarsRover marsRover = new MarsRover(0, 0, Direction.W);

        MarsStatus marsStatus = marsRover.execute("L");

        assertEquals(new MarsStatus(0, 0, Direction.S), marsStatus);
    }

    @Test
    public void should_return_00E_when_execute_given_init_state_00S_command_L() throws InvalidCommandException {
        MarsRover marsRover = new MarsRover(0, 0, Direction.S);

        MarsStatus marsStatus = marsRover.execute("L");

        assertEquals(new MarsStatus(0, 0, Direction.E), marsStatus);
    }

    @Test
    public void should_return_00N_when_execute_given_init_state_00E_command_L() throws InvalidCommandException {
        MarsRover marsRover = new MarsRover(0, 0, Direction.E);

        MarsStatus marsStatus = marsRover.execute("L");

        assertEquals(new MarsStatus(0, 0, Direction.N), marsStatus);
    }

    @Test
    public void should_return_00S_when_execute_given_init_state_00N_command_LL() throws InvalidCommandException {
        MarsRover marsRover = new MarsRover(0, 0, Direction.N);

        MarsStatus marsStatus = marsRover.execute("LL");

        assertEquals(new MarsStatus(0, 0, Direction.S), marsStatus);
    }

    @Test
    public void should_return_00S_when_execute_given_init_state_00N_command_RR() throws InvalidCommandException {
        MarsRover marsRover = new MarsRover(0, 0, Direction.N);

        MarsStatus marsStatus = marsRover.execute("RR");

        assertEquals(new MarsStatus(0, 0, Direction.S), marsStatus);
    }

    @Test
    public void should_return_12N_when_execute_given_init_state_11N_command_M() throws InvalidCommandException {
        MarsRover marsRover = new MarsRover(1, 1, Direction.N);

        MarsStatus marsStatus = marsRover.execute("M");

        assertEquals(new MarsStatus(1, 2, Direction.N), marsStatus);
    }

    @Test
    public void should_return_21E_when_execute_given_init_state_11E_command_M() throws InvalidCommandException {
        MarsRover marsRover = new MarsRover(1, 1, Direction.E);

        MarsStatus marsStatus = marsRover.execute("M");

        assertEquals(new MarsStatus(2, 1, Direction.E), marsStatus);
    }

    @Test
    public void should_return_10S_when_execute_given_init_state_11S_command_M() throws InvalidCommandException {
        MarsRover marsRover = new MarsRover(1, 1, Direction.S);

        MarsStatus marsStatus = marsRover.execute("M");

        assertEquals(new MarsStatus(1, 0, Direction.S), marsStatus);
    }

    @Test
    public void should_return_01W_when_execute_given_init_state_11W_command_M() throws InvalidCommandException {
        MarsRover marsRover = new MarsRover(1, 1, Direction.W);

        MarsStatus marsStatus = marsRover.execute("M");

        assertEquals(new MarsStatus(0, 1, Direction.W), marsStatus);
    }

    @Test(expected = InvalidCommandException.class)
    public void should_throw_invalid_command_exception_when_command_is_invalid() throws InvalidCommandException {
        MarsRover marsRover = new MarsRover(1, 1, Direction.W);

        MarsStatus marsStatus = marsRover.execute("MMX");
    }
}
