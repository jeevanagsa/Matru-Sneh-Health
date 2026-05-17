# Matru-Sneh Health (ಮಾತೃ-ಸ್ನೇಹ ಹೆಲ್ತ್) 💝

### 📱 Pocket Pregnancy Guide for Rural Maternal Healthcare
*Developed as part of the **MindMatrix VTU Internship Program (Project Title: 91)**.*

---

## 📥 [👉 DOWNLOAD THE WORKING APK HERE 👈](https://github.com/jeevanagsa/Matru-Sneh-Health/releases/download/v1.0/Matru-Sneh-Health-v1.0.apk)

---

<p align="center">
  <img src="logo.png" width="180" alt="Matru-Sneh Health Logo">
</p>

## 📌 1. Problem Statement
Maternal health tracking in low-resource rural areas relies heavily on physical medical cards that are highly vulnerable to damage, misplacement, or being completely lost. Expectant mothers frequently lack stable, high-speed internet connections, requiring an intuitive digital backup system to track critical vital wellness metrics smoothly without cloud dependencies.

## 🌟 2. Project Vision & Features
**Matru-Sneh Health** acts as an offline-first digital companion to the physical Mother-Child health card, optimized specifically for first-time smartphone users:

* **👶 Fetal Kick Counter:** An interactive interface allowing users to log baby movements instantly. Includes programmatic **software debouncing** to prevent accidental rapid double-taps.
* **🍲 Native Nutrition Plate:** A structured daily checklist tracking critical indigenous dietary components essential for preventing maternal anemia and complications (*Ragi/Finger Millet, Milk, Greens, and Pulses*).
* **📅 Check-up & Vaccine Countdown:** Clear local visualization showing days remaining for critical scans and compulsory vaccinations (e.g., Tetanus Toxoid Injection).
* **🚨 Red Flag Health Alert System:** A high-visibility warning guide outlining major danger symptoms (*Heavy bleeding, severe face/foot swelling, high fever*) requiring immediate hospital visitation.
* **🌍 Vernacular Readability:** Core structural guidelines configured to support regional language optimization (**Kannada**) for direct community accessibility.

---

## 🛠️ 3. Technical Stack & Architecture

* **Language:** Kotlin 🚀
* **UI Framework:** XML Layouts (Material Design Components)
* **Minimum SDK:** API 26 (Android 8.0 Oreo)
* **Architecture Pattern:** Single-Device Offline MVP Lifecycle Pattern
* **Core Logic Implementations:**
    * *Debounce Verification:* Custom delta-time calculations tracking touch frequencies to filter out invalid accidental interactions.

---

## ⚙️ 4. Local Installation & Build Setup

Follow these simple steps to download and run this prototype project locally on your machine:

### Prerequisites
* Android Studio (Latest Version)
* JDK 17 installed
* An Android device or emulator running API level 26 or higher

### Step-by-Step Setup
1. **Clone the Repository:**
   ```bash
   git clone [https://jeevanagsa/Matru-Sneh-Health.git](https://github.com/jeevanagsa/Matru-Sneh-Health.git)
   # Matru-Sneh Health (ಮಾತೃ-ಸ್ನೇಹ ಹೆಲ್ತ್) 💝

2. Open in Android Studio:

Launch Android Studio.

Click File -> Open and select the cloned directory.

Allow Gradle to sync and build project dependencies completely.

 3.Run the Application:

Connect your physical Android test device via USB (with USB Debugging turned on) or boot up your virtual emulator.

Press Shift + F10 (Windows) or Control + R (Mac) to install and launch the application natively.   
5. Success Criteria Met

[x] Debouncing Protection: Implemented an automatic input guard preventing double-taps on the Fetal Kick Counter.

[x] Clear Danger Actions: Formatted high-contrast alert states directing users to take urgent action when observing critical symptoms.

[x] First-Time User Accessibility: Engineered large touch elements, clear typography scaling, and emoji indicators to remove barriers for rural populations.

[x] 100% Offline Integrity: Designed to work entirely without an internet connection or cloud login screens

6. License & Intent
This project is developed solely for educational and internal internship demonstration requirements under the MindMatrix VTU Internship Program.

---


