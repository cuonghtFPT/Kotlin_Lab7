package cuonghtph34430.poly.kotlin_lab7.screen

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.selection.selectable
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import cuonghtph34430.poly.kotlin_lab7.model.ROUTE_SCREEN

@Composable
fun GetLayoutScreenTwo(navController: NavHostController) {
    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Text(text = "Screen Two",
            modifier = Modifier.selectable(
                selected = true,
                onClick = {
                    navController.navigate(ROUTE_SCREEN.screen3.name)
                }
            )
        )

    }
}