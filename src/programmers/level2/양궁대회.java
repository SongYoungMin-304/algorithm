package programmers.level2;

import java.util.Comparator;
import java.util.PriorityQueue;

public class 양궁대회 {


    static int answerTT[] = {-1};

    int maxValue = 0;

    public int[] solution(int n, int[] info) {

        int []result = {0,0,0,0,0,0,0,0,0,0,0};

        dfs(result, 0 , n, info);


        return answerTT;
    }

    public void dfs(int []array, int depth, int n, int []info){

        if(depth == array.length){
            judge(array,info,n);
            return;
        }

        array[depth]++;
        dfs(array, depth+1,n, info);
        array[depth]--;
        dfs(array, depth+1,n, info);
    }

    void judge(int []array, int []standard, int arrowCnt){
        int apacheSum = 0;
        int lionSum = 0;
        int tempList [] = new int[array.length];

        for(int b = 0; b < array.length; b++){
            if(array[b] == 1){
                int needCnt = standard[b] + 1;
                arrowCnt -= needCnt;
                if(arrowCnt < 0){
                    return;
                }
                tempList[b] = needCnt;
                lionSum+= (10 - b);
            }
        }

        for(int c = 0; c < standard.length; c++){
            if(array[c]!=1 && standard[c] > 0){
                apacheSum += (10 - c);
            }
        }

        if(lionSum > apacheSum && lionSum - apacheSum > maxValue){

            maxValue = lionSum - apacheSum;
            tempList[array.length -1] += arrowCnt;
            answerTT = tempList.clone();
        }
        else if(lionSum > apacheSum && lionSum - apacheSum == maxValue){
            if(check2(tempList)){
                answerTT = tempList.clone();
            }
        }else{
            // skip
        }
    }

    public boolean check2(int []arr1){

        if(answerTT.length==1){
            return true;
        }

        int index = 0;
        int index2 = 0;
        for(int a = 0; a < arr1.length; a++){
            if(arr1[a]!=0){
                index = a;
            }
        }

        for(int a = 0; a < answerTT.length; a++){
            if(answerTT[a]!=0){
                index2 = a;
            }
        }

        if(index > index2){
            return true;
        }else if(index == index2){
            if(answerTT[index]> arr1[index]){
                return false;
            }else{
                return true;
            }
        }else{
            return false;
        }
    }


    public static void main(String[] args) {


        양궁대회 a = new 양궁대회();
        int [] array = {0,0,1,2,0,1,1,1,1,1,1};
        int n  = 9;

        a.solution(n,array);


    }
}

// 1 1 1 1 1 1 1 1 1 1 1
// 1 1 1 1 1 1 1 1 1 1 0

// 1 1 1
// 1 1 0
// 1 0 1
// 1 0 0
// 0 1 1
// 0 1 0
// 0 0 1
// 0 0 0