package com.akings.viewmodeldeneme

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.akings.viewmodeldeneme.karecizme.KareScreen
import com.akings.viewmodeldeneme.ui.theme.ViewModelDenemeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ViewModelDenemeTheme {
                KareScreen()

            }
        }
    }

}

