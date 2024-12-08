package com.straccion.portafolio.components

import androidx.compose.runtime.*
import com.straccion.portafolio.models.Theme
import com.varabyte.kobweb.compose.foundation.layout.Arrangement
import com.varabyte.kobweb.compose.foundation.layout.Column
import com.varabyte.kobweb.compose.foundation.layout.Row
import com.varabyte.kobweb.compose.ui.Alignment
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.graphics.Colors
import com.varabyte.kobweb.compose.ui.modifiers.*
import com.varabyte.kobweb.silk.components.icons.fa.*
import com.varabyte.kobweb.silk.components.navigation.Link
import org.jetbrains.compose.web.css.px

@Composable
fun SocialBar(row: Boolean = false) {

    if (row){
        Row (modifier = Modifier
            .margin(top = 25.px)
            .padding(leftRight = 25.px)
            .minHeight(40.px)
            .borderRadius(r = 20.px)
            .backgroundColor(Colors.White),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Center
        ) {
            SocialLinks(row = true)
        }
    } else{
        Column(modifier = Modifier
            .margin(right = 25.px)
            .padding(topBottom = 25.px)
            .minWidth(40.px)
            .borderRadius(r = 20.px)
            .backgroundColor(Colors.White),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            SocialLinks()
        }
    }
}

@Composable
private fun SocialLinks(row: Boolean = false) {
    var isTwitterHovered by remember { mutableStateOf(false) }
    var isFacebookHovered by remember { mutableStateOf(false) }
    var isInstagramHovered by remember { mutableStateOf(false) }
    var isLinkedinHovered by remember { mutableStateOf(false) }

    Link(
        path = "https://www.facebook.com/"
    ) {
        FaFacebook(
            modifier = Modifier
                .margin(
                    bottom = if (row) 0.px else 40.px,
                    right = if (row) 40.px else 0.px,
                )
                .color(if (isFacebookHovered) Theme.Primary.rgb else Theme.Gray.rgb)
                .onMouseEnter { isFacebookHovered = true }
                .onMouseLeave { isFacebookHovered = false },
            size = IconSize.LG
        )
    }
    Link(
        path = "https://www.instagram.com/"
    ) {
        FaInstagram(
            modifier = Modifier
                .margin(
                    bottom = if (row) 0.px else 40.px,
                    right = if (row) 40.px else 0.px,
                )
                .color(if (isInstagramHovered) Theme.Primary.rgb else Theme.Gray.rgb)
                .onMouseEnter { isInstagramHovered = true }
                .onMouseLeave { isInstagramHovered = false },
            size = IconSize.LG
        )
    }
    Link(
        path = "https://www.linkedin.com/in/juan-david-castano/"
    ) {
        FaLinkedin(
            modifier = Modifier
                .margin(
                    bottom = if (row) 0.px else 40.px,
                    right = if (row) 40.px else 0.px,
                )
                .color(if (isLinkedinHovered) Theme.Primary.rgb else Theme.Gray.rgb)
                .onMouseEnter { isLinkedinHovered = true }
                .onMouseLeave { isLinkedinHovered = false },
            size = IconSize.LG
        )
    }
    Link(
        path = "https://x.com/?lang=es",
       // openExternalLinksStrategy = OpenLinkStrategy.IN_PLACE sirve para mostarla en la misma ventana
    ) {
        FaTwitter(
            modifier = Modifier
                .color(if (isTwitterHovered) Theme.Primary.rgb else Theme.Gray.rgb)
                .onMouseEnter { isTwitterHovered = true }
                .onMouseLeave { isTwitterHovered = false },
            size = IconSize.LG
        )
    }
}