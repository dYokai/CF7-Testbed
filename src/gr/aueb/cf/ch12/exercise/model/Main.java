package gr.aueb.cf.ch12.exercise.model;

public class Main {

    public static void main(String[] args) {
        User user = new User(1L, "Dim", "Anagn");

        UserCredentials userCredentials = new UserCredentials(1L, "Dimi", "Anagno");

        System.out.println(user.getId() + ", " + user.getLastname() + ", " + user.getFirstname());

        System.out.println(userCredentials.getId() + ", " + userCredentials.getPassword() + ", " + userCredentials.getUsername());
    }
}
