package cn.xwrc.xwrc.pojo;

public class Resume {
    /** 简历表主键id */
    private Integer id;

    /** 用户表id */
    private Integer uid;

    /** 求职意向 */
    private String qzyx;

    /** 自我评价 */
    private String zwpj;

    /** 简历名称 */
    private String jlmc;

    /** 求职类型 */
    private String qzlx;

    /** 联系方式 */
    private String lxfs;

    /** 期望待遇 */
    private Integer qwdy;

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

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public String getQzyx() {
        return qzyx;
    }

    public void setQzyx(String qzyx) {
        this.qzyx = qzyx == null ? null : qzyx.trim();
    }

    public String getZwpj() {
        return zwpj;
    }

    public void setZwpj(String zwpj) {
        this.zwpj = zwpj == null ? null : zwpj.trim();
    }

    public String getJlmc() {
        return jlmc;
    }

    public void setJlmc(String jlmc) {
        this.jlmc = jlmc == null ? null : jlmc.trim();
    }

    public String getQzlx() {
        return qzlx;
    }

    public void setQzlx(String qzlx) {
        this.qzlx = qzlx == null ? null : qzlx.trim();
    }

    public String getLxfs() {
        return lxfs;
    }

    public void setLxfs(String lxfs) {
        this.lxfs = lxfs == null ? null : lxfs.trim();
    }

    public Integer getQwdy() {
        return qwdy;
    }

    public void setQwdy(Integer qwdy) {
        this.qwdy = qwdy;
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