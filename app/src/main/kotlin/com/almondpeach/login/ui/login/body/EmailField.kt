package com.almondpeach.login.ui.login.body

import android.content.res.Configuration
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalConfiguration
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.unit.dp
import com.almondpeach.login.R

@Composable
fun EmailField(
    email: String,
    onEmailChange: (String) -> Unit,
) {
    val orientation = LocalConfiguration.current.orientation

    OutlinedTextField(
        value = email,
        onValueChange = { onEmailChange(it) },
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = if (orientation == Configuration.ORIENTATION_PORTRAIT) 24.dp else 48.dp),
        label = { Text(text = stringResource(R.string.email)) },
        keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Email),
        singleLine = true,
    )
}
