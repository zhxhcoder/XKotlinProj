package com.zhxh.corelib.state

interface IListBean<out T> {
    val list: List<T>
}