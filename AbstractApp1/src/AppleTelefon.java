public class AppleTelefon extends Telefon{


    public AppleTelefon(int fiyat, String marka, String model) {
        super(fiyat, marka, model);
    }

    @Override
    public void aramaYap(String numara) {
        System.out.println( getMarka()+  " " + getModel()
        + "ile " + numara + "numarasını arıyor .");

    }

    @Override
    public void mesajGonder(String numara, String icerik) {
        System.out.println( getMarka() + " " + getModel()
        + "ile " + numara + "numarasına "+ icerik + "mesajı gönderildi");

    }
}
