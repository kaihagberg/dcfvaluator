package com.kaihagberg.dcfvaluator

import org.springdoc.core.GroupedOpenApi
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.ComponentScan
import com.fasterxml.jackson.databind.ObjectMapper
import com.kaihagberg.dcfvaluator.fundamentaldata.companyoverview.CompanyOverview


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
