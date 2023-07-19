public class missingChar {
    public String missingChar(String str, int n) {
        if (str.length() >= 2){
          return str.substring(0,n) + str.substring(n+1);
        }
        return str;
      }
      
}
