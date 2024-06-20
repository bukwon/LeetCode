import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public static List<Integer> arrRowItems;

    public List<List<Integer>> groupThePeople(int[] groupSizes) {
        List<List<Integer>> answer = new ArrayList<>();
        int maxNum = Arrays.stream(groupSizes).max().getAsInt();

        for (int i = 0; i < maxNum; i++) {
            arrRowItems = new ArrayList<>();

            int j = 0;

            while (j < groupSizes.length) {
                if (groupSizes[j] == i + 1 && !answer.contains(j)) {
                    if (arrRowItems.size() >= i+1) {
                        answer.add(arrRowItems);
                        arrRowItems = new ArrayList<>();
                    }
                    arrRowItems.add(j);
                }
                j++;
            }
            if (!arrRowItems.isEmpty()) answer.add(arrRowItems);
        }
        return answer;
    }
}