package programmers.level3;

public class 정수삼각형2 {

    public int solution(int[][] triangle) {
        int answer = 0;

        for(int a = 1; a < triangle.length; a++)
        {
            for(int b = 0; b <=a; b++){

                if(b == 0){
                    triangle[a][b] = triangle[a][b] + triangle[a-1][b];
                }else if(a == b){
                    triangle[a][b] = triangle[a][b] + triangle[a-1][b-1];
                }else{
                    triangle[a][b] =
                            Math.max(triangle[a-1][b-1] +triangle[a][b],triangle[a-1][b] + triangle[a][b]);
                }

                //System.out.println(triangle[a][b]);
                if(triangle[a][b] > answer){
                    answer = triangle[a][b];
                }
            }
        }

        return answer;
    }

    //   7(0,0)
    //   3(1,0) 8(1,1)
    //   8(2,0) 1(2,1) 0(2,2)
    // 2 7 4 4
    //4 5 2 6 5
    public static void main(String[] args) {
        int [][] list ={{7},{3,8},{8,1,0},{2,7,4,4},{4,5,2,6,5}};

        //int [][] list ={{7},{3,8}};

        정수삼각형2 a = new 정수삼각형2();

        System.out.println(a.solution(list));
    }
}
