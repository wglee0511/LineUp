package org.techtown.lineup.navigation.model

data  class AlarmDTO(
    var destinationUid : String? = null,
    var userId : String? = null,
    var uid : String? = null,
    var kind : Int? = null, //knowing to alarm type
    var message : String? = null,
    var timestamp : Long? = null
)