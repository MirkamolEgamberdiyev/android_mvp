package com.mirkamol.android_mvp.presenter

import com.mirkamol.android_mvp.model.Post

interface MainPresenterImpl {
    fun apiPostList()
    fun apiPostDelete(post: Post)
}