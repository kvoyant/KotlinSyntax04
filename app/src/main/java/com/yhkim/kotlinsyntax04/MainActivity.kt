package com.yhkim.kotlinsyntax04

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

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


    }
}
