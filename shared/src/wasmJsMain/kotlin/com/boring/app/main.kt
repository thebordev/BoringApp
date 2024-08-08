import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.ui.Alignment
import androidx.compose.ui.ExperimentalComposeUiApi
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.sp
import androidx.compose.ui.window.CanvasBasedWindow

@OptIn(ExperimentalComposeUiApi::class)
fun main() {
    CanvasBasedWindow("SCC APP") {
        Box(
            modifier = Modifier
                .fillMaxSize()
                .background(
                    color = Color.Green,
                ),
            contentAlignment = Alignment.Center,
        ) {
            Text(
                text = "Boring App",
                fontSize = 160.sp,
                color = Color.Red,
            )
        }
    }
}
