package com.onedream.wedoxadapterdelegates;

import android.view.ViewGroup;

import androidx.annotation.NonNull;

import com.onedream.wedoxadapterdelegates.base.WeDoXBaseAdapterDelegate;
import com.onedream.wedoxadapterdelegates.base.WeDoXBaseRVH;
import com.onedream.wedoxadapterdelegates.other.WeDoXConstant;

import java.util.ArrayList;
import java.util.List;

public class WeDoXAdapterDelegateManager<K extends WeDoXBaseRVH> {
    private List<WeDoXBaseAdapterDelegate<K>> adapterDelegateList = new ArrayList<>();

    public WeDoXAdapterDelegateManager() {
    }

    public WeDoXAdapterDelegateManager addDelegate(@NonNull WeDoXBaseAdapterDelegate delegate) {
        adapterDelegateList.add(delegate);
        return this;
    }

    public K onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        for (WeDoXBaseAdapterDelegate<K> adapterDelegate : adapterDelegateList) {
            if (viewType == adapterDelegate.getItemType()) {
                return adapterDelegate.onCreateViewHolder(parent, viewType);
            }
        }
        return null;
    }

    public void onBindViewHolder(List dataList, @NonNull K holder, int position) {
        for (WeDoXBaseAdapterDelegate<K> adapterDelegate : adapterDelegateList) {
            if (holder.getItemViewType() == adapterDelegate.getItemType()) {
                adapterDelegate.onBindViewHolder(dataList, holder, position);
            }
        }
    }

    public int getItemViewType(@NonNull List dataList, int position) {
        for (WeDoXBaseAdapterDelegate adapterDelegate : adapterDelegateList) {
            if (adapterDelegate.findViewTypeByPosition(dataList, position)) {
                return adapterDelegate.getItemType();
            }
        }
        return WeDoXConstant.NO_EXIST_ITEM_VIEW_TYPE;
    }

}