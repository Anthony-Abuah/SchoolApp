package com.example.schoolapp.feature_app.ui.presentation.composables.parent.notice_board.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import com.example.schoolapp.feature_app.ui.presentation.composables.admin.notice_board.NoticeBoardInfoScreenTopBar
import com.example.schoolapp.feature_app.ui.presentation.composables.components.BasicScreenTopBar
import com.example.schoolapp.feature_app.ui.presentation.composables.parent.notice_board.ParentNoticeBoardInfoContent

@Composable
fun ParentNoticeBoardInfoScreen(
    navigateBack: () -> Unit,
){
    Scaffold(
        topBar = {
            BasicScreenTopBar(topBarTitleText = "Notice",
            ) {
                navigateBack()
            }
        },
    ){it
        Column(modifier = Modifier.fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
            ) {
           ParentNoticeBoardInfoContent(
               header = "PTA Meeting",
               priority = "Very Important",
               termName = "First Term",
               message = "Get free Admin icons in iOS, Material, Windows and other design styles for web, mobile, and graphic design projects. These free images are pixel perfect to fit your design and available in both PNG and vector. Download icons in all formats or edit them for your designs. Also, be sure to check out new icons and popular icons. Get free Admin icons in iOS, Material, Windows and other design styles for web, mobile, and graphic design projects. These free images are pixel perfect to fit your design and available in both PNG and vector. Download icons in all formats or edit them for your designs. Also, be sure to check out new icons and popular icons.",
               noticeTime = "22nd January, 2024, 13:56pm"
           )
        }
    }
}