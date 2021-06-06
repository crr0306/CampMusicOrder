package com.ssm.po;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TblsongExample {
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
    public TblsongExample() {
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

        public Criteria andColnameIsNull() {
            addCriterion("colname is null");
            return (Criteria) this;
        }

        public Criteria andColnameIsNotNull() {
            addCriterion("colname is not null");
            return (Criteria) this;
        }

        public Criteria andColnameEqualTo(String value) {
            addCriterion("colname =", value, "colname");
            return (Criteria) this;
        }

        public Criteria andColnameNotEqualTo(String value) {
            addCriterion("colname <>", value, "colname");
            return (Criteria) this;
        }

        public Criteria andColnameGreaterThan(String value) {
            addCriterion("colname >", value, "colname");
            return (Criteria) this;
        }

        public Criteria andColnameGreaterThanOrEqualTo(String value) {
            addCriterion("colname >=", value, "colname");
            return (Criteria) this;
        }

        public Criteria andColnameLessThan(String value) {
            addCriterion("colname <", value, "colname");
            return (Criteria) this;
        }

        public Criteria andColnameLessThanOrEqualTo(String value) {
            addCriterion("colname <=", value, "colname");
            return (Criteria) this;
        }

        public Criteria andColnameLike(String value) {
            addCriterion("colname like", value, "colname");
            return (Criteria) this;
        }

        public Criteria andColnameNotLike(String value) {
            addCriterion("colname not like", value, "colname");
            return (Criteria) this;
        }

        public Criteria andColnameIn(List<String> values) {
            addCriterion("colname in", values, "colname");
            return (Criteria) this;
        }

        public Criteria andColnameNotIn(List<String> values) {
            addCriterion("colname not in", values, "colname");
            return (Criteria) this;
        }

        public Criteria andColnameBetween(String value1, String value2) {
            addCriterion("colname between", value1, value2, "colname");
            return (Criteria) this;
        }

        public Criteria andColnameNotBetween(String value1, String value2) {
            addCriterion("colname not between", value1, value2, "colname");
            return (Criteria) this;
        }

        public Criteria andColsingerIsNull() {
            addCriterion("colsinger is null");
            return (Criteria) this;
        }

        public Criteria andColsingerIsNotNull() {
            addCriterion("colsinger is not null");
            return (Criteria) this;
        }

        public Criteria andColsingerEqualTo(String value) {
            addCriterion("colsinger =", value, "colsinger");
            return (Criteria) this;
        }

        public Criteria andColsingerNotEqualTo(String value) {
            addCriterion("colsinger <>", value, "colsinger");
            return (Criteria) this;
        }

        public Criteria andColsingerGreaterThan(String value) {
            addCriterion("colsinger >", value, "colsinger");
            return (Criteria) this;
        }

        public Criteria andColsingerGreaterThanOrEqualTo(String value) {
            addCriterion("colsinger >=", value, "colsinger");
            return (Criteria) this;
        }

        public Criteria andColsingerLessThan(String value) {
            addCriterion("colsinger <", value, "colsinger");
            return (Criteria) this;
        }

        public Criteria andColsingerLessThanOrEqualTo(String value) {
            addCriterion("colsinger <=", value, "colsinger");
            return (Criteria) this;
        }

        public Criteria andColsingerLike(String value) {
            addCriterion("colsinger like", value, "colsinger");
            return (Criteria) this;
        }

        public Criteria andColsingerNotLike(String value) {
            addCriterion("colsinger not like", value, "colsinger");
            return (Criteria) this;
        }

        public Criteria andColsingerIn(List<String> values) {
            addCriterion("colsinger in", values, "colsinger");
            return (Criteria) this;
        }

        public Criteria andColsingerNotIn(List<String> values) {
            addCriterion("colsinger not in", values, "colsinger");
            return (Criteria) this;
        }

        public Criteria andColsingerBetween(String value1, String value2) {
            addCriterion("colsinger between", value1, value2, "colsinger");
            return (Criteria) this;
        }

        public Criteria andColsingerNotBetween(String value1, String value2) {
            addCriterion("colsinger not between", value1, value2, "colsinger");
            return (Criteria) this;
        }

        public Criteria andColcomposingwordsIsNull() {
            addCriterion("colcomposingwords is null");
            return (Criteria) this;
        }

        public Criteria andColcomposingwordsIsNotNull() {
            addCriterion("colcomposingwords is not null");
            return (Criteria) this;
        }

        public Criteria andColcomposingwordsEqualTo(String value) {
            addCriterion("colcomposingwords =", value, "colcomposingwords");
            return (Criteria) this;
        }

        public Criteria andColcomposingwordsNotEqualTo(String value) {
            addCriterion("colcomposingwords <>", value, "colcomposingwords");
            return (Criteria) this;
        }

        public Criteria andColcomposingwordsGreaterThan(String value) {
            addCriterion("colcomposingwords >", value, "colcomposingwords");
            return (Criteria) this;
        }

        public Criteria andColcomposingwordsGreaterThanOrEqualTo(String value) {
            addCriterion("colcomposingwords >=", value, "colcomposingwords");
            return (Criteria) this;
        }

        public Criteria andColcomposingwordsLessThan(String value) {
            addCriterion("colcomposingwords <", value, "colcomposingwords");
            return (Criteria) this;
        }

        public Criteria andColcomposingwordsLessThanOrEqualTo(String value) {
            addCriterion("colcomposingwords <=", value, "colcomposingwords");
            return (Criteria) this;
        }

        public Criteria andColcomposingwordsLike(String value) {
            addCriterion("colcomposingwords like", value, "colcomposingwords");
            return (Criteria) this;
        }

        public Criteria andColcomposingwordsNotLike(String value) {
            addCriterion("colcomposingwords not like", value, "colcomposingwords");
            return (Criteria) this;
        }

        public Criteria andColcomposingwordsIn(List<String> values) {
            addCriterion("colcomposingwords in", values, "colcomposingwords");
            return (Criteria) this;
        }

        public Criteria andColcomposingwordsNotIn(List<String> values) {
            addCriterion("colcomposingwords not in", values, "colcomposingwords");
            return (Criteria) this;
        }

        public Criteria andColcomposingwordsBetween(String value1, String value2) {
            addCriterion("colcomposingwords between", value1, value2, "colcomposingwords");
            return (Criteria) this;
        }

        public Criteria andColcomposingwordsNotBetween(String value1, String value2) {
            addCriterion("colcomposingwords not between", value1, value2, "colcomposingwords");
            return (Criteria) this;
        }

        public Criteria andColproductioncompanyIsNull() {
            addCriterion("colproductioncompany is null");
            return (Criteria) this;
        }

        public Criteria andColproductioncompanyIsNotNull() {
            addCriterion("colproductioncompany is not null");
            return (Criteria) this;
        }

        public Criteria andColproductioncompanyEqualTo(String value) {
            addCriterion("colproductioncompany =", value, "colproductioncompany");
            return (Criteria) this;
        }

        public Criteria andColproductioncompanyNotEqualTo(String value) {
            addCriterion("colproductioncompany <>", value, "colproductioncompany");
            return (Criteria) this;
        }

        public Criteria andColproductioncompanyGreaterThan(String value) {
            addCriterion("colproductioncompany >", value, "colproductioncompany");
            return (Criteria) this;
        }

        public Criteria andColproductioncompanyGreaterThanOrEqualTo(String value) {
            addCriterion("colproductioncompany >=", value, "colproductioncompany");
            return (Criteria) this;
        }

        public Criteria andColproductioncompanyLessThan(String value) {
            addCriterion("colproductioncompany <", value, "colproductioncompany");
            return (Criteria) this;
        }

        public Criteria andColproductioncompanyLessThanOrEqualTo(String value) {
            addCriterion("colproductioncompany <=", value, "colproductioncompany");
            return (Criteria) this;
        }

        public Criteria andColproductioncompanyLike(String value) {
            addCriterion("colproductioncompany like", value, "colproductioncompany");
            return (Criteria) this;
        }

        public Criteria andColproductioncompanyNotLike(String value) {
            addCriterion("colproductioncompany not like", value, "colproductioncompany");
            return (Criteria) this;
        }

        public Criteria andColproductioncompanyIn(List<String> values) {
            addCriterion("colproductioncompany in", values, "colproductioncompany");
            return (Criteria) this;
        }

        public Criteria andColproductioncompanyNotIn(List<String> values) {
            addCriterion("colproductioncompany not in", values, "colproductioncompany");
            return (Criteria) this;
        }

        public Criteria andColproductioncompanyBetween(String value1, String value2) {
            addCriterion("colproductioncompany between", value1, value2, "colproductioncompany");
            return (Criteria) this;
        }

        public Criteria andColproductioncompanyNotBetween(String value1, String value2) {
            addCriterion("colproductioncompany not between", value1, value2, "colproductioncompany");
            return (Criteria) this;
        }

        public Criteria andCollyricIsNull() {
            addCriterion("collyric is null");
            return (Criteria) this;
        }

        public Criteria andCollyricIsNotNull() {
            addCriterion("collyric is not null");
            return (Criteria) this;
        }

        public Criteria andCollyricEqualTo(String value) {
            addCriterion("collyric =", value, "collyric");
            return (Criteria) this;
        }

        public Criteria andCollyricNotEqualTo(String value) {
            addCriterion("collyric <>", value, "collyric");
            return (Criteria) this;
        }

        public Criteria andCollyricGreaterThan(String value) {
            addCriterion("collyric >", value, "collyric");
            return (Criteria) this;
        }

        public Criteria andCollyricGreaterThanOrEqualTo(String value) {
            addCriterion("collyric >=", value, "collyric");
            return (Criteria) this;
        }

        public Criteria andCollyricLessThan(String value) {
            addCriterion("collyric <", value, "collyric");
            return (Criteria) this;
        }

        public Criteria andCollyricLessThanOrEqualTo(String value) {
            addCriterion("collyric <=", value, "collyric");
            return (Criteria) this;
        }

        public Criteria andCollyricLike(String value) {
            addCriterion("collyric like", value, "collyric");
            return (Criteria) this;
        }

        public Criteria andCollyricNotLike(String value) {
            addCriterion("collyric not like", value, "collyric");
            return (Criteria) this;
        }

        public Criteria andCollyricIn(List<String> values) {
            addCriterion("collyric in", values, "collyric");
            return (Criteria) this;
        }

        public Criteria andCollyricNotIn(List<String> values) {
            addCriterion("collyric not in", values, "collyric");
            return (Criteria) this;
        }

        public Criteria andCollyricBetween(String value1, String value2) {
            addCriterion("collyric between", value1, value2, "collyric");
            return (Criteria) this;
        }

        public Criteria andCollyricNotBetween(String value1, String value2) {
            addCriterion("collyric not between", value1, value2, "collyric");
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