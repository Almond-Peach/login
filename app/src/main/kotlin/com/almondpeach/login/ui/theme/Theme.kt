package com.almondpeach.login.ui.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable

private val lightColorScheme = lightColorScheme(
    primary = darkTeal,
    onPrimary = white,
)

private val darkColorScheme = darkColorScheme(
    primary = darkTeal,
    onPrimary = white,
)

@Composable
fun LoginTheme(
    useDarkTheme: Boolean = isSystemInDarkTheme(),
    content: @Composable () -> Unit,
) {
    val colorScheme =
        if (!useDarkTheme) {
            lightColorScheme
        } else {
            darkColorScheme
        }
    MaterialTheme(
        colorScheme = colorScheme,
        content = content,
    )
}
