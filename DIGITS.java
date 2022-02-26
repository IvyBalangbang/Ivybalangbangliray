package digits.com;

public class DIGITS {

  public static void main(String[] args) {
  
  String str = "1245679848";
  boolean result = str.matches("[0-9]+");
  System.out.println("Original String : " + str);
  System.out.println("Does string contains only Digits? ; " + result);
  
   
  }
}
