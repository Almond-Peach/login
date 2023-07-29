package com.almondpeach.login.ui.login.body

import android.content.res.Configuration
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalConfiguration
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.unit.dp
import com.almondpeach.login.R

@Composable
fun PasswordField(
    password: String,
    onPasswordChange: (String) -> Unit,
    passwordVisible: Boolean,
    onPasswordVisibilityChange: () -> Unit,
) {
    val orientation = LocalConfiguration.current.orientation

    OutlinedTextField(
        value = password,
        onValueChange = { onPasswordChange(it) },
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = if (orientation == Configuration.ORIENTATION_PORTRAIT) 24.dp else 48.dp),
        label = { Text(text = stringResource(R.string.password)) },
        trailingIcon = {
            IconButton(onClick = { onPasswordVisibilityChange() }) {
                Icon(
                    painter = painterResource(
                        if (passwordVisible) {
                            R.drawable.ic_baseline_visibility_24
                        } else {
                            R.drawable.ic_baseline_visibility_off_24
                        },
                    ),
                    contentDescription = stringResource(
                        id = if (passwordVisible) {
                            R.string.hide_password
                        } else {
                            R.string.show_password
                        },
                    ),
                )
            }
        },
        visualTransformation = if (passwordVisible) VisualTransformation.None else PasswordVisualTransformation(),
        keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Password),
        singleLine = true,
    )
}
