package org.canos.moneybook

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.ui.Modifier
import org.canos.moneybook.ui.core.components.AppLayout
import org.canos.moneybook.ui.core.theme.MoneyBookTheme

class MainActivity : ComponentActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            MoneyBookTheme {
                // A surface container using the 'background' color from the theme

                AppLayout()

            }
        }
    }
}