package ru.netology.coroutines.dto

data class PostWithCommentsAuthor(
    val post: Post,
    val comments: List<Comment>,
    val author: Author,
)