package wang.lvshang.designPattern.behavior.visitor;

import java.io.File;

public class Application {
    public static void main(String[] args){
        //更新处理
        FileStructure fs = new FileStructure(new File("."));
        fs.handle(new JavaFileVisitor());

    }

}




