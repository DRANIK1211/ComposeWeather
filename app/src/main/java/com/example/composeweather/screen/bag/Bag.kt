package com.example.composeweather.screen.bag

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.composeweather.screen.bag.components.Products


@Composable
fun Bag(){
    TODO("Доделать MyBag")
    Column (
        modifier = Modifier.fillMaxWidth()
            .padding(start = 16.dp, end = 16.dp),
    ){
        Text("My Bag")
        LazyColumn {
            item {
                Text("Products")
                Products()
                Button(
                    onClick = {},
                    modifier = Modifier.fillMaxWidth()
                        .height(50.dp),
                    shape = RoundedCornerShape(8)
                ) {
                    Text("Add More Product")
                }
            }
        }
    }

}


@Preview
@Composable
fun BagPreview(){
    Bag()
}