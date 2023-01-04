package wang.lvshang.designPattern.building.clone;

public class Student{

    private static  Student student = new Student();
    private Student(){
        System.out.println("new student");
    }

    public static Student getStudent(){
        return Student.student;
    }

    private Integer id;
    private String name;
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public Student copy(){
        Student student = new Student();
        student.setId(this.id);
        student.setName(this.name);
        return student;
    }

}
