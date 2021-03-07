package com.kaihagberg.dcfvaluator.fundamentaldata.balancesheet

import java.io.Serializable

class BalanceSheet : Serializable {
    var symbol: String? = null
    var annualReports: List<BalanceSheetReports>? = null
    var quarterlyReports: List<BalanceSheetReports>? = null
}