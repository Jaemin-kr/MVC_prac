package controller;

import service.NameCollector;
import view.InputView;
import view.OutputView;

public class NameController {
    private NameCollector nameCollector;

    public NameController(){
        this.nameCollector = new NameCollector();
    }

    public void run(){
        nameCollector.nameCollect(InputView.startMSG());

        OutputView.printResult(nameCollector.findResult());
    }

}
