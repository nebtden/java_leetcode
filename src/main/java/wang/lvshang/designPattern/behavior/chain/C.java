package wang.lvshang.designPattern.behavior.chain;

public class C  implements People{
    @Override
    public Boolean  audit(Integer price) {
        if(price>=300){
            System.out.println("C 100 success");
            return true;
        }else{
            System.out.println("C 200 fail");
            return null;
        }
    }
}
