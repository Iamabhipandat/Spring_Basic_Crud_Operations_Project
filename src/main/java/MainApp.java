import Config.ConfigApp;
import Controllers.UserController;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainApp {
    public static void main(String[] args) {

        ApplicationContext context =
                new AnnotationConfigApplicationContext(ConfigApp.class);
        UserController userController = context.getBean(UserController.class);
        userController.createUser("Abhinav");
        userController.listUser();
    }
}
