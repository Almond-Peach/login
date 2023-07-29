package com.almondpeach.login.ui.login.body

import android.content.res.Configuration
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalConfiguration
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import com.almondpeach.login.R

@Composable
fun LoginButton(
    onClick: () -> Unit,
) {
    val orientation = LocalConfiguration.current.orientation

    Button(
        onClick = onClick,
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = if (orientation == Configuration.ORIENTATION_PORTRAIT) 48.dp else 72.dp)
            .padding(top = 20.dp),
    ) {
        Text(text = stringResource(R.string.login))
    }
}
