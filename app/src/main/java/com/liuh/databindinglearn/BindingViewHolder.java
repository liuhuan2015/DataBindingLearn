package com.liuh.databindinglearn;

import android.databinding.ViewDataBinding;
import android.support.v7.widget.RecyclerView;

/**
 * Created by huan on 2017/11/13 14:06.
 */

public class BindingViewHolder<T extends ViewDataBinding>
        extends RecyclerView.ViewHolder {
    private T mBinding;

    public BindingViewHolder(T binding) {
        super(binding.getRoot());
        mBinding = binding;
    }

    public T getmBinding() {
        return mBinding;
    }
}
