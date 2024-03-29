package com.oybekdev.plant_app.presentation.signIn.components

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun DontHaveAccountRow(
    onSignupTap:() -> Unit = {},
){
    Row(
        modifier = Modifier.padding(top = 12.dp, bottom = 52.dp)
    ) {
        Text("Create an account",
            style = TextStyle(
                fontSize = 18.sp,
                fontFamily = FontFamily.Default,
                color = Color.White
            ),
            modifier = Modifier.clickable{
                onSignupTap
            }
            )
    }
}