//例外処理 - 0除算

package paiza;

public class Paiza9_1 {
 public static void main(String[] args) {
     System.out.println("Hello World");

     try {        
         int number = 0;
         int answer = 100 / number;
         System.out.println(answer);
     } catch (Exception e) {
         e.printStackTrace();
     } finally {
         System.out.println("Hello Java");
     }
 }
}
