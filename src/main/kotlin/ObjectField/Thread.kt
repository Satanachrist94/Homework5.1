package ObjectField

data class Thread(
    var count :Int,
    var items :Array<Comments> = emptyArray(),
    var canPost :Boolean,
    var showReplyButton : Boolean,
    var groupsCanPost : Boolean
)
