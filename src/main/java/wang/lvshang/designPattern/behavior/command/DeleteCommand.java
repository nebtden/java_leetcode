package wang.lvshang.designPattern.behavior.command;

public class DeleteCommand implements Command {
    private TextEditor textEditor;

    public  DeleteCommand(TextEditor textEditor){
        this.textEditor = textEditor;
    }

    @Override
    public void   execute( ){
        System.out.println("delete begin");
        textEditor.delete();
    }
}
