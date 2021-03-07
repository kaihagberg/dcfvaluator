package com.kaihagberg.dcfvaluator.alphavantage.globalquote

import com.fasterxml.jackson.annotation.JsonGetter

class Quote {
    @get:JsonGetter(value = "Global Quote") var globalQuote: GlobalQuote? = null
}