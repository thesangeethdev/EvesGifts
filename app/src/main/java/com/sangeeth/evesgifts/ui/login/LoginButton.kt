package com.sangeeth.evesgifts.ui.login

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.CircularProgressIndicator
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
fun LoginButton(
    modifier: Modifier = Modifier,
    loading: Boolean,
    enabled: Boolean = true,
    onClick: () -> Unit = {},

    ) {

    Button(
        onClick = onClick,
        enabled = enabled && !loading,
        modifier = Modifier
            .fillMaxWidth()
            .padding(0.dp),
        colors = ButtonDefaults.buttonColors(
            containerColor = colorResource(R.color.primary_color),
            contentColor = Color.White,
            disabledContentColor = Color.White.copy(alpha = 0.6f),
            disabledContainerColor = Color.Gray
        ),
        shape = RoundedCornerShape(12.dp)

    ) {
        if (loading) {
            CircularProgressIndicator(
                modifier = Modifier.size(20.dp),
                strokeWidth = 2.dp
            )
        } else {
            Text(
                text = "Login",
                fontSize = 18.sp,
                fontWeight = FontWeight.Bold,
                modifier = Modifier.padding(vertical = 8.dp)
            )
        }

    }
}