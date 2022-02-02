package config;

import domain.Parrot;
import domain.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @ProjectName: SpringBeansWiring
 * @Author: Temesgen D.
 * @Date: 1/31/22
 */

@Configuration
public class Config {

    @Bean
    Parrot parrot() {
        Parrot parrot = new Parrot();
        parrot.setName("Glen");
        return parrot;
    }

    @Bean
    Person person() {
        Person person = new Person();
        person.setName("Ella");
        person.setParrot(parrot());
        return person;
    }
}
