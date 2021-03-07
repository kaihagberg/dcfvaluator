package com.kaihagberg.dcfvaluator.alphavantage.balancesheet

import java.io.Serializable

class BalanceSheet : Serializable {
    var symbol: String? = null
    var annualReports: List<BalanceSheetReports>? = null
    var quarterlyReports: List<BalanceSheetReports>? = null
}