package com.oace.bean;

import java.util.ArrayList;
import java.util.List;

public class TwitterExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TwitterExample() {
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

        public Criteria andTwtIdIsNull() {
            addCriterion("twt_id is null");
            return (Criteria) this;
        }

        public Criteria andTwtIdIsNotNull() {
            addCriterion("twt_id is not null");
            return (Criteria) this;
        }

        public Criteria andTwtIdEqualTo(String value) {
            addCriterion("twt_id =", value, "twtId");
            return (Criteria) this;
        }

        public Criteria andTwtIdNotEqualTo(String value) {
            addCriterion("twt_id <>", value, "twtId");
            return (Criteria) this;
        }

        public Criteria andTwtIdGreaterThan(String value) {
            addCriterion("twt_id >", value, "twtId");
            return (Criteria) this;
        }

        public Criteria andTwtIdGreaterThanOrEqualTo(String value) {
            addCriterion("twt_id >=", value, "twtId");
            return (Criteria) this;
        }

        public Criteria andTwtIdLessThan(String value) {
            addCriterion("twt_id <", value, "twtId");
            return (Criteria) this;
        }

        public Criteria andTwtIdLessThanOrEqualTo(String value) {
            addCriterion("twt_id <=", value, "twtId");
            return (Criteria) this;
        }

        public Criteria andTwtIdLike(String value) {
            addCriterion("twt_id like", value, "twtId");
            return (Criteria) this;
        }

        public Criteria andTwtIdNotLike(String value) {
            addCriterion("twt_id not like", value, "twtId");
            return (Criteria) this;
        }

        public Criteria andTwtIdIn(List<String> values) {
            addCriterion("twt_id in", values, "twtId");
            return (Criteria) this;
        }

        public Criteria andTwtIdNotIn(List<String> values) {
            addCriterion("twt_id not in", values, "twtId");
            return (Criteria) this;
        }

        public Criteria andTwtIdBetween(String value1, String value2) {
            addCriterion("twt_id between", value1, value2, "twtId");
            return (Criteria) this;
        }

        public Criteria andTwtIdNotBetween(String value1, String value2) {
            addCriterion("twt_id not between", value1, value2, "twtId");
            return (Criteria) this;
        }

        public Criteria andSelfidIsNull() {
            addCriterion("selfId is null");
            return (Criteria) this;
        }

        public Criteria andSelfidIsNotNull() {
            addCriterion("selfId is not null");
            return (Criteria) this;
        }

        public Criteria andSelfidEqualTo(String value) {
            addCriterion("selfId =", value, "selfid");
            return (Criteria) this;
        }

        public Criteria andSelfidNotEqualTo(String value) {
            addCriterion("selfId <>", value, "selfid");
            return (Criteria) this;
        }

        public Criteria andSelfidGreaterThan(String value) {
            addCriterion("selfId >", value, "selfid");
            return (Criteria) this;
        }

        public Criteria andSelfidGreaterThanOrEqualTo(String value) {
            addCriterion("selfId >=", value, "selfid");
            return (Criteria) this;
        }

        public Criteria andSelfidLessThan(String value) {
            addCriterion("selfId <", value, "selfid");
            return (Criteria) this;
        }

        public Criteria andSelfidLessThanOrEqualTo(String value) {
            addCriterion("selfId <=", value, "selfid");
            return (Criteria) this;
        }

        public Criteria andSelfidLike(String value) {
            addCriterion("selfId like", value, "selfid");
            return (Criteria) this;
        }

        public Criteria andSelfidNotLike(String value) {
            addCriterion("selfId not like", value, "selfid");
            return (Criteria) this;
        }

        public Criteria andSelfidIn(List<String> values) {
            addCriterion("selfId in", values, "selfid");
            return (Criteria) this;
        }

        public Criteria andSelfidNotIn(List<String> values) {
            addCriterion("selfId not in", values, "selfid");
            return (Criteria) this;
        }

        public Criteria andSelfidBetween(String value1, String value2) {
            addCriterion("selfId between", value1, value2, "selfid");
            return (Criteria) this;
        }

        public Criteria andSelfidNotBetween(String value1, String value2) {
            addCriterion("selfId not between", value1, value2, "selfid");
            return (Criteria) this;
        }

        public Criteria andTwitterheadIsNull() {
            addCriterion("TwitterHead is null");
            return (Criteria) this;
        }

