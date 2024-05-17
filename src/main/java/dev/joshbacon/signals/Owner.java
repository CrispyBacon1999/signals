package dev.joshbacon.signals;

import java.util.Optional;

class Owner {
    enum State {
        CLEAN,
        CHECK,
        DIRTY,
        DISPOSED
    }

    private Optional<Owner> parent;
    private Optional<Owner> nextSibling;
    private Optional<Owner> prevSibling;

    private State state = State.CLEAN;


}