package com.almondpeach.login.ui.login

import android.content.res.Configuration
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.paint
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalConfiguration
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.almondpeach.login.R
import com.almondpeach.login.ui.common.DevicePreviews

@Composable
fun LoginScreen(
    modifier: Modifier = Modifier,
    onLaunch: () -> Unit = {},
) {
    LaunchedEffect(Unit) { onLaunch() }

    val columnModifier = when (LocalConfiguration.current.orientation) {
        Configuration.ORIENTATION_PORTRAIT ->
            modifier
                .fillMaxSize()
                .paint(
                    painter = painterResource(id = R.drawable.bg),
                    contentScale = ContentScale.FillBounds,
                )

        else -> modifier.fillMaxSize()
    }

    Column(
        modifier = columnModifier.verticalScroll(rememberScrollState()),
        verticalArrangement = Arrangement.spacedBy(10.dp, Alignment.CenterVertically),
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {
        Spacer(modifier = Modifier.height(20.dp))
        LoginHeader()
        Spacer(modifier = Modifier.height(15.dp))
        LoginBody()
        Spacer(modifier = Modifier.height(15.dp))
        LoginFooter()
        Spacer(modifier = Modifier.height(20.dp))
    }
}

@DevicePreviews
@Composable
private fun LoginScreenPreview() {
    LoginScreen()
}