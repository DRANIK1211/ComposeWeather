package com.example.composeweather.screen.registrationPassword

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
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
fun RegistrationPassword(){
    Column (
        verticalArrangement = Arrangement.Center,
        modifier = Modifier
            .fillMaxSize(),
    ){

        Column(
            modifier = Modifier.fillMaxSize().weight(1f),
            verticalArrangement = Arrangement.Top,
        ) {
            Row(
                modifier = Modifier.fillMaxWidth()
                    .padding(bottom = 29.dp, start = 16.dp)
                    .height(88.dp),
                verticalAlignment = Alignment.Bottom
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
            Column(
                modifier = Modifier.fillMaxWidth()
                    .padding(start = 16.dp, end = 16.dp),
                verticalArrangement = Arrangement.Center,
            ) {
                Text(
                    text = "For the security & safety please choose a password",
                    fontSize = 14.sp,
                    fontWeight = FontWeight(400),
                    color = Color(55, 71, 79, 184),
                    modifier = Modifier.height(73.dp),
                    textAlign = TextAlign.Start
                )
                Image(
                    painter = painterResource(R.drawable.mobile_login_pana),
                    contentDescription = null,
                    modifier = Modifier.fillMaxWidth()
                        .height(344.dp)
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
                        .padding(top = 44.dp),
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
                        focusedBorderColor = Color(240, 241, 242),
                        unfocusedBorderColor = Color(240, 241, 242),
                        containerColor = Color(240, 241, 242)
                    )

                )

                var passwordVisibility1: Boolean by remember { mutableStateOf(false) }
                var phoneNumber1 by rememberSaveable { mutableStateOf("") }
                OutlinedTextField(
                    value = phoneNumber1,
                    onValueChange = {
                        phoneNumber1 = it
                    },
                    label = { Text("Confirm Password") },
                    keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Password),
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(top = 18.dp),
                    shape = RoundedCornerShape(8.dp),
                    visualTransformation = if (passwordVisibility1) VisualTransformation.None else PasswordVisualTransformation(),
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
                        focusedBorderColor = Color(240, 241, 242),
                        unfocusedBorderColor = Color(240, 241, 242),
                        containerColor = Color(240, 241, 242)
                    )

                )
            }

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
                    text = "Finish, Good to go",
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
fun RegistrationPasswordPreview(){
    RegistrationPassword()
}