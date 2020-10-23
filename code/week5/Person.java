public class Person {
    private int id;
    private int age;
    public Person() { id = 0; age = 20;}
    public Person(int i) { id = 0; age = i;}
    public Person(int n, int i) { id = n; age = i;}
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }
    public int getAge() { return age; }
    public void setAge(int age) { this.age = age; }
    public static void main(String[] args) {
        Person person = new Person();
        System.out.println(person.age);
    }
}
