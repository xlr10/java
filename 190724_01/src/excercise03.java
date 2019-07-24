import java.util.ArrayList;

public class excercise03 extends ArrayList {

    @Override
    public Object get(int index) {
        return super.get(index);
    }
    @Override
    public Object set(int index, Object element) {
        return super.set(index, element);
    }

    //ArrayList 내부 전부출력
    public void print_ArrayListALL(){
        for (Object e : this){
            System.out.print(e+" ");
        }
    }

    //ArrayList 내부 cnt 까지 숫자 자동입력
    public void scan_ArrayList(int cnt){
        for(int i=0; i<cnt; i++){
            this.add(i);
        }
    }
}
