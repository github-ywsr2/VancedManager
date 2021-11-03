package com.vanced.manager.core.util

import android.os.Build

val arch = when {
    Build.SUPPORTED_ABIS.contains("x86") -> "x86"
    Build.SUPPORTED_ABIS.contains("arm64-v8a") -> "arm64_v8a"
    else -> "armeabi_v7a"
}