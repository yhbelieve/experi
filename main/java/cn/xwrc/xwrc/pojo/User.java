package cn.xwrc.xwrc.pojo;

public class User {
    /** 普通用户表id */
    private Integer id;

    /** 账号 */
    private String account;

    /** 密码 */
    private String password;

    /** 姓名 */
    private String name;

    /** 性别 */
    private String sex;

    /** 年龄 */
    private Integer age;

    /** 籍贯 */
    private String jg;

    /** 工作经验 */
    private String gzjy;

    /** 居住地 */
    private String jzd;

    /** 学历 */
    private String xl;

    /** 手机号 */
    private String sjh;

    /** 身份证 */
    private String sfz;

    /** 邮箱 */
    private String yx;

    /** 现任公司 */
    private String xrgs;

    /** 创建时间 */
    private String createtime;

    /** 更新时间 */
    private String updatetime;

    /** 删除 */
    private Integer delete;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account == null ? null : account.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex == null ? null : sex.trim();
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getJg() {
        return jg;
    }

    public void setJg(String jg) {
        this.jg = jg == null ? null : jg.trim();
    }

    public String getGzjy() {
        return gzjy;
    }

    public void setGzjy(String gzjy) {
        this.gzjy = gzjy == null ? null : gzjy.trim();
    }

    public String getJzd() {
        return jzd;
    }

    public void setJzd(String jzd) {
        this.jzd = jzd == null ? null : jzd.trim();
    }

    public String getXl() {
        return xl;
    }

    public void setXl(String xl) {
        this.xl = xl == null ? null : xl.trim();
    }

    public String getSjh() {
        return sjh;
    }

    public void setSjh(String sjh) {
        this.sjh = sjh == null ? null : sjh.trim();
    }

    public String getSfz() {
        return sfz;
    }

    public void setSfz(String sfz) {
        this.sfz = sfz == null ? null : sfz.trim();
    }

    public String getYx() {
        return yx;
    }

    public void setYx(String yx) {
        this.yx = yx == null ? null : yx.trim();
    }

    public String getXrgs() {
        return xrgs;
    }

    public void setXrgs(String xrgs) {
        this.xrgs = xrgs == null ? null : xrgs.trim();
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

    public Integer getDelete() {
        return delete;
    }

    public void setDelete(Integer delete) {
        this.delete = delete;
    }
}