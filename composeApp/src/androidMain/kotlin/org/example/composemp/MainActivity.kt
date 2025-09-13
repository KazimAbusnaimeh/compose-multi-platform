package org.example.composemp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.google.firebase.analytics.FirebaseAnalytics

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        enableEdgeToEdge()
        super.onCreate(savedInstanceState)

        setContent {
            App(onBockClicked = {
                val analytics = FirebaseAnalytics.getInstance(this)
                analytics.logEvent("clicked_home", null)
            })
        }
    }
}

@Preview(showSystemUi = true, showBackground = true)
@Composable
fun AppAndroidPreview() {
    App()
}