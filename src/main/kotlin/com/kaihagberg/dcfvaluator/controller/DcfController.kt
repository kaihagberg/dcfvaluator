package com.kaihagberg.dcfvaluator.controller

import org.springframework.web.bind.annotation.RestController
import org.springframework.web.bind.annotation.RequestMapping
import com.kaihagberg.dcfvaluator.service.FundamentalDataService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import com.kaihagberg.dcfvaluator.fundamentaldata.balancesheet.BalanceSheet
import com.kaihagberg.dcfvaluator.fundamentaldata.cashflow.CashFlow

@RestController
@RequestMapping("/valuation")
class DcfController (private val service: FundamentalDataService) {

    @GetMapping(value = ["/balance_sheet/{symbol}"])
    fun getBalanceSheet(@PathVariable("symbol") symbol: String?): BalanceSheet? {
        return service.getBalanceSheet(symbol)
    }

    @GetMapping(value = ["/cash_flow/{symbol}"])
    fun getCashFlow(@PathVariable("symbol") symbol: String?): CashFlow? {
        return service.getCashFlow(symbol)
    }
}