package com.onedream.wedoxadapterdelegatesdemo;

import android.content.Context;

import com.onedream.wedoxadapterdelegates.base.WeDoXBaseAdapter;
import com.onedream.wedoxadapterdelegatesdemo.delegate.AHolderDelegate;
import com.onedream.wedoxadapterdelegatesdemo.delegate.BHolderDelegate;
import com.onedream.wedoxadapterdelegatesdemo.delegate.CHolderDelegate;

import java.util.List;

/**
 * @author jdallen
 * @since 2020/11/5
 */
public class MyAdapter extends WeDoXBaseAdapter {

    public MyAdapter(Context mContext, List dataList) {
        super(dataList);
        //
        adapterDelegateManager.addDelegate(new AHolderDelegate(mContext));
        adapterDelegateManager.addDelegate(new BHolderDelegate(mContext));
        adapterDelegateManager.addDelegate(new CHolderDelegate(mContext));
    }
}
