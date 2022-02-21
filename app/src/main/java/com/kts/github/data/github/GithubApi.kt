package com.kts.github.data.github

import com.kts.github.data.github.models.RemoteGithubUser
import retrofit2.http.GET

interface GithubApi {
    @GET("user")
    suspend fun getCurrentUser(
    ): RemoteGithubUser
}
