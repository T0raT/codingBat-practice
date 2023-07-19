public class startOz {
    public String startOz(String str) {
        if (str.length() == 1){
          if (str.charAt(0) == 'o' || str.charAt(0) == 'z'){
            return str;
          }
        }
        if (str.length() > 1){
          if (str.equals("oz") || str.substring(0, 2).equals("oz")){
            return "oz";
          } else if (str.charAt(0) == 'o'){
            return "o";
          } else if (str.charAt(1) == 'z'){
            return "z";
          }
        }
        return "";
      }
          
}
