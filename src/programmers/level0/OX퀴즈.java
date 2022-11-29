package programmers.level0;

public class OX퀴즈 {

    public String[] solution(String[] quiz) {

        String []result = new String[quiz.length];

        int k = 0;
        int t;
        for(String q : quiz){
            String []list = q.split(" ");
            if(list[1].equals("+") ){
                t = Integer.parseInt(list[0]) + Integer.parseInt(list[2]);

                if(list[4].equals(String.valueOf(t))){
                    result[k++] = "O";
                }else{
                    result[k++] = "X";
                }

            }else if(list[1].equals("-")){
                t = Integer.parseInt(list[0]) - Integer.parseInt(list[2]);

                if(list[4].equals(String.valueOf(t))){
                    result[k++] = "O";
                }else{
                    result[k++] = "X";
                }
            }else{
                result[k++] = "X";
            }
        }

        return result;
    }

    public static void main(String[] args) {
        OX퀴즈 a = new OX퀴즈();

        String [] array = {"3 - 4 = -3","5 + 6 = 11"};

        String [] result = a.solution(array);

        for(String key : result){
            System.out.println(key);
        }
    }
}
