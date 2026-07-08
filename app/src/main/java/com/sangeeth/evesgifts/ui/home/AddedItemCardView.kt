package com.sangeeth.evesgifts.ui.home

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Delete
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.composed
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.capitalize
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.tooling.preview.PreviewParameter
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.sangeeth.evesgifts.R

@Composable
fun AddedItemCardView(
    item: String,
    size: String?,
    price: String,
    quantity: Int = 1,
    onQuantityChange: (Int) -> Unit = {},
    onDelete: () -> Unit = {}
) {
    Card(
        modifier = Modifier
//            .padding(10.dp)
            .fillMaxWidth(),
        elevation = CardDefaults.cardElevation(
            defaultElevation = 5.dp
        )
    ) {

        Row(
            modifier = Modifier
                .padding(16.dp)
                .fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Column(modifier = Modifier.weight(1f)) {

                Text(
                    text = item,
                    fontSize = 20.sp,
                    fontFamily = FontFamily.Default,
                    fontWeight = FontWeight.Bold
                )
                Text(
                    text = size!!,
                    color = Color.Gray,
                    fontFamily = FontFamily.Default,
                    fontWeight = FontWeight.ExtraBold
                )
                Text(
                    modifier = Modifier.padding(top = 10.dp),
                    text = "Rs. $price",
                    color = colorResource(R.color.primary_color),
                    fontFamily = FontFamily.Default,
                    fontWeight = FontWeight.ExtraBold
                )
            }


            Row(
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.spacedBy(8.dp)
            ) {
                Row(
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.spacedBy(8.dp)
                ) {
                    IconButton(
                        onClick = {
                            if (quantity > 1) {
                                onQuantityChange(quantity - 1)
                            }
                        },
                        modifier = Modifier.size(36.dp),
                        enabled = quantity > 1
                    ) {
                        Icon(
                            painter = painterResource(R.drawable.ic_remove),
                            contentDescription = "Decrease",
                            tint = if (quantity > 1) Color.Black else Color.Gray
                        )
                    }

                    Text(
                        text = quantity.toString(),
                        fontSize = 18.sp,
                        fontWeight = FontWeight.Bold,
                        modifier = Modifier.width(24.dp),
                        textAlign = TextAlign.Center
                    )

                    IconButton(
                        onClick = {
                            onQuantityChange(quantity + 1)

                        },
                        modifier = Modifier.size(36.dp),

                        ) {
                        Icon(
                            painter = painterResource(R.drawable.ic_add),
                            contentDescription = "Increase",
                            tint = Color.Black
                        )
                    }
                }

                IconButton(
                    onClick = onDelete,
                    modifier = Modifier.size(40.dp)
                ) {
                    Icon(
                        imageVector = Icons.Default.Delete,
                        contentDescription = "Delete",
                        tint = Color.Red
                    )
                }
            }


        }
    }

}


// category
// size
// price
// quantity (increase or decrease)
// delete card
