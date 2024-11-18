public class Customer {
    //attributes
    private int id;                             //encapsulation gereği private tanımladık
    private int customerNumber;
    private String firstName;
    private String lastName;
    private int age;
    public Customer(){

    }

   public Customer(int id,int customerNumber,String firstName,String lastName,int age){    //constructor tanımladık
       this.id=id;
       this.customerNumber=customerNumber;
       this.firstName=firstName;
       this.lastName=lastName;
       this.age=age;
   }
   public int getId(){                          //getter ve setterlar tanımlandı
       return id;
   }
   public void setId(int id){
       this.id=id;
   }
   public int getCustomerNumber(){
       return customerNumber;
   }
   public void setCustomerNumber(int customerNumber){
       this.customerNumber=customerNumber;
   }
   public String getFirstName(){
       return firstName;
   }
   public void setFirstName(String firstName){
       this.firstName=firstName;
   }
   public String getLastName(){
       return lastName;
   }
   public void setLastName(String lastName){
       this.lastName=lastName;
   }
   public int getAge(){
       return age;
   }
   public void setAge(int age){
       this.age=age;
   }

}
