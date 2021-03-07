package com.kaihagberg.dcfvaluator.alphavantage.incomestatement

class IncomeStatement {
    var symbol: String? = null
    var annualReports: List<IncomeReports>? = null
    var quarterlyReports: List<IncomeReports>? = null
}