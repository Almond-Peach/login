package com.almondpeach.login.ui.login.body

import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.VisualTransformation
import com.almondpeach.login.R

@Composable
fun PasswordField(
    modifier: Modifier = Modifier,
    password: String,
    onPasswordChange: (String) -> Unit,
    passwordVisible: Boolean,
    onPasswordVisibilityChange: () -> Unit,
) {
    OutlinedTextField(
        value = password,
        onValueChange = { onPasswordChange(it) },
        modifier = modifier,
        label = { Text(text = stringResource(R.string.password)) },
        trailingIcon = {
            IconButton(onClick = { onPasswordVisibilityChange() }) {
                Icon(
                    painter = if (passwordVisible) {
                        painterResource(R.drawable.ic_baseline_visibility_24)
                    } else {
                        painterResource(R.drawable.ic_baseline_visibility_off_24)
                    },
                    contentDescription = if (passwordVisible) {
                        stringResource(R.string.hide_password)
                    } else {
                        stringResource(R.string.show_password)
                    },
                )
            }
        },
        visualTransformation = if (passwordVisible) VisualTransformation.None else PasswordVisualTransformation(),
        keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Password),
        singleLine = true,
    )
}
