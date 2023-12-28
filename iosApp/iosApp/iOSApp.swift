import SwiftUI

@main
struct iOSApp: App {
    
    @Environment(\.scenePhase)
    var scenePhase: ScenePhase
    
    @UIApplicationDelegateAdaptor(AppDelegate.self)
    var appDelegate: AppDelegate
    
    var body: some Scene {
        
        WindowGroup {
            ContentView(appComponent: appDelegate.appComponent)
        }
    }
}
