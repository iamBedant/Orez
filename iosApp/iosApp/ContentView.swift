import SwiftUI
import shared

struct ContentView: View {

    let appComponent: ApplicationComponent
    var body: some View {
        Text(appComponent.greeter.greet())
	}
}
