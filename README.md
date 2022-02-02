## Wiring the beans using a direct method call between the @Bean methods


When we have beans in spring context, establishing a relationship between them can be done by either
***wiring*** or ***autowiting***. 

By taking two beans of type Person and Parrot, if we want to establish a **has-A** relationship between 
the person and the parrot instances, we can do it like the following.

Parrot class
```
    public class Parrot {
        private String name;
    
        public Parrot() {
            System.out.println("Parrot Created!");
        }
    
        public String getName() {
            return name;
        }
    
        public void setName(String name) {
            this.name = name;
        }
    
        @Override
        public String toString() {
            return "Parrot{" +
                    "name='" + name + '\'' +
                    '}';
        }
    }
```

and person class: 

```
    public class Person {
        private String name;
        private Parrot parrot;
    
        public String getName() {
            return name;
        }
    
        public void setName(String name) {
            this.name = name;
        }
    
        public Parrot getParrot() {
            return parrot;
        }
    
        public void setParrot(Parrot parrot) {
            this.parrot = parrot;
        }
    
        @Override
        public String toString() {
            return "Person{" +
                    "name='" + name + '\'' +
                    ", parrot=" + parrot +
                    '}';
        }
    }
```

In these class examples, the person instance owns (has-A) parrot instance.

In the configuration class then, we do the following:

```
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
```

The important part is that, the relationship is established by calling the method that creates the ***owned***
inside the ***owning*** class.
