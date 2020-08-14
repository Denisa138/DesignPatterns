package com.command;

import java.util.ArrayList;
import java.util.List;

public class History {
    List<UndoableCommand> commands = new ArrayList<>();

    public void push(UndoableCommand command)
    {
        commands.add(command);
    }

    public UndoableCommand pop()
    {
        int index = commands.size() - 1;
        if(index >= 0) {
            UndoableCommand lastCommand = commands.get(index);
            commands.remove(index);

            return lastCommand;
        }

        return null;
    }

    public List<UndoableCommand> executedCommands()
    {
        return commands;
    }
}
