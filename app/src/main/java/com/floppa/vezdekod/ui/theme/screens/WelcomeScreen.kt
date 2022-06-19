package com.floppa.vezdekod.ui.theme.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.floppa.vezdekod.R
import com.floppa.vezdekod.ui.theme.BackGreen
import kotlinx.coroutines.delay

@Composable
fun WelcomeScreen(navController: NavController) {
    Box(modifier = Modifier
        .background(BackGreen)
        .fillMaxSize()) {
        Column(modifier = Modifier.fillMaxSize()) {
            Text(
                text = "Foody!",
                color = Color.White,
                fontSize = 50.sp,
                modifier = Modifier.padding(vertical = 270.dp, horizontal = 115.dp))
            val img: Painter = painterResource(id = R.drawable.ramen)
            Image(
                painter = img,
                contentDescription = "",
                modifier = Modifier.padding(horizontal = 90.dp))
            LaunchedEffect(key1 = true) {
                delay(3000L)
                navController.navigate(Screens.MenuScreen.route)
            }
        }
    }
}