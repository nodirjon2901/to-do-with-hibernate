package uz.nt.todowithhibernate.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import uz.nt.todowithhibernate.entity.UserEntity;
import uz.nt.todowithhibernate.exception.AlreadyExistsException;
import uz.nt.todowithhibernate.exception.NotFoundException;
import uz.nt.todowithhibernate.exception.WrongPasswordOrUsernameException;
import uz.nt.todowithhibernate.repository.UserRepository;

import java.util.Objects;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository userRepository;

    public void save(UserEntity user) {
        UserEntity resalt = userRepository.findByUsername(user.getUsername());
        if (resalt != null) {
            throw new AlreadyExistsException("User already exists with this username");
        }
        userRepository.save(user);
    }

    public UserEntity login(String username, String password) {
        UserEntity user = userRepository.findByUsername(username);
        if (user != null) {
            if (Objects.equals(user.getPassword(), password)) {
                return user;
            }
            throw new WrongPasswordOrUsernameException("Password or username is wrong");
        }
        throw new NotFoundException("This user is not found with this username");
    }

    public UserEntity findById(UUID id) {
        return userRepository.findById(id);
    }

}
