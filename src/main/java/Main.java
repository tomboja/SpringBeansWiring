import config.Config;
import domain.Parrot;
import domain.Person;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @ProjectName: SpringBeansWiring
 * @Author: Temesgen D.
 * @Date: 1/31/22
 */

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(Config.class);
        Parrot parrot = context.getBean(Parrot.class);
        Person person = context.getBean(Person.class);

        System.out.println("person = " + person);
        System.out.println("parrot = " + parrot);
    }
}
