package gr.aueb.cf.ch12;

import gr.aueb.cf.ch12.model.Customer;
import gr.aueb.cf.ch12.model.Order;
import gr.aueb.cf.ch12.model.Teacher;
import gr.aueb.cf.ch12.model.User;

import java.awt.*;

public class Main {

    public static void main(String[] args) {
        Teacher teacher = new Teacher(1, "Dimitrios", "Anagnostopoulos");
        User user = new User(1, "Costas", "Mast", "cmask", "12345", true);
        Customer customer = new Customer(1, "Andrew", "Dimitriou", "07654329", "6937687654", "West Attica", "Attica", "Athens", "Patission", "76", "10434");
        Point point = new Point(0,10);
        Order order = new Order(1, 5.5, "Meat", "Ordered");

        System.out.println("Teacher full name: " + teacher.getFirstname() + ", " + teacher.getLastname());
        System.out.println("User usernamr: " + user.getUsername());
        System.out.println("Customer Vat: " + customer.getVatRegistrationNo());
        System.out.println("Order Formatted Timestamp" + order.getFormattedTimestamp());
        System.out.printf("Point: {%d, %d}", point.getX(), point.getY());
    }
}
