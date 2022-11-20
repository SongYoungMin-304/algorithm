package programmers.level0;

public class 잘라서배열로저장하기 {

    public String[] solution(String my_str, int n) {

        int k = my_str.length()/n;

        if(my_str.length()%n!=0){
            k++;
        }

        String[] answer = new String[k];


        int k2 = 0;
        for(int a = 0; a < my_str.length(); a+=n){
            if(a+n < my_str.length()){
                answer[k2++] = my_str.substring(a, a+n);
            }else{
                answer[k2++] = my_str.substring(a, my_str.length());
            }

        }

        return answer;
    }

    public static void main(String[] args) {
        String k ="abcdef123";

        잘라서배열로저장하기 a = new 잘라서배열로저장하기();

        String []answer = a.solution(k, 3);

        for(String an : answer){
            System.out.println(an);
        }
    }
}
