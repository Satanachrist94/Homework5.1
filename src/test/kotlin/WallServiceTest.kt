import org.junit.jupiter.api.AfterEach
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

internal class WallServiceTest {

    @BeforeEach
    fun setUp() {
    }

    @AfterEach
    fun tearDown() {
        WallService.clear()
    }

    @Test
    fun add() {
        val expectedID = 1
        val actualID = WallService.add(Post(id = 12345,
            ownerId = 5674734,
            fromId = 9999999,
            createdBy = 889850938,
            date = 1212022,
            text = "Hello, World!!",
            replyOwnerId = 567890,
            replyPostId = 124567,
            singerId = 77777))
        assertEquals(expectedID, actualID.propertyId)


    }

    @Test
    fun updateReturnTrue() {
        val actualResult = WallService.update(WallService.add(Post(id = 12345,
            ownerId = 5674734,
            fromId = 9999999,
            createdBy = 889850938,
            date = 1212022,
            text = "Hello, World!!",
            replyOwnerId = 567890,
            replyPostId = 124567,
            singerId = 77777)))
        assertTrue(actualResult)
    }

    @Test
    fun updateReturnFalse() {
        var post = Post(id = 12345,
            ownerId = 5674734,
            fromId = 9999999,
            createdBy = 889850938,
            date = 1212022,
            text = "Hello, World!!",
            replyOwnerId = 567890,
            replyPostId = 124567,
            singerId = 77777)
        WallService.add(post)
        post.propertyId = 56
        var actualResult = WallService.update(post)
        assertFalse(actualResult)
    }


}
