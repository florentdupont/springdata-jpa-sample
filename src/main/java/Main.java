import com.example.demo.MyAppRunner;
import com.example.demo.MyConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String[] args) {

        ApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);

        MyAppRunner runner = context.getBean(MyAppRunner.class);
        runner.run();
    }
}
