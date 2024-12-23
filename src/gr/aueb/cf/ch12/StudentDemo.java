package gr.aueb.cf.ch12;

public class StudentDemo {

    public static void main(String[] args) {

        Student student = new Student();
        Student bob = new Student(2, "Bob", "D.");

        student.setId(1);
        student.setFirstname("Alice");
        student.setLastname("W.");

        System.out.println("Id: " + student.getId());
        System.out.println("Firstname: " + student.getFirstname());
        System.out.println("Lastanme: " + student.getLastname());

        System.out.println("Id: " + bob.getId());
        System.out.println("Firstname: " + bob.getFirstname());
        System.out.println("Lastanme: " + bob.getLastname());
    }
}
