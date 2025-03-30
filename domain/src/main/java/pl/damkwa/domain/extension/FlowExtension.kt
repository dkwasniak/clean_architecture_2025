package pl.damkwa.domain.extension

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.catch
import kotlinx.coroutines.flow.map
import kotlinx.coroutines.flow.onStart
import mu.KotlinLogging
import pl.damkwa.domain.remotedata.RemoteData


private val logger = KotlinLogging.logger {}

fun <T> Flow<T>.remotelify(): Flow<RemoteData<Throwable, T>> = this
    .map<T, RemoteData<Throwable, T>> { RemoteData.Success(it) }
    .onStart { emit(RemoteData.Loading) }
    .catch { error ->
        logger.error { error.printStackTrace() }
        emit(RemoteData.Failure(error))
    }


