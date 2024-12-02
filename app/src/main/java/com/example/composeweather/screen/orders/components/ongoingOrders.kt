package com.example.composeweather.screen.orders.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
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


var ongoingOrders = listOf<StatusOrders>(
    StatusOrders(
        0, OngoingOrderStatus.Issued, "October 14, 2016", 281
    ),
    StatusOrders(
        1, OngoingOrderStatus.Rides, "July 26, 2017", 500
    )
)

@Composable
fun OngoingOrders(mas: List<StatusOrders>) {
    if (mas.isEmpty()) {
        Column(
            modifier = Modifier.fillMaxSize()
                .padding(start = 16.dp, end = 16.dp),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Image(
                modifier = Modifier.fillMaxWidth()
                    .height(415.dp),
                painter = painterResource(R.drawable.empty_rafiki_1),
                contentDescription = null
            )
            Text(
                "There is n ongoing order right now. You can order from home",
                textAlign = TextAlign.Center,
                fontWeight = FontWeight(500),
                fontSize = 16.sp,
                color = Color(55, 71, 79)
            )
        }
    }
    else{
        LazyColumn(
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 16.dp, end = 16.dp),
        ) {


            items(mas) { item ->
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(top = 21.dp),
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Image(
                        painter = painterResource(R.drawable.order),
                        contentDescription = null,
                        modifier = Modifier
                            .height(44.dp)
                            .width(44.dp)
                    )
                    Column(
                        modifier = Modifier.padding(start = 19.dp)
                    ) {
                        Text(
                            "Order  #" + (item.num + 1).toString(),
                            color = Color(55, 71, 79),
                            fontSize = 16.sp,
                            fontWeight = FontWeight(500),
                            modifier = Modifier.padding(bottom = 2.dp)
                        )
                        Text(
                            item.status.name,
                            color = Color(199, 0, 255, 255),
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


}

data class StatusOrders(
    var num: Int,
    var status: OngoingOrderStatus,
    var date: String,
    var price: Int
)

enum class OngoingOrderStatus {
    Issued,
    Rides
}


@Preview
@Composable
fun OngoingOrdersPreview(){
    OngoingOrders(ongoingOrders)
}
