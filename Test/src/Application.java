import controller.TestController;


//시작 -> 컨트롤러(서비스 구상)
public class Application {
    public static void main(String[] args) { //psvm
        TestController testController = new TestController(); //option + cmd + v
        testController.run();
    }
}
