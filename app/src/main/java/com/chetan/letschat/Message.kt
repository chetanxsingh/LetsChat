package com.chetan.letschat

import android.content.IntentSender

class Message {
    var message: String? = null
    var senderId: String? = null
    constructor(){}
    constructor(message: String?, sender: String?){
        this.message = message
        this.senderId = senderId
    }
}