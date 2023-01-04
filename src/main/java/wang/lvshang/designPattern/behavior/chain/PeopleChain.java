package wang.lvshang.designPattern.behavior.chain;

import java.util.ArrayList;
import java.util.List;

public class PeopleChain {
    private List<People> list = new ArrayList<>();

    public  void add(People people){
        list.add(people);
        System.out.println(list.size());
    }

    public void handle(Things things){
        for(People people:list){

            if(people.audit(things.getPrice())==null || people.audit(things.getPrice()).equals(false) ){
                continue;
            }else{
                //
                break;

            }
        }


    }
}
