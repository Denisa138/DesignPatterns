package com.command;

public class UndoCommand implements  Command{
    private History history;

    public UndoCommand(History history) {
        this.history = history;
    }

    public History getHistory() {
        return history;
    }

    public void setHistory(History history) {
        this.history = history;
    }

    @Override
    public void execute() {
        if(history.executedCommands() != null)
        {
            history.pop().unexecute();
        }
    }
}
