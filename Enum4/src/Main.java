//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
       /* AlanKodları için bir Enum oluşturun. Bu
        Enum’un parametre alan bir yapılandırıcısı ve
        içindeki kısaltma ve sayısal değeri döndüren iki
        metodu bulunsun. Main kısmında istediğimiz
        sabitin değerini, kısaltmayı, indisini ve sayısal
        değeri yazdıran, ayrıca tüm enum sabitlerini
        ekrana yazan programı yazın*/

        AlanKodlari secilenAlanKodu =AlanKodlari.ISTANBUL;
        System.out.println( "Seçilen alan kodu:" +secilenAlanKodu );
        System.out.println( "Kısaltması: " + secilenAlanKodu.getKisaltma());
        System.out.println( "Sayısal değeri:"+ secilenAlanKodu.getNumara());
        System.out.println( "indisi:" + secilenAlanKodu.ordinal());

        System.out.println( "tüm alan kodları:");
        for(AlanKodlari alankodlari: AlanKodlari.values()){
            System.out.println( "alan kodu:" +" - "+alankodlari.getKisaltma()+"-"+alankodlari.getNumara());
        }
    }
}