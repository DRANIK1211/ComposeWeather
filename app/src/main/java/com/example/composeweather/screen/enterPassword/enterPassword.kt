package com.example.composeweather.screen.enterPassword

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
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
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Devices
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.composeweather.R


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun EnterPassword() {
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center
    ) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .weight(1f),
            verticalArrangement = Arrangement.Center,


            ) {
            Image(
                painter = painterResource(R.drawable.backbutton),
                contentDescription = null,
                modifier = Modifier.fillMaxWidth()
                    .height(24.dp)
                    .width(24.dp)
                    .padding(start = 16.dp),
                alignment = Alignment.CenterStart
            )
            Image(
                painter = painterResource(R.drawable.enterpassimg), contentDescription = null,
                modifier = Modifier
                    .fillMaxWidth()
                    .height(300.dp)
            )
            Text(
                "Enter the password",
                modifier = Modifier.padding(15.dp),
                fontSize = 20.sp,
                color = Color(55, 71, 79),
                fontWeight = FontWeight.Medium
            )
            Text(
                "It looks like you already have an account in this number. Please enter the password to proceed",
                modifier = Modifier.padding(15.dp),
                fontSize = 14.sp,
                color = Color(55, 71, 79, 183),
                fontWeight = FontWeight.Medium
            )
            var passwordVisibility: Boolean by remember { mutableStateOf(false) }
            var phoneNumber by rememberSaveable { mutableStateOf("") }
            OutlinedTextField(
                value = phoneNumber,
                onValueChange = {
                    phoneNumber = it
                },
                label = { Text("Password") },
                keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Password),
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(start = 16.dp, end = 16.dp, top = 20.dp),
                shape = RoundedCornerShape(8.dp),
                visualTransformation = if (passwordVisibility) VisualTransformation.None else PasswordVisualTransformation(),
                leadingIcon = {
                    Row(
                        horizontalArrangement = Arrangement.Center,
                        verticalAlignment = Alignment.CenterVertically,
                        modifier = Modifier.padding(start = 10.dp, end = 10.dp)
                    ) {
                        Image(
                            painter = painterResource(R.drawable.lock),
                            contentDescription = null,
                            modifier = Modifier
                                .height(24.dp)
                                .width(24.dp),
                        )
                    }

                },
                trailingIcon = {
                    Row(
                        horizontalArrangement = Arrangement.Center,
                        verticalAlignment = Alignment.CenterVertically,
                        modifier = Modifier.padding(start = 10.dp, end = 16.dp)
                    ) {
                        Image(
                            painter = painterResource(R.drawable.visibility),
                            contentDescription = null,
                            modifier = Modifier
                                .height(24.dp)
                                .width(24.dp).clickable {
                                    passwordVisibility = !passwordVisibility
                                },
                        )
                    }

                },
                colors = TextFieldDefaults.outlinedTextFieldColors(
                    containerColor = Color(240, 241, 242),
                    focusedBorderColor = Color(240, 241, 242),
                    unfocusedBorderColor = Color(240, 241, 242)
                )
            )
            Text(
                text = "Forgot  Password?",
                color = Color(243, 122, 32),
                modifier = Modifier
                    .padding(start = 16.dp, top = 35.dp),
                fontSize = 14.sp,
                fontWeight = FontWeight(400)
            )
        }
        Button(
            onClick = {},
            modifier = Modifier
                .padding(start = 16.dp, end = 16.dp, bottom = 34.dp)
                .fillMaxWidth()
                .height(48.dp),
            colors = ButtonDefaults.buttonColors(
                containerColor = Color(94, 196, 1),
                contentColor = Color.White
            ),
            shape = RoundedCornerShape(8.dp)
        ) {
            Row(
                horizontalArrangement = Arrangement.Center,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Text(
                    text = "Submit",
                    fontSize = 16.sp,
                    fontWeight = FontWeight(500),
                    modifier = Modifier
                        .fillMaxWidth()
                        .weight(1f),
                    textAlign = TextAlign.Center
                )
                Image(
                    painter = painterResource(R.drawable.nextbutton),
                    contentDescription = null,
                    modifier = Modifier
                        .height(15.dp)
                        .width(15.dp)
                )
            }

        }
    }

}


@Preview(showBackground = true, showSystemUi = true, device = Devices.PIXEL_4)
@Composable
fun EnterPasswordPreview() {
    EnterPassword()
}
