package com.example.schoolapp.feature_app.ui.theme

import android.os.Build
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.platform.LocalContext

private val DarkColorPalette = darkColorScheme(
    primary = Blue90,
    onPrimary = Blue30,
    primaryContainer = Blue20,
    onPrimaryContainer = Blue95,
    inversePrimary = Blue40,
    secondary = Yellow90,
    onSecondary = Yellow30,
    secondaryContainer = Yellow20,
    onSecondaryContainer = Yellow90,
    tertiary = DarkBlue90,
    onTertiary = DarkBlue30,
    tertiaryContainer = DarkBlue20,
    onTertiaryContainer = DarkBlue80,
    error = Red80,
    onError = Red20,
    errorContainer = Red30,
    onErrorContainer = Red90,
    background = Grey10,
    onBackground = Grey90,
    surface = BlueGrey10,
    onSurface = BlueGrey90,
    inverseSurface = Grey90,
    inverseOnSurface = Grey10,
    surfaceVariant = Grey20,
    onSurfaceVariant = Grey90,
    outline = BlueGrey80,
    outlineVariant = Blue50
)

private val LightColorPalette = lightColorScheme(
    primary = Blue40,
    onPrimary = Grey99,
    primaryContainer = Blue90,
    onPrimaryContainer = Blue10,
    inversePrimary = Blue80,
    secondary = Yellow40,
    onSecondary = Yellow95,
    secondaryContainer = Yellow90,
    onSecondaryContainer = Yellow10,
    tertiary = DarkBlue40,
    onTertiary = Grey99,
    tertiaryContainer = DarkBlue90,
    onTertiaryContainer = DarkBlue10,
    error = Red40,
    onError = Grey99,
    errorContainer = Red90,
    onErrorContainer = Red10,
    background = Grey99,
    onBackground = Grey10,
    surface = BlueGrey95,
    onSurface = BlueGrey30,
    inverseSurface = Grey20,
    inverseOnSurface = Grey95,
    surfaceVariant = BlueGrey90,
    onSurfaceVariant = BlueGrey30,
    outline = Grey40,
    outlineVariant = Blue50

)
    /* Other default colors to override
    background = Color.White,
    surface = Color.White,
    onPrimary = Color.White,
    onSecondary = Color.Black,
    onBackground = Color.Black,
    onSurface = Color.Black,
    */

@Composable
fun SchoolAppTheme(darkTheme: Boolean = isSystemInDarkTheme(), content: @Composable () -> Unit) {
    val useDynamicColors = Build.VERSION.SDK_INT >= Build.VERSION_CODES.S
    val colors = when{
        useDynamicColors && darkTheme -> dynamicDarkColorScheme(LocalContext.current)
        useDynamicColors && !darkTheme -> dynamicLightColorScheme(LocalContext.current)
        darkTheme -> DarkColorPalette
        else -> LightColorPalette
    }

    MaterialTheme(
        colorScheme = colors,
        typography = Typography,
        shapes = Shapes,
        content = content
    )
}