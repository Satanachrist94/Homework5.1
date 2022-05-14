import ObjectField.*

fun main() {
    var post1 = Post(id = 12345,
        ownerId = 5674734,
        fromId = 9999999,
        createdBy = 889850938,
        date = 1212022,
        text = "Hello, World!!",
        replyOwnerId = 567890,
        replyPostId = 124567,
        singerId = 77777)
    var post2 = Post(id = 123456,
        ownerId = 567264734,
        fromId = 99999299,
        createdBy = 77850938,
        date = 1212022,
        text = "Hello, World!!",
        replyOwnerId = 5617890,
        replyPostId = 12456567,
        singerId = 7777788)

    WallService.add(post1)
    WallService.add(post2)

    println(WallService.update(post2))
    for (attachment in post1.attachments) {
        when (attachment.type) {
            "photo" -> (attachment as Photo).album_id
            "audio" -> (attachment as Audio).artist
            "sticker" -> (attachment as Sticker).sticker_id
            "history" -> (attachment as History).owner_id
            "video" -> (attachment as Video).description

        }
    }


}


