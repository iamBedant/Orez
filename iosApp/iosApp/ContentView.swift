import SwiftUI
import shared

struct ComposeView: UIViewControllerRepresentable {
    let viewControllerComponent: InjectViewControllerComponent
    let backDispatcher: BackDispatcher
    
    init(viewControllerComponent: InjectViewControllerComponent, backDispatcher: BackDispatcher) {
        self.viewControllerComponent = viewControllerComponent
        self.backDispatcher = backDispatcher
    }
    
    func makeUIViewController(context: Context) -> UIViewController {
        viewControllerComponent.homeViewControllerFactory(backDispatcher)
    }

    func updateUIViewController(_ uiViewController: UIViewController, context: Context) {}
}

struct ContentView: View {
    let viewControllerComponent: InjectViewControllerComponent
    let backDispatcher: BackDispatcher
    var body: some View {
        ComposeView(viewControllerComponent: viewControllerComponent, backDispatcher: backDispatcher)
                .ignoresSafeArea(.keyboard)
    }
}
