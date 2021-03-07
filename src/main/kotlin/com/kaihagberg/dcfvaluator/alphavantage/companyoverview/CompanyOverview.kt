package com.kaihagberg.dcfvaluator.alphavantage.companyoverview

import com.fasterxml.jackson.annotation.JsonGetter
import com.fasterxml.jackson.databind.PropertyNamingStrategy
import com.fasterxml.jackson.databind.annotation.JsonNaming
import java.io.Serializable

@JsonNaming(PropertyNamingStrategy.UpperCamelCaseStrategy::class)
class CompanyOverview : Serializable {
    var symbol: String? = null
    var assetType: String? = null
    var name: String? = null
    var description: String? = null
    var exchange: String? = null
    var currency: String? = null
    var country: String? = null
    var sector: String? = null
    var industry: String? = null
    var address: String? = null
    var fullTimeEmployees: String? = null
    var fiscalYearEnd: String? = null
    var latestQuarter: String? = null
    var marketCapitalization: String? = null
    @get:JsonGetter(value = "EBITDA") var EBITDA: String? = null
    @get:JsonGetter(value = "PERatio") var PERatio: String? = null
    @get:JsonGetter(value = "PEGRatio") var PEGRatio: String? = null
    var bookValue: String? = null
    var dividendPerShare: String? = null
    var dividendYield: String? = null
    @get:JsonGetter(value = "EPS") var EPS: String? = null
    var revenuePerShareTTM: String? = null
    var profitMargin: String? = null
    var operatingMarginTTM: String? = null
    var returnOnAssetsTTM: String? = null
    var returnOnEquityTTM: String? = null
    var revenueTTM: String? = null
    var grossProfitTTM: String? = null
    var dilutedEPSTTM: String? = null
    var quarterlyEarningsGrowthYOY: String? = null
    var quarterlyRevenueGrowthYOY: String? = null
    var analystTargetPrice: String? = null
    var trailingPE: String? = null
    var forwardPE: String? = null
    var priceToSalesRatioTTM: String? = null
    var priceToBookRatio: String? = null
    @get:JsonGetter(value = "EVToRevenue") var EVToRevenue: String? = null
    @get:JsonGetter(value = "EVToEBITDA") var EVToEBITDA: String? = null
    var beta: String? = null
    @get:JsonGetter(value = "52WeekHigh") var fiftyTwoWeekHigh: String? = null
    @get:JsonGetter(value = "52WeekLow") var fiftyTwoWeekLow: String? = null
    @get:JsonGetter(value = "50DayMovingAverage") var fiftyDayMovingAverage: String? = null
    @get:JsonGetter(value = "200DayMovingAverage") var twoHundredDayMovingAverage: String? = null
    var sharesOutstanding: String? = null
    var sharesFloat: String? = null
    var sharesShort: String? = null
    var sharesShortPriorMonth: String? = null
    var shortRatio: String? = null
    var shortPercentOutstanding: String? = null
    var shortPercentFloat: String? = null
    var percentInsiders: String? = null
    var percentInstitutions: String? = null
    var forwardAnnualDividendRate: String? = null
    var forwardAnnualDividendYield: String? = null
    var payoutRatio: String? = null
    var dividendDate: String? = null
    var exDividendDate: String? = null
    var lastSplitFactor: String? = null
    var lastSplitDate: String? = null
}