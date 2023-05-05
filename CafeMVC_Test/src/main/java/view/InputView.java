package view;

import model.dto.CommandDto;

import java.util.Scanner;

public class InputView {

    static Scanner sc = new Scanner(System.in);
    private static final String WELCOME_MSG = "\n 번호를 선택해주세요 \n"
            + "1. 회원주문\n"
            + "2. 비회원주문\n"
            + "3. 회원가입\n"
            + "4. 종료";

    private static final String SELECT_MENU = "\t 메뉴판 \n";
            //db에서 끌어올때
    /*
    DAO는 서비스와 DB사이(기존에는 repo) DAO에서 JDBC를 사용해서 insert, update
    서비스에서 데이터를 정제 후 DAO, DAO는 데이터를 DB로 저장
     */

    private static final String FIRST_MGS = "회원정보를 입력해주세요";
    private static final String SECOND_MGS = "주문하실 메뉴를 골라주세요.";
    private static final String THIRD_MGS = "회원가입 정보를 입력해주세요.";

    public CommandDto readCmd(){
        System.out.println(WELCOME_MSG);
        String cmd = sc.next().toUpperCase();
        return new CommandDto(cmd);
    }
    public String firstMsg(){
        System.out.println(FIRST_MGS);
        String msg = sc.next();
        return msg;
    }
    public String secondMsg(){
        System.out.println(SECOND_MGS);
        System.out.println(WELCOME_MSG);
        String msg = sc.next();
        return msg;
    }
    public String thirdMsg(){
        System.out.println(THIRD_MGS);
        String msg = sc.next();
        return msg;
    }

}
