package com.onedream.wedoxadapterdelegates.base;

import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.onedream.wedoxadapterdelegates.WeDoXAdapterDelegateManager;
import com.onedream.wedoxadapterdelegates.other.WeDoXConstant;

import java.util.List;

public class WeDoXBaseAdapter<K extends WeDoXBaseRVH> extends RecyclerView.Adapter<K> {
    private List dataList;
    protected WeDoXAdapterDelegateManager<K> adapterDelegateManager;

    public WeDoXBaseAdapter(List dataList) {
        this.dataList = dataList;
        //
        adapterDelegateManager = new WeDoXAdapterDelegateManager<K>();
    }


    @NonNull
    @Override
    public K onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return adapterDelegateManager.onCreateViewHolder(parent, viewType);
    }

    @Override
    public void onBindViewHolder(@NonNull K holder, int position) {
        adapterDelegateManager.onBindViewHolder(dataList, holder, position);
    }

    @Override
    public int getItemCount() {
        return null == dataList ? 0 : dataList.size();
    }

    @Override
    public int getItemViewType(int position) {
        int itemType = WeDoXConstant.NO_EXIST_ITEM_VIEW_TYPE;
        if (dataList != null && dataList.size() > 0 && position < dataList.size()) {
            itemType = adapterDelegateManager.getItemViewType(dataList, position);
        }
        return itemType == WeDoXConstant.NO_EXIST_ITEM_VIEW_TYPE ? super.getItemViewType(position) : itemType;
    }
}