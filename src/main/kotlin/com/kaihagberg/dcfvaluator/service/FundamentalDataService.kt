package com.kaihagberg.dcfvaluator.service

import com.kaihagberg.dcfvaluator.fundamentaldata.balancesheet.BalanceSheet
import com.kaihagberg.dcfvaluator.AlphaVantageClient
import com.kaihagberg.dcfvaluator.fundamentaldata.cashflow.CashFlow
import org.springframework.stereotype.Service

@Service
class FundamentalDataService(private val client: AlphaVantageClient) {

    fun getBalanceSheet(symbol: String?): BalanceSheet? {
        client.symbol = symbol
        return client.balanceSheet
    }

    fun getCashFlow(symbol: String?): CashFlow? {
        client.symbol = symbol
        return client.cashFlow
    }
}
