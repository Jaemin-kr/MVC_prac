package controller;

import repo.NumRepo;
import service.AddTest;
import view.InputView;
import view.OutputView;

//서비스 호출 -> 로직구상 -> Repo 구현 후 DB연동
public class TestController {
    private AddTest addTest;


    //다른 클래스의 메서드 호출방법 1.static, 2.객체생성
    //2. 객체생성
    public TestController(){
        this.addTest = new AddTest();
    }


    public void run(){

//        System.out.println("Hi");


        addTest.adder(InputView.readWelcomeMassage());

        OutputView.printResult(addTest.findResult());
    }
}
