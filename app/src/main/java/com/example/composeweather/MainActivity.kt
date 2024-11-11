package com.example.composeweather

import android.os.Bundle
import android.view.WindowManager
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.safeDrawingPadding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.composeweather.screen.enterCode.EnterCode
import com.example.composeweather.screen.enterPassword.EnterPassword
import com.example.composeweather.ui.theme.ComposeWeatherTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ComposeWeatherTheme{
                Box(Modifier.safeDrawingPadding()){
                    MainScreen()
                }

            }
        }
    }
}


@Composable
fun MainScreen() {
    EnterCode()
}



