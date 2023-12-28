//
//  AppDelegate.swift
//  iosApp
//
//  Created by Bedanta Bikash Borah on 28/12/23.
//  Copyright © 2023 orgName. All rights reserved.
//

import Foundation
import UIKit
import shared

class AppDelegate : NSObject, UIApplicationDelegate {
    lazy var appComponent: InjectApplicationComponent = InjectApplicationComponent()
    
    
    func application(_ application: UIApplication, didFinishLaunchingWithOptions launchOptions: [UIApplication.LaunchOptionsKey : Any]? = nil) -> Bool {
        
        appComponent.initializers
            .compactMap { ($0 as! any Initializer) }
            .forEach { initializer in
                initializer.initialize()
            }
        
        return true
    }
}
