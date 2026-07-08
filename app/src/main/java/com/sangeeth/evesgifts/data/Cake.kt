package com.sangeeth.evesgifts.data

data class Cakes(
    val butter_cake: CakeItem,
    val chocolate_cake: CakeItem,
    val birthday_cake: BirthdayCake,
    val butter_cup_cake: CakeItem,
    val chocolate_cup_cake: CakeItem,
    val marble_cake: CakeItem,
    val ribbon_cake: CakeItem
)
data class CakeItem(
    val unit: String,
    val price: String
)

data class BirthdayCake(
    val butter: BirthdayCakeDetails,
    val chocolate: BirthdayCakeDetails
)

data class BirthdayCakeDetails(
    val price: String,
    val includes: List<String>
)