package com.kaihagberg.dcfvaluator.alphavantage.balancesheet

import java.io.Serializable

class BalanceSheetReports : Serializable {
    var fiscalDateEnding: String? = null
    var reportedCurrency: String? = null
    var totalAssets: String? = null
    var totalCurrentAssets: String? = null
    var cashAndCashEquivalentsAtCarryingValue: String? = null
    var cashAndShortTermInvestments: String? = null
    var inventory: String? = null
    var currentNetReceivables: String? = null
    var totalNonCurrentAssets: String? = null
    var propertyPlantEquipment: String? = null
    var accumulatedDepreciationAmortizationPPE: String? = null
    var intangibleAssets: String? = null
    var intangibleAssetsExcludingGoodwill: String? = null
    var goodwill: String? = null
    var investments: String? = null
    var longTermInvestments: String? = null
    var shortTermInvestments: String? = null
    var otherCurrentAssets: String? = null
    var otherNonCurrrentAssets: String? = null
    var totalLiabilities: String? = null
    var totalCurrentLiabilities: String? = null
    var currentAccountsPayable: String? = null
    var deferredRevenue: String? = null
    var currentDebt: String? = null
    var shortTermDebt: String? = null
    var totalNonCurrentLiabilities: String? = null
    var capitalLeaseObligations: String? = null
    var longTermDebt: String? = null
    var currentLongTermDebt: String? = null
    var longTermDebtNoncurrent: String? = null
    var shortLongTermDebtTotal: String? = null
    var otherCurrentLiabilities: String? = null
    var otherNonCurrentLiabilities: String? = null
    var totalShareholderEquity: String? = null
    var treasuryStock: String? = null
    var retainedEarnings: String? = null
    var commonStock: String? = null
    var commonStockSharesOutstanding: String? = null
}