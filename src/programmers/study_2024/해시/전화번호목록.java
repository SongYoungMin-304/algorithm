package programmers.study_2024.해시;

import java.util.Arrays;

public class 전화번호목록 {

    public boolean solution(String[] phone_book) {
        boolean answer = true;

        Arrays.sort(phone_book);

        for(int i = 0; i < phone_book.length - 1; i++){
            if(phone_book[i+1].startsWith(phone_book[i])){
                return false;
            }
        }

        return answer;
    }

    public static void main(String[] args) {

        // "119", "97674223", "1195524421"

        String [] arr = {"119","97674223","1195524421"};

        전화번호목록 a = new 전화번호목록();
        boolean solution = a.solution(arr);

        System.out.println("result : "+solution);

        Arrays.sort(arr);

        for(String b : arr){
            System.out.println(b);
        }

    }

}
