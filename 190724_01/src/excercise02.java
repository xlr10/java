/*
excercise01 에서 구현할려 했던 기능을 익명클래스로 구현
ArrayList에서 값 입력시 메소드 전달없이       //add_ArrayList(arryList,10);
클래스 내부 메서드 호출로 직접 입력 구현      //System.out.println(tmp.add(10));

 */


import javax.sound.midi.Soundbank;
import java.util.ArrayList;

public class excercise02 {

    public static void main(String[] args) {

        ArrayList tmp=new ArrayList(){
            @Override
            public boolean add(Object o) {
                if(o instanceof Integer){
                    for(int i=0 ; i<(int)o; i++){
                        super.add(String.valueOf(i));
                    }
                    return true;
                }else{
                    return super.add(o);
                }
            }


        };//end class


        /*
        ArrayList의 add()의 입력값이 integer면 그만큼 "숫자" 입력
        */
        System.out.println("Anonymous Class");
        System.out.println(tmp.add(10));    //익명클래스 오버라이딩후 입력
        print_ArrayList(tmp);   //익명클래스 출력


        System.out.println("Normal");
        ArrayList<String> tmp2=new ArrayList<>();
        add_ArrayList(tmp2,10); //파라미터 전달후 입력
        print_ArrayList(tmp2);         //전달후 출력


        System.out.println("Anonymous to parameter");
        add_ArrayList(tmp,10);  //익명클래스기 때문에 해당 스코프 넘어서 add() 본래기능으로
        print_ArrayList(tmp);

        System.out.println("Inheritance ArrayList");
        excercise03 tmp3=new excercise03(); //ArrayList 상속한 클래스 이용
        tmp3.scan_ArrayList(10);
        tmp3.print_ArrayListALL();

    }

    private static void add_ArrayList(ArrayList arr,int cnt){   //ArrayList에 <> 형전달 없었는데 가능?
        for(int i = 0 ; i < cnt ; i++){
            arr.add(String.valueOf(i));
        }
    }

    private static void print_ArrayList(ArrayList arr){
        for(Object e : arr){
            System.out.println(e);
        }
    }

}
