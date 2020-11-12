package com.onedream.wedoxadapterdelegatesdemo.delegate;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;

import com.onedream.wedoxadapterdelegates.base.WeDoXBaseAdapterDelegate;
import com.onedream.wedoxadapterdelegates.base.WeDoXBaseRVH;
import com.onedream.wedoxadapterdelegatesdemo.R;
import com.onedream.wedoxadapterdelegatesdemo.bean.ABean;

import java.util.List;

public class AHolderDelegate extends WeDoXBaseAdapterDelegate<AHolderDelegate.AHolder> {
    private Context mContext;

    public AHolderDelegate(Context mContext) {
        super(mContext, ABean.TYPE_A, ABean.class);
        this.mContext = mContext;
    }

    @Override
    public AHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new AHolder(getViewByRes(R.layout.item_a));
    }

    @Override
    public void onBindViewHolder(List item, @NonNull AHolder holder, int position) {

    }

    static class AHolder extends WeDoXBaseRVH {
        private AHolder(@NonNull View itemView) {
            super(itemView);
        }
    }
}
