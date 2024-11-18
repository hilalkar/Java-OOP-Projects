//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static <TelefonAbstract> void main(String[] args) {


        /* absract bir telefon sınıfı oluşturup bu sınıftan
         yeni telefon sınıfları türetelim ve client kısmında
         nesne olusturarak gösterelim
         */

        AppleTelefon apple1 = new AppleTelefon(100000,"AppleTelefon","15 proMax");
        apple1.aramaYap("444444");

        TelefonAbstract telefon1= (TelefonAbstract) new SamsungTelefon(79999,"SamsungTelefon","abcd");
        telefon1.aramaYap("5397051099");
        telefon1.


    }
}