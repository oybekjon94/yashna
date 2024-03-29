package com.oybekdev.plant_app

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.oybekdev.plant_app.presentation.signIn.WelcomScreen
import com.oybekdev.plant_app.presentation.signIn.components.LoginScreen
import com.oybekdev.plant_app.ui.theme.PlantappTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            PlantappTheme {
                // A surface container using the 'background' color from the theme
               NavigationView()
            }
        }
    }
}

@Composable
fun NavigationView(){
    val navController = rememberNavController()

    NavHost(navController = navController, startDestination = "welcome"){
        composable("welcome"){ WelcomScreen(navController)}
        composable("login"){LoginScreen(navController)}
    }
}