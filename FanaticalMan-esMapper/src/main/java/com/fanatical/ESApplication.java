package com.fanatical;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ESApplication {
    public static void main(String[] args) {
        SpringApplication.run(ESApplication.class,args);
    }
}
