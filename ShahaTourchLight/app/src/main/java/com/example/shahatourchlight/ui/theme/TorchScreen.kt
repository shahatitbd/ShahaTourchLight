package com.example.shahatourchlight

import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.platform.LocalContext

@Composable
fun TorchScreen() {
    val context = LocalContext.current
    var isOn by remember { mutableStateOf(false) }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text("ShahaTourchLight", style = MaterialTheme.typography.headlineSmall)

        Spacer(modifier = Modifier.height(80.dp))

        Switch(
            checked = isOn,
            onCheckedChange = {
                isOn = it
                TorchController.toggleTorch(context)
            }
        )

        Spacer(modifier = Modifier.height(40.dp))

        Text(
            text = if (isOn) "Torch is ON" else "Torch is OFF",
            style = MaterialTheme.typography.bodyLarge
        )

        Spacer(modifier = Modifier.height(120.dp))

        Text(
            text = "Developed by Shahabuddin",
            style = MaterialTheme.typography.labelLarge
        )
    }
}
