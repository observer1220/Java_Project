import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class Main {
    public int multiplier(int a, int b) {
        return a * b;
    }

    public void main(String[] args) {
        ArrayList<String> friends = new ArrayList<>();
        ArrayList<Integer> scores = new ArrayList<>();

        friends.add("Mike");
        friends.add("Wilson");
        friends.add("Grace");
        friends.add("Abigail");
//        System.out.println(friends);
//        System.out.println(friends.get(2));

        Collections.sort(friends);
//        System.out.println(friends);
//        System.out.println(friends.size());

//        friends.clear();
//        System.out.println(friends);

        scores.add(99);
//        System.out.println(scores.getFirst());

        int[][] my2dArray = new int[4][3];
        my2dArray[2][0] = 10;
//        System.out.println(Arrays.deepToString(my2dArray));
//        for (int i = 0; i < friends.size(); i++) {
//            System.out.println(i + 1 + ". " + friends.get(i));
//        }
//
//        for (String name : friends) {
//            System.out.println(name);
//        }

//        int counter = 0;
//        while (counter < 5) {
//            System.out.println(counter);
//            counter++;
//        }

//        for (int i = 0; i < 10; i++) {
//            for (int j = 3; j > 0; j--) {
//                System.out.println(i + ", " + j);
//            }
//        }

        for (int i = 1; i <= 10; i++) {
            if (i == 5) {
                System.out.println("停止迴圈，當 i = " + i);
                break; // Exit the loop when i equals 5
            }

            if (i % 2 == 0) {
                System.out.println("跳過偶數: " + i);
                continue; // Skip the rest of the loop body for even numbers
            }

            System.out.println("目前數字: " + i);
        }

        System.out.println(multiplier(2, 2) + multiplier(3, 3));
    }
}
