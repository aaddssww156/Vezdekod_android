package com.floppa.vezdekod.ui.theme.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.focus.focusModifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.floppa.vezdekod.R
import com.floppa.vezdekod.ui.theme.BackGreen
import com.floppa.vezdekod.ui.theme.models.Goods
import com.floppa.vezdekod.ui.theme.perository.GoodsRepository
import kotlinx.coroutines.selects.select

@Composable
fun MenuScreen(navController: NavController) {
    Box(modifier = Modifier.fillMaxSize()) {
        Column(modifier = Modifier.fillMaxSize()) {
            val selected = remember { mutableStateOf(false)}
            val selected2 = remember { mutableStateOf(false)}
            val selected3 = remember { mutableStateOf(false)}
            val selected4 = remember { mutableStateOf(false)}
            val selected5 = remember { mutableStateOf(false)}

            val img: Painter = painterResource(id = R.drawable.ramen)
            Image(
                painter = img,
                contentDescription = "",
                modifier = Modifier
                    .padding(horizontal = 160.dp)
                    .size(50.dp))
            
            Spacer(modifier = Modifier.padding(5.dp))

            Row(modifier = Modifier
                .fillMaxWidth()
                .padding(2.dp), horizontalArrangement = Arrangement.SpaceBetween) {
                Button(onClick = {
                    selected.value = !selected.value
                    selected4.value = false
                    selected2.value = false
                    selected3.value = false
                    selected5.value = false
                    },
                    colors = ButtonDefaults.buttonColors(
                        backgroundColor = if(selected.value) BackGreen else Color.White
                    ),
                    shape = RoundedCornerShape(10.dp)){
                    Text(text = "Pizza")
                }
                Button(onClick = {
                    selected2.value = !selected2.value
                    selected.value = false
                    selected4.value = false
                    selected3.value = false
                    selected5.value = false
                },
                    colors = ButtonDefaults.buttonColors(
                        backgroundColor = if(selected2.value) BackGreen else Color.White
                    ),
                    shape = RoundedCornerShape(10.dp)){
                    Text(text = "Sushi")
                }
                Button(onClick = {
                    selected3.value = !selected3.value
                    selected2.value = false
                    selected.value = false
                    selected4.value = false
                    selected5.value = false
                    },
                    colors = ButtonDefaults.buttonColors(
                        backgroundColor = if(selected3.value) BackGreen else Color.White
                    ),
                    shape = RoundedCornerShape(10.dp)){
                    Text(text = "Burger")
                }
                Button(onClick = {
                    selected4.value = !selected4.value
                    selected.value = false
                    selected2.value = false
                    selected3.value = false
                    selected5.value = false
                    },
                    colors = ButtonDefaults.buttonColors(
                        backgroundColor = if(selected4.value) BackGreen else Color.White
                    ),
                    shape = RoundedCornerShape(10.dp)){
                    Text(text = "Soup")
                }
                Button(onClick = {
                    selected5.value = !selected5.value
                    selected4.value = false
                    selected.value = false
                    selected2.value = false
                    selected3.value = false
                    },
                    colors = ButtonDefaults.buttonColors(
                        backgroundColor = if(selected5.value) BackGreen else Color.White
                    ),
                    shape = RoundedCornerShape(10.dp)){
                    Text(text = "Salad")
                }
            }

            Spacer(modifier = Modifier.padding(20.dp))

            val repo = GoodsRepository()
            val allData = repo.getAllData()
            
            LazyColumn() {
                items(items = allData) { item ->
                    Goods(goods = item)
                    Spacer(Modifier.padding(30.dp))
                }
            }

        }

    }
    //LazyColumn(content = )
}

@Composable
fun Goods(goods: Goods) {
    Column(modifier = Modifier
        .fillMaxWidth()
        .padding(10.dp),
    verticalArrangement = Arrangement.SpaceBetween,
    horizontalAlignment = Alignment.CenterHorizontally) {
        val img: Painter = painterResource(id = R.drawable.ramen)
        Image(
            painter = img,
            contentDescription = "",
            modifier = Modifier
                .padding(horizontal = 160.dp)
                .size(70.dp))
        Spacer(Modifier.padding(4.dp))
        Text(text = goods.name)
        Spacer(Modifier.padding(4.dp))
        Text(text = goods.measure.toString() + goods.measure_unit)
        Spacer(Modifier.padding(4.dp))
        Button(onClick = { /*TODO*/ }) {
            Text(goods.price_current.toString())
        }
    }
}