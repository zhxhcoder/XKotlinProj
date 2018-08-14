package com.zhxh.xkotlin.mvp.adapter

import com.chad.library.adapter.base.BaseQuickAdapter
import com.chad.library.adapter.base.BaseViewHolder
import com.zhxh.xkotlin.R


class DemoAdapter(var data: ArrayList<String>):BaseQuickAdapter<String,BaseViewHolder>(R.layout.adapter_item,data) {
    override fun convert(helper: BaseViewHolder?, item: String?) {

    }
}