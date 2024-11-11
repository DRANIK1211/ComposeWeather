@file:Suppress("DEPRECATION")

package com.example.composeweather.screen.phoneNumber

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Phone
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Devices
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.composeweather.R


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun PhoneNumber(){
    Column(
        modifier = Modifier.fillMaxSize(),
       verticalArrangement = Arrangement.Center
    ) {
        Column (
            modifier = Modifier.fillMaxWidth().weight(1f),
            verticalArrangement = Arrangement.Center,


        ){
            Image(painter = painterResource(R.drawable.phonenumberimg1), contentDescription = null,
                modifier = Modifier.fillMaxWidth()
                    .height(300.dp)
            )
            Text("Enter your mobile number",
                modifier = Modifier.padding(15.dp),
                fontSize = 20.sp,
                color = Color(55, 71, 79),
                fontWeight = FontWeight.Medium
            )
            Text("We need to verify you. We will send you a one time verification code. ",
                modifier = Modifier.padding(15.dp),
                fontSize = 14.sp,
                color = Color(55, 71, 79, 183),
                fontWeight = FontWeight.Medium
            )

            var phoneNumber by rememberSaveable { mutableStateOf("") }
            val numericRegex = Regex("[^0-9]")
            OutlinedTextField(
                value = phoneNumber,
                onValueChange = {
                    // Remove non-numeric characters.
                    val stripped = numericRegex.replace(it, "")
                    phoneNumber = if (stripped.length >= 10) {
                        stripped.substring(0..9)
                    } else {
                        stripped
                    }
                },
                label = { Text("Phone Number") },
                keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number),
                modifier = Modifier.fillMaxWidth().padding(16.dp, 20.dp),
                shape = RoundedCornerShape(8.dp),
                leadingIcon = {
                    Row(
                        horizontalArrangement = Arrangement.Center,
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Image(
                            painter = painterResource(R.drawable.call),
                            contentDescription = null,
                            modifier = Modifier
                                .height(18.dp)
                                .width(37.dp)
                                .padding(start = 19.dp),
                        )
                        Image(
                            painter = painterResource(R.drawable.flag),
                            contentDescription = null,
                            modifier = Modifier
                                .height(21.dp)
                                .width(38.dp)
                                .padding(start = 11.dp, end = 3.dp),
                        )
                    }

                },
                colors = TextFieldDefaults.outlinedTextFieldColors(
                    containerColor = Color(240, 241, 242),
                    focusedBorderColor = Color(240, 241, 242),
                    unfocusedBorderColor = Color(240, 241, 242)
                )
            )
        }
        Button(
            onClick = {},
            modifier = Modifier.padding(start = 16.dp, end = 16.dp, bottom = 34.dp)
                .fillMaxWidth()
                .height(48.dp),
            colors = ButtonDefaults.buttonColors(
                containerColor = Color(94, 196, 1),
                contentColor = Color.White
            ),
            shape = RoundedCornerShape(8.dp)
        ) {
            Row (
                horizontalArrangement = Arrangement.Center,
                verticalAlignment = Alignment.CenterVertically
            ){
                Text(
                    text = "Next",
                    fontSize = 16.sp,
                    fontWeight = FontWeight(500),
                    modifier = Modifier.fillMaxWidth().weight(1f),
                    textAlign = TextAlign.Center
                )
                Image(
                    painter = painterResource(R.drawable.nextbutton),
                    contentDescription = null,
                    modifier = Modifier.height(15.dp)
                        .width(15.dp)
                )
            }

        }
    }

}


@Preview(showBackground = true, showSystemUi = true, device = Devices.PIXEL_4)
@Composable
fun PhoneNumberPreview(){
    PhoneNumber()
}
