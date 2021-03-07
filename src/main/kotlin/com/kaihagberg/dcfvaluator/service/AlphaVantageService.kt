package com.kaihagberg.dcfvaluator.service

import com.kaihagberg.dcfvaluator.alphavantage.balancesheet.BalanceSheet
import com.kaihagberg.dcfvaluator.alphavantage.AlphaVantageClient
import com.kaihagberg.dcfvaluator.alphavantage.cashflow.CashFlow
import com.kaihagberg.dcfvaluator.alphavantage.companyoverview.CompanyOverview
import com.kaihagberg.dcfvaluator.alphavantage.earnings.Earnings
import com.kaihagberg.dcfvaluator.alphavantage.globalquote.Quote
import com.kaihagberg.dcfvaluator.alphavantage.incomestatement.IncomeStatement
import org.springframework.stereotype.Service

@Service
class AlphaVantageService(private val client: AlphaVantageClient) {

    fun getQuote(symbol: String?): Quote? {
        client.symbol = symbol
        return client.quote
    }

    fun getCompanyOverview(symbol: String?): CompanyOverview? {
        client.symbol = symbol
        return client.companyOverview
    }

    fun getEarnings(symbol : String?): Earnings? {
        client.symbol = symbol
        return client.earnings
    }

    fun getIncomeStatement(symbol : String?): IncomeStatement? {
        client.symbol = symbol
        return client.incomeStatement
    }

    fun getBalanceSheet(symbol: String?): BalanceSheet? {
        client.symbol = symbol
        return client.balanceSheet
    }

    fun getCashFlow(symbol: String?): CashFlow? {
        client.symbol = symbol
        return client.cashFlow
    }
}
