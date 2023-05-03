package view;

import java.util.Scanner;
//프로그램 실행시 처음 실행할 것들 구현
public class InputView {
    private static final String WELCOME_MSG = "이름을 입력하세요: 이름 구분은 \",\"로 합니다.";

    static Scanner sc = new Scanner(System.in);

    public static String startMSG(){
        System.out.println(WELCOME_MSG);

        return sc.nextLine();
    }

}
