class RemoveDupChars{
	public static void main(String[] args) {
      String str = "manikanta";
      System.out.println("The given string is: " + str);
      System.out.println("After removing duplicates characters the new string is: " + removeDupChars(str));
 }
 private static String removeDupChars(String str1) {
  char[] arr = str1.toCharArray();
  String resultStr = "";
  for (char value: arr) {
   if (resultStr.indexOf(value) == -1) {
    resultStr = resultStr + value;
   }
  }
  return resultStr;
 }
}