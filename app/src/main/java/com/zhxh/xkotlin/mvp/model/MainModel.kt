package com.zhxh.xkotlin.mvp.model

import com.zhxh.xkotlin.http.MainDataBean
import com.zhxh.xkotlin.http.MainRetrofit
import com.zhxh.xkotlin.mvp.contract.IMainContact
import com.zhxh.corelib.mvp.BaseModelKt
import io.reactivex.Observable

class MainModel : BaseModelKt(), IMainContact.Model {
    override fun getMainData(): Observable<MainDataBean> {
        return MainRetrofit.apiService.getMainData()
    }
}