package duplicatecharacters.com;

public class DUPLICATECHARACTERS {

  public static void main(String[] args){
    
    String string1 = "Attractive Color";
    int count;
    
    //Converts given string into character array
    char string[] = string1.toCharArray();
    
    System.out.println("Duplicate characters on a givan string:");
    
    //Counts each character present in the string
    for (int i=0; i <string.length; i++){
      count = 1;
    for (int j = i+1;j <string.length; j++){
      if(string[i] == string[j] && string[i] != ' '){
        count++;
        //Set  string[j] to 0 to avoid printing visited character
        string[j] = 'o';
        
      }
    }
    
    //A character is considered as duplicate if count is greater than 1
    if(count > 1 && string[i] != 'o')
    System.out.println(string[i]);
    }
  }

}
