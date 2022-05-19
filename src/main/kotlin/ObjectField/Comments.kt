package ObjectField

import java.util.Objects

data class Comments(
    val id :Int ,
    val fromId:Int = 2,
    val date :Int= 11222022,
    var donut :Donut?= null,
    val replyToUser :Int = 5542,
    val replyToComment :Int = 123,
    val attachments :Attachment=AudioAttachment() ,
    val parentStack : Array<Any>? = null,
    val thread :Thread? = null




)
