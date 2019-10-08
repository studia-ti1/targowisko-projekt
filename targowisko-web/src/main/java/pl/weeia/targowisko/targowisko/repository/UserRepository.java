package pl.weeia.targowisko.targowisko.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.weeia.targowisko.targowisko.domain.enity.User;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByEmail(String email);
}
