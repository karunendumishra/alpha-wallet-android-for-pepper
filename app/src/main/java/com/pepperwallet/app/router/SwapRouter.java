package com.pepperwallet.app.router;


import android.app.Activity;
import android.content.Intent;

import com.pepperwallet.app.C;
import com.pepperwallet.app.entity.Wallet;
import com.pepperwallet.app.entity.tokens.Token;
import com.pepperwallet.app.ui.SwapActivity;

public class SwapRouter
{
    public void open(Activity context, Token token, Wallet wallet)
    {
        Intent intent = new Intent(context, SwapActivity.class);
        intent.putExtra(C.Key.WALLET, wallet);
        intent.putExtra(C.EXTRA_CHAIN_ID, token.tokenInfo.chainId);
        intent.putExtra(C.EXTRA_ADDRESS, token.getAddress());
        intent.setFlags(Intent.FLAG_ACTIVITY_MULTIPLE_TASK);
        context.startActivityForResult(intent, C.TOKEN_SEND_ACTIVITY);
    }
}
