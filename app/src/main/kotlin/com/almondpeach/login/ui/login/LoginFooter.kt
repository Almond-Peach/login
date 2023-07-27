package com.almondpeach.login.ui.login

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.almondpeach.login.R
import com.almondpeach.login.ui.common.DevicePreviews

@Composable
fun LoginFooter(
    modifier: Modifier = Modifier,
) {
    Row(
        modifier = modifier.fillMaxSize(),
        horizontalArrangement = Arrangement.spacedBy(15.dp, Alignment.CenterHorizontally),
        verticalAlignment = Alignment.CenterVertically,
    ) {
        FacebookLoginOption()
        GoogleLoginOption()
        InstagramLoginOption()
    }
}

@Composable
fun FacebookLoginOption(
    modifier: Modifier = Modifier,
    size: Dp = 48.dp,
) {
    Image(
        painter = painterResource(R.drawable.ic_login_fb),
        contentDescription = stringResource(id = R.string.login_fb),
        modifier = modifier.size(size),
    )
}

@Composable
fun GoogleLoginOption(
    modifier: Modifier = Modifier,
    size: Dp = 48.dp,
) {
    Image(
        painter = painterResource(R.drawable.ic_login_google),
        contentDescription = stringResource(id = R.string.login_google),
        modifier = modifier.size(size),
    )
}

@Composable
fun InstagramLoginOption(
    modifier: Modifier = Modifier,
    size: Dp = 48.dp,
) {
    Image(
        painter = painterResource(R.drawable.ic_login_ig),
        contentDescription = stringResource(id = R.string.login_ig),
        modifier = modifier.size(size),
    )
}

@DevicePreviews
@Composable
private fun LoginFooterPreview() {
    LoginFooter()
}
