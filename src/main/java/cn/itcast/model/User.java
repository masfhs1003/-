package cn.itcast.model;

/**
 * @Author 方海生
 * @Date 2/1/2018 9:31 PM
 */
public class User {
   private Integer uid;
   private String username;
   private Integer userage;

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Integer getUserage() {
        return userage;
    }

    public void setUserage(Integer userage) {
        this.userage = userage;
    }
}