        public Criteria andTwitterheadIsNotNull() {
            addCriterion("TwitterHead is not null");
            return (Criteria) this;
        }

        public Criteria andTwitterheadEqualTo(String value) {
            addCriterion("TwitterHead =", value, "twitterhead");
            return (Criteria) this;
        }

        public Criteria andTwitterheadNotEqualTo(String value) {
            addCriterion("TwitterHead <>", value, "twitterhead");
            return (Criteria) this;
        }

        public Criteria andTwitterheadGreaterThan(String value) {
            addCriterion("TwitterHead >", value, "twitterhead");
            return (Criteria) this;
        }

        public Criteria andTwitterheadGreaterThanOrEqualTo(String value) {
            addCriterion("TwitterHead >=", value, "twitterhead");
            return (Criteria) this;
        }

        public Criteria andTwitterheadLessThan(String value) {
            addCriterion("TwitterHead <", value, "twitterhead");
            return (Criteria) this;
        }

        public Criteria andTwitterheadLessThanOrEqualTo(String value) {
            addCriterion("TwitterHead <=", value, "twitterhead");
            return (Criteria) this;
        }

        public Criteria andTwitterheadLike(String value) {
            addCriterion("TwitterHead like", value, "twitterhead");
            return (Criteria) this;
        }

        public Criteria andTwitterheadNotLike(String value) {
            addCriterion("TwitterHead not like", value, "twitterhead");
            return (Criteria) this;
        }

        public Criteria andTwitterheadIn(List<String> values) {
            addCriterion("TwitterHead in", values, "twitterhead");
            return (Criteria) this;
        }

        public Criteria andTwitterheadNotIn(List<String> values) {
            addCriterion("TwitterHead not in", values, "twitterhead");
            return (Criteria) this;
        }

        public Criteria andTwitterheadBetween(String value1, String value2) {
            addCriterion("TwitterHead between", value1, value2, "twitterhead");
            return (Criteria) this;
        }

        public Criteria andTwitterheadNotBetween(String value1, String value2) {
            addCriterion("TwitterHead not between", value1, value2, "twitterhead");
            return (Criteria) this;
        }

        public Criteria andUseridIsNull() {
            addCriterion("userId is null");
            return (Criteria) this;
        }

        public Criteria andUseridIsNotNull() {
            addCriterion("userId is not null");
            return (Criteria) this;
        }

