package patterns.behavioralPatterns.command;

public class CutCommand extends Command{

    public CutCommand(Application application, Editor editor) {
        super(application, editor);
    }

    @Override
    public boolean execute() {
        saveBackup();
        application.clipboard = editor.getSelection();
        editor.deleteSelectionText();
        return true;
    }
}
