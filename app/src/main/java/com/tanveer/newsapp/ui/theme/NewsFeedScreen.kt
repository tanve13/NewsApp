package com.tanveer.newsapp.ui.theme

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Divider
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.tanveer.newsapp.utils.sampleNewsList

@Composable
fun NewsFeedScreen(){
    LazyColumn(modifier = Modifier.fillMaxSize()){
        items(sampleNewsList){ news ->
            NewsCard(news)
            Divider(modifier = Modifier.padding(horizontal=8.dp))
        }
    }
}