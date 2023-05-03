package view;

import java.util.Scanner;

public class InputView {
    private static final String WELCOME_MSG = "숫자를 두 개 입력해주세요. 입력 형식은 a b 입니다.";

    static Scanner sc = new Scanner(System.in);



    public static String readWelcomeMassage(){
        System.out.println(WELCOME_MSG);

        return sc.nextLine();

    }
}
