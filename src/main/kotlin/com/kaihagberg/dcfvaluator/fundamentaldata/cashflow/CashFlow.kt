package com.kaihagberg.dcfvaluator.fundamentaldata.cashflow

import java.io.Serializable

class CashFlow : Serializable {
    var symbol: String? = null
    var annualReports: List<CashFlowReports>? = null
    var quarterlyReports: List<CashFlowReports>? = null
}