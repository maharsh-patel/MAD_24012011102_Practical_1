# MAD Practical 1: Introduction to Android Application Development

## 📄 Submission Information
- **Student Name:** Maharsh Patel
- **Enrollment No.:** 24012011102
- **Batch:** 5H-1
- **Branch:** CE
- **Course:** Mobile Application Development (MAD)

---

## 📱 Practical Overview
This repository contains Practical 1 for the **Mobile Application Development (MAD)** course. The objective of this practical is to get familiar with Android Studio, project structure, activity lifecycle logging, and building modern user interface layouts using XML.

### Key Features & Components:
- **Activity Lifecycle Monitoring:** Implemented `Log.i()` logging in `MainActivity.kt` to monitor activity creation.
- **Modern UI Layout:** Built using `ConstraintLayout` and `MaterialCardView`.
- **User Interface Elements:**
  - `ImageView` for institution logo display
  - `MaterialCardView` container for clean form styling
  - `TextView` labels for Email and Password inputs
  - `EditText` fields with `textEmailAddress` and `textPassword` input types
- **Edge-to-Edge Display:** Uses `enableEdgeToEdge()` and `WindowInsetsCompat` for modern screen handling.

---

## 🛠️ Tech Stack & Tools
- **Language:** Kotlin
- **IDE:** Android Studio
- **UI Framework:** Android XML Layouts & Material Design Components
- **Build System:** Gradle (Kotlin DSL)
- **Minimum SDK:** Android 7.0 (API Level 24) or higher

---

## 🚀 How to Run
1. Clone this repository:
   ```bash
   git clone https://github.com/maharsh-patel/MAD_24012011102_Practical_1.git
   ```
2. Open the project in **Android Studio**.
3. Allow Gradle to sync dependencies.
4. Select an **Android Emulator** or connect a physical device via **USB Debugging**.
5. Click **Run** (`Shift + F10`) to build and launch the application.

---

## 📁 Repository Structure
```
24012011102_MAHARSH_PR_1/
├── app/
│   ├── src/
│   │   └── main/
│   │       ├── java/com/example/first_project/
│   │       │   └── MainActivity.kt
│   │       ├── res/
│   │       │   ├── layout/
│   │       │   │   └── activity_main.xml
│   │       │   └── drawable/
│   │       └── AndroidManifest.xml
│   └── build.gradle.kts
├── build.gradle.kts
├── settings.gradle.kts
└── README.md
```
