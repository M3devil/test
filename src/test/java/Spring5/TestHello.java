package Spring5;

import com.study.Spring5.Config.SpringConfig;
import com.study.Spring5.autowire.Course;
import com.study.Spring5.autowire.Student;
import com.study.Spring5.bean.Java;
import com.study.Spring5.bean.Pet;
import com.study.Spring5.bean.User;
import com.study.Spring5.service.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestHello {

    @Test
    public void test1(){
        //1.加载Spring配置文件
        ApplicationContext app = new ClassPathXmlApplicationContext("bean1.xml");
        //2.获取配置创建的对象
        User user = app.getBean("user", User.class);
        //3.使用获取到的对象进行其他操作
        System.out.println(user);

        UserService userService = (UserService) app.getBean("userService");
        userService.get();
    }

    @Test
    public void test2(){
        ApplicationContext app = new ClassPathXmlApplicationContext("bean1.xml");
        Pet pet = app.getBean("pet", Pet.class);
        System.out.println(pet);
    }

    @Test
    public void test3(){
        ApplicationContext app = new ClassPathXmlApplicationContext("bean1.xml");
        Java java = app.getBean("java", Java.class);
        System.out.println(java);
    }

    @Test
    public void test4(){
        ApplicationContext app = new ClassPathXmlApplicationContext("bean1.xml");
        User myBean = app.getBean("myBean", User.class);
        System.out.println(myBean);
    }

    @Test
    public void test5(){
        ApplicationContext app = new ClassPathXmlApplicationContext("bean1.xml");
        Student student = app.getBean("student", Student.class);
        System.out.println(student);
    }

    @Test
    public void test6(){
        ApplicationContext app = new AnnotationConfigApplicationContext(SpringConfig.class);
        Student student = app.getBean("student", Student.class);
        System.out.println(student);
    }
}
