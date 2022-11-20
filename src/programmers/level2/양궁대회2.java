package programmers.level2;

public class 양궁대회2 {

    static int max = 0;
    static int []answer ={-1};

    public int[] solution(int n, int[] info) {

        int []list = {0,0,0,0,0,0,0,0,0,0,0};

        DFS(list, 0, n, info);

        return answer;
    }

    public void printout(int []list){
        for(int k : list){
            System.out.print(k);
        }
        System.out.println();
    }

    public void DFS(int []list, int depth, int n, int []info){

        if(list.length == depth){
            judge(list,n,info);
            //printout(list);
            return;
        }

        list[depth]++;
        DFS(list, depth+1, n, info);
        list[depth]--;
        DFS(list, depth+1, n, info);
    }

    public void judge(int []list, int n, int []info){

        int apacheSum = 0;
        int lionSum = 0;
        int []tempList = new int[list.length];

        for(int a = 0; a < list.length; a++){
            if(list[a]==1){
                n -= (info[a] + 1);

                if(n < 0){
                    return;
                }
                tempList[a] = (info[a] + 1);
                lionSum += (10 - a);
            }else{
                if(info[a] > 0){
                    apacheSum+= (10 - a);
                }
            }
        }

        if(lionSum == apacheSum){
            return;
        }
        else if(lionSum - apacheSum > max){
            max = lionSum - apacheSum;
            answer = tempList.clone();
            answer[list.length] += n;
        }else if(lionSum - apacheSum > 0 && lionSum - apacheSum == max){
            if(checkFinal(tempList)){
                answer = tempList.clone();
                answer[list.length] += n;
            }
        }
    }

    public boolean checkFinal(int []tempList){
        int index = 0;
        int index2 = 0;

        for(int a = 0; a < tempList.length; a++){
            if(tempList[a]>0){
                index = a;
            }

            if(answer[a]>0){
                index2 = a;
            }
        }
        if(index > index2){
            return true;
        }else if(index == index2){
            if(tempList[index] > answer[index2]){
                return true;
            }else{
                return false;
            }
        }else{
            return false;
        }

    }


    public static void main(String[] args) {

        int [] array = {2, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0};
        int n  = 5;

        양궁대회2 a = new 양궁대회2();

        a.solution(n, array);

        for(int key : answer){
            System.out.print(key);
        }
    }
}
