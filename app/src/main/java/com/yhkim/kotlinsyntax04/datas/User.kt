package com.yhkim.kotlinsyntax04.datas

class User {

    var name: String = ""
    var loginId: String = ""

    override fun equals(other: Any?): Boolean {
        var otherUser = other as User

        return this.name == otherUser.name && this.loginId == otherUser.loginId
    }
}