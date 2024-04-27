import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class Dice1 {
    public static void main(String[] args) {
        
//      1. 합의 법칙
        System.out.println("== 합의 법칙 ==");
//      두개의 주사위를 던졌을때 합이 3 또는 4의 배수일 경우의 수
        int[] d1 = {1, 2, 3, 4, 5, 6};
        int[] d2 = {1, 2, 3, 4, 5, 6};

        int nA = 0; //3의 배수일 경우
        int nB = 0; //4의 배수일 경우
        int nAandB = 0;

        //기본 풀이
        for(int item1 : d1){
            for(int item2 : d2){
                if((item1 + item2)%3 == 0){
                    nA += 1;
                }
                if((item1 + item2)%4 == 0){
                    nB += 1;
                }
                if((item1 + item2) == 12){
                    nAandB += 1;
                }
            }
        }
        System.out.println("결과 : " + (nA + nB - nAandB));


        //HashSet 이용
        HashSet<ArrayList> allCase = new HashSet<>();
        for(int item1 : d1){
            for(int item2 : d2){
                if((item1 + item2) %3 == 0 || (item1 + item2) %4 == 0){
                    ArrayList list = new ArrayList(Arrays.asList(item1, item2));
                    allCase.add(list);
                }
            }
        }
        System.out.println("결과 : " + allCase.size());

//      2. 곱의 법칙
        System.out.println("== 곱의 법칙 ==");
//      두개의 주사위 a, b 를 던졌을 때 a는 3의 배수, b는 4의 배수인 경우의 수
        nA=0;
        nB=0;
        for(int item1: d1){
            if(item1 % 3 == 0){
                nA++;
            }
        }
        for(int item1 : d2){
            if(item1 % 4 == 0){
                nB++;
            }
        }
        System.out.println("결과 : " + (nA*nB));



    }
}
