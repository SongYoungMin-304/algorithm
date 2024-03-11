package programmers.study_2024.level0;

import java.util.Arrays;
import java.util.HashSet;

public class 폰케몬 {

    public int solution(int [] nums){

        HashSet set = new HashSet();

        Arrays.stream(nums).forEach(
                num -> set.add(num)
        );

        return set.size() > nums.length / 2 ? nums.length/2 : set.size();

    }

}
