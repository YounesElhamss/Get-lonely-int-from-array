import java.util.Arrays;

class Main {
  public static void main(String[] args) {
    int[] arr = {1,1,2,3,3,4,4};

    System.out.println(lonelyInteger(arr)); 
  }

   public static int lonelyInteger(int[] a) {
    
    for (int i = 0; i < a.length; i++) { 
        int count = 0;
        
        for (int j = 0; j < a.length; j++) {
            if (a[i] == a[j] ){
                count++;
            }
        }
        if (count == 1) {
            return a[i];
        }
    }
     return -1;
    }
}
