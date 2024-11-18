//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
       /*Mağaza isminde bir sınıf ve bu sınıfın
        siparişKod , magazaKod ve
        indirim isminde 3 değişkeni olsun. Bu değişkenlerden
        yapılabildiklerinizi static yapın ve main kısmından bunlara ulaşarak
        değerlerini ekrana yazdırın.*/

        Magaza.setMagazaKod("m100");
        Magaza.setIndirim(10.30);
        Magaza magaza1=new Magaza("s123");

        // Değerleri ekrana yazdırma
        System.out.println("Sipariş Kod: " + Magaza.getSiparisKod());
        System.out.println("Mağaza Kod: " + Magaza.getMagazaKod());
        System.out.println("İndirim: " + Magaza.getIndirim() + "%");
    }
    }





