package com.zhxh.xkotlin.http

import io.reactivex.Observable
import retrofit2.http.POST

interface MainApi {

    /**
     * 主页接口
     */
    @POST("main/init")
    fun getMainData(): Observable<MainDataBean>

}