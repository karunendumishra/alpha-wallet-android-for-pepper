package com.pepperwallet.app.entity.tokenscript;

public interface TokenScriptRenderCallback
{
    void callToJSComplete(String function, String result);
}
