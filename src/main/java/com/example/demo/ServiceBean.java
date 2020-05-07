package com.example.demo;

import lombok.extern.slf4j.Slf4j;

@Slf4j
class ServiceBean {

    ServiceBean() {
        log.info("Creating service bean '{}'!", this);
    }

    void destroy() {
        log.info("Destroying service bean '{}'!", this);
    }
}
