package com.zhxh.xkotlin.http

import com.zhxh.corelib.http.retrofit.RetrofitFactory


object MainRetrofit : RetrofitFactory<MainApi>() {
    override fun getApiService(): Class<MainApi> {
        return MainApi::class.java
    }

    override fun getToken(): String {
        return ""
    }
}