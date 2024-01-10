package com.iambedant.orez.nav

import com.iambedant.home.HomeComponent
import com.iambedant.profile.ProfileComponent

sealed interface Screen {
    class Home(val component: HomeComponent) : Screen
    class Profile(val component: ProfileComponent) : Screen
}