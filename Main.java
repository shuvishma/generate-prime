import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
//import java.nio.Buffer;

//import jdk.internal.org.jline.utils.InputStreamReader;

/**
 * Main
 */
public class Main {

    public static boolean isPrime(int n) {
        if(n==0 || n==1) {
            return false ;
        }
        if(n == 2) {
            return true ;
        }
        if(n % 2 == 0) {
            return false ;
        }
        for(int i=3; i<=Math.sqrt(n); i+=2) {
            if(n % i == 0) {
                return false ;
            }
        }
        return true ;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in)) ;
        int test = Integer.parseInt(read.readLine()) ;
        while (test-- > 0) {
            String[] str = read.readLine().trim().split(" ") ;
            int l = Integer.parseInt(str[0]) ;
            int r = Integer.parseInt(str[1]) ;
            for(int i=l; i<=r; i++) {
                if(isPrime(i)) {
                    System.out.println(i);
                }
            }
            System.out.println();
        }
    }
}