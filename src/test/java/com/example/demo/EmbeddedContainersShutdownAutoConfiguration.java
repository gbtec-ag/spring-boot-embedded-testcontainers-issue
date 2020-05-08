package com.example.demo;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.boot.autoconfigure.AutoConfigureOrder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.testcontainers.containers.GenericContainer;

import java.util.Arrays;

@Slf4j
@Configuration
@AutoConfigureOrder
public class EmbeddedContainersShutdownAutoConfiguration {

    @Bean
    public DisposableBean allContainers(GenericContainer... allContainers) {
        return () -> Arrays.asList(allContainers)
                .parallelStream()
                .forEach(GenericContainer::stop);
    }

}
