package com.zoontek.rnbootsplash;

import android.app.Activity;

import androidx.annotation.DrawableRes;
import androidx.annotation.NonNull;
import androidx.annotation.LayoutRes;

public class RNBootSplash {

  public static void init(final @DrawableRes int drawableResId, @NonNull final Activity activity) {
    RNBootSplashModule.init(drawableResId, activity);
  }

  public static void initLayout(final @LayoutRes int layoutRes, @NonNull final Activity activity) {
    RNBootSplashModule.initLayout(layoutRes, activity);
  }
}
