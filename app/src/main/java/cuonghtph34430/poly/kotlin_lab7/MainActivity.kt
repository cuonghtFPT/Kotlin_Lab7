package cuonghtph34430.poly.kotlin_lab7

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import cuonghtph34430.poly.kotlin_lab7.navigation.GetLayoutScreenNavigation

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            GetLayoutScreenNavigation()
        }
    }
}




@Preview(showBackground = true)
@Composable
fun GreetingPreview() {

}