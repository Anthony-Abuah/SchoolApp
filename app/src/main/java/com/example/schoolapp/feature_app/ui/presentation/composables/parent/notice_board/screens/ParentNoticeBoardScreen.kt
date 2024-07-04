package com.example.schoolapp.feature_app.ui.presentation.composables.parent.notice_board.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import com.example.schoolapp.feature_app.ui.presentation.composables.admin.notice_board.NoticeBoardContent
import com.example.schoolapp.feature_app.ui.presentation.composables.admin.notice_board.NoticeBoardScreenTopBar

@Composable
fun ParentNoticeBoardScreen(
    navigateToNoticeBoardInfoScreen: () -> Unit,
    navigateBack: () -> Unit,
    ){
    Scaffold(
        topBar = {
            NoticeBoardScreenTopBar(topBarTitleText = "Notices",
                onClick = {}
            ) {
                navigateBack()
            }
        },
    ){it
        Column(modifier = Modifier.fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
            ) {
            NoticeBoardContent(navigateToNoticeBoardInfoScreen)
        }
    }
}