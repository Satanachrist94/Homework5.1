object WallService {
    private var propertyId: Int = 0
    private var posts = mutableMapOf<Int, Post>()


    fun add(post: Post): Post {
        propertyId++
        val c = post.copy(propertyId = propertyId)
        posts.put(propertyId, c)
        return c
    }


    fun clear() {
        posts.clear()
    }

    fun update(post: Post): Boolean {

        if (posts.keys.contains(post.propertyId)) {
            val updatePost = post.copy(ownerId = 2,
                fromId = 99998,
                createdBy = 889095,
                text = "Hello,Kotlin",
                replyOwnerId = 6732647,
                replyPostId = 1111,
                friendsOnly = 456,
                singerId = 888888,
                canPin = false)
            posts.set(propertyId, updatePost)
            return true
        } else return false


    }
}