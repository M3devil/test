import com.pking.config.SpringConfiguration;
import com.pking.dao.UserDao;
import com.pking.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class userDaoTest {
    public static void main(String[] args) {

//        ApplicationContext app=new ClassPathXmlApplicationContext("applicationContext.xml");
//        UserDao userDao = (UserDao) app.getBean("userDao");
//        userDao.save();
        ApplicationContext app=new AnnotationConfigApplicationContext(SpringConfiguration.class);
        UserDao userDao = app.getBean(UserDao.class);
        userDao.save();
    }
}
