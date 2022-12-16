class Student implements  Cloneable{
    private int id;
    private String name;

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}

public class ClonableTest {

    public static void main(String[] args) throws CloneNotSupportedException {

        Student s1= new Student(1,"modi");
        Student s2=(Student)s1.clone();

        System.out.println(s1);
        System.out.println(s2);



    }
}
