package pe.porject01;

import org.apache.commons.lang.StringUtils;
import pe.project19072201.*;

public class initClass {
    public static void main(String[] args) {
        System.out.println("asdasd");

        String name = null;
        System.out.println(StringUtils.isEmpty(name));

        System.out.println("vision 2 "); //주석 테스트
        System.out.println("한글테스트"); // test

        /*
        intellij Run/Debug Configurations 창에서
        VM Options 항목에 아래 내용을 추가
        -Dfile.encoding=UTF-8
        출처: https://jsyang12.tistory.com/45 [.bashrc]
        */

        new HelloIntelliJ().importEx();

    }
}
