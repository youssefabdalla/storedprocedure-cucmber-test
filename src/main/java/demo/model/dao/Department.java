package demo.model.dao;

public class Department {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column DBUSER.DEPT.DEPTNO
     *
     * @mbg.generated Mon Nov 06 13:15:56 GMT 2017
     */
    private Short DEPTNO;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column DBUSER.DEPT.DNAME
     *
     * @mbg.generated Mon Nov 06 13:15:56 GMT 2017
     */
    private String DNAME;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column DBUSER.DEPT.LOC
     *
     * @mbg.generated Mon Nov 06 13:15:56 GMT 2017
     */
    private String LOC;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column DBUSER.DEPT.DEPTNO
     *
     * @return the value of DBUSER.DEPT.DEPTNO
     *
     * @mbg.generated Mon Nov 06 13:15:56 GMT 2017
     */
    public Short getDEPTNO() {
        return DEPTNO;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column DBUSER.DEPT.DEPTNO
     *
     * @param DEPTNO the value for DBUSER.DEPT.DEPTNO
     *
     * @mbg.generated Mon Nov 06 13:15:56 GMT 2017
     */
    public void setDEPTNO(Short DEPTNO) {
        this.DEPTNO = DEPTNO;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column DBUSER.DEPT.DNAME
     *
     * @return the value of DBUSER.DEPT.DNAME
     *
     * @mbg.generated Mon Nov 06 13:15:56 GMT 2017
     */
    public String getDNAME() {
        return DNAME;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column DBUSER.DEPT.DNAME
     *
     * @param DNAME the value for DBUSER.DEPT.DNAME
     *
     * @mbg.generated Mon Nov 06 13:15:56 GMT 2017
     */
    public void setDNAME(String DNAME) {
        this.DNAME = DNAME == null ? null : DNAME.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column DBUSER.DEPT.LOC
     *
     * @return the value of DBUSER.DEPT.LOC
     *
     * @mbg.generated Mon Nov 06 13:15:56 GMT 2017
     */
    public String getLOC() {
        return LOC;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column DBUSER.DEPT.LOC
     *
     * @param LOC the value for DBUSER.DEPT.LOC
     *
     * @mbg.generated Mon Nov 06 13:15:56 GMT 2017
     */
    public void setLOC(String LOC) {
        this.LOC = LOC == null ? null : LOC.trim();
    }
}