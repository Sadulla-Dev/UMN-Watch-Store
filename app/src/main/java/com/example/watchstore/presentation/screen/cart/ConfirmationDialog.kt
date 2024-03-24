package com.example.watchstore.presentation.screen.cart

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.AlertDialog
import androidx.compose.material.Text
import androidx.compose.material.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.watchstore.theme.Black
import com.example.watchstore.theme.GilroyFontFamily
import com.example.watchstore.theme.TEXT_SIZE_16sp

@Composable
fun ConfirmationDialog(
    onConfirm: (phoneNumber: String) -> Unit,
    onCancel: () -> Unit
) {
    var phoneNumber by remember { mutableStateOf("+9989") }
    var confirmClicked by remember { mutableStateOf(false) }

    AlertDialog(
        onDismissRequest = onCancel,
        shape = RoundedCornerShape(20.dp),
        title = {
            Text(
                text = "Confirmation",
                fontFamily = GilroyFontFamily,
                fontWeight = FontWeight.Bold,
                color = Black,
                fontSize = TEXT_SIZE_16sp,
                modifier = Modifier
                    .clip(RoundedCornerShape(10.dp))
                    .padding(10.dp),
            )
        },
        text = {
            Column {
                if (confirmClicked) {
                    TextField(
                        modifier = Modifier.clip(RoundedCornerShape(15.dp)),
                        value = phoneNumber,
                        textStyle = TextStyle(
                            fontFamily = GilroyFontFamily,
                            fontWeight = FontWeight.Bold,
                            color = Black,
                            fontSize = TEXT_SIZE_16sp,
                        ),
                        onValueChange = {
                            phoneNumber = it
                        },
                        label = { Text("Phone Number") },
                        keyboardOptions = KeyboardOptions.Default.copy(
                            keyboardType = KeyboardType.Number
                        ),
                        keyboardActions = KeyboardActions(
                            onDone = {
                                onConfirm(phoneNumber)
                            }
                        )
                    )
                }
            }
        },
        confirmButton = {
            Text(
                text = "Confirm",
                fontFamily = GilroyFontFamily,
                fontWeight = FontWeight.Bold,
                color = Black,
                fontSize = TEXT_SIZE_16sp,
                modifier = Modifier
                    .padding(start = 15.dp, end = 15.dp, bottom = 15.dp)
                    .clip(RoundedCornerShape(10.dp))
                    .clickable {
                        confirmClicked = true
                        onConfirm(phoneNumber)
                    }
            )
        },
        dismissButton = {
            Text(
                text = "Cancel",
                fontFamily = GilroyFontFamily,
                fontWeight = FontWeight.Bold,
                color = Black,
                fontSize = TEXT_SIZE_16sp,
                modifier = Modifier
                    .padding(start = 15.dp, end = 15.dp, bottom = 15.dp)
                    .clip(RoundedCornerShape(10.dp))
                    .clickable { onCancel() }
            )
        },
    )
}

@Preview
@Composable
private fun ConfirmationDialogPreview() {
    ConfirmationDialog(onConfirm = {}, onCancel = {})
}