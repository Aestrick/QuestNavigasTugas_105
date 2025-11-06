package com.example.praktikum6.view // <-- SUDAH DISESUAIKAN

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.praktikum6.Navigasi // <-- SUDAH DISESUAIKAN
import com.example.praktikum6.R // <-- SUDAH DISESUAIKAN

// Warna dari screenshot
val DarkPurple = Color(0xFF6200EE)
val LightPurple = Color(0xFFF3E5F5)
val CustomColor1 = Color(0xFFD32F2F) // Merah untuk Nama
val CustomColor2 = Color(0xFF1976D2) // Biru untuk NIM

@Composable
fun WelcomeScreen(
    navController: NavController,
    modifier: Modifier = Modifier
) {
    Column(
        modifier = modifier
            .fillMaxSize()
            .systemBarsPadding()
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.SpaceAround
    ) {
        Text(
            text = stringResource(R.string.welcome_title),
            fontSize = 32.sp,
            fontWeight = FontWeight.Bold,
            color = DarkPurple
        )

        // --- TEMPAT LOGO KAMU ---
        Box(
            modifier = Modifier.size(150.dp),
            contentAlignment = Alignment.Center
        ) {
            Text("Tempat Logo di sini", textAlign = TextAlign.Center)
            /*
            Image(
                painter = painterResource(id = R.drawable.nama_logomu), // Ganti ini nanti
                contentDescription = "Logo"
            )
            */
        }

        Column(horizontalAlignment = Alignment.CenterHorizontally) {
            Text(
                text = stringResource(R.string.welcome_name), // "Nashrul Fikri"
                fontSize = 24.sp,
                fontWeight = FontWeight.Medium,
                color = CustomColor1
            )
            Spacer(modifier = Modifier.height(8.dp))
            Text(
                text = stringResource(R.string.welcome_nim), // "20230140105"
                fontSize = 18.sp,
                color = CustomColor2
            )
        }

        Button(
            onClick = {
                navController.navigate(Navigasi.Formulirku.name)
            },
            modifier = Modifier.fillMaxWidth(),
            colors = ButtonDefaults.buttonColors(containerColor = DarkPurple),
            shape = RoundedCornerShape(50)
        ) {
            Text(
                text = stringResource(R.string.welcome_submit),
                modifier = Modifier.padding(8.dp)
            )
        }
    }
}