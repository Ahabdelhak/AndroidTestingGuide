package com.example.androidtestingguide

import android.content.Context
import androidx.test.core.app.ApplicationProvider
import com.example.androidtestingguide.utils.ResourceComparer
import com.google.common.truth.Truth.assertThat
import org.junit.After
import org.junit.Before
import org.junit.Test

class ResourceComparerTest{
    lateinit var resourceComparer: ResourceComparer

    @Before
    fun setUp(){
        resourceComparer= ResourceComparer()
    }

    @After
    fun close(){
        //used in example with room to close DB
    }

    @Test
    fun stringResourceSameAsGivenString_returnsTrue(){
        val context = ApplicationProvider.getApplicationContext<Context>()
        val result = resourceComparer.isEqual(context,R.string.app_name,"AndroidTestingGuide")
        assertThat(result).isTrue()
    }

    @Test
    fun stringResourceDiffGivenString_returnsFalse(){
        val context = ApplicationProvider.getApplicationContext<Context>()
        val result = resourceComparer.isEqual(context,R.string.app_name,"Hello")
        assertThat(result).isFalse()
    }
}