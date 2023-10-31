package com.example.numaboaterapia.ds

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Card
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.myapplication.main.view.actions.MainActions
import com.example.myapplication.main.view.actions.MainActions.Action
import com.example.myapplication.main.view.states.MainStates
import com.example.myapplication.ui.theme.NumaBoaTheme



@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun CustomWhiteButton(
    text: String,
    modifier: Modifier = Modifier,
    onClick: () -> Unit,
    state: MainStates

) {
    Card(
        modifier = modifier
            .padding(16.dp),
        shape = MaterialTheme.shapes.extraLarge,
        onClick = onClick
    ) {
        Column{
            Text(
                text = text,
                fontSize = 16.sp,
                color = Color(0xFF9C27B0),
                fontWeight = FontWeight.Bold,
                textAlign = TextAlign.Center,
                modifier = modifier
                    .padding(16.dp)
            )
        }
    }
}

@Preview
@Composable
fun CustomButtonPreview() {
    NumaBoaTheme {
    val buttonClicked = remember { mutableStateOf(false) }

    // Verifique o estado para determinar se o botão foi clicado
    if (buttonClicked.value) {
        Text("Button Clicked")
    } else {
        CustomWhiteButton(
            text = "Button Text",
            state = MainStates.Enabled(true),
            onClick = {
                // Defina o estado do botão como clicado
                buttonClicked.value = true
            }
        )
    }
}

}

