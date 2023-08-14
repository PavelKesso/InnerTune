package com.zionhuang.music.ui.widgets

import androidx.glance.appwidget.GlanceAppWidget
import androidx.glance.appwidget.GlanceAppWidgetReceiver

class PlaybackWidgetReceiver : GlanceAppWidgetReceiver() {

    override val glanceAppWidget: GlanceAppWidget = PlaybackWidget()
}