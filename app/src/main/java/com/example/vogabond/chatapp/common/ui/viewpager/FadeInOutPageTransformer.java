package commoon.ui.viewpager.ui.viewpager;

import android.support.v4.view.ViewPager;
import android.view.View;

/**
 * Viewpager 页面切换动画，只支持3.0以上版本
 * [-∞，-1]完全不可见
 * [-1,  0]从不可见到完全可见
 * [0,1]从完全可见到不可见
 * [1,∞]完全不可见
 * Created by yang。先森 on 2017/8/9 0009.
 */

public class FadeInOutPageTransformer implements ViewPager.PageTransformer {
    @Override
    public void transformPage(View page, float position) {
        if (position < -1){//页面完全不可见
            page.setAlpha(0);
        }else if (position < 0){
            page.setAlpha(1 + position);
        }else if (position <  1){
            page.setAlpha(1 - position);
        }else {
            page.setAlpha(0);
        }
    }
}