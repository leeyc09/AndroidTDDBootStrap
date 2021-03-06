package com.github.piasy.gh.features.splash;

import android.content.Intent;
import com.github.piasy.base.android.BaseFragment;
import com.github.piasy.gh.R;
import com.github.piasy.gh.features.search.SearchActivity;

/**
 * Created by Piasy{github.com/Piasy} on 20/09/2016.
 */

public class SplashFragment extends BaseFragment<SplashView, SplashPresenter, SplashComponent>
        implements SplashView {
    @Override
    protected int getLayoutRes() {
        return R.layout.splash_activity;
    }

    @Override
    protected void injectDependencies(final SplashComponent component) {
    }

    @Override
    public void finishSplash(final boolean initSuccess) {
        if (initSuccess) {
            startActivitySafely(new Intent(getContext(), SearchActivity.class));
            getActivity().finish();
        }
    }
}
