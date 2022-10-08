
package float_sayi;


public class Float_Sayi {

    public static void main(String[] args) {
        //Float sayi carpimi
        /*
        float sayi1 = 1.5f;
        float sayi2 = 2.0f;
        
        float carpim = sayi1 * sayi2;
        
        System.out.println("Sayilarin çarpimi: "+ carpim);*/
        
        // Float sayilarin bolen ve kalanini bulmak.
      int sayi =20, bolen = 7;
      
      int bolum = sayi/ bolen;
      int kalan = sayi%bolen;
      
      System.out.println("Islem = "+ sayi+" bolu "+ bolen);
      System.out.println("Bolum= "+ bolum);
      System.out.println("Kalan= "+ kalan);
    }
    
}
