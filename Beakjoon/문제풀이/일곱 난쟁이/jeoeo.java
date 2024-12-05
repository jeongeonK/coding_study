import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class jeoeo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> heights = new ArrayList<>();

        for (int i = 0; i < 9; i++) {
            heights.add(sc.nextInt());
        }

        int totalSum = 0;
        for (int height : heights) {
            totalSum += height;
        }

        int falseSum = totalSum - 100;

        boolean dwaf = false;
        // 두 난쟁이 찾기
        for (int i = 0; i < heights.size(); i++) {
            for (int j = i + 1; j < heights.size(); j++) {
                if (heights.get(i) + heights.get(j) == falseSum) {
                    heights.remove(j);
                    heights.remove(i);
                    dwaf = true;
                    break;
                }
            }
            if (dwaf) {
                break;
            }
        }

        Collections.sort(heights);

        for (int height : heights) {
            System.out.println(height);
        }

        sc.close();
    }
}
