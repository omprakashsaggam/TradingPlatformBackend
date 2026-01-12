package com.coinTrade.service;

import com.coinTrade.model.Coin;
import com.coinTrade.model.User;
import com.coinTrade.model.Watchlist;

public interface WatchlistService {

    Watchlist findUserWatchlist(Long userId) throws Exception;

    Watchlist createWatchList(User user);

    Watchlist findById(Long id) throws Exception;

    Coin addItemToWatchlist(Coin coin,User user) throws Exception;
}
