package com.muniao.serverconsumer.config;

import feign.Logger;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FeginLogConfig
{
    @Bean
    Logger.Level feginLogLevel()
    {
        return Logger.Level.FULL;
    }
}
