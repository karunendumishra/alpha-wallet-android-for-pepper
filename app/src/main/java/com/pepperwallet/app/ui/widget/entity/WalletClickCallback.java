package com.pepperwallet.app.ui.widget.entity;

import com.pepperwallet.app.entity.Wallet;

/**
 * Created by James on 21/07/2019.
 * Stormbird in Sydney
 */
public interface WalletClickCallback
{
    void onWalletClicked(Wallet wallet);
    void ensAvatar(Wallet wallet);
}
