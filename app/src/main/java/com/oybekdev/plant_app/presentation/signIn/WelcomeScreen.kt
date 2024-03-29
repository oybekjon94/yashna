package com.oybekdev.plant_app.presentation.signIn

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.oybekdev.plant_app.R
import com.oybekdev.plant_app.presentation.signIn.components.CButton
import com.oybekdev.plant_app.presentation.signIn.components.DontHaveAccountRow

@Composable
fun WelcomScreen(
    navController: NavHostController
    //modifier: Modifier
){
    Box(
        modifier = Modifier.fillMaxSize()
    ){
        //Background image
        Image(
            painter = painterResource(id = R.drawable.bg),
            contentDescription = null,
            contentScale = ContentScale.FillBounds,
            modifier = Modifier.fillMaxSize()
        )
        
        //Content
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center,
            modifier = Modifier
                .fillMaxSize()
                .padding(horizontal = 24.dp)
        ) {
            
            Spacer(modifier = Modifier.weight(1f))
            
            Text(
                "The best\n app for\n your plants",
                fontSize = 40.sp,
                fontFamily = FontFamily.Cursive,
                fontWeight = FontWeight.Bold,
                textAlign = TextAlign.Center,
                color = Color.White
            )

            Spacer(modifier = Modifier.weight(1f))

            CButton(text = "Sign In",
                onClick = {
                    navController.navigate("login")
                }
                )

            DontHaveAccountRow(
                onSignupTap = {
                    navController.navigate("signup")
                }
            )

        }
    }
}
