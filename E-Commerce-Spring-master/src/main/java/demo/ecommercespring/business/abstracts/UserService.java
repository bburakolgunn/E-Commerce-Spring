package demo.ecommercespring.business.abstracts;

import demo.ecommercespring.core.entities.User;
import demo.ecommercespring.core.utilities.results.DataResult;
import demo.ecommercespring.core.utilities.results.Result;


public interface UserService {

    Result add(User user);

    DataResult<User> findByEmail(String email);


}
