import ObjectField.*

data class Post(
    var propertyId: Int? = null,
    val id: Int,
    var ownerId: Int,
    val fromId: Int,
    val createdBy: Int = 6769789,
    val date: Int = 7052022,
    val text: String,
    val replyOwnerId: Int,
    val replyPostId: Int,
    val friendsOnly: Int = 1,
    var comments: Comments? = null,
    var copyright: Copyright? = null,
    val likes: Likes? = null,
    val reposts: Reposts? = null,
    val views: Views? = null,
    val postType: String = "post",
    val singerId: Int,
    var canPin: Boolean = true,
    var canDelete: Boolean = true,
    var canEdit: Boolean = true,
    var isPinned: Boolean = false,
    var isFavorite: Boolean = true,
    var donut: Donut? = null,
    val postponedId: Int = 23,
    val attachments: Array<Attachment> = arrayOf(Video("Big floppa","Big floppa eat chicken"))
)




