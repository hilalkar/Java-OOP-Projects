public class Ev {
   private int kapiNo;
   private String sokakAdi;

   public Ev(){
       this(0,"bilinmiyor");
   }

   public Ev(int kapiNo){
       this(17,"bilinmiyor");

   }
   public Ev(int kapiNo, String sokakAdi){
       this.kapiNo=kapiNo;
       this.sokakAdi=sokakAdi;
   }
   public void setKapiNo(int kapiNo){
       this.kapiNo=kapiNo;
   }
   public int getKapiNo(){
       return kapiNo;
   }
   public void setSokakAdi(String sokakAdi){
       this.sokakAdi=sokakAdi;
   }
   public String getSokakAdi(){
       return sokakAdi;
   }

   public void bilgiGoster(){
       System.out.println( "kapi no:" + getKapiNo()+ "sokak adi:"+ getSokakAdi());
   }

}
