import UIKit
import SwiftUI
import ComposeApp

struct ComposeViewController: UIViewControllerRepresentable {
    func makeUIViewController(context: Context) -> UIViewController {
        return Main_iosKt.ComposeEntryPointWithUIViewController(createUIViewController: { () -> UIViewController in
            let swiftUIView = VStack {
                Text("SwiftUI in Compose Multiplatform")
            }
            return UIHostingController(rootView: swiftUIView)
        })
    }

    func updateUIViewController(_ uiViewController: UIViewController, context: Context) {}
}

struct ContentView: View {
    let greet = GreetingViewModel().greet()

    var body: some View {
        ComposeViewController()
                .ignoresSafeArea(.keyboard) // Compose has own keyboard handler
    }
}



