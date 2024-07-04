package com.example.schoolapp.feature_app.domain.model

data class SubjectScores(
    val subjectName: String,
    val classScore: Double,
    val examScore: Double,
    val overallTotalScore: Double = classScore.plus(examScore),
    val grade: String,
    val position: String,
    val remarks: String,
)
