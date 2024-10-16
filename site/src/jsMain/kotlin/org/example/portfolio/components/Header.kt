package org.example.portfolio.components

import androidx.compose.runtime.Composable
import com.varabyte.kobweb.compose.foundation.layout.Row
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.fillMaxWidth
import com.varabyte.kobweb.silk.components.graphics.Image
import com.varabyte.kobweb.silk.components.icons.fa.FaBars
import com.varabyte.kobweb.silk.style.breakpoint.Breakpoint
import org.example.portfolio.util.Res
import org.jetbrains.compose.web.css.percent

@Composable
fun Header(breakPoint: Breakpoint, onMenuClicked: () -> Unit) {
    Row(
        modifier = Modifier
            .fillMaxWidth(
                if (breakPoint >= Breakpoint.MD) 80.percent
                else 90.percent
            )
    ) {
        LeftSide(breakPoint, onMenuClicked = onMenuClicked)

    }
}

@Composable
fun LeftSide(breakPoint: Breakpoint, onMenuClicked: () -> Unit) {
    Row() {
        if (breakPoint < Breakpoint.MD)
            FaBars()

        Image(

            src = Res.Image.logo,
            alt = "Logo"
        )
    }
}
