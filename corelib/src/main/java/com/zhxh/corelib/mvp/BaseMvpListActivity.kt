package com.zhxh.corelib.mvp

import android.support.v4.content.ContextCompat
import android.support.v7.widget.RecyclerView
import com.zhxh.corelib.R
import com.zhxh.corelib.state.IStateView
import com.scwang.smartrefresh.layout.SmartRefreshLayout
import kotlinx.android.synthetic.main.layout_list.*

abstract class BaseMvpListActivity<V : ITopView, P : ITopPresenter> : BaseMvpActivity<V, P>(), IListView<P> {
    override fun getContentView() = R.layout.layout_list
    override val mStateView: IStateView by lazy { list_sv }
    override val mRecyclerView: RecyclerView by lazy { list_rv }
    override val mRefreshLayout: SmartRefreshLayout by lazy { refreshLayout }

    override fun initView() {
        //设置列表背景色
        list_rv.setBackgroundColor(ContextCompat.getColor(this, setRecyclerViewBgColor))
        //重试
        list_sv.onRetry = { onRetry() }
        //刷新
        refreshLayout.setOnRefreshListener { onRefresh() }
        //设置下拉刷新是否可用
        refreshLayout.isEnabled = setRefreshEnable
    }

    abstract fun onRefresh()
    abstract fun onRetry()
    open val setRecyclerViewBgColor = R.color.white
    open val setRefreshEnable = true
}