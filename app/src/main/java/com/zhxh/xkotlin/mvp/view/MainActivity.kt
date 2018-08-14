package com.zhxh.xkotlin.mvp.view

import com.zhxh.xkotlin.R
import com.zhxh.xkotlin.mvp.adapter.DemoAdapter
import com.zhxh.xkotlin.mvp.contract.IMainContact
import com.zhxh.xkotlin.mvp.presenter.MainPresenter
import com.zhxh.corelib.mvp.BaseMvpListActivity
import com.zhxh.corelib.utils.CustomLoadMoreView


class MainActivity : BaseMvpListActivity<IMainContact.View, IMainContact.Presenter>(), IMainContact.View {

    override var mPresenter: IMainContact.Presenter = MainPresenter()
    override val setRefreshEnable = true
    override val setRecyclerViewBgColor = R.color.white
    override fun initData() {
        super.initData()
        val data = ArrayList<String>()
        data.add("")
        data.add("")
        data.add("")
        val demoAdapter = DemoAdapter(data = data)
        demoAdapter.setLoadMoreView(CustomLoadMoreView())
        mRecyclerView.adapter = demoAdapter
        demoAdapter.setOnLoadMoreListener({ demoAdapter.loadMoreEnd() }, mRecyclerView)
    }

    override fun onRetry() {

    }

    override fun onRefresh() {
        mRefreshLayout.finishRefresh(false)
    }

    override fun loadMoreFail(isRefresh: Boolean) {

    }


    override fun getDataSuccess() {

    }
}
