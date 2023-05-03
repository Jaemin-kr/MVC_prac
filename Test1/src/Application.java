import controller.NameController;
import service.NameCollector;

//실제 메인문이 동작하는 공간

public class Application {
    public static void main(String[] args) {
        NameController nameController = new NameController();
        nameController.run();
    }
}
