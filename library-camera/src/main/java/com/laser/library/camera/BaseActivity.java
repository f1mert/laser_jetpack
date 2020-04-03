package com.laser.library.camera;

import android.app.Activity;
import android.view.View;

public class BaseActivity extends Activity {

    protected void invisibleView(View view){
        if( view != null && view.getVisibility() != View.INVISIBLE){
            view.setVisibility(View.INVISIBLE);
        }
    }
    protected void goneView(View view){
        if( view != null && view.getVisibility() != View.GONE){
            view.setVisibility(View.GONE);
        }
    }
    protected void visibleView(View view){
        if( view != null && view.getVisibility() != View.VISIBLE){
            view.setVisibility(View.VISIBLE);
        }
    }
}
