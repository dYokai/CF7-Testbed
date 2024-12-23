package gr.aueb.cf.ch12;

/**
 * Data class.
 * Encapsulation
 */
public class Student {
    private int id;
    private String firstname;
    private String lastname;

        public int getID(){
            return id; // this.id
        }

        public void setId(int id){
            this.id = id;
        }

        public String getFirstname() {
            return firstname;
        }

        public void setFirstname(String firstname){
            this.firstname = firstname;
        }

        public String getLastname(){
            return lastname;
        }

        public void setLastname(String lastname){
            this.lastname = lastname;
        }
}
