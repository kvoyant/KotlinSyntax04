package com.yhkim.kotlinsyntax04

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.yhkim.kotlinsyntax04.datas.User

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val lottoNumArr = ArrayList<Int>()
        //val(value) 변하지 않는 변수 : 포인터가 가르키는 객체주소가 바뀔일이 없다(만약 변하면 var(variable))

        lottoNumArr.add(10)
        lottoNumArr.add(42)
        lottoNumArr.add(17)
        lottoNumArr.add(0, 15)


//        String.format("생년: %d, 나이: %d, 키: %f", 1988, 32, 180.5)//이전 로그방식 예
//        Log.d("로또번호입력한개수", String.format("%d",lottoNumArr.size))
        Log.d("로또번호입력한개수", "${lottoNumArr.size} 개 입력됨")//4 개 입력됨

        Log.d("42는몇번칸에?","${lottoNumArr.indexOf(42)} 번 칸에 있음")//2 번 칸에 있음

        Log.d("1번칸에는 뭐가들어있나?", "${lottoNumArr.get(1)}")

//        42를 배열에서 빼내고 싶다
        lottoNumArr.remove(42)//return boolean(실패/성공)
        Log.d("로또번호입력한개수", "${lottoNumArr.size} 개 입력됨")//3 개 입력됨


//        맨 앞의 자료를 삭제하고 싶다
        lottoNumArr.removeAt(0)

        val userList = ArrayList<User>()
        val user1 = User()
        user1.name = "김영호"
        user1.loginId = "kyh1234"
        userList.add(user1)

        val user2 = User()
        user2.name = "홍길동"
        user2.loginId = "hgd01"
        userList.add(user2)

        Log.d("들어있는 사람수", "${userList.size} 명")

        Log.d("1번칸에 들어있는 사람이름", "${userList.get(1).name}")

        val user3 = User()
        user3.name = "김영호"
        user3.loginId = "kyh1234"

        Log.d("김영호가 있는 위치", "${userList.indexOf(user3)}")
        //-1 찾지 못함 : indexOf
        //0 : User equals override 해서 재정의 했을 경우

        userList.remove(user3)
        Log.d("들어있는 사람수", "${userList.size} 명")

//        var count = 0
//        while ( true ) {
//
//            count++
//
//            if (count >= 10) {
//                break
//            }
//        }

        userList.add(user3)
        Log.d("user3 추가후 들어있는 사람수", "${userList.size} 명")

        val user4 = User()
        user4.name = "장비"
        user4.loginId = "jangbee01"
        userList.add(user4)

//        사용자 목록에 들어있는 사람들이 이름/ 아이디 출력
        for(user in userList) {
            Log.d("사람이름/아이디", "${user.name} / ${user.loginId}")
        }

        for(i in 0..5) {
            Log.d("뽑힌 숫자", "${i}")
        }

//        var user5:User = null //error !!
        var user5:User? = null //error !!
        user5?.name
        //일반 변수 타입에 null이 절대 못들어간다.
        //null 고려한다면 자료형태에 ?를 붙히자

        //############ 단축키 ###############
        //alt + return 에러탐색
        //Ctl + space 코드자동탐색
        //Ctl + Alt + o : import 정리
        //--------------------------------



   }
}
