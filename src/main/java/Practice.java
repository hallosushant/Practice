import java.text.DecimalFormat;

public class Practice {

    public static void main(String[] args) {
        int[] a = {-4, 3, -9, 0, 4, 1};
        plusMinus(a);
    }
    
    static void plusMinus(int[] arr) {
        int[] nzps = {0,0,0};

        int n = arr.length;
        for(int i = 0; i< n; i++) {
            if(arr[i] < 0) {
                nzps[0] = nzps[0]+1; 
            }
                
            else if(arr[i] == 0) {
                nzps[1] = nzps[1]+1; 
            }
            else{
                nzps[2] = nzps[2]+1; 
            }
        }

        System.out.println(new DecimalFormat("#.######").format((float)nzps[2]/n));
        System.out.println(new DecimalFormat("#.######").format((float)nzps[0]/n));
        System.out.println(new DecimalFormat("#.######").format((float)nzps[1]/n));

    }
}
