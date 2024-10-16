package org.example.portfolio.model

enum class Section(
    val id: String,
    val title: String,
    val subTitle: String,
    val path: String = "#$id"
) {
    Home(
        id = "home",
        title = "Home",
        subTitle = ""
    )
}