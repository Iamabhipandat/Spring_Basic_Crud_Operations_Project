package Service;

import Repository.UserRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UserService {
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    private UserRepository userRepository;


    public void adduser(String name) {
        userRepository.save(name);
    }

    public List<String> getAllUser() {
        return userRepository.findAll();
    }
}
