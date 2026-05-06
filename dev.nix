{ pkgs, ... }:

{
  # Define the packages needed for Android development
  packages = with pkgs; [
    jdk17 # Java Development Kit (Android requires Java)
    android-studio # Android Studio itself (optional, but good for IDE features)
    android-sdk # Android SDK tools
    android-platform-tools # ADB, fastboot, etc.
    gradle # Build tool for Android projects
    # Add any other tools you might need, e.g., git, curl
    git
    curl
  ];

  # Define environment variables for Android SDK
  env = {
    ANDROID_HOME = "${pkgs.android-sdk}/libexec/android-sdk";
    PATH = "${pkgs.android-sdk}/libexec/android-sdk/cmdline-tools/latest/bin:${pkgs.android-sdk}/libexec/android-sdk/platform-tools:$PATH";
  };

  # Define the startup command for the project
  # This will run when the workspace starts in IDX
  # For an Android project, you might want to sync Gradle or run a build
  startup = ''
    echo 
 "Welcome to Amader Tangail Android Project in Project IDX!"
    echo "Running Gradle sync..."
    cd AmaderTangail # Assuming the project is in a folder named AmaderTangail
    gradlew clean assembleDebug # Clean and build a debug APK
    echo "Gradle build finished. You can now run the app on an emulator or generate signed builds."
  '';

  # Optional: Define ports to expose if your app had a web component or API
  # ports = [
  #   {
  #     port = 8080;
  #     target = 8080;
  #     protocol = "tcp";
  #   }
  # ];
}
