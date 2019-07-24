/**

 @author    //클래스나 인터페이스의 제작자 표시
 @version   //버전 정보
 @return    //메서드가 void 형이 아닐경우 return 타입을 기술
 @exception //메서드가 발생 시킬 수 있는 예외를 기술
 @throws    //위와 동일
 @deprecated //다음버전에서 폐기된 메서드 알림
 @param     //매개변수에 대한 설명 (@param 변수 설명)
 @serial    //기본적으로 직렬화 할 수 있는 클래스의 멤버를 설명
 @see       //참조표시
 @since     //위의 Tag 들이 언제 추가되었는지를 명시

 출처: https://blog.hansoolabs.com/487 [한수댁 작업실 Blog]

 */

import java.util.*;


public class exercise01 {

    public static void main(String[] args) {
        ArrayList<String> arryList=new ArrayList<>();

        add_ArrayList(arryList,10);

        for(String e : arryList){
            System.out.println(e);
        }
    }

    //override 없이 파라미터 전달로 arrylist 추가
    //override 안됨 = add() 오버라이드시 아래 메소드에서 사용 불가 -> 인터페이스화?
    private static void add_ArrayList(ArrayList arr,int cnt){   //ArrayList에 <> 형전달 없었는데 가능?
        for(int i = 0 ; i < cnt ; i++){
            arr.add(String.valueOf(i));
        }
    }

    //Anonymous Class 예시
    anonymous tmp = new anonymous(){
        int num = 2;

        @Override
        void whoAmI() {
            System.out.println("I'm Anonymous");
        }
    };





    //생성자 오버라이드 제한



}