        public Criteria andUseridEqualTo(String value) {
            addCriterion("userId =", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotEqualTo(String value) {
            addCriterion("userId <>", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridGreaterThan(String value) {
            addCriterion("userId >", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridGreaterThanOrEqualTo(String value) {
            addCriterion("userId >=", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLessThan(String value) {
            addCriterion("userId <", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLessThanOrEqualTo(String value) {
            addCriterion("userId <=", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLike(String value) {
            addCriterion("userId like", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotLike(String value) {
            addCriterion("userId not like", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridIn(List<String> values) {
            addCriterion("userId in", values, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotIn(List<String> values) {
            addCriterion("userId not in", values, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridBetween(String value1, String value2) {
            addCriterion("userId between", value1, value2, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotBetween(String value1, String value2) {
            addCriterion("userId not between", value1, value2, "userid");
            return (Criteria) this;
        }

        public Criteria andDateIsNull() {
            addCriterion("Date is null");
            return (Criteria) this;
        }

        public Criteria andDateIsNotNull() {
            addCriterion("Date is not null");
            return (Criteria) this;
        }

        public Criteria andDateEqualTo(String value) {
            addCriterion("Date =", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateNotEqualTo(String value) {
            addCriterion("Date <>", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateGreaterThan(String value) {
            addCriterion("Date >", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateGreaterThanOrEqualTo(String value) {
            addCriterion("Date >=", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateLessThan(String value) {
            addCriterion("Date <", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateLessThanOrEqualTo(String value) {
            addCriterion("Date <=", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateLike(String value) {
            addCriterion("Date like", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateNotLike(String value) {
            addCriterion("Date not like", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateIn(List<String> values) {
            addCriterion("Date in", values, "date");
            return (Criteria) this;
        }

        public Criteria andDateNotIn(List<String> values) {
            addCriterion("Date not in", values, "date");
            return (Criteria) this;
        }

        public Criteria andDateBetween(String value1, String value2) {
            addCriterion("Date between", value1, value2, "date");
            return (Criteria) this;
        }

        public Criteria andDateNotBetween(String value1, String value2) {
            addCriterion("Date not between", value1, value2, "date");
            return (Criteria) this;
        }

        public Criteria andImgurlIsNull() {
            addCriterion("imgUrl is null");
            return (Criteria) this;
        }

        public Criteria andImgurlIsNotNull() {
            addCriterion("imgUrl is not null");
            return (Criteria) this;
        }

        public Criteria andImgurlEqualTo(String value) {
            addCriterion("imgUrl =", value, "imgurl");
            return (Criteria) this;
        }

        public Criteria andImgurlNotEqualTo(String value) {
            addCriterion("imgUrl <>", value, "imgurl");
            return (Criteria) this;
        }

        public Criteria andImgurlGreaterThan(String value) {
            addCriterion("imgUrl >", value, "imgurl");
            return (Criteria) this;
        }

        public Criteria andImgurlGreaterThanOrEqualTo(String value) {
            addCriterion("imgUrl >=", value, "imgurl");
            return (Criteria) this;
        }

        public Criteria andImgurlLessThan(String value) {
            addCriterion("imgUrl <", value, "imgurl");
            return (Criteria) this;
        }

        public Criteria andImgurlLessThanOrEqualTo(String value) {
            addCriterion("imgUrl <=", value, "imgurl");
            return (Criteria) this;
        }

        public Criteria andImgurlLike(String value) {
            addCriterion("imgUrl like", value, "imgurl");
            return (Criteria) this;
        }

        public Criteria andImgurlNotLike(String value) {
            addCriterion("imgUrl not like", value, "imgurl");
            return (Criteria) this;
        }

        public Criteria andImgurlIn(List<String> values) {
            addCriterion("imgUrl in", values, "imgurl");
            return (Criteria) this;
        }

        public Criteria andImgurlNotIn(List<String> values) {
            addCriterion("imgUrl not in", values, "imgurl");
            return (Criteria) this;
        }

        public Criteria andImgurlBetween(String value1, String value2) {
            addCriterion("imgUrl between", value1, value2, "imgurl");
            return (Criteria) this;
        }

        public Criteria andImgurlNotBetween(String value1, String value2) {
            addCriterion("imgUrl not between", value1, value2, "imgurl");
            return (Criteria) this;
        }

        public Criteria andTwitterTypeIsNull() {
            addCriterion("twitter_type is null");
            return (Criteria) this;
        }

        public Criteria andTwitterTypeIsNotNull() {
            addCriterion("twitter_type is not null");
            return (Criteria) this;
        }

        public Criteria andTwitterTypeEqualTo(String value) {
            addCriterion("twitter_type =", value, "twitterType");
            return (Criteria) this;
        }

        public Criteria andTwitterTypeNotEqualTo(String value) {
            addCriterion("twitter_type <>", value, "twitterType");
            return (Criteria) this;
        }

        public Criteria andTwitterTypeGreaterThan(String value) {
            addCriterion("twitter_type >", value, "twitterType");
            return (Criteria) this;
        }

        public Criteria andTwitterTypeGreaterThanOrEqualTo(String value) {
            addCriterion("twitter_type >=", value, "twitterType");
            return (Criteria) this;
        }

        public Criteria andTwitterTypeLessThan(String value) {
            addCriterion("twitter_type <", value, "twitterType");
            return (Criteria) this;
        }

        public Criteria andTwitterTypeLessThanOrEqualTo(String value) {
            addCriterion("twitter_type <=", value, "twitterType");
            return (Criteria) this;
        }

        public Criteria andTwitterTypeLike(String value) {
            addCriterion("twitter_type like", value, "twitterType");
            return (Criteria) this;
        }

        public Criteria andTwitterTypeNotLike(String value) {
            addCriterion("twitter_type not like", value, "twitterType");
            return (Criteria) this;
        }

        public Criteria andTwitterTypeIn(List<String> values) {
            addCriterion("twitter_type in", values, "twitterType");
            return (Criteria) this;
        }

        public Criteria andTwitterTypeNotIn(List<String> values) {
            addCriterion("twitter_type not in", values, "twitterType");
            return (Criteria) this;
        }

        public Criteria andTwitterTypeBetween(String value1, String value2) {
            addCriterion("twitter_type between", value1, value2, "twitterType");
            return (Criteria) this;
        }

        public Criteria andTwitterTypeNotBetween(String value1, String value2) {
            addCriterion("twitter_type not between", value1, value2, "twitterType");
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