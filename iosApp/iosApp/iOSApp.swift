import SwiftUI
import shared

@main
struct iOSApp: App {
    
    @Environment(\.scenePhase)
    var scenePhase: ScenePhase
    
    @UIApplicationDelegateAdaptor(AppDelegate.self)
    var appDelegate: AppDelegate
    
    var lifecycleHolder: LifecycleHolder { appDelegate.lifecycleHolder }

    var body: some Scene {
        let backDispatcher = BackDispatcherKt.BackDispatcher()
        let viewControllerComponent = InjectViewControllerComponent(
                        componentContext: DefaultComponentContext(
                        lifecycle: lifecycleHolder.lifecycle,
                        stateKeeper: nil,
                        instanceKeeper: nil, 
                        backHandler: backDispatcher
                    ),
                        applicationComponent: appDelegate.appComponent
                )
        WindowGroup {
            ContentView(viewControllerComponent: viewControllerComponent, backDispatcher: backDispatcher)
        }
    }
}
