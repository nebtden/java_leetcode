package wang.lvshang.designPattern.behavior.command;

public class TextEditor {
    private StringBuffer text = new StringBuffer();

    public void add(){
        text.append('t');
    }

    public void delete(){
        text.delete(0,1);
    }

    public StringBuffer getText(){
        return text;
    }

}
