package com.example.myapplication.main.view

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.livedata.observeAsState
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.NavController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.myapplication.R
import com.example.myapplication.main.nav.MyAppNavHost
import com.example.myapplication.main.view.actions.MainActions
import com.example.myapplication.main.view.states.MainStates
import com.example.myapplication.ui.theme.NumaBoaTheme
import com.example.numaboaterapia.ds.CustomWhiteButton
import com.example.numaboaterapia.versionTwo.main.viewModel.MainViewModel

class MainActivity : ComponentActivity() {
    private lateinit var mainViewModel: MainViewModel
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mainViewModel = ViewModelProvider(this).get(MainViewModel::class.java)
        setContent {
            val navController = rememberNavController()

            NumaBoaTheme {

                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    MyAppNavHost(navController = navController)

                }
            }

        }
    }
}

@Composable
fun MainScreen(
    state: MainStates,
    onAction: (MainActions.Action) -> Unit,
    navController: NavController
) {
    Box(
        modifier = Modifier.fillMaxSize()
            .background(Color(0xFFE3B5FF))
    ) {
        Image(
            painter = painterResource(id = R.mipmap.ic_logo_background),
            contentDescription = null,
            contentScale = ContentScale.Crop,
            modifier = Modifier.fillMaxSize()
        )

        Column(
            modifier = Modifier
                .fillMaxWidth()
                .fillMaxSize()
                .padding(16.dp)
                .background(Color.Transparent)
                .verticalScroll(rememberScrollState()), // Adicione verticalScroll se o conteúdo for longo
            verticalArrangement = Arrangement.Bottom,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            CustomWhiteButton(
                text = "Entrar",
                onClick = {
                    onAction(MainActions.Action.ClickButton)
                    // Use o NavController para navegar para a tela de login
                    navController.navigate("destination_login")
                },
                modifier = Modifier.fillMaxWidth(), // Adicione Modifier.fillMaxWidth() para ambos os botões
                state = state
            )
            Spacer(modifier = Modifier.height(16.dp))
            CustomWhiteButton(
                text = "Cadastro",
                onClick = { onAction(MainActions.Action.ClickButton) },
                modifier = Modifier.fillMaxWidth(), // Adicione Modifier.fillMaxWidth() para ambos os botões
                state = state
            )
        }
    }

}

@Composable
@Preview
fun MainScreenPreview() {
    val navController = rememberNavController()
    MainScreen(
        state = MainStates.Disabled(false),
        onAction = { action -> /* Define ação aqui */ },
        navController = navController
    )
}
