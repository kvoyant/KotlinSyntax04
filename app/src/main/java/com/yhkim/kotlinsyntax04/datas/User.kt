package com.yhkim.kotlinsyntax04.datas

class User {

    var name: String = ""
    var loginId: String = ""

    //equals 함수 오버라이딩
    override fun equals(other: Any?): Boolean {
        var otherUser = other as User

        // == 값만 비교, === 값, 주소 모두 비교
        return this.name == otherUser.name && this.loginId == otherUser.loginId
    }
}