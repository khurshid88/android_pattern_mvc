package com.example.android_mvc

import com.example.android_advanced_kotlin.activity.model.Post
import com.example.android_mvc.network.RetrofitHttp
import org.junit.Test

import org.junit.Assert.*
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest {

    @Test
    fun postsResponseNotNull() {
        var list = RetrofitHttp.postService.listPost().execute()
        assertNotNull(list)
    }
}