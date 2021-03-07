package com.kaihagberg.dcfvaluator.controller

import org.springframework.web.bind.annotation.RestController
import org.springframework.web.bind.annotation.RequestMapping
import com.kaihagberg.dcfvaluator.service.AlphaVantageService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import com.kaihagberg.dcfvaluator.alphavantage.balancesheet.BalanceSheet
import com.kaihagberg.dcfvaluator.alphavantage.cashflow.CashFlow
import com.kaihagberg.dcfvaluator.alphavantage.companyoverview.CompanyOverview
import com.kaihagberg.dcfvaluator.alphavantage.earnings.Earnings
import com.kaihagberg.dcfvaluator.alphavantage.globalquote.Quote
import com.kaihagberg.dcfvaluator.alphavantage.incomestatement.IncomeStatement

@RestController
@RequestMapping("/valuation")
class DcfController (private val service: AlphaVantageService) {

    @GetMapping(value = ["/quote/{symbol}"])
    fun getQuote(@PathVariable("symbol") symbol: String?): Quote? {
        return service.getQuote(symbol)
    }

    @GetMapping(value = ["/overview/{symbol}"])
    fun getCompanyOverview(@PathVariable("symbol") symbol: String?): CompanyOverview? {
        return service.getCompanyOverview(symbol)
    }

    @GetMapping(value = ["/earnings/{symbol}"])
    fun getEarnings(@PathVariable("symbol") symbol: String?): Earnings? {
        return service.getEarnings(symbol)
    }

    @GetMapping(value = ["/income_statement/{symbol}"])
    fun getIncomeStatement(@PathVariable("symbol") symbol: String?): IncomeStatement? {
        return service.getIncomeStatement(symbol)
    }

    @GetMapping(value = ["/balance_sheet/{symbol}"])
    fun getBalanceSheet(@PathVariable("symbol") symbol: String?): BalanceSheet? {
        return service.getBalanceSheet(symbol)
    }

    @GetMapping(value = ["/cash_flow/{symbol}"])
    fun getCashFlow(@PathVariable("symbol") symbol: String?): CashFlow? {
        return service.getCashFlow(symbol)
    }
}