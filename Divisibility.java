import java.util.*;
public class Divisibility {

    public static String CheckDivisibility(int[] arr, int n) {
        StringBuilder lastDigits = new StringBuilder();

        // Concatenate last digits of each number in the array
        for (int i = 0; i < n; i++) {
            lastDigits.append(arr[i] % 10); // Append the last digit
        }

        // Check if the last digit of the formed number is '0'
        if (lastDigits.charAt(lastDigits.length() - 1) == '0') {
            return "Yes";
        } else {
            return "No";
        }
    }
    public static void main(String args[] ) throws Exception {
        //BufferedReader
        // BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // String name = br.readLine();                // Reading input from STDIN
        
        Scanner sc= new Scanner(System.in);

        int n=sc.nextInt();
        int[] arr= new int[n];
        for(int i=0; i<n ;i++){
            arr[i]=sc.nextInt();
        }

        String ans=CheckDivisibility(arr, n);
        System.out.println(ans);

    }
}
