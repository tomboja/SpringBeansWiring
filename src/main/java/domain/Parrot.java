package domain;

/**
 * @ProjectName: SpringBeansWiring
 * @Author: Temesgen D.
 * @Date: 1/31/22
 */

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
