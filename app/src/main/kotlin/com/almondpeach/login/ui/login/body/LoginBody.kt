package com.almondpeach.login.ui.login.body

import android.content.res.Configuration
import android.widget.Toast
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalConfiguration
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import com.almondpeach.login.R
import com.almondpeach.login.ui.common.DevicePreviews

@Composable
fun LoginBody(
    modifier: Modifier = Modifier,
) {
    var email by rememberSaveable { mutableStateOf("") }
    var password by rememberSaveable { mutableStateOf("") }
    var passwordVisible by rememberSaveable { mutableStateOf(false) }

    val orientation = LocalConfiguration.current.orientation
    val fieldHorizontalPadding = when (orientation) {
        Configuration.ORIENTATION_PORTRAIT -> 24.dp
        else -> 48.dp
    }

    val context = LocalContext.current
    val successfulLoginText = stringResource(R.string.successful_login)
    val buttonHorizontalPadding = when (orientation) {
        Configuration.ORIENTATION_PORTRAIT -> 48.dp
        else -> 72.dp
    }

    Column(
        modifier = modifier.fillMaxSize(),
        verticalArrangement = Arrangement.spacedBy(10.dp, Alignment.CenterVertically),
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {
        EmailField(
            modifier = modifier
                .fillMaxWidth()
                .padding(horizontal = fieldHorizontalPadding),
            email = email,
            onEmailChange = { email = it },
        )
        PasswordField(
            modifier = modifier
                .fillMaxWidth()
                .padding(horizontal = fieldHorizontalPadding),
            password = password,
            onPasswordChange = { password = it },
            passwordVisible = passwordVisible,
            onPasswordVisibilityChange = { passwordVisible = passwordVisible.not() },
        )
        LoginButton(
            Modifier
                .fillMaxWidth()
                .padding(horizontal = buttonHorizontalPadding)
                .padding(top = 10.dp),
            onClick = { Toast.makeText(context, successfulLoginText, Toast.LENGTH_SHORT).show() },
        )
    }
}

@DevicePreviews
@Composable
private fun LoginBodyPreview() {
    LoginBody()
}
