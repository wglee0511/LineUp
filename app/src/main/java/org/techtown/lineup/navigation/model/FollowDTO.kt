package org.techtown.lineup.navigation.model


data class FollowDTO(
    var followCount: Int = 0,
    var followers: MutableMap<String, Boolean> = HashMap(),
    // Protect to overlapping follow

    var followingCount : Int = 0,
    var followings : MutableMap<String, Boolean> = HashMap()

    )