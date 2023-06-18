package com.example.performanceoptimizationcomposeuiapp.optimization2

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import com.plcoding.external_module.ExternalUser

@Composable
fun WelcomeView(user: ExternalUser) {
    
    Text(text = "Welcome ${user.username}!")

}