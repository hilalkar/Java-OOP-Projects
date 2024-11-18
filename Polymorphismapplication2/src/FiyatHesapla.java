public @interface FiyatHesapla extends{
    public void Fiyat(Ev e){
        System.out.println( e.getIsim()+ "evin fiyatı"+e.getFiyat());
    }
}
