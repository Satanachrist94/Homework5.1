package ObjectField


data class Video(val title: String, val description: String) : Attachment {
    override val type: String
        get() = "video"

}

data class Photo(val album_id: Int) : Attachment {
    override val type: String
        get() = "photo"

}

data class Audio(val artist: String) : Attachment {
    override val type: String
        get() = "audio"

}

data class History(val owner_id: Int) : Attachment {
    override val type: String
        get() = "history"

}

data class Sticker(val sticker_id: Int) : Attachment {
    override val type: String
        get() = "sticker"

}

interface Attachment {
    val type: String
}



