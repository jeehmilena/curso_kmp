package br.com.cursokmp.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.ListItem
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import cursokmp.composeapp.generated.resources.Res
import cursokmp.composeapp.generated.resources.snoopy1
import moe.tlaster.precompose.navigation.Navigator
import org.jetbrains.compose.resources.painterResource

@Composable
fun Memories(navigator: Navigator) {
    Column {
        Text(text = "Snoopy e sua turma se divertindo!")
        HorizontalDivider()

        ListItem(
            headlineContent = {/* TODO */ },
            supportingContent = { /* TODO */ },
            leadingContent = {
                Image(
                    painter = painterResource(Res.drawable.snoopy1),
                    contentDescription = null
                )
            },
            trailingContent = {/* TODO */ }
        )
    }

}