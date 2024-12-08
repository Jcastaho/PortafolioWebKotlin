package com.straccion.portafolio.pages

import androidx.compose.runtime.*
import com.straccion.portafolio.components.BackToTopButton
import com.straccion.portafolio.components.OverflowMenu
import com.straccion.portafolio.sections.*
import com.varabyte.kobweb.compose.foundation.layout.Box
import com.varabyte.kobweb.compose.ui.Alignment
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.fillMaxSize
import com.varabyte.kobweb.core.Page
import com.varabyte.kobweb.compose.foundation.layout.Arrangement
import com.varabyte.kobweb.compose.foundation.layout.Column


@Page
@Composable
fun HomePage() {
    var menuOpened by remember { mutableStateOf(false) }
    Box(
        modifier = Modifier.fillMaxSize()
    ) {
        Column(
            Modifier
                .fillMaxSize(),
            verticalArrangement = Arrangement.Top,
            horizontalAlignment = Alignment.CenterHorizontally

        ) {
            MainSection(onMenuClicked = {
                menuOpened = true
            })
            AboutSection()
            ServiceSection()
            PortafolioSection()
            AchievementsSection()
            TestimonialSection()
            ExperienceSection()
            ContacSection()
            FooterSection()
        }
        BackToTopButton()
        if (menuOpened){
            OverflowMenu(onMenuClosed = { menuOpened = false})
        }
    }

}