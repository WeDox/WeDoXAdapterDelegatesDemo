package com.onedream.wedoxadapterdelegates.base;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;

import java.util.List;

/**
 * @author jdallen
 * @since 2020/11/6
 */
public abstract class WeDoXBaseAdapterDelegate<K extends WeDoXBaseRVH> {
    private Context mContext;
    private int itemViewType;
    private Class clazz;


    public WeDoXBaseAdapterDelegate(Context mContext, int itemViewType, Class clazz) {
        this.mContext = mContext;
        this.itemViewType = itemViewType;
        this.clazz = clazz;
    }

    public abstract K onCreateViewHolder(@NonNull ViewGroup parent, int viewType);

    public abstract void onBindViewHolder(List item, @NonNull K holder, int position);

    /**
     * 通过资源res获得view
     */
    protected View getViewByRes(int res) {
        return LayoutInflater.from(mContext).inflate(res, null);
    }


    public int getItemType() {
        return itemViewType;
    }


    public boolean findViewTypeByPosition(List item, int position) {
        return item.get(position).getClass().equals(clazz);
    }
}
