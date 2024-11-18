//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        /* this kulllanarak yapılandırıcıarın birbirini cağırdığı örnek
         */
    //parametresiz yapılandırıcı ile
    Ev ev1=new Ev();
    // tek parametreli ile
    Ev ev2= new Ev(10);
    //iki parametreli ile
    Ev ev3= new Ev(18,"sevgi sokak") ;

    ev1.bilgiGoster();
    ev2.bilgiGoster();
    ev3.bilgiGoster();


    }
}