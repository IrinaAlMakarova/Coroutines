### Coroutines: легковесные потоки, Thread Pools & Dispatchers

## Задача №1. AuthorId
Разработчики снова переделали API и сделали следующие сущности:

data class Post(
    val id: Long,
    val authorId: Long,
    val content: String,
    val published: Long,
    val likedByMe: Boolean,
    val likes: Int = 0,
    var attachment: Attachment? = null,
)

data class Attachment(
    val url: String,
    val description: String,
    val type: AttachmentType,
)

data class Comment(
    val id: Long,
    val postId: Long,
    val authorId: Long,
    val content: String,
    val published: Long,
    val likedByMe: Boolean,
    val likes: Int = 0,
)

data class Author(
    val id: Long,
    val name: String,
    val avatar: String,
)
Теперь в постах и комментариях нет ни имени автора, ни аватарки.

Сервер с реализацией находится в каталоге server.

Чтобы автор отображался, нужно делать запрос на /api/authors/{id}, где {id} — это идентификатор автора. Никакого getAll для авторов нет.

Задача
Используя примеры с лекций, реализуйте любым способом (последовательным или с помощью async/await) получение авторов:

для постов;
для комментариев (необязательная часть).
Нужно сделать обычный (не Android) проект и реализовать такую последовательность вызовов, в результате которой мы получим коллекцию из постов с авторами и комментариями. Комментарии тоже должны быть с авторами — необязательная часть.

