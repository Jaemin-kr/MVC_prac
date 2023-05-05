package controller;


import com.sun.net.httpserver.Authenticator;
import model.domain.CommandController;
import model.dto.CommandDto;
import service.CustomerService;
import view.InputView;
import view.OutputView;

import java.util.HashMap;
import java.util.Map;

public class Controller {

    /*
        메서드 접근
        1. Class명으로 접근 - 메서드가 static
        1. 참조변수(주소를 참조)로 접근
     */
    private final Map <CommandController, Runnable> service = new HashMap<>();
    private CustomerService customerService;
    private final InputView inputView = new InputView();
    private final OutputView outputView = new OutputView();
    public Controller() {
        this.customerService = new CustomerService();
        service.put(CommandController.FIRST, this::firstView); //1번 선택
        service.put(CommandController.SECOND, this::secondView);//2번 선택
        service.put(CommandController.THIRD, this::thridView);//3번 선택
    }
    public void run() {
        CommandController commandController = readCommand();
        do {
            try {
                service.get(commandController).run();
            } catch (IllegalArgumentException e) {
                outputView.printException(e.getMessage());
            } finally {
                commandController = readCommand();
            }

        } while (commandController.isNotQuit());
    }

    public CommandController readCommand(){
        CommandDto commandDto = Retry.execute(inputView::readCmd);
        return CommandController.from(commandDto.getCommand());
    }

    public void firstView(){
        inputView.firstMsg();
    }
    public void secondView(){
        inputView.secondMsg();
    }
    public void thridView(){
        inputView.thirdMsg();
    }

}
