package programmers.level3;

public class 정수삼각형 {

    static int max = 0;

    public int solution(int[][] triangle) {

        dfs(triangle, 0, 0, 0 );

        return max;
    }

    public void dfs(int [][] triangle, int depth, int n, int sum){

        sum += triangle[depth][n];


        if(depth == triangle.length - 1){
            if(sum > max){
                max = sum;
            }
            return;
        }

        dfs(triangle, depth+1,  n, sum);
        dfs(triangle, depth+1,  n+1, sum);

    }


    //    7
    //   3 8
    //  8 1 0
    // 2 7 4 4
    //4 5 2 6 5
    public static void main(String[] args) {

        int [][] list ={{7},{3,8},{8,1,0},{2,7,4,4},{4,5,2,6,5}};

        //System.out.println(list[4][4]);

        정수삼각형 a = new 정수삼각형();

        System.out.println(a.solution(list));
    }
}
