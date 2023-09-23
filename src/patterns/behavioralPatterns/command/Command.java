package patterns.behavioralPatterns.command;

abstract public class Command {
    protected Application application;
    protected Editor editor;
    protected String backup;

    public Command(Application application, Editor editor) {
        this.application = application;
        this.editor = editor;
        saveBackup();

    }

    public void saveBackup(){
        this.backup = editor.text;
    }

    public void undo(){
        editor.text = backup;
    }

    abstract public boolean execute();

}
