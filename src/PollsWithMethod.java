import polls.PollInitailArrays;
import polls.PollScanners02;
import polls.PollStatistics;
import java.util.Scanner;

public class PollsWithMethod {
    public static void main(String[] args) {
        try {
            // 객체 생성
            Scanner sc = new Scanner(System.in);
            // 변수 선언 (초기화)
            String userName;
            String answer = "";
            String[] answers = {"", "", "", ""};
            
            PollInitailArrays pollInitailArrays = new PollInitailArrays();
            String[] initail = pollInitailArrays.init();
            System.out.println(initail.length);
            
            // 이름 입출력 (그냥 프린트 아웃) 처음 개요 만들기
            System.out.println("> 이름을 입력하세요.");
            System.out.print("이름) ");
            userName = sc.nextLine();
            System.out.println();

            // 설문 출력 & 답안 입출력 & 범위내의 숫자를 입력 (입출력)

            // 입력값을 프린트아웃 (통계)

        } catch (Exception e) {
            // TODO: handle exception
        }
        
        // return 0;
    }
}
