package com.example.watchstore.presentation.common.content

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import com.example.watchstore.theme.Black
import com.example.watchstore.theme.DIMENS_16dp
import com.example.watchstore.theme.DIMENS_248dp
import com.example.watchstore.theme.GilroyFontFamily
import com.example.watchstore.theme.TEXT_SIZE_18sp
import com.example.watchstore.R

@Composable
fun EmptyContent(
    modifier: Modifier = Modifier
) {
    Column(
        modifier = modifier
            .fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Image(
            modifier = Modifier.size(DIMENS_248dp),
            painter = painterResource(id = R.drawable.no_data),
            contentDescription = stringResource(R.string.image_content_empty)
        )

        Spacer(modifier = Modifier.height(DIMENS_16dp))

        Text(
            modifier = modifier.fillMaxWidth(),
            text = stringResource(R.string.oops_no_data),
            fontFamily = GilroyFontFamily,
            fontWeight = FontWeight.Bold,
            fontSize = TEXT_SIZE_18sp,
            color = Black,
            textAlign = TextAlign.Center,
        )
    }
}

@Preview(showBackground = true)
@Composable
fun EmptyContentPreview() {
    EmptyContent()
}