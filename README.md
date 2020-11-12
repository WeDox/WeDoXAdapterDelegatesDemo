# WeDoXAdapterDelegatesDemo
多Item类型的RecyclerView适配器


~~~~~
public class MyAdapter extends WeDoXBaseAdapter {

    public MyAdapter(Context mContext, List dataList) {
        super(dataList);
        //
        adapterDelegateManager.addDelegate(new AHolderDelegate(mContext))
                .addDelegate(new BHolderDelegate(mContext))
                .addDelegate(new CHolderDelegate(mContext));
    }
}
~~~~~

~~~~~
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
~~~~~
