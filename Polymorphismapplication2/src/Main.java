//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        KiralikEv kiralikev =new KiralikEv(128);
        System.out.println( kiralikev.getFiyat());

        SatilikEv satilikev=new SatilikEv(120);
        System.out.println( satilikev.getFiyat());

        FiyatHesapla fiyathesapla =new FiyatHesapla();

        fiyathesapla.Fiyat(kira);


    }
}