# Amader Tangail: A Local Community Android Application

## Project Overview

**Amader Tangail** (Our Tangail) is a comprehensive Android application designed to serve the local community of Tangail, Bangladesh. It aims to be a central hub for essential services, local information, and community engagement, developed with a focus on security, scalability, and user experience.

## Core Features

This application is built around several key features to address the diverse needs of the Tangail community:

1.  **Monetization via Manual Local Ads:**
    *   Display custom advertisements from local businesses (e.g., coaching centers, shops).
    *   Ads can be dynamically changed, activated, or deactivated from a backend without requiring app updates.

2.  **Secure & Engaging Blood Bank:**
    *   Users and institutions can register as blood donors and search for blood.
    *   Features phone/OTP verification for data integrity and user security.
    *   Gamification: Registered and verified donors receive a "Verified Donor" badge to encourage participation.

3.  **Emergency Directory:**
    *   Categorized contacts for essential services (Hospitals, Police, Fire, Electricity) organized by Tangail's 12 Upazilas and 118 Unions.
    *   Supports direct "Call Intents" from within the app.
    *   Includes offline support for critical emergency numbers.

4.  **Heritage & Tourism:**
    *   A dedicated visual section to promote local historical sites and famous regional items (e.g., Tangail Tat Sari, Porabari Chomchom).

5.  **Local News & High Engagement:**
    *   A news feed section to keep the community informed.
    *   Utilizes Push Notifications for breaking news or urgent blood requests to maintain high daily active user engagement.

## Architecture & Tech Stack

The application follows a **Client-Server Architecture** with a modern technology stack to ensure robustness, maintainability, and scalability.

### Client-Side (Android Application)

*   **Language:** Kotlin
*   **UI Toolkit:** Jetpack Compose
*   **Architecture Pattern:** MVVM (Model-View-ViewModel) with Android Architecture Components
*   **Navigation:** Jetpack Navigation Component
*   **Dependency Injection:** Hilt
*   **Networking:** Retrofit & OkHttp (for future API integrations)
*   **Image Loading:** Coil
*   **Local Persistence:** Room Persistence Library (for offline caching)
*   **Push Notifications:** Firebase Cloud Messaging (FCM)
*   **Authentication:** Firebase Authentication (for phone/OTP verification)

### Server-Side (Backend)

For the MVP, a **Firebase-centric backend** is chosen for rapid development, built-in scalability, and comprehensive features:

*   **Authentication:** Firebase Authentication
*   **Database:** Cloud Firestore (NoSQL document database)
*   **Storage:** Firebase Storage (for media assets)
*   **Cloud Functions:** Firebase Cloud Functions (for serverless logic, API endpoints, notifications)
*   **Push Notifications:** Firebase Cloud Messaging (FCM)

## Getting Started

To get the Amader Tangail project up and running on your local machine or in a cloud environment like Google Project IDX, follow these steps:

### Prerequisites

*   **Android Studio:** Latest stable version installed.
*   **Java Development Kit (JDK):** Version 17 or higher.
*   **Git:** For version control (optional, but recommended).

### Local Setup (Android Studio)

1.  **Download the Project:** Download the `AmaderTangail_MVP_Phase1.zip` file provided.
2.  **Extract:** Extract the contents of the ZIP file to a convenient location on your computer (e.g., `C:\Projects\AmaderTangail`). **Avoid cloud-synced folders like OneDrive Desktop to prevent build issues.**
3.  **Open in Android Studio:**
    *   Launch Android Studio.
    *   Select `File` > `Open` and navigate to the extracted `AmaderTangail` folder.
4.  **Sync Gradle:** Android Studio will automatically sync the project with Gradle. If it doesn't, click the "Sync Project with Gradle Files" button (often an elephant icon in the toolbar).
5.  **Run on Emulator/Device:**
    *   Connect an Android device with USB debugging enabled or start an Android Emulator.
    *   Click the `Run` button (green triangle) in the toolbar to deploy the app.

### Generating APK/AAB Files

Refer to the `android_build_guide.md` file for detailed instructions on how to generate signed `.aab` (Android App Bundle) for Google Play Store submission and `.apk` files for testing.

### Google Project IDX Setup

Refer to the `google_project_idx_guide.md` file and the `dev.nix` configuration file for instructions on how to set up and run this project in Google Project IDX, including using its built-in emulator and generating builds in the cloud.

## Project Structure (High-Level)

```
AmaderTangail/
├── app/                  # Android application module
│   ├── src/
│   │   ├── main/
│   │   │   ├── java/com/example/amadertangail/ # Kotlin source code
│   │   │   │   ├── AmaderTangailApp.kt       # Hilt Application class
│   │   │   │   ├── MainActivity.kt           # Main Activity with Navigation
│   │   │   │   ├── navigation/               # Navigation routes
│   │   │   │   ├── ui/screens/               # UI Composable screens
│   │   │   │   └── ui/theme/                 # Jetpack Compose theming
│   │   │   └── res/                      # Android resources (layouts, drawables, values)
│   │   └── AndroidManifest.xml           # App manifest
│   └── build.gradle              # Module-level Gradle build file
├── build.gradle              # Project-level Gradle build file
└── settings.gradle           # Gradle settings
```

## Contributing

Contributions are welcome! Please feel free to fork the repository, make your changes, and submit a pull request. For major changes, please open an issue first to discuss what you would like to change.

## License

This project is licensed under the MIT License - see the LICENSE.md file for details (to be added).

## Contact 

For any questions or inquiries, please contact
[Sayad Md Bayezid Hosan /
email - cwb.agency@outlook.com
/GitHub - https://github.com/Sayadbayezid
website - www.sayadbayezid.com 
Business Website Www.connectwithbayezid.it.com ].
