package br.com.furlaneto.murilo.movie.ui.theme

import androidx.compose.material3.Text
import androidx.compose.material3.Typography
import androidx.compose.runtime.Composable
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import movie.composeapp.generated.resources.Res
import movie.composeapp.generated.resources.Urbanist_Bold
import movie.composeapp.generated.resources.Urbanist_Medium
import movie.composeapp.generated.resources.Urbanist_Regular
import org.jetbrains.compose.resources.Font

val urbannist: FontFamily
    @Composable get() = FontFamily(
        Font(Res.font.Urbanist_Regular, FontWeight.Normal),
        Font(Res.font.Urbanist_Bold, FontWeight.Bold),
        Font(Res.font.Urbanist_Medium, FontWeight.Medium),
    )

@Composable
fun AppTypography() = Typography(
    displaySmall = TextStyle(
        fontSize = 26.sp,
        fontFamily = urbannist,
        fontWeight = FontWeight.Normal,
    ),
    headlineLarge = TextStyle(
        fontSize = 24.sp,
        fontFamily = urbannist,
        fontWeight = FontWeight.Bold,
    ),
    titleLarge = TextStyle(
        fontSize = 20.sp,
        fontFamily = urbannist,
        fontWeight = FontWeight.Normal,
    ),
    titleMedium = TextStyle(
        fontSize = 16.sp,
        fontFamily = urbannist,
        fontWeight = FontWeight.Medium,
    ),
    titleSmall = TextStyle(
        fontSize = 14.sp,
        fontFamily = urbannist,
        fontWeight = FontWeight.Medium,
    ),
    bodyLarge = TextStyle(
        fontSize = 16.sp,
        fontFamily = urbannist,
        fontWeight = FontWeight.Normal,
    ),
    bodyMedium = TextStyle(
        fontSize = 14.sp,
        fontFamily = urbannist,
        fontWeight = FontWeight.Normal,
    ),
    bodySmall = TextStyle(
        fontSize = 12.sp,
        fontFamily = urbannist,
        fontWeight = FontWeight.Normal
    ),
)
