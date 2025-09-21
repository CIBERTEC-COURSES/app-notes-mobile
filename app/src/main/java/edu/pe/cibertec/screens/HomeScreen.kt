package edu.pe.cibertec.screens

import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Adb
import androidx.compose.material.icons.filled.Add
import androidx.compose.material3.Divider
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Icon
import androidx.compose.material3.ListItem
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

@Composable
fun HomeScreen(onNavigateTONew: () -> Unit){
    Scaffold (
        floatingActionButton = {
            FloatingActionButton(onClick = onNavigateTONew) {
                Icon(Icons.Default.Add, contentDescription = "New Note")
            }
        }
    ) { padding ->
        LazyColumn (modifier = Modifier.padding(padding)) {
            items(10){
                    index ->
                ListItem(
                    headlineContent = { Text("Nota #$index") },
                    supportingContent = { Text("Description here..")}

                )
                HorizontalDivider()
            }
        }

    }

}