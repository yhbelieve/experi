package cn.xwrc.xwrc.pojo;

public class JobsWithBLOBs extends Jobs {
    /** 工作地址 */
    private String gzdz;

    /** 职位描述 */
    private String zwms;

    /** 待遇 */
    private String dy;

    /** 联系方式 */
    private String lxfs;

    public String getGzdz() {
        return gzdz;
    }

    public void setGzdz(String gzdz) {
        this.gzdz = gzdz == null ? null : gzdz.trim();
    }

    public String getZwms() {
        return zwms;
    }

    public void setZwms(String zwms) {
        this.zwms = zwms == null ? null : zwms.trim();
    }

    public String getDy() {
        return dy;
    }

    public void setDy(String dy) {
        this.dy = dy == null ? null : dy.trim();
    }

    public String getLxfs() {
        return lxfs;
    }

    public void setLxfs(String lxfs) {
        this.lxfs = lxfs == null ? null : lxfs.trim();
    }
}