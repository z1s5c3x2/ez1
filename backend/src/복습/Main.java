package 복습;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        
        int testCases = Integer.parseInt(reader.readLine());
        for (int t = 0; t < testCases; t++) {
            int n = Integer.parseInt(reader.readLine());
            int[] sequence = new int[n];
            
            StringTokenizer tokenizer = new StringTokenizer(reader.readLine());
            for (int i = 0; i < n; i++) {
                sequence[i] = Integer.parseInt(tokenizer.nextToken());
            }

            int positiveSum = 0;
            int negativeSum = 0;
            int result = 0;

            for (int i = 0; i < n; i++) {
                int currentSum = 0;
                for (int j = i; j < n; j++) {
                    currentSum += sequence[j];

                    if (currentSum > 0) {
                        positiveSum++;
                    } else if (currentSum < 0) {
                        negativeSum++;
                    }

                    if (positiveSum > negativeSum) {
                        result++;
                    }
                }
            }

            if (result > 0) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}