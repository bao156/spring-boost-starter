package vn.eztek.basicstarter.repository;

import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import vn.eztek.basicstarter.entity.Role;
import vn.eztek.basicstarter.entity.RoleName;

public interface RoleRepository extends JpaRepository<Role, String> {

  Optional<Role> findByName(RoleName roleName);

}
