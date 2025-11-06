package com.example.praktikum6 // <-- Sesuaikan dengan nama project-mu

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import com.example.praktikum6.ui.theme.Praktikum6Theme // <-- Sesuaikan dengan nama tema-mu

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Praktikum6Theme { // <-- Panggil tema project-mu

                // Hapus semua kode template (Scaffold, Greeting, dll)
                // Cukup panggil DataApp()

                DataApp() // Panggil "Pusat Kontrol Navigasi" kita
            }
        }
    }
}