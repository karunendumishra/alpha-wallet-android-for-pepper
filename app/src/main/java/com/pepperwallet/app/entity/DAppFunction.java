package com.pepperwallet.app.entity;

import com.pepperwallet.token.entity.Signable;

public interface DAppFunction
{
    void DAppError(Throwable error, Signable message);
    void DAppReturn(byte[] data, Signable message);
}
