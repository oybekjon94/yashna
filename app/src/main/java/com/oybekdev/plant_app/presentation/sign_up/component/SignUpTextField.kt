package com.oybekdev.plant_app.presentation.sign_up.component

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun SingUpTextField(
    onValueChange: (String) -> Unit = {},
    hint: String,
    value: String,
) {
    TextField(value = value,
        onValueChange = onValueChange,
        placeholder = {
            Text(text = hint,
                style = TextStyle(
                    fontSize = 18.sp, fontFamily = FontFamily.Monospace,
                    color = Color.DarkGray
                ))
        },
        modifier = Modifier
            .fillMaxWidth()
            .padding(bottom = 8.dp),
        colors = TextFieldDefaults.textFieldColors(
            containerColor =  Color.Transparent,
            focusedIndicatorColor = Color.DarkGray,
            unfocusedIndicatorColor = Color.DarkGray
        ))
}