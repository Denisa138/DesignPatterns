package com.command;

public interface UndoableCommand extends Command {
    void unexecute();
}
