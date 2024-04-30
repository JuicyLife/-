import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
// import java.util.Scanner;


public class bjct1 {
    public static void main(String[] args) {
        int sum = 0;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
        try{
            String str = br.readLine();
            if(str.length() !=5){
                return;
            }else{
                char[] nums = str.toCharArray();
                for(char num : nums){
                    sum += Math.pow(num -'0',5);
                }
            }
        }catch(IOException e){
            e.printStackTrace();
        }  
        System.out.println(sum);
    }
}
        //-----------------------------------
        // String num = "";
        // int sum = 0;
        // Scanner sc = new Scanner(System.in);
        
        // System.out.println("5자리 숫자를 입력하세요.");

        // num = sc.nextLine();

        // while(true){
        //     if(num.length() == 5){
        //         break;
        //     }else{
        //         System.out.println("자리 숫자가 아닙니다. 다시 입력해주세요.");
        //         num = sc.nextLine();   
        //     }

        // }
        // for(int i = 0 ; i < num.length(); i++){
        //     char num2 = num.charAt(i);
        //     sum += Math.pow(Character.getNumericValue(num2), 5);
        // }

        // System.out.println("정답 : " + sum);
        // 주석처리한 코드는 IDE에서 작성했던 코드. 정답이지만 정답 제출이 되지않아서 위의 코드로 재작성.
        //----------------------------------- 아래는 지인에게 물어보고 답변으로 받은 코드
//import java.io.BufferedReader;
//import java.io.IOException;
//import java.io.InputStreamReader;
//import java.io.OutputStreamWriter;

//public class Main {
//  public static void main(String[] args) {

//      int sum = 0;
//      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
//      try {
//          String str = null;
//          str = br.readLine();
//          if(str == null || str.length() != 5) return;
//              char[] digits = str.toCharArray();
//              for (char digit : digits) {
//                  sum += Math.pow(digit - '0', 5);
//                  }

//                  System.out.println(sum);
//          } catch (IOException e) {
//              e.printStackTrace();
//              System.out.println("Error: " + e.toString());

//         }

//     }
// }


