package cn.xwrc.xwrc.pojo;

public class Apply {
    /** 求职表主键 */
    private Integer id;

    /** 简历表id */
    private Integer rid;

    /** 岗位表id */
    private Integer jid;

    /** 是否删除 */
    private Integer delete;

    /** 创建时间 */
    private String createtime;

    /** 更新时间 */
    private String updatetime;

    /** 面试邀请 */
    private Integer msyq;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getRid() {
        return rid;
    }

    public void setRid(Integer rid) {
        this.rid = rid;
    }

    public Integer getJid() {
        return jid;
    }

    public void setJid(Integer jid) {
        this.jid = jid;
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

    public Integer getMsyq() {
        return msyq;
    }

    public void setMsyq(Integer msyq) {
        this.msyq = msyq;
    }
}