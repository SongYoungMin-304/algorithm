package programmers.level2;

import java.util.LinkedList;
import java.util.Queue;

public class 두큐합같게만들기 {


    public int solution(int[] queue1, int[] queue2) {

            long sumA = 0;
            long sumB = 0;

            Queue<Long> q1 = new LinkedList();
            Queue<Long> q2 = new LinkedList();


            for(int a : queue1){
                q1.add((long)a);
                sumA+=a;
            }

            for(int b : queue2){
                q2.add((long)b);
                sumB+=b;
            }

            if((sumA+sumB)%2 == 1){
                return -1;
            }

            long v = (sumA+sumB)/2;

            int p1 = 0;
            int p2 = 0;
            int limit = queue1.length*2;

            while(p1 <= limit && p2 <=limit){
                if(sumA == v) return p1 + p2;
                if(sumA > v){
                    long temp = q1.poll();
                    sumA-=temp;
                    sumB+=temp;
                    q2.add(temp);
                    p1++;
                }else{
                    long temp = q2.poll();
                    sumA+=temp;
                    sumB-=temp;
                    q1.add(temp);
                    p2++;
                }
            }
            return  -1;
    }


    public static void main(String[] args) {

        int []a = {1,2,1,2,};
        int []b = {1,10,1,2};
      //  int []a = {1,1};
     //   int []b = {1,2};
        //int []a = {1,1};
        //int []b = {1,5};

        두큐합같게만들기 c = new 두큐합같게만들기();

        System.out.println(c.solution(a, b));

    }
}
