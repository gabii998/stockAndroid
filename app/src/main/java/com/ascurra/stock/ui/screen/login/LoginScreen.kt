package com.ascurra.stock.ui.screen.login

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.IntrinsicSize
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.ascurra.stock.ui.component.PrimaryButton
import com.ascurra.stock.ui.component.TextInput

@Composable
fun LoginScreen() {
    val username = remember { mutableStateOf("") }
    val password = remember { mutableStateOf("") }
    
    
    Column(
        Modifier
            .fillMaxSize()
            .width(IntrinsicSize.Max), horizontalAlignment = Alignment.CenterHorizontally) {
        Spacer(modifier = Modifier.weight(1f))
        Column(
            Modifier
                .fillMaxWidth()
                .padding(horizontal = 15.dp), horizontalAlignment = Alignment.CenterHorizontally) {
            TextInput(username, "Email")
            Spacer(modifier = Modifier.height(20.dp))
            TextInput(password, "Password")
            Spacer(modifier = Modifier.height(40.dp))
            PrimaryButton(text = "Iniciar Sesión") {}
        }
        Spacer(modifier = Modifier.weight(1f))
    }
}

@Preview(showSystemUi = true)
@Composable
fun PreviewLoginScreen() {
    LoginScreen()
}