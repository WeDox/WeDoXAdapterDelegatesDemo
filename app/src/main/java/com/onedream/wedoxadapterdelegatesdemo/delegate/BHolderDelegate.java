package com.onedream.wedoxadapterdelegatesdemo.delegate;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;

import com.onedream.wedoxadapterdelegates.base.WeDoXBaseAdapterDelegate;
import com.onedream.wedoxadapterdelegates.base.WeDoXBaseRVH;
import com.onedream.wedoxadapterdelegatesdemo.R;
import com.onedream.wedoxadapterdelegatesdemo.bean.BBean;

import java.util.List;

public class BHolderDelegate extends WeDoXBaseAdapterDelegate<BHolderDelegate.BHolder> {
    private Context mContext;

    public BHolderDelegate(Context mContext) {
        super(mContext, BBean.TYPE_B, BBean.class);
        this.mContext = mContext;
    }


    @Override
    public BHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new BHolder(getViewByRes(R.layout.item_b));
    }

    @Override
    public void onBindViewHolder(List item, @NonNull BHolder holder, int position) {

    }

    static class BHolder extends WeDoXBaseRVH {
        private BHolder(@NonNull View itemView) {
            super(itemView);
        }
    }
}