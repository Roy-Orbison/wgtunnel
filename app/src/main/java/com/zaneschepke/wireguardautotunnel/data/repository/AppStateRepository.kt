package com.zaneschepke.wireguardautotunnel.data.repository

import com.zaneschepke.wireguardautotunnel.data.model.GeneralState
import kotlinx.coroutines.flow.Flow

interface AppStateRepository {
    suspend fun isLocationDisclosureShown(): Boolean
    suspend fun setLocationDisclosureShown(shown: Boolean)

    suspend fun isBatteryOptimizationDisableShown(): Boolean
    suspend fun setBatteryOptimizationDisableShown(shown: Boolean)

    suspend fun isTunnelRunningFromManualStart(): Boolean
    suspend fun setTunnelRunningFromManualStart(id: Int)

    suspend fun setManualStop()

    suspend fun getActiveTunnelId(): Int?

    suspend fun getCurrentSsid(): String?

    suspend fun setCurrentSsid(ssid: String)

    val generalStateFlow: Flow<GeneralState>

}
