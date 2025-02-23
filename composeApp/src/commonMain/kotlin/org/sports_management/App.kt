package org.sports_management

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material.Button
import androidx.compose.material.MaterialTheme
import androidx.compose.material.OutlinedTextField
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import org.jetbrains.compose.ui.tooling.preview.Preview

@Composable
@Preview
fun App(greetingViewModel: GreetingViewModel ) {
    MaterialTheme {
        var showContent by remember { mutableStateOf(false) }
        var userName by remember { mutableStateOf("username") }
        var password by remember { mutableStateOf("password") }
        Column(
            Modifier.fillMaxWidth(),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {

            Text(greetingViewModel.print())
            OutlinedTextField(
                value = userName,
                onValueChange = { userName = it },
                label = { Text("Username: ") })
            OutlinedTextField(
                value = password,
                onValueChange = { password = it },
                label = { Text("Password: ") })
            Button(onClick = {showContent = !showContent}){
                Text("Submit")
            }
            AnimatedVisibility(showContent) {
                Column(Modifier.fillMaxWidth(), horizontalAlignment = Alignment.CenterHorizontally) {
                    Text("Username = $userName\nPassword = $password")
                }
            }
        }
    }
}