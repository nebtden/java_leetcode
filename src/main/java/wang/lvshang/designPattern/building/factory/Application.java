package wang.lvshang.designPattern.building.factory;

public class Application {
    public static void main(String[] args){
        LogInterface sql = LogFactory.createLog("sql");
        sql.log();

    }
}

interface LogInterface{
     void log();
}

class FileLog implements  LogInterface{

    @Override
    public void log() {
        System.out.println("this is file log");
    }
}

class SqlLog implements  LogInterface{

    @Override
    public void log() {
        System.out.println("this is sql log");
    }
}

class LogFactory{
    public static LogInterface createLog(String type){
        if(type.equals("file")){
            return new FileLog();
        }else{
            return new SqlLog();
        }
    }
}
