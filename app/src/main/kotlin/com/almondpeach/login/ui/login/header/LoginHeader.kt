package com.almondpeach.login.ui.login.header

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.almondpeach.login.R
import com.almondpeach.login.ui.common.DevicePreviews

@Composable
fun LoginHeader(
    modifier: Modifier = Modifier,
) {
    Column(
        modifier = modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {
        Image(
            painter = painterResource(id = R.drawable.ic_login_header),
            contentDescription = stringResource(R.string.login_header),
            modifier = modifier.size(200.dp),
        )
        Text(
            text = stringResource(id = R.string.login),
            modifier = modifier,
            fontSize = 40.sp,
            fontWeight = FontWeight.Bold,
            fontFamily = FontFamily.Serif,
        )
    }
}

@DevicePreviews
@Composable
private fun LoginHeaderPreview() {
    LoginHeader()
}
