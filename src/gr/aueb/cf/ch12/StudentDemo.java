package gr.aueb.cf.ch12;

public class StudentDemo {

    public static void main(String[] args) {

        Student student = new Student();

        student.setId(1);
        student.setFirstname("Alice");
        student.setLastname("W.");

        System.out.println("Id: " + student.getID());
        System.out.println("Firstname: " + student.getFirstname());
        System.out.println("Lastanme: " + student.getLastname());
    }
}
