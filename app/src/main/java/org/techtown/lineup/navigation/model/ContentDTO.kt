package org.techtown.lineup.navigation.model

data class ContentDTO(
    var explain: String? = null,
    // explain this content
    var imageUri: String? = null,
    // manage image address
    var uid: String? = null,
    // who upload this image
    var userId: String? = null,
    // manage upload user
    var timestamp: Long? = null,
    // know time
    var favoriteCount: Int = 0,
    var favorites: Map<String, Boolean> = HashMap()
) {

    data class Comment(
        // protecting overlaping favorites
        var uid: String? = null,
        var userId: String? = null,
        var comment: String? = null,
        var timestamp: Long? = null
    )
}



