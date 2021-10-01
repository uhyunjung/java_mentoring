import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashSet;

public class HSet{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        String[] a = br.readLine().split(" ");
        HashSet<String> hs = new HashSet<>(Arrays.asList(a));

        int m = Integer.parseInt(br.readLine());
        String[] arrM = br.readLine().split(" ");
        for (int i=0; i<m; i++) {
            if (hs.contains(arrM[i])) {
                System.out.println(1);
            } else {
                System.out.println(0);
            }
        }
    }
}