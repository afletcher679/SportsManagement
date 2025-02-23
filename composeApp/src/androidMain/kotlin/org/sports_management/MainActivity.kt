package org.sports_management

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import org.koin.androidx.viewmodel.ext.android.viewModel

class MainActivity : ComponentActivity() {
    private val greetingViewModel: GreetingViewModel by viewModel()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            App(greetingViewModel)
        }
    }
}

@Preview
@Composable
fun AppAndroidPreview() {
    App(GreetingViewModel(Greeting(Platform())))
}