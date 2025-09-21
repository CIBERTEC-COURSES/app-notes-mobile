package edu.pe.cibertec.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun NewNoteSreen(onBack: () -> Unit){
    var title by remember { mutableStateOf("") }
    var detail by remember { mutableStateOf("") }

    Column (modifier = Modifier.padding(16.dp)) {
        OutlinedTextField(
            value = title,
            onValueChange = { title = it},
            label = { Text("Note TItle") },
            modifier = Modifier.fillMaxWidth()
        )
        Spacer(Modifier.height(8.dp))
        OutlinedTextField(
            value = detail,
            onValueChange = { title = it},
            label = { Text("Details") },
            modifier = Modifier.fillMaxWidth()
        )
        Spacer(Modifier.height(16.dp))

        Button(onClick = onBack ) {
            Text("Save")
        }
    }

}