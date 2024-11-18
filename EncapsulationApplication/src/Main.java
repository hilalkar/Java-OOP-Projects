//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

  Person person =new Person("furkan","baysan",22,"hilal@hotmail.com");
 /* person.firstName="Furkan";
  person.lastName="Baysan";
  person.age=21;*/
  //person.email="furkanbaysan@hotmail.com";  email private tanımlı olduğu için hata verir

  /* person.setEmail("burakkose@gmail.com");
   System.out.println( person.getEmail());
   person.setEmail("hilalkarhotmail.com");*/

   System.out.println( person.getEmail() );
   System.out.println( person.firstName+" "+person.lastName);


}}