package pl.weeia.targowisko.targowisko.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import pl.weeia.targowisko.targowisko.domain.enity.User;
import pl.weeia.targowisko.targowisko.repository.RoleRepository;
import pl.weeia.targowisko.targowisko.repository.UserRepository;
import pl.weeia.targowisko.targowisko.service.UserService;

import java.util.HashSet;


public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;
    @Autowired
    private RoleRepository roleRepository;
    @Autowired
    private BCryptPasswordEncoder bCryptPasswordEncoder;

    @Override
    public void save(User user) {
        user.setPassword(bCryptPasswordEncoder.encode(user.getPassword()));
        user.setRoles(new HashSet<>(roleRepository.findAll()));
        userRepository.save(user);
    }

    @Override
    public User findByEmail(String email) {
        return userRepository.findByEmail(email);
    }
}
