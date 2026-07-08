package com.sangeeth.evesgifts.data

data class Gifts(
    val customized_bouquet: GiftItem,
    val personalized_clock: GiftItem,
    val baby_photo_collage: GiftItem,
    val customized_chocolate: GiftItem,
    val spotify_frame: GiftItem
)

data class GiftItem(
    val price: String,
    val unit: String? = null
)