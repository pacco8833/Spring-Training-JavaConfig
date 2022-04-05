package net.genspark.demo;

import org.springframework.stereotype.Component;

@Component
public class Phone {

    private String mobile;

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    @Override
    public String toString() {
        return mobile;
    }
}
