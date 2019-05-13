public class FirstNonRepeatedChar {
 
    public static void main(String[] args) {
      String str = "manikantamahendra";
      for (char ch : str.toCharArray()) {
          if (str.indexOf(ch) == str.lastIndexOf(ch)) {
              System.out.println("First non repeated characted in String \""+ str + "\" is:" + ch);
              break;
          }
      }
    }
}