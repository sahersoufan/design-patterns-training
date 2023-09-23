package patterns.behavioralPatterns.command;

import java.util.ArrayList;

public class Application {
    String clipboard = "";
    ArrayList<Editor> editors = new ArrayList<>();
    Editor activeEditor = new Editor();
    CommandHistory history = new CommandHistory();


    public void setClipboard(String clipboard) {
        this.clipboard = clipboard;
    }

    public void executeCommand(Command command){
        if (command.execute()){
            history.push(command);
        }
    }

    public void undo(){
        Command command = history.pop();
        if (command != null){
            command.undo();
        }
    }
}
