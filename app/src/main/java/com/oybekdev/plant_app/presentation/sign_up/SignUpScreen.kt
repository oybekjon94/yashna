package com.oybekdev.plant_app.presentation.sign_up

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.oybekdev.plant_app.presentation.sign_up.component.SignUpButton
import com.oybekdev.plant_app.presentation.sign_up.component.SingUpTextField

@Composable
fun SignUpScreen(
    navController: NavController
){
    Surface(
        color = Color(0xFF253334),
        modifier = Modifier.fillMaxSize()
    ) {

        Box(modifier = Modifier.fillMaxSize()){


            Column(horizontalAlignment = Alignment.CenterHorizontally,
                modifier = Modifier
                    .fillMaxSize()
                    .padding(horizontal = 24.dp)) {

                Text(text = "Register",
                    style = TextStyle(
                        fontSize = 50.sp,
                        fontFamily = FontFamily.Monospace,
                        color = Color.DarkGray

                    ),
                    modifier = Modifier
                        .align(Alignment.Start)
                        .padding(top = 130.dp)
                        .padding(start = 80.dp)
                )

                //Text Field
                SingUpTextField(hint = "Full Name", value = "" )
                
                SingUpTextField(hint = "user@mail.com", value = "")

                SingUpTextField(hint = "Password", value = "")

                Spacer(modifier = Modifier.height(24.dp))

                SignUpButton(text = "Sign Up")

                Row(
                    modifier =Modifier.padding(top = 12.dp, bottom = 52.dp)
                ){
                    Text("Forgot Password ?",
                        style = TextStyle(
                            fontSize = 18.sp,
                            fontFamily = FontFamily.Monospace,
                            fontWeight = FontWeight(800),
                            color = Color.White
                        ),
                        modifier = Modifier.clickable {
                            navController.navigate("login")
                        }
                        )
                }
            }
        }

    }
}

@Preview
@Composable
fun SignUpScreenPreview(){
    SignUpScreen(rememberNavController())
}