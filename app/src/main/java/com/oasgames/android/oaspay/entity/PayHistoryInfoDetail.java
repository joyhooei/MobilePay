package com.oasgames.android.oaspay.entity;

import java.io.Serializable;

/**
 * 支付历史记录详细信息
 * @author xdb
 *
 */
public class PayHistoryInfoDetail implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1598605839985469091L;
	
	public String oas_orderid;		//OAS订单id
	public String pay_way;				//支付渠道
	public String pay_way_sub;			//子支付渠道
	public String amount;		//价格
	public String currency;				//货币
	public String game_coins;			//游戏币
	public String send_time;		//时间
	public String rewards;		//赠送游戏币
	public void setOas_orderid(String oas_orderid) {
		this.oas_orderid = oas_orderid;
	}
	public void setPay_way(String pay_way) {
		this.pay_way = pay_way;
	}
	public void setPay_way_sub(String pay_way_sub) {
		this.pay_way_sub = pay_way_sub;
	}
	public void setAmount(String amount) {
		this.amount = amount;
	}
	public void setCurrency(String currency) {
		this.currency = currency;
	}
	public void setGame_coins(String game_coins) {
		this.game_coins = game_coins;
	}
	public void setSend_time(String send_time) {
		this.send_time = send_time;
	}
	public void setRewards(String rewards) {
		this.rewards = rewards;
	}
	
	
	
	
}
