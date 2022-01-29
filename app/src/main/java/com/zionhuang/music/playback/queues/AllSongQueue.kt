package com.zionhuang.music.playback.queues

import com.google.android.exoplayer2.MediaItem
import com.zionhuang.music.constants.MediaConstants.QUEUE_ALL_SONG
import com.zionhuang.music.db.SongRepository
import com.zionhuang.music.extensions.getApplication
import com.zionhuang.music.extensions.toMediaItems
import com.zionhuang.music.models.QueueData

class AllSongQueue(
    override val items: List<MediaItem>,
) : Queue {
    override fun hasNextPage() = false
    override suspend fun nextPage() = emptyList<MediaItem>()

    companion object {
        const val TYPE = QUEUE_ALL_SONG
        val fromParcel: suspend (QueueData) -> Queue = {
            AllSongQueue(SongRepository().getAllSongsList(it.sortInfo!!).toMediaItems(getApplication()))
        }
    }
}