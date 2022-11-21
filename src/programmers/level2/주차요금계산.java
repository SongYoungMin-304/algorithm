package programmers.level2;

import java.util.*;

public class 주차요금계산 {

    class car{
        String status;
        int hour;
        int minute;
        int useMinute;
        int money;
    }


    public int[] solution(int[] fees, String[] records) {
        int[] answer = {};

        int defaultTime = fees[0];
        int defaultMoney = fees[1];

        int unitTime = fees[2];
        int unitMoney = fees[3];

        Map<String, car> map = new HashMap();

        for(String record : records){

            String []arrays = record.split(" ");

            if(!map.containsKey(arrays[1])){
                car c = new car();
                String []array2 = arrays[0].split(":");
                c.hour = Integer.parseInt(array2[0]);
                c.minute = Integer.parseInt(array2[1]);
                c.status = arrays[2];
                map.put(arrays[1],c);

            }else{

                car c = new car();
                String []array2 = arrays[0].split(":");
                c.hour = Integer.parseInt(array2[0]);
                c.minute = Integer.parseInt(array2[1]);
                c.status = arrays[2];
                c.useMinute = 0;


                // step1 IN OUT 판단
                if(arrays[2].equals("IN")){
                    car c2 = (car) map.get(arrays[1]);
                    c2.hour = Integer.parseInt(array2[0]);
                    c2.minute = Integer.parseInt(array2[1]);
                    c2.status = arrays[2];
                    map.put(arrays[1],c2);
                }else if(arrays[2].equals("OUT")){
                    car c2 = (car) map.get(arrays[1]);
                    int remainHour = Integer.parseInt(array2[0]) - c2.hour;
                    int remainminute = Integer.parseInt(array2[1]) - c2.minute;
                    c2.status = arrays[2];
                    c2.useMinute += remainHour * 60 + remainminute;
                    map.put(arrays[1],c2);
                }else{

                }
            }

        }


        // STEP4 MAP 돌리다가 IN 인거 계산해서 끝내기기
        for(String key : map.keySet()){
                car c = map.get(key);
                if(c.status.equals("IN")){
                    int remainHour = 23 - c.hour;
                    int remainminute = 59 - c.minute;
                    c.useMinute += remainHour * 60 + remainminute;
                }

                int useMinute = c.useMinute;
                int money = 0;

                useMinute-=defaultTime;
                money+=defaultMoney;
                if(useMinute > 0){
                    int t1 = useMinute/unitTime;
                    if(useMinute%unitTime!=0){
                        t1++;
                    }
                    money+=(t1*unitMoney);
                }
                c.money = money;
        }

        List<String> keyList = new ArrayList<>(map.keySet());
        keyList.sort((s1, s2) -> s1.compareTo(s2));

        int n = 0;
        answer = new int[keyList.size()];
        for (String key : keyList) {
            answer[n++] = map.get(key).money;
        }


        return answer;
    }

    public static void main(String[] args) {

        int []fees = {180, 5000, 10, 600};
        String []arr = {"05:34 5961 IN", "06:00 0000 IN", "06:34 0000 OUT", "07:59 5961 OUT", "07:59 0148 IN", "18:59 0000 IN", "19:09 0148 OUT", "22:59 5961 IN", "23:00 5961 OUT"};

        //16:00 3961 IN
        //16:00 0202 IN
        //18:00 3961 OUT
        //18:00 0202 OUT
        //23:58 3961 IN

        주차요금계산 a = new 주차요금계산();

        int [] answer = a.solution(fees, arr);
        for(int b : answer){
            System.out.println(b);
        }
    }
}
