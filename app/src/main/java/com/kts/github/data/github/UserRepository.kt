package com.kts.github.data.github

import com.kts.github.data.github.models.RemoteGithubUser
import com.kts.github.data.network.Networking

class UserRepository {
    suspend fun getUserInformation(): RemoteGithubUser {
        return Networking.githubApi.getCurrentUser()
    }
}