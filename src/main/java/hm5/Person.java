package hm5;

public class Person {
    public String name;
    public String post;
    public String email;
    public float number;
    public int salary;
    public int age;

    public int getAge() {
        return age;
    }

    public Person (String name, String post, String email, float number, int salary, int age)   {
            this.name = name;
            this.post = post;
            this.email = email;
            this.number = number;
            this.salary = salary;
            this.age= age;
    }
    void print () {
        System.out.println("Name:" +name+ "\n" + "Post:" + post+ "\n" + "Email:" +email+ "\n"+
                "Phone:"+number+ "\n" + "Salary:"  +salary+ "\n" + "Age:" + age+ "\n");
    }
}



