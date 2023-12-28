import SwiftUI
import shared

struct ComposeView: UIViewControllerRepresentable {
    var greetingMessage: String
    func makeUIViewController(context: Context) -> UIViewController {
        MainViewControllerKt.MainViewController(greet: greetingMessage)
    }

    func updateUIViewController(_ uiViewController: UIViewController, context: Context) {}
}

struct ContentView: View {
    let appComponent: ApplicationComponent
    var body: some View {
        ComposeView(greetingMessage: appComponent.greeter.greet())
                .ignoresSafeArea(.keyboard) // Compose has own keyboard handler
    }
}
