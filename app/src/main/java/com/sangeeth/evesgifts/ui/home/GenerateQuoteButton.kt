package com.sangeeth.evesgifts.ui.home

import android.widget.Button
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.sangeeth.evesgifts.R

@Composable
fun GenerateQuoteButton(
    modifier: Modifier = Modifier,
    hasItems: Boolean = false,
    onClick:() -> Unit = {}
) {

    Button(
        onClick = onClick,
        enabled = hasItems,
        modifier = Modifier.fillMaxWidth()
            .padding(0.dp),
        colors = ButtonDefaults.buttonColors(
            containerColor = if (hasItems) colorResource(R.color.primary_color) else Color.Gray,
            contentColor = Color.White,
            disabledContentColor = Color.White.copy(alpha = 0.6f),
            disabledContainerColor = Color.Gray
        ),
        shape = RoundedCornerShape(12.dp)

    ){
        Text(
            text = "Generate Quote",
            fontSize = 18.sp,
            fontWeight = FontWeight.Bold,
            modifier = Modifier.padding(vertical = 8.dp)
        )
    }
}