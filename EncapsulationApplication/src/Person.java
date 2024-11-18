public class Person {
    //attributes
    public String firstName;
    public String lastName;
    public int age;
    private String email;

    public Person(String firstName, String lastName, int age, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        setEmail(email);
    }
    public String getEmail(){
        return email;

    }public void setEmail(String email){
       // this.email=email;
        if (email.contains("@")){               //@ kontrolü için
            this.email=email;

        }else
            this.email="Invalid email";

    }

}
