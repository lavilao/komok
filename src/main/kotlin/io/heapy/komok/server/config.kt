@file:Suppress("FunctionName")

package io.heapy.komok.server

import kotlinx.serialization.Serializable

@Serializable
data class ServerConfiguration(
    val port: Int,
    val host: String,
    val resources: String,
)
