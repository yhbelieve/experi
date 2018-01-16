package cn.xwrc.xwrc.pojo;

public class ResumeWithBLOBs extends Resume {
    /** 工作经验 */
    private String gzjy;

    /** 教育经验 */
    private String jyjy;

    public String getGzjy() {
        return gzjy;
    }

    public void setGzjy(String gzjy) {
        this.gzjy = gzjy == null ? null : gzjy.trim();
    }

    public String getJyjy() {
        return jyjy;
    }

    public void setJyjy(String jyjy) {
        this.jyjy = jyjy == null ? null : jyjy.trim();
    }
}