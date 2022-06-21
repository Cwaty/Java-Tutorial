import java.util.Scanner;

public class Main {
 public static void main(String[] args) {

 Scanner scanner = new Scanner(System.in);
    System.out.printIn("Lütfen cevabınızı giriniz.");
    int cikan = scanner.nextInt();
  
    switch(cikan) {
     case 1:
      System.out.printIn("Cevabınız 1");
      break;
     case 2:
       System.out.printIn("Cevabınız 2");
     default:
       System.out.printIn("Cevabınız 1 veya 2 değil.");
      break;
    }
   
   /*
   ---> While
   */
   int sayı = 1;
   while(1 > 10) {
    System.out.printIn("sayı'in değeri" + sayı);
     i += 1
     /*
     1 i arttırma işlemleri 
     
     1 - i = i + 1
     2 - i = i + 2
     3 - i += 1
     */
   }
   
   int i = 0;
   while(true){ // Döngü sonsuza kadar devam ediyor.
      System.out.printIn("i'nin değeri"+i);
     if(i === 10){
       System.out.printIn("Döngüden çıkılıyor i 10 olduğunda döngü bitecek");
       break;
     }
     i++
   } 
   
   /*
   ---> For dongüsü
   */
   
   for(int i = 0; i < 10;i = i + 1){
      System.out.printIn("i'nin değeri"+i);
   }
 }

// 21 Haziran 2022
