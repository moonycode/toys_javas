import java.util.Scanner; // 설문지 답 입력
public class PollScanners {
    public static void main(String[] arge){
        System.out.println(">이름을 입력하세요");       // 이름 입력요청
        try { Scanner myObj = new Scanner(System.in)      // 이름 출력
                String Fix = "이름) ";
                String UserName = myObj.nextLine();
                System.out.println( Fix + UserName );
            }    
        } catch (Exception e) {
            // TODO: handle exception
        }
         //return 0;
              
    }
}
