package sarankar.app.tipcalculator.ui.theme

import androidx.compose.material3.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import sarankar.app.tipcalculator.R

val fontFamily = FontFamily(
    Font(R.font.poppins),
    Font(R.font.poppins_light, FontWeight.Light),
    Font(R.font.poppins_bold, FontWeight.Bold),
)

// Set of Material typography styles to start with
val Typography = Typography(
    bodyLarge = TextStyle(
        fontFamily = fontFamily,
        fontSize = 18.sp,
    ),
    bodyMedium = TextStyle(fontFamily = fontFamily),
    bodySmall = TextStyle(fontFamily = fontFamily),
    titleMedium = TextStyle(fontFamily = fontFamily),
    titleSmall = TextStyle(fontFamily = fontFamily),
    titleLarge = TextStyle(
        fontFamily = fontFamily,
        fontSize = 24.sp,
    ),
    labelSmall = TextStyle(fontFamily = fontFamily),
    labelMedium = TextStyle(fontFamily = fontFamily),
    labelLarge = TextStyle(fontFamily = fontFamily),
    displayLarge = TextStyle(fontFamily = fontFamily),
    displayMedium = TextStyle(fontFamily = fontFamily),
    displaySmall = TextStyle(fontFamily = fontFamily),
    headlineLarge = TextStyle(fontFamily = fontFamily),
    headlineMedium = TextStyle(fontFamily = fontFamily),
    headlineSmall = TextStyle(fontFamily = fontFamily),
)