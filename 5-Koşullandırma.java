import java.util.Scanner;

public class Main {
 public static void main(String[] args) {
   Scanner scanner = new Scanner(System.in)
     
     int a 
     
     System.out.printIn("Lütfen yaşınızı belirtin.");
     System.out.printIn("Lütfen cevabınızı giriniz.");
     a = scanner.nextInt()
   
     if(a < 17) {// A değişkeni 17'den küçükse
     System.out.printIn("Sitemize giriş yapamazsınız.");
     } else {
     System.out.printIn("Sitemize giriş yapabilirsiniz." a);
     } 
   /*
   */
    Scanner scanner = new Scanner(System.in);
    
    int cikan = scanner.nextInt();
  
     if(cikan === 1) {
      /// Kullanıcının girdiği input 1'e eşitse.
     System.out.printIn("Cevabınız 1 soru doğru.");

     } else if(cikan === 2) {
     /// Kullanıcının girdiği input 2'ye eşitse.
     System.out.printIn("Cevabınız 2 soru doğru.");
      
    } else if(cikan !== 2){
     /// Kullanıcının girdiği input 2'ye eşit değilse.
     System.out.printIn("cevabınız 2 değil cevabınız yanlış.");
    }
  
 }
}

// 21 Haziran 2022
