package com.coinTrade.service;

import com.coinTrade.model.CoinDTO;
import com.coinTrade.response.ApiResponse;

public interface ChatBotService {
    ApiResponse getCoinDetails(String coinName);

    CoinDTO getCoinByName(String coinName);

    String simpleChat(String prompt);
}
