public class diff21 {

    public int diff21(int n) {
        int result = Math.abs(21 - n);
        if (n > 21){
            return 2* result;
        }   
        return result;
    }
}
