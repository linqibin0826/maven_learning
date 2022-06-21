package com.linqibin.imperial.court.entity;

import java.util.ArrayList;
import java.util.List;

public class MemorialsExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table t_memorials
     *
     * @mbggenerated Tue Jun 21 09:54:55 CST 2022
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table t_memorials
     *
     * @mbggenerated Tue Jun 21 09:54:55 CST 2022
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table t_memorials
     *
     * @mbggenerated Tue Jun 21 09:54:55 CST 2022
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_memorials
     *
     * @mbggenerated Tue Jun 21 09:54:55 CST 2022
     */
    public MemorialsExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_memorials
     *
     * @mbggenerated Tue Jun 21 09:54:55 CST 2022
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_memorials
     *
     * @mbggenerated Tue Jun 21 09:54:55 CST 2022
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_memorials
     *
     * @mbggenerated Tue Jun 21 09:54:55 CST 2022
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_memorials
     *
     * @mbggenerated Tue Jun 21 09:54:55 CST 2022
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_memorials
     *
     * @mbggenerated Tue Jun 21 09:54:55 CST 2022
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_memorials
     *
     * @mbggenerated Tue Jun 21 09:54:55 CST 2022
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_memorials
     *
     * @mbggenerated Tue Jun 21 09:54:55 CST 2022
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_memorials
     *
     * @mbggenerated Tue Jun 21 09:54:55 CST 2022
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_memorials
     *
     * @mbggenerated Tue Jun 21 09:54:55 CST 2022
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_memorials
     *
     * @mbggenerated Tue Jun 21 09:54:55 CST 2022
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table t_memorials
     *
     * @mbggenerated Tue Jun 21 09:54:55 CST 2022
     */
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

        public Criteria andMemorialsIdIsNull() {
            addCriterion("memorials_id is null");
            return (Criteria) this;
        }

        public Criteria andMemorialsIdIsNotNull() {
            addCriterion("memorials_id is not null");
            return (Criteria) this;
        }

        public Criteria andMemorialsIdEqualTo(Integer value) {
            addCriterion("memorials_id =", value, "memorialsId");
            return (Criteria) this;
        }

        public Criteria andMemorialsIdNotEqualTo(Integer value) {
            addCriterion("memorials_id <>", value, "memorialsId");
            return (Criteria) this;
        }

        public Criteria andMemorialsIdGreaterThan(Integer value) {
            addCriterion("memorials_id >", value, "memorialsId");
            return (Criteria) this;
        }

        public Criteria andMemorialsIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("memorials_id >=", value, "memorialsId");
            return (Criteria) this;
        }

        public Criteria andMemorialsIdLessThan(Integer value) {
            addCriterion("memorials_id <", value, "memorialsId");
            return (Criteria) this;
        }

        public Criteria andMemorialsIdLessThanOrEqualTo(Integer value) {
            addCriterion("memorials_id <=", value, "memorialsId");
            return (Criteria) this;
        }

        public Criteria andMemorialsIdIn(List<Integer> values) {
            addCriterion("memorials_id in", values, "memorialsId");
            return (Criteria) this;
        }

        public Criteria andMemorialsIdNotIn(List<Integer> values) {
            addCriterion("memorials_id not in", values, "memorialsId");
            return (Criteria) this;
        }

        public Criteria andMemorialsIdBetween(Integer value1, Integer value2) {
            addCriterion("memorials_id between", value1, value2, "memorialsId");
            return (Criteria) this;
        }

        public Criteria andMemorialsIdNotBetween(Integer value1, Integer value2) {
            addCriterion("memorials_id not between", value1, value2, "memorialsId");
            return (Criteria) this;
        }

        public Criteria andMemorialsTitleIsNull() {
            addCriterion("memorials_title is null");
            return (Criteria) this;
        }

        public Criteria andMemorialsTitleIsNotNull() {
            addCriterion("memorials_title is not null");
            return (Criteria) this;
        }

        public Criteria andMemorialsTitleEqualTo(String value) {
            addCriterion("memorials_title =", value, "memorialsTitle");
            return (Criteria) this;
        }

        public Criteria andMemorialsTitleNotEqualTo(String value) {
            addCriterion("memorials_title <>", value, "memorialsTitle");
            return (Criteria) this;
        }

        public Criteria andMemorialsTitleGreaterThan(String value) {
            addCriterion("memorials_title >", value, "memorialsTitle");
            return (Criteria) this;
        }

        public Criteria andMemorialsTitleGreaterThanOrEqualTo(String value) {
            addCriterion("memorials_title >=", value, "memorialsTitle");
            return (Criteria) this;
        }

        public Criteria andMemorialsTitleLessThan(String value) {
            addCriterion("memorials_title <", value, "memorialsTitle");
            return (Criteria) this;
        }

        public Criteria andMemorialsTitleLessThanOrEqualTo(String value) {
            addCriterion("memorials_title <=", value, "memorialsTitle");
            return (Criteria) this;
        }

        public Criteria andMemorialsTitleLike(String value) {
            addCriterion("memorials_title like", value, "memorialsTitle");
            return (Criteria) this;
        }

        public Criteria andMemorialsTitleNotLike(String value) {
            addCriterion("memorials_title not like", value, "memorialsTitle");
            return (Criteria) this;
        }

        public Criteria andMemorialsTitleIn(List<String> values) {
            addCriterion("memorials_title in", values, "memorialsTitle");
            return (Criteria) this;
        }

        public Criteria andMemorialsTitleNotIn(List<String> values) {
            addCriterion("memorials_title not in", values, "memorialsTitle");
            return (Criteria) this;
        }

        public Criteria andMemorialsTitleBetween(String value1, String value2) {
            addCriterion("memorials_title between", value1, value2, "memorialsTitle");
            return (Criteria) this;
        }

        public Criteria andMemorialsTitleNotBetween(String value1, String value2) {
            addCriterion("memorials_title not between", value1, value2, "memorialsTitle");
            return (Criteria) this;
        }

        public Criteria andMemorialsContentIsNull() {
            addCriterion("memorials_content is null");
            return (Criteria) this;
        }

        public Criteria andMemorialsContentIsNotNull() {
            addCriterion("memorials_content is not null");
            return (Criteria) this;
        }

        public Criteria andMemorialsContentEqualTo(String value) {
            addCriterion("memorials_content =", value, "memorialsContent");
            return (Criteria) this;
        }

        public Criteria andMemorialsContentNotEqualTo(String value) {
            addCriterion("memorials_content <>", value, "memorialsContent");
            return (Criteria) this;
        }

        public Criteria andMemorialsContentGreaterThan(String value) {
            addCriterion("memorials_content >", value, "memorialsContent");
            return (Criteria) this;
        }

        public Criteria andMemorialsContentGreaterThanOrEqualTo(String value) {
            addCriterion("memorials_content >=", value, "memorialsContent");
            return (Criteria) this;
        }

        public Criteria andMemorialsContentLessThan(String value) {
            addCriterion("memorials_content <", value, "memorialsContent");
            return (Criteria) this;
        }

        public Criteria andMemorialsContentLessThanOrEqualTo(String value) {
            addCriterion("memorials_content <=", value, "memorialsContent");
            return (Criteria) this;
        }

        public Criteria andMemorialsContentLike(String value) {
            addCriterion("memorials_content like", value, "memorialsContent");
            return (Criteria) this;
        }

        public Criteria andMemorialsContentNotLike(String value) {
            addCriterion("memorials_content not like", value, "memorialsContent");
            return (Criteria) this;
        }

        public Criteria andMemorialsContentIn(List<String> values) {
            addCriterion("memorials_content in", values, "memorialsContent");
            return (Criteria) this;
        }

        public Criteria andMemorialsContentNotIn(List<String> values) {
            addCriterion("memorials_content not in", values, "memorialsContent");
            return (Criteria) this;
        }

        public Criteria andMemorialsContentBetween(String value1, String value2) {
            addCriterion("memorials_content between", value1, value2, "memorialsContent");
            return (Criteria) this;
        }

        public Criteria andMemorialsContentNotBetween(String value1, String value2) {
            addCriterion("memorials_content not between", value1, value2, "memorialsContent");
            return (Criteria) this;
        }

        public Criteria andMemorialsEmpIsNull() {
            addCriterion("memorials_emp is null");
            return (Criteria) this;
        }

        public Criteria andMemorialsEmpIsNotNull() {
            addCriterion("memorials_emp is not null");
            return (Criteria) this;
        }

        public Criteria andMemorialsEmpEqualTo(Integer value) {
            addCriterion("memorials_emp =", value, "memorialsEmp");
            return (Criteria) this;
        }

        public Criteria andMemorialsEmpNotEqualTo(Integer value) {
            addCriterion("memorials_emp <>", value, "memorialsEmp");
            return (Criteria) this;
        }

        public Criteria andMemorialsEmpGreaterThan(Integer value) {
            addCriterion("memorials_emp >", value, "memorialsEmp");
            return (Criteria) this;
        }

        public Criteria andMemorialsEmpGreaterThanOrEqualTo(Integer value) {
            addCriterion("memorials_emp >=", value, "memorialsEmp");
            return (Criteria) this;
        }

        public Criteria andMemorialsEmpLessThan(Integer value) {
            addCriterion("memorials_emp <", value, "memorialsEmp");
            return (Criteria) this;
        }

        public Criteria andMemorialsEmpLessThanOrEqualTo(Integer value) {
            addCriterion("memorials_emp <=", value, "memorialsEmp");
            return (Criteria) this;
        }

        public Criteria andMemorialsEmpIn(List<Integer> values) {
            addCriterion("memorials_emp in", values, "memorialsEmp");
            return (Criteria) this;
        }

        public Criteria andMemorialsEmpNotIn(List<Integer> values) {
            addCriterion("memorials_emp not in", values, "memorialsEmp");
            return (Criteria) this;
        }

        public Criteria andMemorialsEmpBetween(Integer value1, Integer value2) {
            addCriterion("memorials_emp between", value1, value2, "memorialsEmp");
            return (Criteria) this;
        }

        public Criteria andMemorialsEmpNotBetween(Integer value1, Integer value2) {
            addCriterion("memorials_emp not between", value1, value2, "memorialsEmp");
            return (Criteria) this;
        }

        public Criteria andMemorialsCreateTimeIsNull() {
            addCriterion("memorials_create_time is null");
            return (Criteria) this;
        }

        public Criteria andMemorialsCreateTimeIsNotNull() {
            addCriterion("memorials_create_time is not null");
            return (Criteria) this;
        }

        public Criteria andMemorialsCreateTimeEqualTo(String value) {
            addCriterion("memorials_create_time =", value, "memorialsCreateTime");
            return (Criteria) this;
        }

        public Criteria andMemorialsCreateTimeNotEqualTo(String value) {
            addCriterion("memorials_create_time <>", value, "memorialsCreateTime");
            return (Criteria) this;
        }

        public Criteria andMemorialsCreateTimeGreaterThan(String value) {
            addCriterion("memorials_create_time >", value, "memorialsCreateTime");
            return (Criteria) this;
        }

        public Criteria andMemorialsCreateTimeGreaterThanOrEqualTo(String value) {
            addCriterion("memorials_create_time >=", value, "memorialsCreateTime");
            return (Criteria) this;
        }

        public Criteria andMemorialsCreateTimeLessThan(String value) {
            addCriterion("memorials_create_time <", value, "memorialsCreateTime");
            return (Criteria) this;
        }

        public Criteria andMemorialsCreateTimeLessThanOrEqualTo(String value) {
            addCriterion("memorials_create_time <=", value, "memorialsCreateTime");
            return (Criteria) this;
        }

        public Criteria andMemorialsCreateTimeLike(String value) {
            addCriterion("memorials_create_time like", value, "memorialsCreateTime");
            return (Criteria) this;
        }

        public Criteria andMemorialsCreateTimeNotLike(String value) {
            addCriterion("memorials_create_time not like", value, "memorialsCreateTime");
            return (Criteria) this;
        }

        public Criteria andMemorialsCreateTimeIn(List<String> values) {
            addCriterion("memorials_create_time in", values, "memorialsCreateTime");
            return (Criteria) this;
        }

        public Criteria andMemorialsCreateTimeNotIn(List<String> values) {
            addCriterion("memorials_create_time not in", values, "memorialsCreateTime");
            return (Criteria) this;
        }

        public Criteria andMemorialsCreateTimeBetween(String value1, String value2) {
            addCriterion("memorials_create_time between", value1, value2, "memorialsCreateTime");
            return (Criteria) this;
        }

        public Criteria andMemorialsCreateTimeNotBetween(String value1, String value2) {
            addCriterion("memorials_create_time not between", value1, value2, "memorialsCreateTime");
            return (Criteria) this;
        }

        public Criteria andFeedbackTimeIsNull() {
            addCriterion("feedback_time is null");
            return (Criteria) this;
        }

        public Criteria andFeedbackTimeIsNotNull() {
            addCriterion("feedback_time is not null");
            return (Criteria) this;
        }

        public Criteria andFeedbackTimeEqualTo(String value) {
            addCriterion("feedback_time =", value, "feedbackTime");
            return (Criteria) this;
        }

        public Criteria andFeedbackTimeNotEqualTo(String value) {
            addCriterion("feedback_time <>", value, "feedbackTime");
            return (Criteria) this;
        }

        public Criteria andFeedbackTimeGreaterThan(String value) {
            addCriterion("feedback_time >", value, "feedbackTime");
            return (Criteria) this;
        }

        public Criteria andFeedbackTimeGreaterThanOrEqualTo(String value) {
            addCriterion("feedback_time >=", value, "feedbackTime");
            return (Criteria) this;
        }

        public Criteria andFeedbackTimeLessThan(String value) {
            addCriterion("feedback_time <", value, "feedbackTime");
            return (Criteria) this;
        }

        public Criteria andFeedbackTimeLessThanOrEqualTo(String value) {
            addCriterion("feedback_time <=", value, "feedbackTime");
            return (Criteria) this;
        }

        public Criteria andFeedbackTimeLike(String value) {
            addCriterion("feedback_time like", value, "feedbackTime");
            return (Criteria) this;
        }

        public Criteria andFeedbackTimeNotLike(String value) {
            addCriterion("feedback_time not like", value, "feedbackTime");
            return (Criteria) this;
        }

        public Criteria andFeedbackTimeIn(List<String> values) {
            addCriterion("feedback_time in", values, "feedbackTime");
            return (Criteria) this;
        }

        public Criteria andFeedbackTimeNotIn(List<String> values) {
            addCriterion("feedback_time not in", values, "feedbackTime");
            return (Criteria) this;
        }

        public Criteria andFeedbackTimeBetween(String value1, String value2) {
            addCriterion("feedback_time between", value1, value2, "feedbackTime");
            return (Criteria) this;
        }

        public Criteria andFeedbackTimeNotBetween(String value1, String value2) {
            addCriterion("feedback_time not between", value1, value2, "feedbackTime");
            return (Criteria) this;
        }

        public Criteria andFeedbackContentIsNull() {
            addCriterion("feedback_content is null");
            return (Criteria) this;
        }

        public Criteria andFeedbackContentIsNotNull() {
            addCriterion("feedback_content is not null");
            return (Criteria) this;
        }

        public Criteria andFeedbackContentEqualTo(String value) {
            addCriterion("feedback_content =", value, "feedbackContent");
            return (Criteria) this;
        }

        public Criteria andFeedbackContentNotEqualTo(String value) {
            addCriterion("feedback_content <>", value, "feedbackContent");
            return (Criteria) this;
        }

        public Criteria andFeedbackContentGreaterThan(String value) {
            addCriterion("feedback_content >", value, "feedbackContent");
            return (Criteria) this;
        }

        public Criteria andFeedbackContentGreaterThanOrEqualTo(String value) {
            addCriterion("feedback_content >=", value, "feedbackContent");
            return (Criteria) this;
        }

        public Criteria andFeedbackContentLessThan(String value) {
            addCriterion("feedback_content <", value, "feedbackContent");
            return (Criteria) this;
        }

        public Criteria andFeedbackContentLessThanOrEqualTo(String value) {
            addCriterion("feedback_content <=", value, "feedbackContent");
            return (Criteria) this;
        }

        public Criteria andFeedbackContentLike(String value) {
            addCriterion("feedback_content like", value, "feedbackContent");
            return (Criteria) this;
        }

        public Criteria andFeedbackContentNotLike(String value) {
            addCriterion("feedback_content not like", value, "feedbackContent");
            return (Criteria) this;
        }

        public Criteria andFeedbackContentIn(List<String> values) {
            addCriterion("feedback_content in", values, "feedbackContent");
            return (Criteria) this;
        }

        public Criteria andFeedbackContentNotIn(List<String> values) {
            addCriterion("feedback_content not in", values, "feedbackContent");
            return (Criteria) this;
        }

        public Criteria andFeedbackContentBetween(String value1, String value2) {
            addCriterion("feedback_content between", value1, value2, "feedbackContent");
            return (Criteria) this;
        }

        public Criteria andFeedbackContentNotBetween(String value1, String value2) {
            addCriterion("feedback_content not between", value1, value2, "feedbackContent");
            return (Criteria) this;
        }

        public Criteria andMemorialsStatusIsNull() {
            addCriterion("memorials_status is null");
            return (Criteria) this;
        }

        public Criteria andMemorialsStatusIsNotNull() {
            addCriterion("memorials_status is not null");
            return (Criteria) this;
        }

        public Criteria andMemorialsStatusEqualTo(Integer value) {
            addCriterion("memorials_status =", value, "memorialsStatus");
            return (Criteria) this;
        }

        public Criteria andMemorialsStatusNotEqualTo(Integer value) {
            addCriterion("memorials_status <>", value, "memorialsStatus");
            return (Criteria) this;
        }

        public Criteria andMemorialsStatusGreaterThan(Integer value) {
            addCriterion("memorials_status >", value, "memorialsStatus");
            return (Criteria) this;
        }

        public Criteria andMemorialsStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("memorials_status >=", value, "memorialsStatus");
            return (Criteria) this;
        }

        public Criteria andMemorialsStatusLessThan(Integer value) {
            addCriterion("memorials_status <", value, "memorialsStatus");
            return (Criteria) this;
        }

        public Criteria andMemorialsStatusLessThanOrEqualTo(Integer value) {
            addCriterion("memorials_status <=", value, "memorialsStatus");
            return (Criteria) this;
        }

        public Criteria andMemorialsStatusIn(List<Integer> values) {
            addCriterion("memorials_status in", values, "memorialsStatus");
            return (Criteria) this;
        }

        public Criteria andMemorialsStatusNotIn(List<Integer> values) {
            addCriterion("memorials_status not in", values, "memorialsStatus");
            return (Criteria) this;
        }

        public Criteria andMemorialsStatusBetween(Integer value1, Integer value2) {
            addCriterion("memorials_status between", value1, value2, "memorialsStatus");
            return (Criteria) this;
        }

        public Criteria andMemorialsStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("memorials_status not between", value1, value2, "memorialsStatus");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table t_memorials
     *
     * @mbggenerated do_not_delete_during_merge Tue Jun 21 09:54:55 CST 2022
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table t_memorials
     *
     * @mbggenerated Tue Jun 21 09:54:55 CST 2022
     */
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