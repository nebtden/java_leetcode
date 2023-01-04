package wang.lvshang.designPattern.behavior.command;

public class Application {
    public static void main(String[] args){
        TextEditor textEditor = new TextEditor();

        Command command = new AddCommand(textEditor);
        command.execute();
        command.execute();

        System.out.println(textEditor.getText());

        Command command2 = new DeleteCommand(textEditor);
        command2.execute();
        System.out.println(textEditor.getText());

    }

}




