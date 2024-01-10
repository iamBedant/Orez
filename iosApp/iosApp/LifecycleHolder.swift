//
//  LifecycleHolder.swift
//  iosApp
//
//  Created by Bedanta Bikash Borah on 10/01/24.
//  Copyright © 2024 orgName. All rights reserved.
//

import Foundation
import shared

class LifecycleHolder : ObservableObject {
    let lifecycle: LifecycleRegistry
    
    init() {
        lifecycle = LifecycleRegistryKt.LifecycleRegistry()
        LifecycleRegistryExtKt.create(lifecycle)
    }
    
    deinit {
        // Destroy the root component before it is deallocated
        LifecycleRegistryExtKt.destroy(lifecycle)
    }
}
