package com.pepperwallet.app.ui.widget;

import android.view.View;

import com.pepperwallet.app.entity.tokens.Token;

import java.math.BigInteger;
import java.util.List;

public interface  TokensAdapterCallback
{
    void onTokenClick(View view, Token token, List<BigInteger> tokenIds, boolean selected);
    void onLongTokenClick(View view, Token token, List<BigInteger> tokenIds);
    default void reloadTokens() { };
    default void onBuyToken() { }
    default void onSearchClicked() { };
    default void onSwitchClicked() {};
}
