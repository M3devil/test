import com.pking.config.SpringConfiguration;
import com.pking.dao.UserDao;
import com.pking.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.sql.DataSource;
import java.sql.SQLException;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {SpringConfiguration.class})
//@ContextConfiguration("classpath:applicationContext.xml")
public class SpringJunitTest {
    @Autowired
    private UserService userService;

    @Autowired
    private DataSource dataSource;

    @Autowired
    private UserDao userDao;
    @Test
    public void test() throws SQLException {
        userService.save();
        System.out.println(dataSource.getConnection());
        userDao.save();
    }
}
