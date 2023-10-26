package com.example.numaboaterapia.ds

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Card
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.myapplication.ui.theme.NumaBoaTheme



@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun CustomWhiteButton(
    text: String,
    onClick: () -> Unit
) {
    Card(
        modifier = Modifier
            .padding(10.dp),
        shape = MaterialTheme.shapes.medium,
        onClick = onClick
    ) {
        Column{
            Text(
                text = text,
                fontSize = 16.sp,
                color = Color(0xFF9C27B0),
                textAlign = TextAlign.Center,
                modifier = Modifier
                    .padding(16.dp)
            )
        }
    }
}

@Preview
@Composable
fun CustomButtonPreview() {
    NumaBoaTheme{
        CustomWhiteButton(text = "Button Text") {}
    }

}

