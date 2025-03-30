package pl.damkwa.data.repository

import pl.damkwa.data.network.api.shipment.GitHubApi
import pl.damkwa.domain.repository.Repository
import javax.inject.Inject

class RepositoryImpl @Inject constructor(
    private val gitHubApi: GitHubApi,
) : Repository {

}