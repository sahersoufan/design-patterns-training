package patterns.behavioralPatterns.command;

public class Editor {

    String text = "";

    public String getSelection(){
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public void deleteSelectionText(){
        this.text = "";
    }

    public void replaceSelection(String text){
        this.text = text;
    }

}
