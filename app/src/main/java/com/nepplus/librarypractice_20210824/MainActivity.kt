package com.nepplus.librarypractice_20210824

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.bumptech.glide.Glide
import com.gun0912.tedpermission.PermissionListener
import kotlinx.android.synthetic.main.activity_main.*
import java.security.Permissions

class MainActivity : BaseActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setupEvents()
        setValues()

    override fun setupEvents() {
        callBtn.setOnClickListener {

            //TedPermission 라이브러리 활용 -> 권한 여부 대응 + 실제 체크

            val pl = object : PermissionListener {
                override fun onPermissionGranted() {

                    //권한 승인되었을때 실행할 코드를 적는 부분
                    //전화 연결 활용
                    val myUri = Uri.parse("tel: 02-222-2222")
                    val myintent = Intent( Intent.ACTION_CALL, myUri)
                    startActivity(myintent)


                }

                override fun onPermissionDenied(deniedPermissions: MutableList<String>?) {

                    Toast.makeText(mContext, "권한이 거부되어 전화연결이 불가합니다.", Toast.LENGTH_SHORT).show()


                }


            }

            //실제로 권한 확인 : Mainfest에도 적어두고 + 코틀린에서도 확인
            //=> 라이브러리 문제로 현재 작업 불가


        }

        profileImg.setOnClickListener {

            //프로필 사진 클릭 이벤트 => 사진 크게 보기로 이동
            val myIntent = Intent(mContext, ViewPhotoActivity :: class.java)
            startActivity(myIntent)



        }

    }

    override fun setValues() {

        //최근 활동 사진을 -> 인터넷에서 곧바로 다운 받아 앱에서 보여주기
        //Drawable 에 붙여넣는 작업 없이

        Glide.with(mContext).load("https://cdn.topstarnews.net/news/photo/201912/714847_426867_3336.jpeg").into(recentImg)



    }










    }
}