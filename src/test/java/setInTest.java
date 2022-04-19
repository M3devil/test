import com.pking.config.SpringConfiguration;
import com.pking.service.impl.UserDaoImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class setInTest {
    public static void main(String[] args) {

//        new UserDaoImpl().save();

//        ApplicationContext app=new ClassPathXmlApplicationContext("applicationContext.xml");
//        UserDaoImpl userService = (UserDaoImpl) app.getBean("userService");
//        userService.save();
        ApplicationContext app=new AnnotationConfigApplicationContext(SpringConfiguration.class);
        UserDaoImpl userService = (UserDaoImpl) app.getBean("userService");
        userService.save();
    }
}
