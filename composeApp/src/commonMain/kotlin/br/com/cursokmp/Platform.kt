package br.com.cursokmp

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform