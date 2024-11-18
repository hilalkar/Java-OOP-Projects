//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Anasinif nesne =new Altsinif();    //upcasting
        // AltSinif sinifinin ozelMetod() metodu AnaSinif sinifi icin erisilemez
        // nesne.ozelMetod(); // Hata! Çalışma zamanında hata oluşur

        if (nesne instanceof Altsinif) {
            Altsinif altnesne = (Altsinif) nesne; // Downcasting
            altnesne.OzelMetot(); // "Alt sınıfın özel metodu" yazdırır
        }


    }
}