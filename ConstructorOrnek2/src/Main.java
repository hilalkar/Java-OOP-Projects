//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

       /* Ev isminde bir sınıfımız ve bu sınıfın kapıNo ve sokakAdı diye iki
        değişkeni olsun. Bu sınıfın 3 adet aşkın yapılandırıcısı olsun ve main
        kısmından tüm yapılandırıcıların tetiklenebileceği bir örnek yazın */

        // Parametresiz yapılandırıcı ile nesne oluşturma
        Ev ev1 = new Ev();
        // Tek parametreli yapılandırıcı ile nesne oluşturma
        Ev ev2 = new Ev(10);
        // İki parametreli yapılandırıcı ile nesne oluşturma
        Ev ev3 = new Ev(15, "Çiçek Sokak");

        // Ev bilgilerini ekranda göster
        ev1.bilgiGoster();
        ev2.bilgiGoster();
        ev3.bilgiGoster();

    }
}