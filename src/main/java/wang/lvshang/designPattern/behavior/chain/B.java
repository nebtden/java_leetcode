package wang.lvshang.designPattern.behavior.chain;

public class B implements People{
    @Override
    public Boolean  audit(Integer price) {
        if(price>=100 && price<200 ){
            System.out.println("B 200 success");
            return true;
        }else{
            System.out.println("B 200 fail");
            return null;
        }
    }
}
