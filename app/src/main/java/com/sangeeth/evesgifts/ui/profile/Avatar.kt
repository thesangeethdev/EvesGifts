package com.sangeeth.evesgifts.ui.profile

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.sangeeth.evesgifts.R

@Composable
fun Avatar(
    name: String?,
    modifier: Modifier = Modifier,
    size: Int = 48
) {
    val initials = name?.split(" ")
        ?.mapNotNull { it.firstOrNull()?.toString() }
        ?.joinToString("")
        ?.take(2)
        ?.uppercase()
        ?: "?"

    Box(
        modifier = modifier.size(size.dp).clip(CircleShape).background(colorResource(R.color.primary_color)),
        contentAlignment = Alignment.Center
    ){
        Text(text = initials, color = Color.White, fontSize = (size*0.45f).sp, fontWeight = FontWeight.Bold)

    }
}