package com.ascurra.stock.ui.component

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.ui.Modifier

@Composable
fun TextInput(value:MutableState<String>,label:String) {
    TextField(value = value.value, onValueChange = { value.value = it}, modifier = Modifier.fillMaxWidth(), label = {
        Text(text = label)
    })
}