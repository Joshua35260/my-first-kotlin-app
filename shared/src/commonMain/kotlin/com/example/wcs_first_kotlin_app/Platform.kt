package com.example.wcs_first_kotlin_app

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform