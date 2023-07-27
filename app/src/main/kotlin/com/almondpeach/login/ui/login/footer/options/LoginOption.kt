package com.almondpeach.login.ui.login.footer.options

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.unit.Dp

@Composable
fun LoginOption(
    modifier: Modifier = Modifier,
    painter: Painter,
    contentDescription: String?,
    size: Dp,
) {
    Image(
        painter = painter,
        contentDescription = contentDescription,
        modifier = modifier.size(size),
    )
}
