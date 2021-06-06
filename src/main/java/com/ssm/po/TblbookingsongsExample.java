package com.ssm.po;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TblbookingsongsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;
	protected Integer pageStart;
    
    protected Integer pageSize;

    public Integer getPageStart() {
		return pageStart;
	}

	public void setPageStart(Integer pageStart) {
		this.pageStart = pageStart;
	}

	public Integer getPageSize() {
		return pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}
    public TblbookingsongsExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(String value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(String value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(String value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(String value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(String value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(String value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLike(String value) {
            addCriterion("id like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotLike(String value) {
            addCriterion("id not like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<String> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<String> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(String value1, String value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(String value1, String value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andColsongidIsNull() {
            addCriterion("colsongid is null");
            return (Criteria) this;
        }

        public Criteria andColsongidIsNotNull() {
            addCriterion("colsongid is not null");
            return (Criteria) this;
        }

        public Criteria andColsongidEqualTo(String value) {
            addCriterion("colsongid =", value, "colsongid");
            return (Criteria) this;
        }

        public Criteria andColsongidNotEqualTo(String value) {
            addCriterion("colsongid <>", value, "colsongid");
            return (Criteria) this;
        }

        public Criteria andColsongidGreaterThan(String value) {
            addCriterion("colsongid >", value, "colsongid");
            return (Criteria) this;
        }

        public Criteria andColsongidGreaterThanOrEqualTo(String value) {
            addCriterion("colsongid >=", value, "colsongid");
            return (Criteria) this;
        }

        public Criteria andColsongidLessThan(String value) {
            addCriterion("colsongid <", value, "colsongid");
            return (Criteria) this;
        }

        public Criteria andColsongidLessThanOrEqualTo(String value) {
            addCriterion("colsongid <=", value, "colsongid");
            return (Criteria) this;
        }

        public Criteria andColsongidLike(String value) {
            addCriterion("colsongid like", value, "colsongid");
            return (Criteria) this;
        }

        public Criteria andColsongidNotLike(String value) {
            addCriterion("colsongid not like", value, "colsongid");
            return (Criteria) this;
        }

        public Criteria andColsongidIn(List<String> values) {
            addCriterion("colsongid in", values, "colsongid");
            return (Criteria) this;
        }

        public Criteria andColsongidNotIn(List<String> values) {
            addCriterion("colsongid not in", values, "colsongid");
            return (Criteria) this;
        }

        public Criteria andColsongidBetween(String value1, String value2) {
            addCriterion("colsongid between", value1, value2, "colsongid");
            return (Criteria) this;
        }

        public Criteria andColsongidNotBetween(String value1, String value2) {
            addCriterion("colsongid not between", value1, value2, "colsongid");
            return (Criteria) this;
        }

        public Criteria andColsongnameIsNull() {
            addCriterion("colsongname is null");
            return (Criteria) this;
        }

        public Criteria andColsongnameIsNotNull() {
            addCriterion("colsongname is not null");
            return (Criteria) this;
        }

        public Criteria andColsongnameEqualTo(String value) {
            addCriterion("colsongname =", value, "colsongname");
            return (Criteria) this;
        }

        public Criteria andColsongnameNotEqualTo(String value) {
            addCriterion("colsongname <>", value, "colsongname");
            return (Criteria) this;
        }

        public Criteria andColsongnameGreaterThan(String value) {
            addCriterion("colsongname >", value, "colsongname");
            return (Criteria) this;
        }

        public Criteria andColsongnameGreaterThanOrEqualTo(String value) {
            addCriterion("colsongname >=", value, "colsongname");
            return (Criteria) this;
        }

        public Criteria andColsongnameLessThan(String value) {
            addCriterion("colsongname <", value, "colsongname");
            return (Criteria) this;
        }

        public Criteria andColsongnameLessThanOrEqualTo(String value) {
            addCriterion("colsongname <=", value, "colsongname");
            return (Criteria) this;
        }

        public Criteria andColsongnameLike(String value) {
            addCriterion("colsongname like", value, "colsongname");
            return (Criteria) this;
        }

        public Criteria andColsongnameNotLike(String value) {
            addCriterion("colsongname not like", value, "colsongname");
            return (Criteria) this;
        }

        public Criteria andColsongnameIn(List<String> values) {
            addCriterion("colsongname in", values, "colsongname");
            return (Criteria) this;
        }

        public Criteria andColsongnameNotIn(List<String> values) {
            addCriterion("colsongname not in", values, "colsongname");
            return (Criteria) this;
        }

        public Criteria andColsongnameBetween(String value1, String value2) {
            addCriterion("colsongname between", value1, value2, "colsongname");
            return (Criteria) this;
        }

        public Criteria andColsongnameNotBetween(String value1, String value2) {
            addCriterion("colsongname not between", value1, value2, "colsongname");
            return (Criteria) this;
        }

        public Criteria andColapptimeIsNull() {
            addCriterion("colapptime is null");
            return (Criteria) this;
        }

        public Criteria andColapptimeIsNotNull() {
            addCriterion("colapptime is not null");
            return (Criteria) this;
        }

        public Criteria andColapptimeEqualTo(String value) {
            addCriterion("colapptime =", value, "colapptime");
            return (Criteria) this;
        }

        public Criteria andColapptimeNotEqualTo(String value) {
            addCriterion("colapptime <>", value, "colapptime");
            return (Criteria) this;
        }

        public Criteria andColapptimeGreaterThan(String value) {
            addCriterion("colapptime >", value, "colapptime");
            return (Criteria) this;
        }

        public Criteria andColapptimeGreaterThanOrEqualTo(String value) {
            addCriterion("colapptime >=", value, "colapptime");
            return (Criteria) this;
        }

        public Criteria andColapptimeLessThan(String value) {
            addCriterion("colapptime <", value, "colapptime");
            return (Criteria) this;
        }

        public Criteria andColapptimeLessThanOrEqualTo(String value) {
            addCriterion("colapptime <=", value, "colapptime");
            return (Criteria) this;
        }

        public Criteria andColapptimeLike(String value) {
            addCriterion("colapptime like", value, "colapptime");
            return (Criteria) this;
        }

        public Criteria andColapptimeNotLike(String value) {
            addCriterion("colapptime not like", value, "colapptime");
            return (Criteria) this;
        }

        public Criteria andColapptimeIn(List<String> values) {
            addCriterion("colapptime in", values, "colapptime");
            return (Criteria) this;
        }

        public Criteria andColapptimeNotIn(List<String> values) {
            addCriterion("colapptime not in", values, "colapptime");
            return (Criteria) this;
        }

        public Criteria andColapptimeBetween(String value1, String value2) {
            addCriterion("colapptime between", value1, value2, "colapptime");
            return (Criteria) this;
        }

        public Criteria andColapptimeNotBetween(String value1, String value2) {
            addCriterion("colapptime not between", value1, value2, "colapptime");
            return (Criteria) this;
        }

        public Criteria andColtypeIsNull() {
            addCriterion("coltype is null");
            return (Criteria) this;
        }

        public Criteria andColtypeIsNotNull() {
            addCriterion("coltype is not null");
            return (Criteria) this;
        }

        public Criteria andColtypeEqualTo(String value) {
            addCriterion("coltype =", value, "coltype");
            return (Criteria) this;
        }

        public Criteria andColtypeNotEqualTo(String value) {
            addCriterion("coltype <>", value, "coltype");
            return (Criteria) this;
        }

        public Criteria andColtypeGreaterThan(String value) {
            addCriterion("coltype >", value, "coltype");
            return (Criteria) this;
        }

        public Criteria andColtypeGreaterThanOrEqualTo(String value) {
            addCriterion("coltype >=", value, "coltype");
            return (Criteria) this;
        }

        public Criteria andColtypeLessThan(String value) {
            addCriterion("coltype <", value, "coltype");
            return (Criteria) this;
        }

        public Criteria andColtypeLessThanOrEqualTo(String value) {
            addCriterion("coltype <=", value, "coltype");
            return (Criteria) this;
        }

        public Criteria andColtypeLike(String value) {
            addCriterion("coltype like", value, "coltype");
            return (Criteria) this;
        }

        public Criteria andColtypeNotLike(String value) {
            addCriterion("coltype not like", value, "coltype");
            return (Criteria) this;
        }

        public Criteria andColtypeIn(List<String> values) {
            addCriterion("coltype in", values, "coltype");
            return (Criteria) this;
        }

        public Criteria andColtypeNotIn(List<String> values) {
            addCriterion("coltype not in", values, "coltype");
            return (Criteria) this;
        }

        public Criteria andColtypeBetween(String value1, String value2) {
            addCriterion("coltype between", value1, value2, "coltype");
            return (Criteria) this;
        }

        public Criteria andColtypeNotBetween(String value1, String value2) {
            addCriterion("coltype not between", value1, value2, "coltype");
            return (Criteria) this;
        }

        public Criteria andColresultIsNull() {
            addCriterion("colresult is null");
            return (Criteria) this;
        }

        public Criteria andColresultIsNotNull() {
            addCriterion("colresult is not null");
            return (Criteria) this;
        }

        public Criteria andColresultEqualTo(String value) {
            addCriterion("colresult =", value, "colresult");
            return (Criteria) this;
        }

        public Criteria andColresultNotEqualTo(String value) {
            addCriterion("colresult <>", value, "colresult");
            return (Criteria) this;
        }

        public Criteria andColresultGreaterThan(String value) {
            addCriterion("colresult >", value, "colresult");
            return (Criteria) this;
        }

        public Criteria andColresultGreaterThanOrEqualTo(String value) {
            addCriterion("colresult >=", value, "colresult");
            return (Criteria) this;
        }

        public Criteria andColresultLessThan(String value) {
            addCriterion("colresult <", value, "colresult");
            return (Criteria) this;
        }

        public Criteria andColresultLessThanOrEqualTo(String value) {
            addCriterion("colresult <=", value, "colresult");
            return (Criteria) this;
        }

        public Criteria andColresultLike(String value) {
            addCriterion("colresult like", value, "colresult");
            return (Criteria) this;
        }

        public Criteria andColresultNotLike(String value) {
            addCriterion("colresult not like", value, "colresult");
            return (Criteria) this;
        }

        public Criteria andColresultIn(List<String> values) {
            addCriterion("colresult in", values, "colresult");
            return (Criteria) this;
        }

        public Criteria andColresultNotIn(List<String> values) {
            addCriterion("colresult not in", values, "colresult");
            return (Criteria) this;
        }

        public Criteria andColresultBetween(String value1, String value2) {
            addCriterion("colresult between", value1, value2, "colresult");
            return (Criteria) this;
        }

        public Criteria andColresultNotBetween(String value1, String value2) {
            addCriterion("colresult not between", value1, value2, "colresult");
            return (Criteria) this;
        }

        public Criteria andUseridIsNull() {
            addCriterion("userid is null");
            return (Criteria) this;
        }

        public Criteria andUseridIsNotNull() {
            addCriterion("userid is not null");
            return (Criteria) this;
        }

        public Criteria andUseridEqualTo(String value) {
            addCriterion("userid =", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotEqualTo(String value) {
            addCriterion("userid <>", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridGreaterThan(String value) {
            addCriterion("userid >", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridGreaterThanOrEqualTo(String value) {
            addCriterion("userid >=", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLessThan(String value) {
            addCriterion("userid <", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLessThanOrEqualTo(String value) {
            addCriterion("userid <=", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLike(String value) {
            addCriterion("userid like", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotLike(String value) {
            addCriterion("userid not like", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridIn(List<String> values) {
            addCriterion("userid in", values, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotIn(List<String> values) {
            addCriterion("userid not in", values, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridBetween(String value1, String value2) {
            addCriterion("userid between", value1, value2, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotBetween(String value1, String value2) {
            addCriterion("userid not between", value1, value2, "userid");
            return (Criteria) this;
        }

        public Criteria andUsernameIsNull() {
            addCriterion("username is null");
            return (Criteria) this;
        }

        public Criteria andUsernameIsNotNull() {
            addCriterion("username is not null");
            return (Criteria) this;
        }

        public Criteria andUsernameEqualTo(String value) {
            addCriterion("username =", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotEqualTo(String value) {
            addCriterion("username <>", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameGreaterThan(String value) {
            addCriterion("username >", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameGreaterThanOrEqualTo(String value) {
            addCriterion("username >=", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLessThan(String value) {
            addCriterion("username <", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLessThanOrEqualTo(String value) {
            addCriterion("username <=", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLike(String value) {
            addCriterion("username like", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotLike(String value) {
            addCriterion("username not like", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameIn(List<String> values) {
            addCriterion("username in", values, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotIn(List<String> values) {
            addCriterion("username not in", values, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameBetween(String value1, String value2) {
            addCriterion("username between", value1, value2, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotBetween(String value1, String value2) {
            addCriterion("username not between", value1, value2, "username");
            return (Criteria) this;
        }

        public Criteria andDatestrIsNull() {
            addCriterion("datestr is null");
            return (Criteria) this;
        }

        public Criteria andDatestrIsNotNull() {
            addCriterion("datestr is not null");
            return (Criteria) this;
        }

        public Criteria andDatestrEqualTo(String value) {
            addCriterion("datestr =", value, "datestr");
            return (Criteria) this;
        }

        public Criteria andDatestrNotEqualTo(String value) {
            addCriterion("datestr <>", value, "datestr");
            return (Criteria) this;
        }

        public Criteria andDatestrGreaterThan(String value) {
            addCriterion("datestr >", value, "datestr");
            return (Criteria) this;
        }

        public Criteria andDatestrGreaterThanOrEqualTo(String value) {
            addCriterion("datestr >=", value, "datestr");
            return (Criteria) this;
        }

        public Criteria andDatestrLessThan(String value) {
            addCriterion("datestr <", value, "datestr");
            return (Criteria) this;
        }

        public Criteria andDatestrLessThanOrEqualTo(String value) {
            addCriterion("datestr <=", value, "datestr");
            return (Criteria) this;
        }

        public Criteria andDatestrLike(String value) {
            addCriterion("datestr like", value, "datestr");
            return (Criteria) this;
        }

        public Criteria andDatestrNotLike(String value) {
            addCriterion("datestr not like", value, "datestr");
            return (Criteria) this;
        }

        public Criteria andDatestrIn(List<String> values) {
            addCriterion("datestr in", values, "datestr");
            return (Criteria) this;
        }

        public Criteria andDatestrNotIn(List<String> values) {
            addCriterion("datestr not in", values, "datestr");
            return (Criteria) this;
        }

        public Criteria andDatestrBetween(String value1, String value2) {
            addCriterion("datestr between", value1, value2, "datestr");
            return (Criteria) this;
        }

        public Criteria andDatestrNotBetween(String value1, String value2) {
            addCriterion("datestr not between", value1, value2, "datestr");
            return (Criteria) this;
        }

        public Criteria andCreateuseridIsNull() {
            addCriterion("createuserid is null");
            return (Criteria) this;
        }

        public Criteria andCreateuseridIsNotNull() {
            addCriterion("createuserid is not null");
            return (Criteria) this;
        }

        public Criteria andCreateuseridEqualTo(String value) {
            addCriterion("createuserid =", value, "createuserid");
            return (Criteria) this;
        }

        public Criteria andCreateuseridNotEqualTo(String value) {
            addCriterion("createuserid <>", value, "createuserid");
            return (Criteria) this;
        }

        public Criteria andCreateuseridGreaterThan(String value) {
            addCriterion("createuserid >", value, "createuserid");
            return (Criteria) this;
        }

        public Criteria andCreateuseridGreaterThanOrEqualTo(String value) {
            addCriterion("createuserid >=", value, "createuserid");
            return (Criteria) this;
        }

        public Criteria andCreateuseridLessThan(String value) {
            addCriterion("createuserid <", value, "createuserid");
            return (Criteria) this;
        }

        public Criteria andCreateuseridLessThanOrEqualTo(String value) {
            addCriterion("createuserid <=", value, "createuserid");
            return (Criteria) this;
        }

        public Criteria andCreateuseridLike(String value) {
            addCriterion("createuserid like", value, "createuserid");
            return (Criteria) this;
        }

        public Criteria andCreateuseridNotLike(String value) {
            addCriterion("createuserid not like", value, "createuserid");
            return (Criteria) this;
        }

        public Criteria andCreateuseridIn(List<String> values) {
            addCriterion("createuserid in", values, "createuserid");
            return (Criteria) this;
        }

        public Criteria andCreateuseridNotIn(List<String> values) {
            addCriterion("createuserid not in", values, "createuserid");
            return (Criteria) this;
        }

        public Criteria andCreateuseridBetween(String value1, String value2) {
            addCriterion("createuserid between", value1, value2, "createuserid");
            return (Criteria) this;
        }

        public Criteria andCreateuseridNotBetween(String value1, String value2) {
            addCriterion("createuserid not between", value1, value2, "createuserid");
            return (Criteria) this;
        }

        public Criteria andCreateusernameIsNull() {
            addCriterion("createusername is null");
            return (Criteria) this;
        }

        public Criteria andCreateusernameIsNotNull() {
            addCriterion("createusername is not null");
            return (Criteria) this;
        }

        public Criteria andCreateusernameEqualTo(String value) {
            addCriterion("createusername =", value, "createusername");
            return (Criteria) this;
        }

        public Criteria andCreateusernameNotEqualTo(String value) {
            addCriterion("createusername <>", value, "createusername");
            return (Criteria) this;
        }

        public Criteria andCreateusernameGreaterThan(String value) {
            addCriterion("createusername >", value, "createusername");
            return (Criteria) this;
        }

        public Criteria andCreateusernameGreaterThanOrEqualTo(String value) {
            addCriterion("createusername >=", value, "createusername");
            return (Criteria) this;
        }

        public Criteria andCreateusernameLessThan(String value) {
            addCriterion("createusername <", value, "createusername");
            return (Criteria) this;
        }

        public Criteria andCreateusernameLessThanOrEqualTo(String value) {
            addCriterion("createusername <=", value, "createusername");
            return (Criteria) this;
        }

        public Criteria andCreateusernameLike(String value) {
            addCriterion("createusername like", value, "createusername");
            return (Criteria) this;
        }

        public Criteria andCreateusernameNotLike(String value) {
            addCriterion("createusername not like", value, "createusername");
            return (Criteria) this;
        }

        public Criteria andCreateusernameIn(List<String> values) {
            addCriterion("createusername in", values, "createusername");
            return (Criteria) this;
        }

        public Criteria andCreateusernameNotIn(List<String> values) {
            addCriterion("createusername not in", values, "createusername");
            return (Criteria) this;
        }

        public Criteria andCreateusernameBetween(String value1, String value2) {
            addCriterion("createusername between", value1, value2, "createusername");
            return (Criteria) this;
        }

        public Criteria andCreateusernameNotBetween(String value1, String value2) {
            addCriterion("createusername not between", value1, value2, "createusername");
            return (Criteria) this;
        }

        public Criteria andCreatedateIsNull() {
            addCriterion("createdate is null");
            return (Criteria) this;
        }

        public Criteria andCreatedateIsNotNull() {
            addCriterion("createdate is not null");
            return (Criteria) this;
        }

        public Criteria andCreatedateEqualTo(Date value) {
            addCriterion("createdate =", value, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateNotEqualTo(Date value) {
            addCriterion("createdate <>", value, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateGreaterThan(Date value) {
            addCriterion("createdate >", value, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateGreaterThanOrEqualTo(Date value) {
            addCriterion("createdate >=", value, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateLessThan(Date value) {
            addCriterion("createdate <", value, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateLessThanOrEqualTo(Date value) {
            addCriterion("createdate <=", value, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateIn(List<Date> values) {
            addCriterion("createdate in", values, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateNotIn(List<Date> values) {
            addCriterion("createdate not in", values, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateBetween(Date value1, Date value2) {
            addCriterion("createdate between", value1, value2, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateNotBetween(Date value1, Date value2) {
            addCriterion("createdate not between", value1, value2, "createdate");
            return (Criteria) this;
        }

        public Criteria andBak1IsNull() {
            addCriterion("bak1 is null");
            return (Criteria) this;
        }

        public Criteria andBak1IsNotNull() {
            addCriterion("bak1 is not null");
            return (Criteria) this;
        }

        public Criteria andBak1EqualTo(String value) {
            addCriterion("bak1 =", value, "bak1");
            return (Criteria) this;
        }

        public Criteria andBak1NotEqualTo(String value) {
            addCriterion("bak1 <>", value, "bak1");
            return (Criteria) this;
        }

        public Criteria andBak1GreaterThan(String value) {
            addCriterion("bak1 >", value, "bak1");
            return (Criteria) this;
        }

        public Criteria andBak1GreaterThanOrEqualTo(String value) {
            addCriterion("bak1 >=", value, "bak1");
            return (Criteria) this;
        }

        public Criteria andBak1LessThan(String value) {
            addCriterion("bak1 <", value, "bak1");
            return (Criteria) this;
        }

        public Criteria andBak1LessThanOrEqualTo(String value) {
            addCriterion("bak1 <=", value, "bak1");
            return (Criteria) this;
        }

        public Criteria andBak1Like(String value) {
            addCriterion("bak1 like", value, "bak1");
            return (Criteria) this;
        }

        public Criteria andBak1NotLike(String value) {
            addCriterion("bak1 not like", value, "bak1");
            return (Criteria) this;
        }

        public Criteria andBak1In(List<String> values) {
            addCriterion("bak1 in", values, "bak1");
            return (Criteria) this;
        }

        public Criteria andBak1NotIn(List<String> values) {
            addCriterion("bak1 not in", values, "bak1");
            return (Criteria) this;
        }

        public Criteria andBak1Between(String value1, String value2) {
            addCriterion("bak1 between", value1, value2, "bak1");
            return (Criteria) this;
        }

        public Criteria andBak1NotBetween(String value1, String value2) {
            addCriterion("bak1 not between", value1, value2, "bak1");
            return (Criteria) this;
        }

        public Criteria andBak2IsNull() {
            addCriterion("bak2 is null");
            return (Criteria) this;
        }

        public Criteria andBak2IsNotNull() {
            addCriterion("bak2 is not null");
            return (Criteria) this;
        }

        public Criteria andBak2EqualTo(String value) {
            addCriterion("bak2 =", value, "bak2");
            return (Criteria) this;
        }

        public Criteria andBak2NotEqualTo(String value) {
            addCriterion("bak2 <>", value, "bak2");
            return (Criteria) this;
        }

        public Criteria andBak2GreaterThan(String value) {
            addCriterion("bak2 >", value, "bak2");
            return (Criteria) this;
        }

        public Criteria andBak2GreaterThanOrEqualTo(String value) {
            addCriterion("bak2 >=", value, "bak2");
            return (Criteria) this;
        }

        public Criteria andBak2LessThan(String value) {
            addCriterion("bak2 <", value, "bak2");
            return (Criteria) this;
        }

        public Criteria andBak2LessThanOrEqualTo(String value) {
            addCriterion("bak2 <=", value, "bak2");
            return (Criteria) this;
        }

        public Criteria andBak2Like(String value) {
            addCriterion("bak2 like", value, "bak2");
            return (Criteria) this;
        }

        public Criteria andBak2NotLike(String value) {
            addCriterion("bak2 not like", value, "bak2");
            return (Criteria) this;
        }

        public Criteria andBak2In(List<String> values) {
            addCriterion("bak2 in", values, "bak2");
            return (Criteria) this;
        }

        public Criteria andBak2NotIn(List<String> values) {
            addCriterion("bak2 not in", values, "bak2");
            return (Criteria) this;
        }

        public Criteria andBak2Between(String value1, String value2) {
            addCriterion("bak2 between", value1, value2, "bak2");
            return (Criteria) this;
        }

        public Criteria andBak2NotBetween(String value1, String value2) {
            addCriterion("bak2 not between", value1, value2, "bak2");
            return (Criteria) this;
        }

        public Criteria andBak3IsNull() {
            addCriterion("bak3 is null");
            return (Criteria) this;
        }

        public Criteria andBak3IsNotNull() {
            addCriterion("bak3 is not null");
            return (Criteria) this;
        }

        public Criteria andBak3EqualTo(String value) {
            addCriterion("bak3 =", value, "bak3");
            return (Criteria) this;
        }

        public Criteria andBak3NotEqualTo(String value) {
            addCriterion("bak3 <>", value, "bak3");
            return (Criteria) this;
        }

        public Criteria andBak3GreaterThan(String value) {
            addCriterion("bak3 >", value, "bak3");
            return (Criteria) this;
        }

        public Criteria andBak3GreaterThanOrEqualTo(String value) {
            addCriterion("bak3 >=", value, "bak3");
            return (Criteria) this;
        }

        public Criteria andBak3LessThan(String value) {
            addCriterion("bak3 <", value, "bak3");
            return (Criteria) this;
        }

        public Criteria andBak3LessThanOrEqualTo(String value) {
            addCriterion("bak3 <=", value, "bak3");
            return (Criteria) this;
        }

        public Criteria andBak3Like(String value) {
            addCriterion("bak3 like", value, "bak3");
            return (Criteria) this;
        }

        public Criteria andBak3NotLike(String value) {
            addCriterion("bak3 not like", value, "bak3");
            return (Criteria) this;
        }

        public Criteria andBak3In(List<String> values) {
            addCriterion("bak3 in", values, "bak3");
            return (Criteria) this;
        }

        public Criteria andBak3NotIn(List<String> values) {
            addCriterion("bak3 not in", values, "bak3");
            return (Criteria) this;
        }

        public Criteria andBak3Between(String value1, String value2) {
            addCriterion("bak3 between", value1, value2, "bak3");
            return (Criteria) this;
        }

        public Criteria andBak3NotBetween(String value1, String value2) {
            addCriterion("bak3 not between", value1, value2, "bak3");
            return (Criteria) this;
        }

        public Criteria andBak4IsNull() {
            addCriterion("bak4 is null");
            return (Criteria) this;
        }

        public Criteria andBak4IsNotNull() {
            addCriterion("bak4 is not null");
            return (Criteria) this;
        }

        public Criteria andBak4EqualTo(String value) {
            addCriterion("bak4 =", value, "bak4");
            return (Criteria) this;
        }

        public Criteria andBak4NotEqualTo(String value) {
            addCriterion("bak4 <>", value, "bak4");
            return (Criteria) this;
        }

        public Criteria andBak4GreaterThan(String value) {
            addCriterion("bak4 >", value, "bak4");
            return (Criteria) this;
        }

        public Criteria andBak4GreaterThanOrEqualTo(String value) {
            addCriterion("bak4 >=", value, "bak4");
            return (Criteria) this;
        }

        public Criteria andBak4LessThan(String value) {
            addCriterion("bak4 <", value, "bak4");
            return (Criteria) this;
        }

        public Criteria andBak4LessThanOrEqualTo(String value) {
            addCriterion("bak4 <=", value, "bak4");
            return (Criteria) this;
        }

        public Criteria andBak4Like(String value) {
            addCriterion("bak4 like", value, "bak4");
            return (Criteria) this;
        }

        public Criteria andBak4NotLike(String value) {
            addCriterion("bak4 not like", value, "bak4");
            return (Criteria) this;
        }

        public Criteria andBak4In(List<String> values) {
            addCriterion("bak4 in", values, "bak4");
            return (Criteria) this;
        }

        public Criteria andBak4NotIn(List<String> values) {
            addCriterion("bak4 not in", values, "bak4");
            return (Criteria) this;
        }

        public Criteria andBak4Between(String value1, String value2) {
            addCriterion("bak4 between", value1, value2, "bak4");
            return (Criteria) this;
        }

        public Criteria andBak4NotBetween(String value1, String value2) {
            addCriterion("bak4 not between", value1, value2, "bak4");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}