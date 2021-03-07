package com.kaihagberg.dcfvaluator

import org.springdoc.core.GroupedOpenApi
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.ComponentScan

@SpringBootApplication
class DcfvaluatorApplication

fun main(args: Array<String>) {
    runApplication<DcfvaluatorApplication>(*args)

    @Bean
    fun valuationApi(): GroupedOpenApi? {
        return GroupedOpenApi.builder()
            .pathsToMatch("/valuation/**")
            .build();
    }
}
