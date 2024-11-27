package com.example.composeweather.screen.orders

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Tab
import androidx.compose.material3.TabRow
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.tooling.preview.Preview
import com.example.composeweather.screen.orders.components.HistoryOrders
import com.example.composeweather.screen.orders.components.OrderItem
import com.example.composeweather.screen.orders.components.OrderStatus

var orders = listOf<OrderItem>(
    OrderItem(
        0, OrderStatus.Delivered, "October 14, 2016", 281
    ),
    OrderItem(
        1, OrderStatus.Cancelled, "July 26, 2017", 500
    )
)

@Composable
fun OrderScreen(){
    var selectedTab by remember { mutableIntStateOf(0) }
    val tabTitles = listOf("Ongoing", "History")
    Column {
        TabRow(
            selectedTabIndex = selectedTab
        ){
            tabTitles.forEachIndexed{
                index, title ->

                Tab(
                    selected = selectedTab == index,
                    onClick = {selectedTab = index},
                    text = { Text(title) }
                )
            }
        }
        when (selectedTab){
            0 -> OngoingOrders()
            1 -> HistoryOrders(orders)
        }
    }
}


@Composable
fun OngoingOrders(){

}




@Preview
@Composable
fun OrderScreenPreview(){
    OrderScreen()
}