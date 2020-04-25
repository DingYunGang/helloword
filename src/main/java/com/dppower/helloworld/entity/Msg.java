package com.dppower.helloworld.entity;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * 通用的返回的类
 *
 * @author lfy
 *
 */
public class Msg {
    //状态码   100-成功    200-失败
    private int code;
    //提示信息
    private String msg;

    private String FirstName;

    //用户要返回给浏览器的数据
    private Map<String, Object> extend = new HashMap<String, Object>();

    public static Msg success(){
        Msg result = new Msg();
        result.setCode(100);
        result.setMsg("处理成功！");
        return result;
    }

    public static Msg fail(){
        Msg result = new Msg();
        result.setCode(200);
        result.setMsg("处理失败！");
        return result;
    }

    public Msg add(String key,Object value){
        this.getExtend().put(key, value);
        return this;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setFirstName(String FirstName) {
        this.FirstName = FirstName;
    }

    public String getFirstName() {
        return FirstName;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }


    public Map<String, Object> getExtend() {
        return extend;
    }

    public void setExtend(Map<String, Object> extend) {
        this.extend = extend;
    }


    public static class Customer {
        private Short customer_id;

        private Byte storeId;

        private String first_name;

        private String last_name;

        private String email;

        private Short address_id;

        private Boolean active;

        @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss",timezone="GMT+8")
        private Date createDate;

        @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss",timezone="GMT+8")
        private Date last_update;


        private String address;

        public Short getCustomerId() {
            return customer_id;
        }

        public void setCustomerId(Short customerId) {
            this.customer_id = customerId;
        }

        public Byte getStoreId() {
            return storeId;
        }

        public void setStoreId(Byte storeId) {
            this.storeId = storeId;
        }

        public String getFirstName() {
            return first_name;
        }

        public void setFirstName(String first_name) {
            this.first_name = first_name == null ? null : first_name.trim();
        }

        public String getLastName() {
            return last_name;
        }

        public void setLastName(String last_name) {
            this.last_name = last_name == null ? null : last_name.trim();
        }

        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            this.email = email == null ? null : email.trim();
        }

        public Short getAddressId() {
            return address_id;
        }

        public void setAddressId(Short addressId) {
            this.address_id = addressId;
        }

        public Boolean getActive() {
            return active;
        }

        public void setActive(Boolean active) {
            this.active = active;
        }

        public Date getCreateDate() {
            return createDate;
        }

        public void setCreateDate(Date createDate) {
            this.createDate = createDate;
        }

        public Date getLastUpdate() {
            return last_update;
        }

        public void setLastUpdate(Date lastUpdate) {
            this.last_update = lastUpdate;
        }

        public String getAddress() {
            return address;
        }

        public void setAddress(String address) {
            this.address = address;
        }
    }
}

