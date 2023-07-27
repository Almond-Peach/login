package com.almondpeach.login.ui.login.footer

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.almondpeach.login.ui.common.DevicePreviews
import com.almondpeach.login.ui.login.footer.options.FacebookLoginOption
import com.almondpeach.login.ui.login.footer.options.GoogleLoginOption
import com.almondpeach.login.ui.login.footer.options.InstagramLoginOption

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

@DevicePreviews
@Composable
private fun LoginFooterPreview() {
    LoginFooter()
}
