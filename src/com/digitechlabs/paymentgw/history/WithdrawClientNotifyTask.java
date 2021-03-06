/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.digitechlabs.paymentgw.history;

/**
 *
 * @author FOCUS
 */
public class WithdrawClientNotifyTask {

    private String request_id;
    private String currency;
    private String amount;
    private String to_address;
    private String max_per_day;
    private String user_id;
    private String created_at;
    private String expired_time;

    public WithdrawClientNotifyTask(String request_id, String currency, String amount, String to_address, String max_per_day, String user_id, String created_at, String expired_time) {
        this.request_id = request_id;
        this.currency = currency;
        this.amount = amount;
        this.to_address = to_address;
        this.max_per_day = max_per_day;
        this.user_id = user_id;
        this.created_at = created_at;
        this.expired_time = expired_time;
    }

    public String getRequest_id() {
        return request_id;
    }

    public void setRequest_id(String request_id) {
        this.request_id = request_id;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public String getTo_address() {
        return to_address;
    }

    public void setTo_address(String to_address) {
        this.to_address = to_address;
    }

    public String getMax_per_day() {
        return max_per_day;
    }

    public void setMax_per_day(String max_per_day) {
        this.max_per_day = max_per_day;
    }

    public String getUser_id() {
        return user_id;
    }

    public void setUser_id(String user_id) {
        this.user_id = user_id;
    }

    public String getCreated_at() {
        return created_at;
    }

    public void setCreated_at(String created_at) {
        this.created_at = created_at;
    }

    public String getExpired_time() {
        return expired_time;
    }

    public void setExpired_time(String expired_time) {
        this.expired_time = expired_time;
    }

}
