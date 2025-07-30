package com.example.DzSpringBoot;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;

public class JavaConfig {

    @ConditionalOnProperty
    @Bean
    public SystemProfile devProfile() {
        return new DevProfile();
    }

    @ConditionalOnProperty
    @Bean
    public SystemProfile prodProfile() {
        return new ProductionProfile();
    }
}
