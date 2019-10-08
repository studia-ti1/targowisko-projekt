package pl.weeia.targowisko.targowisko.service;

import pl.weeia.targowisko.targowisko.domain.enity.User;

public interface UserService {
    void save(User user);

    User findByEmail(String email);
}
