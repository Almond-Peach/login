package com.almondpeach.login.ui.login.footer.options

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.almondpeach.login.R

@Composable
fun GoogleLoginOption(
    modifier: Modifier = Modifier,
    size: Dp = 48.dp,
) {
    LoginOption(
        modifier = modifier,
        painter = painterResource(R.drawable.ic_login_google),
        contentDescription = stringResource(id = R.string.login_google),
        size = size,
    )
}
