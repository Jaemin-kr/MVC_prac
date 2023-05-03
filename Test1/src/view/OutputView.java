package view;

import java.util.ArrayList;
//프로그램 실행결과를 반환하는 부분
public class OutputView {

    public static void printResult(ArrayList<String> str){
        for (String s : str) {
            System.out.print(s + " ");
        }
    }
}
