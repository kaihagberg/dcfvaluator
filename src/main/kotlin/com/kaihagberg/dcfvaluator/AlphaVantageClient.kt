package com.kaihagberg.dcfvaluator

import org.springframework.web.client.RestTemplate
import com.kaihagberg.dcfvaluator.fundamentaldata.balancesheet.BalanceSheet
import com.kaihagberg.dcfvaluator.fundamentaldata.cashflow.CashFlow
import com.kaihagberg.dcfvaluator.fundamentaldata.companyoverview.CompanyOverview
import org.springframework.beans.factory.annotation.Value
import org.springframework.stereotype.Component
import org.springframework.web.util.UriComponentsBuilder
import java.net.URI

@Component
class AlphaVantageClient {

    public var symbol: String? = null

    @Value("\${alphavantage.apiKey}")
    private val apiKey: String? = null

    private var function: String? = null
    private var restTemplate: RestTemplate? = null

    constructor() {
        restTemplate = RestTemplate()
    }

    val companyOverview: CompanyOverview?
        get() {
            function = "OVERVIEW"
            return restTemplate!!.getForObject(buildURI(), CompanyOverview::class.java)
        }

    val balanceSheet: BalanceSheet?
        get() {
            function = "BALANCE_SHEET"
            return restTemplate!!.getForObject(buildURI(), BalanceSheet::class.java)
        }

    val cashFlow: CashFlow?
        get() {
            function = "CASH_FLOW"
            return restTemplate!!.getForObject(buildURI(), CashFlow::class.java)
        }

    private fun buildURI(): URI {
        val uriComponents = UriComponentsBuilder.newInstance()
            .scheme("https")
            .host(BASE_URL)
            .queryParam("function", function)
            .queryParam("symbol", symbol)
            .queryParam("apikey", apiKey)
            .build()
        println(uriComponents.toUriString())
        return uriComponents.toUri()
    }

    companion object {
        private const val BASE_URL = "www.alphavantage.co/query"
    }
}