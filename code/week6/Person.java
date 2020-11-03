public class Person {
    private String name;
    private int age;
    public Person() {
        this.name = "Alice";
        this.age = 22;
    }
    // super constructor
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
        
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
    public String getInfo() {
        return "Person "+ name + " is " + age;
    }

}
