package com.kaihagberg.dcfvaluator.alphavantage.globalquote

import com.fasterxml.jackson.annotation.JsonGetter

class GlobalQuote {
    @get:JsonGetter(value = "01. symbol") var symbol: String? = null
    @get:JsonGetter(value = "02. open")var open: String? = null
    @get:JsonGetter(value = "03. high")var high: String? = null
    @get:JsonGetter(value = "04. low")var low: String? = null
    @get:JsonGetter(value = "05. price")var price: String? = null
    @get:JsonGetter(value = "06. volume")var volume: String? = null
    @get:JsonGetter(value = "07. latest trading day")var latestTradingDay: String? = null
    @get:JsonGetter(value = "08. previous close")var previousClose: String? = null
    @get:JsonGetter(value = "09. change")var change: String? = null
    @get:JsonGetter(value = "10. change percent")var changePercent: String? = null
}