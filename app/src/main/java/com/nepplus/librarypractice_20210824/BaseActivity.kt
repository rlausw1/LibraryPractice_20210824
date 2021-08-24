package com.nepplus.librarypractice_20210824

import androidx.appcompat.app.AppCompatActivity

abstract class BaseActivity : AppCompatActivity() {

    //this 자리에 대신 들어갈 변수
    val mContext = this

    //이벤트 처리 관련 코드를 모아줄 함수
    abstract fun setupEvents()

    abstract fun setValues()



}