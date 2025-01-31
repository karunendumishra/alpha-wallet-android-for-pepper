package com.pepperwallet.app.ui.widget.entity;

import com.pepperwallet.app.entity.tokendata.TokenGroup;
import com.pepperwallet.app.ui.widget.holder.ChainNameHeaderHolder;

/**
 * Created by JB on 10/01/2022.
 */
public class ChainItem extends SortedItem<Long> {

    public static long CHAIN_ITEM_WEIGHT = 2;

    public ChainItem(Long networkId, TokenGroup group) {
        super(ChainNameHeaderHolder.VIEW_TYPE, networkId, new TokenPosition(group, networkId, CHAIN_ITEM_WEIGHT));
    }

    @Override
    public boolean areContentsTheSame(SortedItem other) {
        return true;
    }

    @Override
    public boolean areItemsTheSame(SortedItem other) {
        return other.weight.weighting == weight.weighting && other.weight.group == weight.group;
    }
}
