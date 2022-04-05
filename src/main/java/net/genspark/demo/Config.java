package net.genspark.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;

@Configuration
@ComponentScan(basePackages = "net.genspark.demo")
public class Config {

    @Bean("student")
    public Employee getStudent() {
        Employee s = new Employee();
        s.setName("Carl");
        s.setId(1);
        return s;
    }

    @Bean("phones")
    public ArrayList<Phone> getPhones() {
        Phone phone1 = new Phone();
        phone1.setMobile("12345");
        Phone phone2 = new Phone();
        phone2.setMobile("54321");
        return new ArrayList<>(List.of(phone1, phone2));
    }

    @Bean("address")
    public Address getAddress() {
        Address a = new Address();
        a.setCity("Atlanta");
        a.setCountry("USA");
        a.setState("Georgia");
        a.setZip(124353);
        return a;
    }

}
