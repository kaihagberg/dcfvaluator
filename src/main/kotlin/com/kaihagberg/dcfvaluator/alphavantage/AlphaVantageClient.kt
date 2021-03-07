package com.kaihagberg.dcfvaluator.alphavantage

import org.springframework.web.client.RestTemplate
import com.kaihagberg.dcfvaluator.alphavantage.balancesheet.BalanceSheet
import com.kaihagberg.dcfvaluator.alphavantage.cashflow.CashFlow
import com.kaihagberg.dcfvaluator.alphavantage.companyoverview.CompanyOverview
import com.kaihagberg.dcfvaluator.alphavantage.earnings.Earnings
import com.kaihagberg.dcfvaluator.alphavantage.globalquote.Quote
import com.kaihagberg.dcfvaluator.alphavantage.incomestatement.IncomeStatement
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

    val quote: Quote?
        get() {
            function = "GLOBAL_QUOTE"
            return restTemplate!!.getForObject(buildURI(), Quote::class.java)
        }

    val companyOverview: CompanyOverview?
        get() {
            function = "OVERVIEW"
            return restTemplate!!.getForObject(buildURI(), CompanyOverview::class.java)
        }

    val earnings : Earnings?
        get() {
            function = "EARNINGS"
            return restTemplate!!.getForObject(buildURI(), Earnings::class.java)
        }

    val incomeStatement : IncomeStatement?
        get() {
            function = "INCOME_STATEMENT"
            return restTemplate!!.getForObject(buildURI(), IncomeStatement::class.java)
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