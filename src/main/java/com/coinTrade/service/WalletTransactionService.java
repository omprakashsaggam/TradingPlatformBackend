package com.coinTrade.service;

import com.coinTrade.domain.WalletTransactionType;
import com.coinTrade.model.Wallet;
import com.coinTrade.model.WalletTransaction;

import java.util.List;

public interface WalletTransactionService {
    WalletTransaction createTransaction(Wallet wallet,
                                        WalletTransactionType type,
                                        String transferId,
                                        String purpose,
                                        Long amount
    );

    List<WalletTransaction> getTransactions(Wallet wallet, WalletTransactionType type);

}
