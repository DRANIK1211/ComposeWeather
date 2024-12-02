package com.example.composeweather.screen.orders

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Tab
import androidx.compose.material3.TabRow
import androidx.compose.material3.TabRowDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.composeweather.screen.orders.components.HistoryOrders
import com.example.composeweather.screen.orders.components.OngoingOrderStatus
import com.example.composeweather.screen.orders.components.OngoingOrders
import com.example.composeweather.screen.orders.components.OrderItem
import com.example.composeweather.screen.orders.components.OrderStatus
import com.example.composeweather.screen.orders.components.StatusOrders

var orders = listOf<OrderItem>(
    OrderItem(
        0, OrderStatus.Delivered, "October 14, 2016", 281
    ),
    OrderItem(
        1, OrderStatus.Cancelled, "July 26, 2017", 500
    )
)
var ongoingOrders = listOf<StatusOrders>(
    StatusOrders(
        0, OngoingOrderStatus.Issued, "October 14, 2016", 281
    ),
    StatusOrders(
        1, OngoingOrderStatus.Rides, "July 26, 2017", 500
    )
)

@Composable
fun OrderScreen(){
    var selectedTab by remember { mutableIntStateOf(0) }
    val tabTitles = listOf("Ongoing", "History")
    Column {
        Text(
            "Orders",
            modifier = Modifier.height(90.dp)
                .padding(top = 52.dp, start = 16.dp),
            fontWeight = FontWeight(500),
            fontSize = 20.sp,
            color = Color(55, 71, 79)
        )
        TabRow(
            selectedTabIndex = selectedTab,
        ){
            tabTitles.forEachIndexed{
                index, title ->

                Tab(
                    selected = selectedTab == index,
                    onClick = {selectedTab = index},
                    text = { Text(
                        title,

                    ) }
                )
            }
        }
        when (selectedTab){
            0 -> OngoingOrders(ongoingOrders)
            1 -> HistoryOrders(orders)
        }
    }
}



@Preview
@Composable
fun OrderScreenPreview(){
    OrderScreen()
}