package com.oybekdev.plant_app.presentation.signIn.components

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun CButton(
    onClick:() -> Unit = {},
    text:String
){
    Button(
        onClick = onClick,
        shape = MaterialTheme.shapes.large,
        colors = ButtonDefaults.buttonColors(
            containerColor = Color(0xFF7C9A92)
        ),
        modifier = Modifier
            .fillMaxWidth()
            .height(52.dp)
    ){
        Text(
            text = text,
            style = androidx.compose.ui.text.TextStyle(
                fontSize = 22.sp,
                fontFamily = FontFamily.Default,
                fontWeight = FontWeight(500),
                color = Color.White
            )
        )
    }

}