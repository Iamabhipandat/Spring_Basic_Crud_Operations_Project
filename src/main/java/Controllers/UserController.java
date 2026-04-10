package Controllers;

import Service.UserService;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;

import java.util.List;
@Component
@Controller
public class UserController {
    public UserController(UserService userService) {
        this.userService = userService;
    }

    private UserService userService;

    public void createUser(String name){
        userService.adduser(name);
        System.out.println("User added " + name);

    }
     public void listUser(){
         List<String>  user = userService.getAllUser();
         System.out.println("All users " + user);
        }
}
