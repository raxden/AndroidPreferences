object ApplicationId {
  const val id = "com.raxdenstudios.preferences"
}

object Modules {
  const val libraryPreferences = ":libraries:advanced-preferences"

  const val sample = ":sample"
}

object Versions {
  const val minSdk = 21
  const val compileSdk = 29
  const val targetSdk = 29

  const val kotlin = "1.4.21"

  const val gson = "2.8.6"                      // https://github.com/google/gson
  const val preferences = "1.1.1"

  const val archCoreTest = "2.0.0"
  const val atsl = "1.1.0"

  const val robolectric = "4.3.1"
}

object KotlinLibraries {
  const val kotlinBom = "org.jetbrains.kotlin:kotlin-bom:${Versions.kotlin}"
  const val kotlinStdlib = "org.jetbrains.kotlin:kotlin-stdlib-jdk7"
}

object AndroidLibraries {
  // ANDROID
  const val preferences = "androidx.preference:preference-ktx:${Versions.preferences}"
}

object Libraries {
  // Gson
  const val gson = "com.google.code.gson:gson:${Versions.gson}"
}

object TestLibraries {
  // ANDROID TEST
  const val archCoreTest = "androidx.arch.core:core-testing:${Versions.archCoreTest}"
  const val atslJunit = "androidx.test.ext:junit:${Versions.atsl}"
  const val atslRunner = "androidx.test:runner:${Versions.atsl}"
  const val atslRules = "androidx.test:rules:${Versions.atsl}"

  // Robolectric
  const val robolectric = "org.robolectric:robolectric:${Versions.robolectric}"
}