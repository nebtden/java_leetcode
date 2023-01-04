package wang.lvshang.test;

import java.util.*;

public class Main {
    public static void main(String[] args)   {
        //获取队列
        try {
            Queue<People> queue = new PriorityQueue<>();
            queue.add(new People("simon1",22));
            queue.add(new People("simon2",11));
            queue.add(new People("simon3",5));
            queue.add(new People("simon4",8));

            for (People people:queue){
                System.out.println(people.age);
            }
            for (int i = 0; i < 4; i++) {
                People people = queue.poll();
                System.out.println(people.age);
            }



        }catch (NoSuchElementException e){

            System.out.println(e.getMessage());
        }

    }
}

class PeopleCompare implements Comparator<People>{

    @Override
    public int compare(People o1, People o2) {
        if(Objects.equals(o1.age, o2.age)){
            return 0;
        }
        if(o1.age>o2.age){
            return 1;
        }else{
            return -1;
        }
    }
}

class People implements Comparable{
    public String name;
    public Integer age;

    public People(String name,Integer age){
        this.name = name;
        this.age = age;
    }

    @Override
    public int compareTo(Object o) {
        if(o instanceof People){
            People people = (People) o;
            if(Objects.equals(people.age, age)){
                return 0;
            }
            if(people.age>age){
                return -1;
            }else{
                return 1;
            }

        }else{
            return 0;
        }
    }
}

