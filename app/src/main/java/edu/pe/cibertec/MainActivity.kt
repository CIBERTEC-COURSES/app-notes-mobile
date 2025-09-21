package edu.pe.cibertec

import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.DisposableEffect
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.lifecycle.compose.LocalLifecycleOwner
import edu.pe.cibertec.ui.theme.MiprimerappTheme
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.LifecycleEventObserver
import androidx.lifecycle.LifecycleObserver

private const val TAG_ACTIVITY = "Life"
private const val TAG_OBSERVER = "LifeObs"

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d(TAG_ACTIVITY, "onCreate")
        enableEdgeToEdge()
        setContent {
            MiprimerappTheme {
                Surface{
                    AppNav()
                }
            }
        }
    }
    override fun onStart() {
        super.onStart()
        Log.d(TAG_ACTIVITY, "onStart")
    }
    override fun onResume() {
        super.onResume()
        Log.d(TAG_ACTIVITY, "onResume")
    }

    override fun onPause() {
        super.onPause()
        Log.d(TAG_ACTIVITY, "onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.d(TAG_ACTIVITY, "onStop")
    }

}

@Composable
fun TrackLifeCycel(){
    val owner = LocalLifecycleOwner.current
    DisposableEffect(owner) {
        val observer = LifecycleEventObserver { _, event ->
            when(event){
                Lifecycle.Event.ON_CREATE -> Log.d(TAG_OBSERVER, "ONCREATE desde compose")
                Lifecycle.Event.ON_START -> Log.d(TAG_OBSERVER, "ONSTART desde compose")
                Lifecycle.Event.ON_RESUME -> Log.d(TAG_OBSERVER, "ONRESUME desde compose")
                Lifecycle.Event.ON_PAUSE -> Log.d(TAG_OBSERVER, "ONPAUSE desde compose")
                Lifecycle.Event.ON_STOP -> Log.d(TAG_OBSERVER, "ONSTOP desde compose")

                else -> Unit
            }
        }
        owner.lifecycle.addObserver(observer)
        onDispose {
            owner.lifecycle.removeObserver(observer)
        }

    }

}


@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    MiprimerappTheme {
        Greeting("Android")
    }
}