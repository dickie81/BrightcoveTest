package uk.co.news.brightcovevideotest;

import android.os.Bundle;

import com.brightcove.player.media.DeliveryType;
import com.brightcove.player.model.Video;
import com.brightcove.player.view.BrightcoveExoPlayerVideoView;
import com.brightcove.player.view.BrightcovePlayer;

public class MainActivity extends BrightcovePlayer {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        BrightcoveExoPlayerVideoView brightcoveVideoView = (BrightcoveExoPlayerVideoView) findViewById(R.id.brightcove_video_view);

        brightcoveVideoView.add(Video.createVideo("http://learning-services-media.brightcove.com/videos/mp4/Wildlife_Tiger.mp4", DeliveryType.MP4));
        brightcoveVideoView.start();
    }
}
