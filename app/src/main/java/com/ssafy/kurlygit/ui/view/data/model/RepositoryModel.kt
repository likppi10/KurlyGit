package com.ssafy.kurlygit.ui.view.data.model

data class RepositoryModel(
    val id: Int,
    val name :  String,
    val private: Boolean,
    val description: String,
    val stargazers_count: Int,
    val forks_count: Int,
){
    constructor(): this(0,"",true,"",0,0)
}