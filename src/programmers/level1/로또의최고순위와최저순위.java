package programmers.level1;

import java.util.HashSet;

public class 로또의최고순위와최저순위 {

    public int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = new int[2];

        int cnt = 0;
        int undefinedCnt = 0;

        HashSet set = new HashSet();

        for(int w : win_nums){
            set.add(w);
        }

        for(int l : lottos){
            if(set.contains(l)){
                cnt++;
            }else if(l == 0){
                undefinedCnt++;
            }
        }

        answer[0] = 7 - (cnt + undefinedCnt) > 6  ? 6 : 7 -(cnt + undefinedCnt);

        answer[1] = 7 - (cnt) > 6  ? 6 : 7 -(cnt);


        return answer;
    }

    public static void main(String[] args) {

        int []answer = {101, 102, 103, 104, 105, 106};

        int []win_nums = {44, 1, 0, 0, 31, 25};

        로또의최고순위와최저순위 a = new 로또의최고순위와최저순위();

        int answerk [] = a.solution(answer, win_nums);

        System.out.println(answerk[0]);
        System.out.println(answerk[1]);
    }
}
