package com.nepplus.librarypractice_20210824

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : BaseActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setupEvents()
        setValues()

    override fun setupEvents() {
        callBtn.setOnClickListener {

            //전화 연결 활용
            val myUri = Uri.parse("tel: 02-222-2222")
            val myyintent = Intent( Intent.ACTION_CALL, myUri)
            startActivity(myyintent)
        }

        profileImg.setOnClickListener {

            //프로필 사진 클릭 이벤트 => 사진 크게 보기로 이동
            val myIntent = Intent(mContext, ViewPhotoActivity :: class.java)
            startActivity(myIntent)



        }

    }

    override fun setValues() {

    }










    }
}