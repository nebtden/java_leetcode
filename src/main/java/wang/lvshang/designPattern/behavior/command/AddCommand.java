package wang.lvshang.designPattern.behavior.command;

public class AddCommand implements Command {

    private TextEditor textEditor;

    public  AddCommand(TextEditor textEditor){
        this.textEditor = textEditor;
    }

    @Override
    public void   execute( ){
        System.out.println("add begin");
        textEditor.add();
    }
}
