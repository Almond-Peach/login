package com.almondpeach.login.ui.login

import android.content.res.Configuration
import android.widget.Toast
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Button
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalConfiguration
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.unit.dp
import com.almondpeach.login.R
import com.almondpeach.login.ui.common.DevicePreviews

@Composable
fun LoginBody(
    modifier: Modifier = Modifier,
) {
    Column(
        modifier = modifier.fillMaxSize(),
        verticalArrangement = Arrangement.spacedBy(10.dp, Alignment.CenterVertically),
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {
        EmailField()
        PasswordField()
        LoginButton(Modifier.padding(top = 10.dp))
    }
}

@Composable
fun EmailField(
    modifier: Modifier = Modifier,
) {
    var email by rememberSaveable { mutableStateOf("") }

    val horizontalPadding = when (LocalConfiguration.current.orientation) {
        Configuration.ORIENTATION_PORTRAIT -> 24.dp
        else -> 48.dp
    }

    TextField(
        value = email,
        onValueChange = { email = it },
        modifier = modifier
            .fillMaxWidth()
            .padding(horizontal = horizontalPadding),
        label = { Text(text = stringResource(R.string.email)) },
        keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Email),
        singleLine = true,
    )
}

@Composable
fun PasswordField(
    modifier: Modifier = Modifier,
) {
    var password by rememberSaveable { mutableStateOf("") }
    var passwordVisible by rememberSaveable { mutableStateOf(false) }

    val horizontalPadding = when (LocalConfiguration.current.orientation) {
        Configuration.ORIENTATION_PORTRAIT -> 24.dp
        else -> 48.dp
    }

    TextField(
        value = password,
        onValueChange = { password = it },
        modifier = modifier
            .fillMaxWidth()
            .padding(horizontal = horizontalPadding),
        label = { Text(text = stringResource(R.string.password)) },
        trailingIcon = {
            IconButton(onClick = { passwordVisible = passwordVisible.not() }) {
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

@Composable
fun LoginButton(
    modifier: Modifier = Modifier,
) {
    val horizontalPadding = when (LocalConfiguration.current.orientation) {
        Configuration.ORIENTATION_PORTRAIT -> 48.dp
        else -> 72.dp
    }

    val context = LocalContext.current
    val text = stringResource(R.string.successful_login)

    Button(
        onClick = { Toast.makeText(context, text, Toast.LENGTH_SHORT).show() },
        modifier = modifier
            .fillMaxWidth()
            .padding(horizontal = horizontalPadding),
    ) {
        Text(text = stringResource(R.string.login))
    }
}

@DevicePreviews
@Composable
private fun LoginBodyPreview() {
    LoginBody()
}
