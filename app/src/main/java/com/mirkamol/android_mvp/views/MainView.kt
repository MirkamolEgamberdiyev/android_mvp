package com.mirkamol.android_mvp.views

import com.mirkamol.android_mvp.model.Post

interface MainView {
    fun onPostListSuccess(posts:ArrayList<Post>?)
    fun onPostListFailure(error:String)

    fun onPostDeleteSuccess(post: Post?)
    fun onPostDeleteFailure(error: String)

}