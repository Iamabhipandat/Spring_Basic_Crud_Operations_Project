package db;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
@Component
public class DatabaseConnection {
  private List<String> users ;

  public void init(){
      users = new ArrayList<>();
      System.out.println("Database Connection Initialized (Simulation)");
  }
  public List<String> getUsers(){
      return users;
  }
  public void addUsers(String user){
      users.add(user);
  }
  public void Cleanup(){
      System.out.println("Database Connection Cleanup");
  }
}
