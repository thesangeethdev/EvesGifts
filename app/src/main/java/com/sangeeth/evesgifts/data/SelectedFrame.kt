package com.sangeeth.evesgifts.data

import java.util.UUID

data class SelectedFrame(
    var category: String,
    var size: String,
    var price: Int?,
    val id: String = UUID.randomUUID().toString()
)
