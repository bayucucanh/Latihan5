package id.ac.unpas.modul3

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.material.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.tooling.preview.Preview
import id.ac.unpas.modul3.ui.theme.Modul3Theme
import androidx.compose.ui.unit.dp
import id.ac.unpas.modul3.screens.PengelolaanSampahScreen
import dagger.hilt.android.AndroidEntryPoint
import id.ac.unpas.modul3.screens.MainScreen

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Modul3Theme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    MainScreen()
                }
            }
        }
    }
}

@Composable
//fun Greeting(name: String) {
//    Text(text = "Hello $name!")
//}

fun FormLogin() {
    val username = remember { mutableStateOf(TextFieldValue(""))}
    val password = remember { mutableStateOf(TextFieldValue(""))}

    Column(modifier = Modifier
        .padding(10.dp)
        .fillMaxWidth()) {
        Text(text = "Username", modifier = Modifier
            .padding(4.dp)
            .fillMaxWidth())
        TextField(value = username.value, onValueChange = {
            username.value = it
        }, modifier = Modifier
            .padding(4.dp)
            .fillMaxWidth() )
        Text(text = "Password", modifier = Modifier
            .padding(4.dp)
            .fillMaxWidth())
        TextField(value = password.value, visualTransformation = PasswordVisualTransformation(), onValueChange = {
            password.value = it
        }, keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Password), modifier = Modifier
            .padding(4.dp)
            .fillMaxWidth() )
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    Modul3Theme {
//        Greeting("Android")
//        FormLogin()
        MainScreen()
    }
}