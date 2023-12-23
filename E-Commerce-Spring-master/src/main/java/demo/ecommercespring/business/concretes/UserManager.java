package demo.ecommercespring.business.concretes;

import demo.ecommercespring.business.abstracts.UserService;
import demo.ecommercespring.core.entities.User;
import demo.ecommercespring.core.utilities.results.DataResult;
import demo.ecommercespring.core.utilities.results.Result;
import demo.ecommercespring.core.utilities.results.SuccessDataResult;
import demo.ecommercespring.core.utilities.results.SuccessResult;
import demo.ecommercespring.dataAccess.abstracts.UserDao;
import org.springframework.stereotype.Service;

@Service
public class UserManager implements UserService {

    private UserDao userDao;

    public UserManager(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public Result add(User user) {
        this.userDao.save(user);
        return new SuccessResult("Kullanıcı eklendi");
    }

    @Override
    public DataResult<User> findByEmail(String email) {
        return new SuccessDataResult<User>
                (this.userDao.findByEmail(email),"Kullanıcı bulundu");
    }
}
