package com.ssm.po;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class UsersalaryExample {
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

    public UsersalaryExample() {
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

        public Criteria andSalarymonthIsNull() {
            addCriterion("salarymonth is null");
            return (Criteria) this;
        }

        public Criteria andSalarymonthIsNotNull() {
            addCriterion("salarymonth is not null");
            return (Criteria) this;
        }

        public Criteria andSalarymonthEqualTo(String value) {
            addCriterion("salarymonth =", value, "salarymonth");
            return (Criteria) this;
        }

        public Criteria andSalarymonthNotEqualTo(String value) {
            addCriterion("salarymonth <>", value, "salarymonth");
            return (Criteria) this;
        }

        public Criteria andSalarymonthGreaterThan(String value) {
            addCriterion("salarymonth >", value, "salarymonth");
            return (Criteria) this;
        }

        public Criteria andSalarymonthGreaterThanOrEqualTo(String value) {
            addCriterion("salarymonth >=", value, "salarymonth");
            return (Criteria) this;
        }

        public Criteria andSalarymonthLessThan(String value) {
            addCriterion("salarymonth <", value, "salarymonth");
            return (Criteria) this;
        }

        public Criteria andSalarymonthLessThanOrEqualTo(String value) {
            addCriterion("salarymonth <=", value, "salarymonth");
            return (Criteria) this;
        }

        public Criteria andSalarymonthLike(String value) {
            addCriterion("salarymonth like", value, "salarymonth");
            return (Criteria) this;
        }

        public Criteria andSalarymonthNotLike(String value) {
            addCriterion("salarymonth not like", value, "salarymonth");
            return (Criteria) this;
        }

        public Criteria andSalarymonthIn(List<String> values) {
            addCriterion("salarymonth in", values, "salarymonth");
            return (Criteria) this;
        }

        public Criteria andSalarymonthNotIn(List<String> values) {
            addCriterion("salarymonth not in", values, "salarymonth");
            return (Criteria) this;
        }

        public Criteria andSalarymonthBetween(String value1, String value2) {
            addCriterion("salarymonth between", value1, value2, "salarymonth");
            return (Criteria) this;
        }

        public Criteria andSalarymonthNotBetween(String value1, String value2) {
            addCriterion("salarymonth not between", value1, value2, "salarymonth");
            return (Criteria) this;
        }

        public Criteria andSalary1IsNull() {
            addCriterion("salary1 is null");
            return (Criteria) this;
        }

        public Criteria andSalary1IsNotNull() {
            addCriterion("salary1 is not null");
            return (Criteria) this;
        }

        public Criteria andSalary1EqualTo(String value) {
            addCriterion("salary1 =", value, "salary1");
            return (Criteria) this;
        }

        public Criteria andSalary1NotEqualTo(String value) {
            addCriterion("salary1 <>", value, "salary1");
            return (Criteria) this;
        }

        public Criteria andSalary1GreaterThan(String value) {
            addCriterion("salary1 >", value, "salary1");
            return (Criteria) this;
        }

        public Criteria andSalary1GreaterThanOrEqualTo(String value) {
            addCriterion("salary1 >=", value, "salary1");
            return (Criteria) this;
        }

        public Criteria andSalary1LessThan(String value) {
            addCriterion("salary1 <", value, "salary1");
            return (Criteria) this;
        }

        public Criteria andSalary1LessThanOrEqualTo(String value) {
            addCriterion("salary1 <=", value, "salary1");
            return (Criteria) this;
        }

        public Criteria andSalary1Like(String value) {
            addCriterion("salary1 like", value, "salary1");
            return (Criteria) this;
        }

        public Criteria andSalary1NotLike(String value) {
            addCriterion("salary1 not like", value, "salary1");
            return (Criteria) this;
        }

        public Criteria andSalary1In(List<String> values) {
            addCriterion("salary1 in", values, "salary1");
            return (Criteria) this;
        }

        public Criteria andSalary1NotIn(List<String> values) {
            addCriterion("salary1 not in", values, "salary1");
            return (Criteria) this;
        }

        public Criteria andSalary1Between(String value1, String value2) {
            addCriterion("salary1 between", value1, value2, "salary1");
            return (Criteria) this;
        }

        public Criteria andSalary1NotBetween(String value1, String value2) {
            addCriterion("salary1 not between", value1, value2, "salary1");
            return (Criteria) this;
        }

        public Criteria andSalary2IsNull() {
            addCriterion("salary2 is null");
            return (Criteria) this;
        }

        public Criteria andSalary2IsNotNull() {
            addCriterion("salary2 is not null");
            return (Criteria) this;
        }

        public Criteria andSalary2EqualTo(String value) {
            addCriterion("salary2 =", value, "salary2");
            return (Criteria) this;
        }

        public Criteria andSalary2NotEqualTo(String value) {
            addCriterion("salary2 <>", value, "salary2");
            return (Criteria) this;
        }

        public Criteria andSalary2GreaterThan(String value) {
            addCriterion("salary2 >", value, "salary2");
            return (Criteria) this;
        }

        public Criteria andSalary2GreaterThanOrEqualTo(String value) {
            addCriterion("salary2 >=", value, "salary2");
            return (Criteria) this;
        }

        public Criteria andSalary2LessThan(String value) {
            addCriterion("salary2 <", value, "salary2");
            return (Criteria) this;
        }

        public Criteria andSalary2LessThanOrEqualTo(String value) {
            addCriterion("salary2 <=", value, "salary2");
            return (Criteria) this;
        }

        public Criteria andSalary2Like(String value) {
            addCriterion("salary2 like", value, "salary2");
            return (Criteria) this;
        }

        public Criteria andSalary2NotLike(String value) {
            addCriterion("salary2 not like", value, "salary2");
            return (Criteria) this;
        }

        public Criteria andSalary2In(List<String> values) {
            addCriterion("salary2 in", values, "salary2");
            return (Criteria) this;
        }

        public Criteria andSalary2NotIn(List<String> values) {
            addCriterion("salary2 not in", values, "salary2");
            return (Criteria) this;
        }

        public Criteria andSalary2Between(String value1, String value2) {
            addCriterion("salary2 between", value1, value2, "salary2");
            return (Criteria) this;
        }

        public Criteria andSalary2NotBetween(String value1, String value2) {
            addCriterion("salary2 not between", value1, value2, "salary2");
            return (Criteria) this;
        }

        public Criteria andSalary3IsNull() {
            addCriterion("salary3 is null");
            return (Criteria) this;
        }

        public Criteria andSalary3IsNotNull() {
            addCriterion("salary3 is not null");
            return (Criteria) this;
        }

        public Criteria andSalary3EqualTo(String value) {
            addCriterion("salary3 =", value, "salary3");
            return (Criteria) this;
        }

        public Criteria andSalary3NotEqualTo(String value) {
            addCriterion("salary3 <>", value, "salary3");
            return (Criteria) this;
        }

        public Criteria andSalary3GreaterThan(String value) {
            addCriterion("salary3 >", value, "salary3");
            return (Criteria) this;
        }

        public Criteria andSalary3GreaterThanOrEqualTo(String value) {
            addCriterion("salary3 >=", value, "salary3");
            return (Criteria) this;
        }

        public Criteria andSalary3LessThan(String value) {
            addCriterion("salary3 <", value, "salary3");
            return (Criteria) this;
        }

        public Criteria andSalary3LessThanOrEqualTo(String value) {
            addCriterion("salary3 <=", value, "salary3");
            return (Criteria) this;
        }

        public Criteria andSalary3Like(String value) {
            addCriterion("salary3 like", value, "salary3");
            return (Criteria) this;
        }

        public Criteria andSalary3NotLike(String value) {
            addCriterion("salary3 not like", value, "salary3");
            return (Criteria) this;
        }

        public Criteria andSalary3In(List<String> values) {
            addCriterion("salary3 in", values, "salary3");
            return (Criteria) this;
        }

        public Criteria andSalary3NotIn(List<String> values) {
            addCriterion("salary3 not in", values, "salary3");
            return (Criteria) this;
        }

        public Criteria andSalary3Between(String value1, String value2) {
            addCriterion("salary3 between", value1, value2, "salary3");
            return (Criteria) this;
        }

        public Criteria andSalary3NotBetween(String value1, String value2) {
            addCriterion("salary3 not between", value1, value2, "salary3");
            return (Criteria) this;
        }

        public Criteria andSalary4IsNull() {
            addCriterion("salary4 is null");
            return (Criteria) this;
        }

        public Criteria andSalary4IsNotNull() {
            addCriterion("salary4 is not null");
            return (Criteria) this;
        }

        public Criteria andSalary4EqualTo(String value) {
            addCriterion("salary4 =", value, "salary4");
            return (Criteria) this;
        }

        public Criteria andSalary4NotEqualTo(String value) {
            addCriterion("salary4 <>", value, "salary4");
            return (Criteria) this;
        }

        public Criteria andSalary4GreaterThan(String value) {
            addCriterion("salary4 >", value, "salary4");
            return (Criteria) this;
        }

        public Criteria andSalary4GreaterThanOrEqualTo(String value) {
            addCriterion("salary4 >=", value, "salary4");
            return (Criteria) this;
        }

        public Criteria andSalary4LessThan(String value) {
            addCriterion("salary4 <", value, "salary4");
            return (Criteria) this;
        }

        public Criteria andSalary4LessThanOrEqualTo(String value) {
            addCriterion("salary4 <=", value, "salary4");
            return (Criteria) this;
        }

        public Criteria andSalary4Like(String value) {
            addCriterion("salary4 like", value, "salary4");
            return (Criteria) this;
        }

        public Criteria andSalary4NotLike(String value) {
            addCriterion("salary4 not like", value, "salary4");
            return (Criteria) this;
        }

        public Criteria andSalary4In(List<String> values) {
            addCriterion("salary4 in", values, "salary4");
            return (Criteria) this;
        }

        public Criteria andSalary4NotIn(List<String> values) {
            addCriterion("salary4 not in", values, "salary4");
            return (Criteria) this;
        }

        public Criteria andSalary4Between(String value1, String value2) {
            addCriterion("salary4 between", value1, value2, "salary4");
            return (Criteria) this;
        }

        public Criteria andSalary4NotBetween(String value1, String value2) {
            addCriterion("salary4 not between", value1, value2, "salary4");
            return (Criteria) this;
        }

        public Criteria andSortIsNull() {
            addCriterion("sort is null");
            return (Criteria) this;
        }

        public Criteria andSortIsNotNull() {
            addCriterion("sort is not null");
            return (Criteria) this;
        }

        public Criteria andSortEqualTo(Integer value) {
            addCriterion("sort =", value, "sort");
            return (Criteria) this;
        }

        public Criteria andSortNotEqualTo(Integer value) {
            addCriterion("sort <>", value, "sort");
            return (Criteria) this;
        }

        public Criteria andSortGreaterThan(Integer value) {
            addCriterion("sort >", value, "sort");
            return (Criteria) this;
        }

        public Criteria andSortGreaterThanOrEqualTo(Integer value) {
            addCriterion("sort >=", value, "sort");
            return (Criteria) this;
        }

        public Criteria andSortLessThan(Integer value) {
            addCriterion("sort <", value, "sort");
            return (Criteria) this;
        }

        public Criteria andSortLessThanOrEqualTo(Integer value) {
            addCriterion("sort <=", value, "sort");
            return (Criteria) this;
        }

        public Criteria andSortIn(List<Integer> values) {
            addCriterion("sort in", values, "sort");
            return (Criteria) this;
        }

        public Criteria andSortNotIn(List<Integer> values) {
            addCriterion("sort not in", values, "sort");
            return (Criteria) this;
        }

        public Criteria andSortBetween(Integer value1, Integer value2) {
            addCriterion("sort between", value1, value2, "sort");
            return (Criteria) this;
        }

        public Criteria andSortNotBetween(Integer value1, Integer value2) {
            addCriterion("sort not between", value1, value2, "sort");
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