package ObjectField


data class Video(val title: String = "Big floppa", val description: String = "Big floppa eat chicken") {


}

data class Photo(val albumId: Int = 48764)


data class Audio(val artist: String = "Rammstein")


data class History(val ownerId: Int = 999666)


data class Sticker(val stickerId: Int = 123)


interface Attachment {
    val type: String
}


data class VideoAttachment(
    override val type: String = "video",
    val video: Video = Video(),
) : Attachment

data class AudioAttachment(override val type: String = "audio", val audio: Audio = Audio()) : Attachment
data class StickerAttachment(override val type: String = "sticker", val sticker: Sticker = Sticker()) : Attachment
data class HistoryAttachment(override val type: String = "history", val history: History = History()) : Attachment
data class PhotoAttachment(override val type: String = " photo", val photo: Photo= Photo() ) :Attachment



