package com.atguigu.biliapk.cfragment;

import android.app.Activity;
import android.support.design.widget.AppBarLayout;
import android.support.v7.widget.Toolbar;
import android.view.View;

import com.atguigu.biliapk.R;
import com.atguigu.biliapk.activity.MainActivity;
import com.atguigu.biliapk.base.BaseFragment;
import com.atguigu.biliapk.view.CustomEmptyView;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by 熊猛 on 2017/3/25.
 */

public class ConsumeHistoryFragment extends BaseFragment {

    @BindView(R.id.toolbar)
    Toolbar toolbar;
    @BindView(R.id.app_bar_layout)
    AppBarLayout appBarLayout;
    @BindView(R.id.empty_view)
    CustomEmptyView emptyView;
    public static ConsumeHistoryFragment newInstance() {
        return new ConsumeHistoryFragment();
    }
    @Override
    protected View initView() {
        View view = View.inflate(mContext, R.layout.fragment_later, null);
        ButterKnife.bind(this, view);
        return view;
    }

    @Override
    public void initData() {
        super.initData();
        toolbar.setTitle("B币钱包");
        toolbar.setNavigationIcon(R.drawable.ic_navigation_drawer);
        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Activity activity1 = getActivity();
                if (activity1 instanceof MainActivity) {
                    ((MainActivity) activity1).toggleDrawer();
                }

            }

        });

        emptyView.setEmptyImage(R.drawable.ic_movie_pay_area_limit);
        emptyView.setEmptyText("你还没有消费记录哟");
    }
}
