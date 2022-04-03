package com.cyl.musiclake.api;

import android.content.Context;
import android.util.Log;

import com.bumptech.glide.GlideBuilder;
import com.bumptech.glide.annotation.GlideModule;
import com.bumptech.glide.load.engine.cache.MemorySizeCalculator;
import com.bumptech.glide.module.AppGlideModule;
import com.cyl.musiclake.api.net.ExternalCacheDiskFactory;

/**
 * Created by D22434 on 2017/11/16.
 */
@GlideModule
public class MyAppGlideModule extends AppGlideModule {

    private int mDiskSize = 1024 * 1024 * 500;  //500M

    @Override
    public void applyOptions(Context context, GlideBuilder builder) {
        super.applyOptions(context, builder);
        // 캐시 크기와 위치를 정의하십시오
//        builder.setDiskCache(new InternalCacheDiskCacheFactory(context, mDiskSize));  //메모리
        builder.setDiskCache(new ExternalCacheDiskFactory(context)); //sd卡中
//        builder.setLogLevel(Log.DEBUG);
        // 기본 메모리 및 그림 풀 크기
//        builder.setMemoryCache(new LruResourceCache(defaultMemoryCacheSize)); // 이 두 문장을 설정할 필요가 없습니다. 기본값입니다.
//        builder.setBitmapPool(new LruBitmapPool(defaultBitmapPoolSize));

        // 사용자 정의 메모리 및 그림 풀 크기
//        builder.setMemoryCache(new LruResourceCache(mMemorySize));
//        builder.setBitmapPool(new LruBitmapPool(mMemorySize));

        // 이미지 형식을 정의하십시오
//        builder.setDecodeFormat(DecodeFormat.PREFER_ARGB_8888);
//        builder.setDecodeFormat(DecodeFormat.PREFER_RGB_565); // 默认

    }
}
