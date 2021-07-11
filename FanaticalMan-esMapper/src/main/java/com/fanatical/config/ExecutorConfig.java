package com.fanatical.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import java.util.concurrent.*;

@Configuration
public class ExecutorConfig {

    @Bean
    @Primary
    public ExecutorService executorService() {
        return new ThreadPoolExecutor(5, 100, 10000L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue<>());
    }
}
