package com.almondpeach.login.ui.login

import android.content.res.Configuration
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.paint
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalConfiguration
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.almondpeach.login.R
import com.almondpeach.login.ui.common.DevicePreviews
import com.almondpeach.login.ui.login.body.LoginBody
import com.almondpeach.login.ui.login.footer.LoginFooter
import com.almondpeach.login.ui.login.header.LoginHeader

@Composable
fun LoginScreen() {
    val orientation = LocalConfiguration.current.orientation

    Column(
        modifier = Modifier
            .fillMaxSize()
            .run {
                if (orientation == Configuration.ORIENTATION_PORTRAIT) {
                    this.paint(
                        painter = painterResource(id = R.drawable.bg),
                        contentScale = ContentScale.FillBounds,
                    )
                } else {
                    this
                }
            }
            .verticalScroll(rememberScrollState()),
        verticalArrangement = Arrangement.spacedBy(25.dp, Alignment.CenterVertically),
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {
        LoginHeader()
        LoginBody()
        LoginFooter()
    }
}

@DevicePreviews
@Composable
private fun LoginScreenPreview() {
    LoginScreen()
}
