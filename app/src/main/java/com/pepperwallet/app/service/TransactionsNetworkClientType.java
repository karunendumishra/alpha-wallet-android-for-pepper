package com.pepperwallet.app.service;

import com.pepperwallet.app.entity.NetworkInfo;
import com.pepperwallet.app.entity.Transaction;
import com.pepperwallet.app.entity.TransactionMeta;

import io.reactivex.Single;

public interface TransactionsNetworkClientType {
    Single<Transaction[]> storeNewTransactions(TokensService svs, NetworkInfo networkInfo, String tokenAddress, long lastBlock);
    Single<TransactionMeta[]> fetchMoreTransactions(TokensService svs, NetworkInfo network, long lastTxTime);
    Single<Integer> readTransfers(String currentAddress, NetworkInfo networkByChain, TokensService tokensService, boolean nftCheck);
    void checkRequiresAuxReset(String walletAddr);
}
