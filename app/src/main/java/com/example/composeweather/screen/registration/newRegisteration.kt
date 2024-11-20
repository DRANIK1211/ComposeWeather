package com.example.composeweather.screen.registration

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
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldColors
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Devices
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.composeweather.R


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun NewRegistration(){
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
    ) {
        Column(
            modifier = Modifier.fillMaxWidth()
                .padding(start = 16.dp, end = 16.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Row(
                modifier = Modifier.fillMaxWidth()
                    .padding(bottom = 40.dp),
                verticalAlignment = Alignment.Top
            ) {
                Image(
                    painter = painterResource(R.drawable.backbutton),
                    contentDescription = null,
                    modifier = Modifier
                        .height(24.dp)
                        .width(24.dp)
                )
                Text(
                    text = "Your Information",
                    modifier = Modifier.padding(start = 18.dp),
                    fontSize = 20.sp,
                    fontWeight = FontWeight(600),
                    color = Color(55, 71, 79)
                )
            }
            Text(
                text = "It looks like you don’t" +
                        " have account in this number." +
                        " Please let us know some information" +
                        " for a scure service",
                fontSize = 14.sp,
                fontWeight = FontWeight(400),
                color = Color(55, 71, 79, 184),
                modifier = Modifier.padding(bottom = 15.dp)
            )
            Image(
                painter = painterResource(R.drawable.addimage),
                contentDescription = null,
                modifier = Modifier
                    .height(138.dp)
                    .width(138.dp)
            )
            Button(
                onClick = {},
                modifier = Modifier
                    .padding(top = 45.dp)
                    .fillMaxWidth()
                    .height(48.dp),
                colors = ButtonDefaults.buttonColors(
                    containerColor = Color(35, 108, 217),
                    contentColor = Color.White
                ),
                shape = RoundedCornerShape(8.dp)
            ) {
                Row(
                    horizontalArrangement = Arrangement.Center,
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Text(
                        text = "Sync From Facebook",
                        fontSize = 16.sp,
                        fontWeight = FontWeight(500),
                        modifier = Modifier
                            .fillMaxWidth()
                            .weight(1f),
                        textAlign = TextAlign.Center
                    )
                    Image(
                        painter = painterResource(R.drawable.facebook),
                        contentDescription = null,
                        modifier = Modifier
                            .height(24.dp)
                            .width(24.dp)
                    )
                }
            }
            var fullName by rememberSaveable { mutableStateOf("") }
            OutlinedTextField(
                value = fullName,
                onValueChange = { fullName = it },
                label = { Text("Full Name") },
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 18.dp),
                shape = RoundedCornerShape(8.dp),
                colors = TextFieldDefaults.outlinedTextFieldColors(
                    focusedBorderColor = Color(240, 241, 242),
                    unfocusedBorderColor = Color(240, 241, 242),
                    containerColor = Color(240, 241, 242)
                )
            )
        }

    }
}

@Preview(showBackground = true, showSystemUi = true, device = Devices.PIXEL_4)
@Composable
fun NewRegistrationPreview(){
    NewRegistration()
}