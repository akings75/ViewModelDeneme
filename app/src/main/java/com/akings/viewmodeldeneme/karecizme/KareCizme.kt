package com.akings.viewmodeldeneme.karecizme

import android.annotation.SuppressLint
import androidx.compose.foundation.Canvas
import androidx.compose.foundation.layout.*
import androidx.compose.material.Text
import androidx.compose.material.TextField
import androidx.compose.runtime.*
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.unit.dp

@Composable
fun KareScreen() {
    val myViewModel = KareViewModel()
    Column(modifier = Modifier
        .padding(16.dp)
        .fillMaxSize(),
        verticalArrangement = Arrangement.spacedBy(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally) {
        TextValue(myViewModel = myViewModel)
        Kare(myViewModel = myViewModel)

    }

}


@SuppressLint("StateFlowValueCalledInComposition")
@Composable
fun TextValue(myViewModel: KareViewModel) {
    val name by myViewModel.name.collectAsState()
    val numx by myViewModel.numx.collectAsState()
    val numy by myViewModel.numy.collectAsState()
    Text(text = name)
    TextField(value = name, onValueChange = myViewModel::setName)

    Text(text = "numx:${numx}")
    TextField(value = numx.toString(), onValueChange = myViewModel::setNumx)

    Text(text = "numy:${numy}")
    TextField(value = numy.toString(), onValueChange = myViewModel::setNumy)
    var text by rememberSaveable { mutableStateOf("") }
    Text(text = text)
    TextField(value = text, onValueChange = {text = it})


}

@Composable
fun Kare(myViewModel: KareViewModel) {
    Canvas(modifier = Modifier
        .size(300.dp)
        .padding(10.dp)) {

        drawLine(
            color = Color.Red,
            strokeWidth = 10f,
            cap = StrokeCap.Round,
            start = Offset(x = 0f, y = 0f),
            end = Offset(x = 0f, y = myViewModel.numy.value)
        )
        drawLine(
            color = Color.Magenta,
            strokeWidth = 10f,
            cap = StrokeCap.Round,
            start = Offset(x = myViewModel.numx.value, y = 0f),
            end = Offset(x = myViewModel.numx.value, y = myViewModel.numy.value)
        )
        drawLine(
            color = Color.Cyan,
            strokeWidth = 10f,
            cap = StrokeCap.Round,
            start = Offset(x = 0f, y = myViewModel.numy.value),
            end = Offset(x = myViewModel.numx.value, y = myViewModel.numy.value)
        )
        drawLine(
            color = Color.Blue,
            strokeWidth = 10f,
            cap = StrokeCap.Round,
            start = Offset(x = 0f, y = 0f),
            end = Offset(x = myViewModel.numx.value, y = 0f)
        )
        drawLine(
            color = Color.Black,
            strokeWidth = 10f,
            cap = StrokeCap.Round,
            start = Offset(x = 0f, y = 0f),
            end = Offset(x = myViewModel.numx.value, y = myViewModel.numy.value)
        )
        drawLine(
            color = Color.Green,
            strokeWidth = 10f,
            cap = StrokeCap.Round,
            start = Offset(x = myViewModel.numx.value, y = 0f),
            end = Offset(x = 0f, y = myViewModel.numy.value)
        )

    }
}