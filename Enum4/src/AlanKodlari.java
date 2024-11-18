public enum AlanKodlari {

    /*Enum’lar, en kısa ifadesiyle, önceden belirlenmiş sınırlı sayıda
     sabit değerleri alabilen yeni bir tür oluşturmak için kullanılır.
     Yani, enum türünde bir değişken yalnızca kendi listesinde
     belirlenmiş değerlerden birini alabilir, başka bir değere izin verilmez
     */

    /*Değişkenlerin alabileceği değerlerin sabit
  olduğu durumlarda programı daha okunabilir
  hale getirmek için kullanılır. Birçok değişkene
  tek tek sayısal değer vermek yerine
  kullanılabilir. Yani sayıları anlamlı şekilde
  isimlendirerek kullanabilmeye izin verir.*/

    ISTANBUL(212,"IST"),
    ANKARA(312,"ANK"),
    IZMIR(232,"IZM"),
    ADANA(322,"ADA");


    private final int numara;
    private final String kisaltma;


    AlanKodlari(int numara1, String kisaltma1) {
        this.numara = numara1;
        this.kisaltma = kisaltma1;
    }

    public String getKisaltma() {
        return kisaltma;
    }

    public int getNumara() {
        return numara;
    }

}
