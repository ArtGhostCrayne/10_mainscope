package ru.netology.nmedia.model

data class FeedModelState(
    val loading: Boolean = false,
    val error: Boolean = false,
    val like_error: Boolean = false,
    val remove_error: Boolean = false,
    val id: Long = 0,
    val refreshing: Boolean = false,
)
