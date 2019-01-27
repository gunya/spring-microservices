package com.hepexta.springmicrocervices.configuration.cfg;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {
    @Value("${application.properties.value}")
    private String applicationPropertiesValue;

    @Value("${JAVA_HOME}")
    private String systemProperty;

    @Value("${command.line.property:}")
    private String commandLineProperty;

    @Value("${application.properties.dev.value:}")
    private String applicationPropertiesDevValue;

    @Bean
    public String toPlainString() {
        return toString();
    }

    @Override
    public String toString() {
        return "Config{" +
                "applicationPropertiesValue='" + applicationPropertiesValue + '\'' +
                ", systemProperty='" + systemProperty + '\'' +
                ", commandLineProperty='" + commandLineProperty + '\'' +
                ", applicationPropertiesDevValue='" + applicationPropertiesDevValue + '\'' +
                '}';
    }
}
