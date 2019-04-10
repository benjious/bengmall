package com.vb.seckillserver.entity.good;

import java.util.ArrayList;
import java.util.List;

public class GoodStoreExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public GoodStoreExample() {
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

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andNameIsNull() {
            addCriterion("name is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("name is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("name =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("name <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("name >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("name >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("name <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("name <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("name like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("name not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("name in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("name not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("name between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("name not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andStorePhoneIsNull() {
            addCriterion("store_phone is null");
            return (Criteria) this;
        }

        public Criteria andStorePhoneIsNotNull() {
            addCriterion("store_phone is not null");
            return (Criteria) this;
        }

        public Criteria andStorePhoneEqualTo(String value) {
            addCriterion("store_phone =", value, "storePhone");
            return (Criteria) this;
        }

        public Criteria andStorePhoneNotEqualTo(String value) {
            addCriterion("store_phone <>", value, "storePhone");
            return (Criteria) this;
        }

        public Criteria andStorePhoneGreaterThan(String value) {
            addCriterion("store_phone >", value, "storePhone");
            return (Criteria) this;
        }

        public Criteria andStorePhoneGreaterThanOrEqualTo(String value) {
            addCriterion("store_phone >=", value, "storePhone");
            return (Criteria) this;
        }

        public Criteria andStorePhoneLessThan(String value) {
            addCriterion("store_phone <", value, "storePhone");
            return (Criteria) this;
        }

        public Criteria andStorePhoneLessThanOrEqualTo(String value) {
            addCriterion("store_phone <=", value, "storePhone");
            return (Criteria) this;
        }

        public Criteria andStorePhoneLike(String value) {
            addCriterion("store_phone like", value, "storePhone");
            return (Criteria) this;
        }

        public Criteria andStorePhoneNotLike(String value) {
            addCriterion("store_phone not like", value, "storePhone");
            return (Criteria) this;
        }

        public Criteria andStorePhoneIn(List<String> values) {
            addCriterion("store_phone in", values, "storePhone");
            return (Criteria) this;
        }

        public Criteria andStorePhoneNotIn(List<String> values) {
            addCriterion("store_phone not in", values, "storePhone");
            return (Criteria) this;
        }

        public Criteria andStorePhoneBetween(String value1, String value2) {
            addCriterion("store_phone between", value1, value2, "storePhone");
            return (Criteria) this;
        }

        public Criteria andStorePhoneNotBetween(String value1, String value2) {
            addCriterion("store_phone not between", value1, value2, "storePhone");
            return (Criteria) this;
        }

        public Criteria andImgUrlIsNull() {
            addCriterion("img_url is null");
            return (Criteria) this;
        }

        public Criteria andImgUrlIsNotNull() {
            addCriterion("img_url is not null");
            return (Criteria) this;
        }

        public Criteria andImgUrlEqualTo(String value) {
            addCriterion("img_url =", value, "imgUrl");
            return (Criteria) this;
        }

        public Criteria andImgUrlNotEqualTo(String value) {
            addCriterion("img_url <>", value, "imgUrl");
            return (Criteria) this;
        }

        public Criteria andImgUrlGreaterThan(String value) {
            addCriterion("img_url >", value, "imgUrl");
            return (Criteria) this;
        }

        public Criteria andImgUrlGreaterThanOrEqualTo(String value) {
            addCriterion("img_url >=", value, "imgUrl");
            return (Criteria) this;
        }

        public Criteria andImgUrlLessThan(String value) {
            addCriterion("img_url <", value, "imgUrl");
            return (Criteria) this;
        }

        public Criteria andImgUrlLessThanOrEqualTo(String value) {
            addCriterion("img_url <=", value, "imgUrl");
            return (Criteria) this;
        }

        public Criteria andImgUrlLike(String value) {
            addCriterion("img_url like", value, "imgUrl");
            return (Criteria) this;
        }

        public Criteria andImgUrlNotLike(String value) {
            addCriterion("img_url not like", value, "imgUrl");
            return (Criteria) this;
        }

        public Criteria andImgUrlIn(List<String> values) {
            addCriterion("img_url in", values, "imgUrl");
            return (Criteria) this;
        }

        public Criteria andImgUrlNotIn(List<String> values) {
            addCriterion("img_url not in", values, "imgUrl");
            return (Criteria) this;
        }

        public Criteria andImgUrlBetween(String value1, String value2) {
            addCriterion("img_url between", value1, value2, "imgUrl");
            return (Criteria) this;
        }

        public Criteria andImgUrlNotBetween(String value1, String value2) {
            addCriterion("img_url not between", value1, value2, "imgUrl");
            return (Criteria) this;
        }

        public Criteria andChargePersonIdIsNull() {
            addCriterion("charge_person_id is null");
            return (Criteria) this;
        }

        public Criteria andChargePersonIdIsNotNull() {
            addCriterion("charge_person_id is not null");
            return (Criteria) this;
        }

        public Criteria andChargePersonIdEqualTo(Integer value) {
            addCriterion("charge_person_id =", value, "chargePersonId");
            return (Criteria) this;
        }

        public Criteria andChargePersonIdNotEqualTo(Integer value) {
            addCriterion("charge_person_id <>", value, "chargePersonId");
            return (Criteria) this;
        }

        public Criteria andChargePersonIdGreaterThan(Integer value) {
            addCriterion("charge_person_id >", value, "chargePersonId");
            return (Criteria) this;
        }

        public Criteria andChargePersonIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("charge_person_id >=", value, "chargePersonId");
            return (Criteria) this;
        }

        public Criteria andChargePersonIdLessThan(Integer value) {
            addCriterion("charge_person_id <", value, "chargePersonId");
            return (Criteria) this;
        }

        public Criteria andChargePersonIdLessThanOrEqualTo(Integer value) {
            addCriterion("charge_person_id <=", value, "chargePersonId");
            return (Criteria) this;
        }

        public Criteria andChargePersonIdIn(List<Integer> values) {
            addCriterion("charge_person_id in", values, "chargePersonId");
            return (Criteria) this;
        }

        public Criteria andChargePersonIdNotIn(List<Integer> values) {
            addCriterion("charge_person_id not in", values, "chargePersonId");
            return (Criteria) this;
        }

        public Criteria andChargePersonIdBetween(Integer value1, Integer value2) {
            addCriterion("charge_person_id between", value1, value2, "chargePersonId");
            return (Criteria) this;
        }

        public Criteria andChargePersonIdNotBetween(Integer value1, Integer value2) {
            addCriterion("charge_person_id not between", value1, value2, "chargePersonId");
            return (Criteria) this;
        }

        public Criteria andSellTagsIsNull() {
            addCriterion("sell_tags is null");
            return (Criteria) this;
        }

        public Criteria andSellTagsIsNotNull() {
            addCriterion("sell_tags is not null");
            return (Criteria) this;
        }

        public Criteria andSellTagsEqualTo(String value) {
            addCriterion("sell_tags =", value, "sellTags");
            return (Criteria) this;
        }

        public Criteria andSellTagsNotEqualTo(String value) {
            addCriterion("sell_tags <>", value, "sellTags");
            return (Criteria) this;
        }

        public Criteria andSellTagsGreaterThan(String value) {
            addCriterion("sell_tags >", value, "sellTags");
            return (Criteria) this;
        }

        public Criteria andSellTagsGreaterThanOrEqualTo(String value) {
            addCriterion("sell_tags >=", value, "sellTags");
            return (Criteria) this;
        }

        public Criteria andSellTagsLessThan(String value) {
            addCriterion("sell_tags <", value, "sellTags");
            return (Criteria) this;
        }

        public Criteria andSellTagsLessThanOrEqualTo(String value) {
            addCriterion("sell_tags <=", value, "sellTags");
            return (Criteria) this;
        }

        public Criteria andSellTagsLike(String value) {
            addCriterion("sell_tags like", value, "sellTags");
            return (Criteria) this;
        }

        public Criteria andSellTagsNotLike(String value) {
            addCriterion("sell_tags not like", value, "sellTags");
            return (Criteria) this;
        }

        public Criteria andSellTagsIn(List<String> values) {
            addCriterion("sell_tags in", values, "sellTags");
            return (Criteria) this;
        }

        public Criteria andSellTagsNotIn(List<String> values) {
            addCriterion("sell_tags not in", values, "sellTags");
            return (Criteria) this;
        }

        public Criteria andSellTagsBetween(String value1, String value2) {
            addCriterion("sell_tags between", value1, value2, "sellTags");
            return (Criteria) this;
        }

        public Criteria andSellTagsNotBetween(String value1, String value2) {
            addCriterion("sell_tags not between", value1, value2, "sellTags");
            return (Criteria) this;
        }

        public Criteria andStoreAddrCityIsNull() {
            addCriterion("store_addr_city is null");
            return (Criteria) this;
        }

        public Criteria andStoreAddrCityIsNotNull() {
            addCriterion("store_addr_city is not null");
            return (Criteria) this;
        }

        public Criteria andStoreAddrCityEqualTo(String value) {
            addCriterion("store_addr_city =", value, "storeAddrCity");
            return (Criteria) this;
        }

        public Criteria andStoreAddrCityNotEqualTo(String value) {
            addCriterion("store_addr_city <>", value, "storeAddrCity");
            return (Criteria) this;
        }

        public Criteria andStoreAddrCityGreaterThan(String value) {
            addCriterion("store_addr_city >", value, "storeAddrCity");
            return (Criteria) this;
        }

        public Criteria andStoreAddrCityGreaterThanOrEqualTo(String value) {
            addCriterion("store_addr_city >=", value, "storeAddrCity");
            return (Criteria) this;
        }

        public Criteria andStoreAddrCityLessThan(String value) {
            addCriterion("store_addr_city <", value, "storeAddrCity");
            return (Criteria) this;
        }

        public Criteria andStoreAddrCityLessThanOrEqualTo(String value) {
            addCriterion("store_addr_city <=", value, "storeAddrCity");
            return (Criteria) this;
        }

        public Criteria andStoreAddrCityLike(String value) {
            addCriterion("store_addr_city like", value, "storeAddrCity");
            return (Criteria) this;
        }

        public Criteria andStoreAddrCityNotLike(String value) {
            addCriterion("store_addr_city not like", value, "storeAddrCity");
            return (Criteria) this;
        }

        public Criteria andStoreAddrCityIn(List<String> values) {
            addCriterion("store_addr_city in", values, "storeAddrCity");
            return (Criteria) this;
        }

        public Criteria andStoreAddrCityNotIn(List<String> values) {
            addCriterion("store_addr_city not in", values, "storeAddrCity");
            return (Criteria) this;
        }

        public Criteria andStoreAddrCityBetween(String value1, String value2) {
            addCriterion("store_addr_city between", value1, value2, "storeAddrCity");
            return (Criteria) this;
        }

        public Criteria andStoreAddrCityNotBetween(String value1, String value2) {
            addCriterion("store_addr_city not between", value1, value2, "storeAddrCity");
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