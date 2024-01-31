package com.ascurra.stock.ui.component

import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable

@Composable
fun PrimaryButton(text:String,onClick:() -> Unit) {
    Button(onClick = { onClick.invoke() }) {
        Text(text = text)
    }
}