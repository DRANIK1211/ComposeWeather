package com.example.composeweather.screen.enterCode

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.foundation.text.KeyboardActions
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
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.drawWithCache
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardCapitalization
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Devices
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.composeweather.R



@Composable
fun EnterCode() {
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
                painter = painterResource(R.drawable.phonenumberimg1), contentDescription = null,
                modifier = Modifier
                    .fillMaxWidth()
                    .height(300.dp)
            )
            Text(
                "Enter Verification Code",
                modifier = Modifier.padding(15.dp),
                fontSize = 20.sp,
                color = Color(55, 71, 79),
                fontWeight = FontWeight.Medium
            )
            Text(
                "We have sent SMS to:",
                modifier = Modifier.padding(start = 15.dp, top = 10.dp, bottom = 7.dp),
                fontSize = 14.sp,
                color = Color(55, 71, 79, 183),
                fontWeight = FontWeight(400)
            )
            Text(
                "01XXXXXXXXXX",
                modifier = Modifier.padding(start = 15.dp,),
                fontSize = 16.sp,
                color = Color(55, 71, 79),
                fontWeight = FontWeight(700)
            )
            Row(
                modifier = Modifier.fillMaxWidth()
                    .padding(start = 16.dp, top = 35.dp, end = 24.dp),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically,

                ){
                Text(
                    text = "Resend OTP",
                    color = Color(243, 122, 32),
                    modifier = Modifier,
                    fontSize = 14.sp,
                    fontWeight = FontWeight(400)
                )
                Text(
                    text = "Change Phone Number",
                    color = Color(55, 71, 79, 183),
                    modifier = Modifier,
                    fontSize = 14.sp,
                    fontWeight = FontWeight(400)
                )
            }
            var OtpText by remember {
                mutableStateOf("")
            }
            BasicTextField(
                value = OtpText,
                onValueChange = {
                    if(it.length <= 5){
                        OtpText = it
                    }
                },
                modifier = Modifier.fillMaxWidth()
                    .padding(top = 35.dp, start = 24.dp, end = 24.dp),
                keyboardOptions = KeyboardOptions(
                    capitalization = KeyboardCapitalization.Characters,
                    keyboardType = KeyboardType.Number
                )
            ){
                Row (horizontalArrangement = Arrangement.SpaceBetween){
                    repeat(5) { index ->
                        val number = when {
                            index >= OtpText.length -> ""
                            else -> OtpText[index]
                        }

                        Column(
                            verticalArrangement = Arrangement.Center,
                            horizontalAlignment = Alignment.CenterHorizontally
                        ) {
                            Box(
                                modifier = Modifier
                                    .width(56.dp)
                                    .height(56.dp)
                                    .clip(
                                        shape = RoundedCornerShape(8.dp)
                                    )
                                    .background(Color(240, 241, 242))
                                    ,

                            ){
                                Box(
                                    contentAlignment = Alignment.Center,
                                    modifier = Modifier.fillMaxSize()
                                ){
                                    Text(
                                        text = number.toString(),
                                        fontSize = 20.sp,
                                        fontWeight = FontWeight(500)
                                    )
                                }

                            }
                        }
                    }
                }
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
                    text = "Next",
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
fun EnterCodePreview() {
    EnterCode()
}