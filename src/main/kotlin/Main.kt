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
    WallService.creatComment(Comments(1))
    // println()

    // println(WallService.update(post2))
/*
      println(post1.attachments[0])
      for (attachments in post1.attachments) {
          if (attachments is VideoAttachment) {
              println(attachments.video)
          }
      }*/


}


