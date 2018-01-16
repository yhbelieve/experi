package cn.xwrc.xwrc.pojo;

public class Compant {
    /** 主键id */
    private Integer id;

    /** 用户名 */
    private String username;

    /** 密码 */
    private String password;

    /** 账户名称 */
    private String zh;

    /** 头像 */
    private String tx;

    /** 公司名称 */
    private String gsm;

    /** 法人代表 */
    private String frdb;

    /** 公司简介 */
    private String gsjj;

    /** 是否入驻 */
    private Integer isrz;

    /** 删除 */
    private Integer delete;

    /** 创建时间 */
    private String createtime;

    /** 更新时间 */
    private String updatetime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public String getZh() {
        return zh;
    }

    public void setZh(String zh) {
        this.zh = zh == null ? null : zh.trim();
    }

    public String getTx() {
        return tx;
    }

    public void setTx(String tx) {
        this.tx = tx == null ? null : tx.trim();
    }

    public String getGsm() {
        return gsm;
    }

    public void setGsm(String gsm) {
        this.gsm = gsm == null ? null : gsm.trim();
    }

    public String getFrdb() {
        return frdb;
    }

    public void setFrdb(String frdb) {
        this.frdb = frdb == null ? null : frdb.trim();
    }

    public String getGsjj() {
        return gsjj;
    }

    public void setGsjj(String gsjj) {
        this.gsjj = gsjj == null ? null : gsjj.trim();
    }

    public Integer getIsrz() {
        return isrz;
    }

    public void setIsrz(Integer isrz) {
        this.isrz = isrz;
    }

    public Integer getDelete() {
        return delete;
    }

    public void setDelete(Integer delete) {
        this.delete = delete;
    }

    public String getCreatetime() {
        return createtime;
    }

    public void setCreatetime(String createtime) {
        this.createtime = createtime == null ? null : createtime.trim();
    }

    public String getUpdatetime() {
        return updatetime;
    }

    public void setUpdatetime(String updatetime) {
        this.updatetime = updatetime == null ? null : updatetime.trim();
    }
}