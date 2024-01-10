package com.iambedant.orez.di

import com.iambedant.base.scopes.ApplicationScope
import me.tatarka.inject.annotations.Component

@ApplicationScope
@Component
abstract class ApplicationComponent : SharedComponent() {

}