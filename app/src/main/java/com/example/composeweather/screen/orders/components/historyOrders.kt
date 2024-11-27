package com.example.composeweather.screen.orders.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.composeweather.R


var orders = listOf<OrderItem>(
    OrderItem(
        0, OrderStatus.Delivered, "October 14, 2016", 281
    ),
    OrderItem(
        1, OrderStatus.Cancelled, "July 26, 2017", 500
    )
)


@Composable
fun HistoryOrders(mas: List<OrderItem>) :Unit{
    LazyColumn (
        modifier = Modifier.fillMaxWidth()
            .padding(start = 16.dp, end = 16.dp),
    ){

        items(orders){ item ->
            Row(
                modifier = Modifier.fillMaxWidth()
                    .padding(top = 21.dp),
                verticalAlignment = Alignment.CenterVertically
            ){
                Image(
                    painter = painterResource(R.drawable.order),
                    contentDescription = null,
                    modifier = Modifier.height(44.dp).width(44.dp)
                )
                Column (
                    modifier = Modifier.padding(start = 19.dp)
                ){
                    Text(
                        "Order  #" + (item.num + 1).toString(),
                        color = Color(55, 71, 79),
                        fontSize = 16.sp,
                        fontWeight = FontWeight(500),
                        modifier = Modifier.padding(bottom = 2.dp)
                    )
                    Text(
                        item.status.name,
                        color = when(item.status){
                            OrderStatus.Delivered -> Color(94, 196, 1)
                            OrderStatus.Cancelled -> Color(255, 85, 82)
                        },
                        fontSize = 12.sp,
                        fontWeight = FontWeight(400),
                        modifier = Modifier.padding(bottom = 2.dp)
                    )
                    Text(
                        item.date,
                        color = Color(55, 71, 79, 184),
                        fontSize = 12.sp,
                        fontWeight = FontWeight(400),
                        modifier = Modifier.padding(bottom = 2.dp)
                    )
                }
                Text(
                    "৳" + item.price.toString(),
                    color = Color(243, 122, 32),
                    fontSize = 20.sp,
                    fontWeight = FontWeight(600),
                    modifier = Modifier.fillMaxWidth(),
                    textAlign = TextAlign.End
                )
            }
        }
    }
}


@Preview
@Composable
fun HistoryOrdersPreview(){
    HistoryOrders(orders)
}

data class OrderItem(
    var num:Int,
    var status:OrderStatus,
    var date:String,
    var price:Int
)

enum class OrderStatus{
    Delivered,
    Cancelled
}