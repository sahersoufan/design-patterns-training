package patterns.behavioralPatterns.command;

import java.util.ArrayList;
import java.util.Stack;

public class CommandHistory {
    private Stack<Command> history = new Stack<>();

    public void push(Command c){
        history.push(c);
    }

    public Command pop(){
        return history.pop();
    }


}
