package com.example.composeweather.screen.orders.components

fun OngoingOrders(){
TODO("создать OngoingOrders," +
        "если их нет выводить картинку, " +
        "если есть карточки." +
        "Пример в historyOrders.kt")
}

data class StatusOrders(
    var num:Int,
    var status:OrderStatus,
    var date:String,
    var price:Int
)