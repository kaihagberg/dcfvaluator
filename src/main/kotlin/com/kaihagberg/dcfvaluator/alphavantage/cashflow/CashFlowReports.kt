package com.kaihagberg.dcfvaluator.alphavantage.cashflow

import java.io.Serializable

class CashFlowReports : Serializable {
    var fiscalDateEnding: String? = null
    var reportedCurrency: String? = null
    var operatingCashflow: String? = null
    var paymentsForOperatingActivities: String? = null
    var proceedsFromOperatingActivities: String? = null
    var changeInOperatingLiabilities: String? = null
    var changeInOperatingAssets: String? = null
    var depreciationDepletionAndAmortization: String? = null
    var capitalExpenditures: String? = null
    var changeInReceivables: String? = null
    var changeInInventory: String? = null
    var profitLoss: String? = null
    var cashflowFromInvestment: String? = null
    var cashflowFromFinancing: String? = null
    var proceedsFromRepaymentsOfShortTermDebt: String? = null
    var paymentsForRepurchaseOfCommonStock: String? = null
    var paymentsForRepurchaseOfEquity: String? = null
    var paymentsForRepurchaseOfPreferredStock: String? = null
    var dividendPayout: String? = null
    var dividendPayoutCommonStock: String? = null
    var dividendPayoutPreferredStock: String? = null
    var proceedsFromIssuanceOfCommonStock: String? = null
    var proceedsFromIssuanceOfLongTermDebtAndCapitalSecuritiesNet: String? = null
    var proceedsFromIssuanceOfPreferredStock: String? = null
    var proceedsFromRepurchaseOfEquity: String? = null
    var proceedsFromSaleOfTreasuryStock: String? = null
    var changeInCashAndCashEquivalents: String? = null
    var changeInExchangeRate: String? = null
    var netIncome: String? = null
}