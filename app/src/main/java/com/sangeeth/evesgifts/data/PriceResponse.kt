package com.sangeeth.evesgifts.data

import com.google.gson.JsonObject

data class PriceResponse(
    val frames: Map<String, Map<String, Int?>>,
    val cakes: Map<String, String>,
    val gifts: Map<String, String>
)
