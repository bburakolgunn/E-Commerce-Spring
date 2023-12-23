package demo.ecommercespring.dataAccess.abstracts;

import demo.ecommercespring.core.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserDao extends JpaRepository<User,Integer> {
    User finByEmail(String email);
}
