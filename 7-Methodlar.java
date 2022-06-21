import java.util.Scanner;

public class Main {
  /*
  public: her taraftan erişebilmesi için,
  static: Fonksiyonumuzun direkt olarak Main içerisinde kullanılması için,
  void: return kullanıldıgı zaman cağırılmadığı anlamına geliyor.
  */
  public static void toplama(int a , int b){
    /*
    Burada klasik bir toplama fonksiyon yazıyoruz toplama(a,b) veya toplama(1,1) 
    */
    System.out.printIn("Belirttiğiniz sayıların toplamı"  + (a + b));
  }
  
  public class void main(String[] args) {
    int a = 20;
    int b = 30;
    toplama(a , b);
      /*
      */
    toplama(20,10);
  }
}

// Verilen fonksiyonda total sayıyı almamız için fonksiyonumuzu değiştirmemiz gerekiyor.

public class Main {
  /*
  public: her taraftan erişebilmesi için,
  static: Fonksiyonumuzun direkt olarak Main içerisinde kullanılması için,
  void: return kullanıldıgı zaman cağırılmadığı anlamına geliyor.
  */
  public static int toplama(int a , int b){
    return (a+b);
  }
  
  public class void main(String[] args) {
   int toplam = toplama(20,30);
   System.out.printIn("Totalleri" + toplam);
 
  }
}
