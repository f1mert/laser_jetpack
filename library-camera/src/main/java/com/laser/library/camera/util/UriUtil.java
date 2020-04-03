package com.laser.library.camera.util;

import android.content.Context;
import android.net.Uri;
import android.os.Build;

import java.io.File;

import androidx.core.content.FileProvider;

public class UriUtil {
    public static Uri getUriFromFile(Context context, File file,String provider){
        if(file == null || !file.exists())return null;
        Uri uri;
        if(Build.VERSION.SDK_INT >= Build.VERSION_CODES.M){
            uri = FileProvider.getUriForFile(context, context.getPackageName() + provider, file);
        }else{
            uri = Uri.fromFile(file);
        }
        return uri;
    }
}
