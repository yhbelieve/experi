package cn.xwrc.xwrc.pojo;

public class Jobs {
    /** 岗位信息表主键 */
    private Integer id;

    /** 公司表主键 */
    private Integer cid;

    /** 职位名称 */
    private String zwmc;

    /** 职位类别，自定义的类型 */
    private Integer zwlb;

    /** 职位类型，自定义 */
    private Integer zwlx;

    /** 月薪 */
    private Integer yx;

    /** 人数 */
    private Integer rs;

    /** 学历要求 */
    private String xlyq;

    /** 工作年限 */
    private Integer gznx;

    /** 是否删除 */
    private Integer delete;

    /** 创建时间 */
    private String createtime;

    /** 更新时间 */
    private String upadtetime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getCid() {
        return cid;
    }

    public void setCid(Integer cid) {
        this.cid = cid;
    }

    public String getZwmc() {
        return zwmc;
    }

    public void setZwmc(String zwmc) {
        this.zwmc = zwmc == null ? null : zwmc.trim();
    }

    public Integer getZwlb() {
        return zwlb;
    }

    public void setZwlb(Integer zwlb) {
        this.zwlb = zwlb;
    }

    public Integer getZwlx() {
        return zwlx;
    }

    public void setZwlx(Integer zwlx) {
        this.zwlx = zwlx;
    }

    public Integer getYx() {
        return yx;
    }

    public void setYx(Integer yx) {
        this.yx = yx;
    }

    public Integer getRs() {
        return rs;
    }

    public void setRs(Integer rs) {
        this.rs = rs;
    }

    public String getXlyq() {
        return xlyq;
    }

    public void setXlyq(String xlyq) {
        this.xlyq = xlyq == null ? null : xlyq.trim();
    }

    public Integer getGznx() {
        return gznx;
    }

    public void setGznx(Integer gznx) {
        this.gznx = gznx;
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

    public String getUpadtetime() {
        return upadtetime;
    }

    public void setUpadtetime(String upadtetime) {
        this.upadtetime = upadtetime == null ? null : upadtetime.trim();
    }
}