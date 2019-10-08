package pl.weeia.targowisko.targowisko.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.weeia.targowisko.targowisko.domain.enity.Role;

public interface RoleRepository extends JpaRepository<Role, Long> {
}
