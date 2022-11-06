package programmers;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class 신고결과받기 {

    public int[] solution(String[] id_list, String[] report, int k) {

        int[] answer = new int[id_list.length];


        HashSet<String> hashSet = new HashSet();

        HashMap<String, ArrayList<String>> map = new HashMap<>();

        HashMap<String,Integer> resultMap = new HashMap<>();


        for(String r : report){
            hashSet.add(r);
        }


        for(String s : hashSet){
            String []arr = s.split(" ");

            ArrayList<String> list = map.get(arr[1]);
            if(list == null){
                list = new ArrayList<>();
            }

            list.add(arr[0]);
            map.put(arr[1],list);
        }


        for(String key : map.keySet()){
            if(map.get(key).size()>=k){
                ArrayList<String> list = map.get(key);
                for(String kk : list){
                    if(resultMap.containsKey(kk)){
                        resultMap.put(kk, resultMap.get(kk)+1);
                    }else{
                        resultMap.put(kk, 1);
                    }
                }
            }
        }

        for(String key : resultMap.keySet()){
            System.out.println(key);
            System.out.println(resultMap.get(key));

        }

        for(int i = 0; i<id_list.length;i++){
            if(resultMap.containsKey(id_list[i])){
                answer[i] = resultMap.get(id_list[i]);
            }else{
                answer[i] = 0;
            }
        }



        /*

        HashMap<String, Integer> checkMap = new HashMap();
        HashMap<String, Integer> resultMap = new HashMap();
        HashMap<String, Integer> finalMap = new HashMap();
        HashSet<String> checkSet = new HashSet<>();

        for(String r : report){
            String [] arr = r.split(" ");

            if(!checkMap.containsKey(r)){
                checkMap.put(r,1);
                if(resultMap.containsKey(arr[1])){
                    resultMap.put(arr[1],(Integer)resultMap.get(arr[1])+1);
                }else{
                    resultMap.put(arr[1],1);
                }
            }
        }
        // muzi  1
        // neo   2
        // frodo 2

        for(String key : resultMap.keySet()){
            if(resultMap.get(key) >= k){
                checkSet = new HashSet<>();
                for(String r : report){
                    String[] array = r.split(" ");
                    if(array[1].equals(key) && !checkSet.contains(r)){
                        checkSet.add(r);
                        if(finalMap.containsKey(array[0])){
                            finalMap.put(array[0], finalMap.get(array[0])+1);
                        }else{
                            finalMap.put(array[0],1);
                        }
                    }
                }
            }
        }

        for(int k2 = 0; k2 < id_list.length; k2++){
            if(finalMap.containsKey(id_list[k2])){
                answer[k2] = finalMap.get(id_list[k2]);
            }else{
                answer[k2] = 0;
            }
        }
*/

        return answer;
    }


    public static void main(String[] args) {

        String []a ={"muzi", "frodo", "apeach", "neo"};
        //            1       2                  2
        String []b ={"muzi frodo","apeach frodo","frodo neo","muzi neo","apeach muzi"};

        신고결과받기 c = new 신고결과받기();

        int []list = c.solution(a, b, 2);

        for(int i : list){
            System.out.println(i);
        }

    }
}
