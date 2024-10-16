package org.example.portfolio.components

import androidx.compose.runtime.Composable
import com.varabyte.kobweb.compose.foundation.layout.Column
import com.varabyte.kobweb.compose.foundation.layout.Row
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.borderRadius
import com.varabyte.kobweb.compose.ui.modifiers.margin
import com.varabyte.kobweb.compose.ui.modifiers.padding
import com.varabyte.kobweb.navigation.OpenLinkStrategy
import com.varabyte.kobweb.silk.components.icons.fa.FaFacebook
import com.varabyte.kobweb.silk.components.icons.fa.FaInstagram
import com.varabyte.kobweb.silk.components.icons.fa.FaTwitter
import com.varabyte.kobweb.silk.components.icons.fa.IconSize
import com.varabyte.kobweb.silk.components.navigation.Link
import com.varabyte.kobweb.silk.style.toModifier
import org.example.portfolio.style.SocialIconStyle
import org.example.portfolio.util.Constants.WEBSITE
import org.jetbrains.compose.web.css.px

@Composable
fun SocialBar(isRow: Boolean = false) {
    if (isRow) {
        Row(
            modifier = Modifier
                .margin(25.px)
                .padding(topBottom = 25.px)
                .borderRadius(25.px)

        ) {
            Socials(isRow = true)
        }
    } else {
        Column(
            modifier = Modifier
                .margin(25.px)
                .padding(leftRight = 25.px)
                .borderRadius(25.px)

        ) {
            Socials()
        }

    }
}

@Composable
fun Socials(isRow: Boolean = false) {
    Link(
        path = WEBSITE,
        openExternalLinksStrategy = OpenLinkStrategy.IN_NEW_TAB
    ) {
        FaFacebook(
            modifier = SocialIconStyle.toModifier()
                .margin(
                    right = if (!isRow) 0.px else 40.px,
                    bottom = if (isRow) 0.px else 40.px,
                ),
            size = IconSize.LG
        )
    }
    Link(
        path = WEBSITE,
        openExternalLinksStrategy = OpenLinkStrategy.IN_NEW_TAB
    ) {
        FaTwitter(
            modifier = SocialIconStyle.toModifier()
                .margin(
                    right = if (!isRow) 0.px else 40.px,
                    bottom = if (isRow) 0.px else 40.px,
                )
        )
    }
    Link(
        path = WEBSITE,
        openExternalLinksStrategy = OpenLinkStrategy.IN_NEW_TAB
    ) {
        FaInstagram(
            modifier = SocialIconStyle.toModifier()
                .margin(
                    right = if (!isRow) 0.px else 40.px,
                    bottom = if (isRow) 0.px else 40.px,
                ),
            size = IconSize.LG
        )
    }

}