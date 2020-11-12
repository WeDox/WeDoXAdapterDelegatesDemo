package com.onedream.wedoxadapterdelegatesdemo.delegate;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;

import com.onedream.wedoxadapterdelegates.base.WeDoXBaseAdapterDelegate;
import com.onedream.wedoxadapterdelegates.base.WeDoXBaseRVH;
import com.onedream.wedoxadapterdelegatesdemo.R;
import com.onedream.wedoxadapterdelegatesdemo.bean.BBean;
import com.onedream.wedoxadapterdelegatesdemo.bean.CBean;

import java.util.List;

/**
 * @author jdallen
 * @since 2020/11/12
 */
public class CHolderDelegate extends WeDoXBaseAdapterDelegate<CHolderDelegate.CHolder> {


    private Context mContext;

    public CHolderDelegate(Context mContext) {
        super(mContext, CBean.TYPE_C, CBean.class);
        this.mContext = mContext;
    }

    @Override
    public CHolderDelegate.CHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new CHolderDelegate.CHolder(getViewByRes(R.layout.item_c));
    }

    @Override
    public void onBindViewHolder(List item, @NonNull CHolderDelegate.CHolder holder, int position) {

    }


    static class CHolder extends WeDoXBaseRVH {
        public CHolder(View itemView) {
            super(itemView);
        }
    }
}
