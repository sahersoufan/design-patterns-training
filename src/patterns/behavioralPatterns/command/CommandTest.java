package patterns.behavioralPatterns.command;

public class CommandTest {
    public static void test(){
        Application application = new Application();
        Editor editor = new Editor();

        editor.setText("Hello, World!");
        System.out.println(editor.text);


        CutCommand cutCommand = new CutCommand(application, editor);
        application.executeCommand(cutCommand);
        System.out.println(editor.text);

        PasteCommand pasteCommand = new PasteCommand(application, editor);
        application.executeCommand(pasteCommand);
        System.out.println(application.clipboard);
        System.out.println(editor.text);

        application.undo();
        System.out.println(editor.text);
        System.out.println(application.clipboard);

    }
}
