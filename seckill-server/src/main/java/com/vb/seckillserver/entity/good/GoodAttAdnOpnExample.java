package com.vb.seckillserver.entity.good;

import java.util.ArrayList;
import java.util.List;

public class GoodAttAdnOpnExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public GoodAttAdnOpnExample() {
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

        public Criteria andSkuIdIsNull() {
            addCriterion("sku_id is null");
            return (Criteria) this;
        }

        public Criteria andSkuIdIsNotNull() {
            addCriterion("sku_id is not null");
            return (Criteria) this;
        }

        public Criteria andSkuIdEqualTo(Integer value) {
            addCriterion("sku_id =", value, "skuId");
            return (Criteria) this;
        }

        public Criteria andSkuIdNotEqualTo(Integer value) {
            addCriterion("sku_id <>", value, "skuId");
            return (Criteria) this;
        }

        public Criteria andSkuIdGreaterThan(Integer value) {
            addCriterion("sku_id >", value, "skuId");
            return (Criteria) this;
        }

        public Criteria andSkuIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("sku_id >=", value, "skuId");
            return (Criteria) this;
        }

        public Criteria andSkuIdLessThan(Integer value) {
            addCriterion("sku_id <", value, "skuId");
            return (Criteria) this;
        }

        public Criteria andSkuIdLessThanOrEqualTo(Integer value) {
            addCriterion("sku_id <=", value, "skuId");
            return (Criteria) this;
        }

        public Criteria andSkuIdIn(List<Integer> values) {
            addCriterion("sku_id in", values, "skuId");
            return (Criteria) this;
        }

        public Criteria andSkuIdNotIn(List<Integer> values) {
            addCriterion("sku_id not in", values, "skuId");
            return (Criteria) this;
        }

        public Criteria andSkuIdBetween(Integer value1, Integer value2) {
            addCriterion("sku_id between", value1, value2, "skuId");
            return (Criteria) this;
        }

        public Criteria andSkuIdNotBetween(Integer value1, Integer value2) {
            addCriterion("sku_id not between", value1, value2, "skuId");
            return (Criteria) this;
        }

        public Criteria andOptionIdIsNull() {
            addCriterion("option_id is null");
            return (Criteria) this;
        }

        public Criteria andOptionIdIsNotNull() {
            addCriterion("option_id is not null");
            return (Criteria) this;
        }

        public Criteria andOptionIdEqualTo(Integer value) {
            addCriterion("option_id =", value, "optionId");
            return (Criteria) this;
        }

        public Criteria andOptionIdNotEqualTo(Integer value) {
            addCriterion("option_id <>", value, "optionId");
            return (Criteria) this;
        }

        public Criteria andOptionIdGreaterThan(Integer value) {
            addCriterion("option_id >", value, "optionId");
            return (Criteria) this;
        }

        public Criteria andOptionIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("option_id >=", value, "optionId");
            return (Criteria) this;
        }

        public Criteria andOptionIdLessThan(Integer value) {
            addCriterion("option_id <", value, "optionId");
            return (Criteria) this;
        }

        public Criteria andOptionIdLessThanOrEqualTo(Integer value) {
            addCriterion("option_id <=", value, "optionId");
            return (Criteria) this;
        }

        public Criteria andOptionIdIn(List<Integer> values) {
            addCriterion("option_id in", values, "optionId");
            return (Criteria) this;
        }

        public Criteria andOptionIdNotIn(List<Integer> values) {
            addCriterion("option_id not in", values, "optionId");
            return (Criteria) this;
        }

        public Criteria andOptionIdBetween(Integer value1, Integer value2) {
            addCriterion("option_id between", value1, value2, "optionId");
            return (Criteria) this;
        }

        public Criteria andOptionIdNotBetween(Integer value1, Integer value2) {
            addCriterion("option_id not between", value1, value2, "optionId");
            return (Criteria) this;
        }

        public Criteria andAttributeIdIsNull() {
            addCriterion("attribute_id is null");
            return (Criteria) this;
        }

        public Criteria andAttributeIdIsNotNull() {
            addCriterion("attribute_id is not null");
            return (Criteria) this;
        }

        public Criteria andAttributeIdEqualTo(Integer value) {
            addCriterion("attribute_id =", value, "attributeId");
            return (Criteria) this;
        }

        public Criteria andAttributeIdNotEqualTo(Integer value) {
            addCriterion("attribute_id <>", value, "attributeId");
            return (Criteria) this;
        }

        public Criteria andAttributeIdGreaterThan(Integer value) {
            addCriterion("attribute_id >", value, "attributeId");
            return (Criteria) this;
        }

        public Criteria andAttributeIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("attribute_id >=", value, "attributeId");
            return (Criteria) this;
        }

        public Criteria andAttributeIdLessThan(Integer value) {
            addCriterion("attribute_id <", value, "attributeId");
            return (Criteria) this;
        }

        public Criteria andAttributeIdLessThanOrEqualTo(Integer value) {
            addCriterion("attribute_id <=", value, "attributeId");
            return (Criteria) this;
        }

        public Criteria andAttributeIdIn(List<Integer> values) {
            addCriterion("attribute_id in", values, "attributeId");
            return (Criteria) this;
        }

        public Criteria andAttributeIdNotIn(List<Integer> values) {
            addCriterion("attribute_id not in", values, "attributeId");
            return (Criteria) this;
        }

        public Criteria andAttributeIdBetween(Integer value1, Integer value2) {
            addCriterion("attribute_id between", value1, value2, "attributeId");
            return (Criteria) this;
        }

        public Criteria andAttributeIdNotBetween(Integer value1, Integer value2) {
            addCriterion("attribute_id not between", value1, value2, "attributeId");
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

        public Criteria andSupplierOptionIdIsNull() {
            addCriterion("supplier_option_id is null");
            return (Criteria) this;
        }

        public Criteria andSupplierOptionIdIsNotNull() {
            addCriterion("supplier_option_id is not null");
            return (Criteria) this;
        }

        public Criteria andSupplierOptionIdEqualTo(Integer value) {
            addCriterion("supplier_option_id =", value, "supplierOptionId");
            return (Criteria) this;
        }

        public Criteria andSupplierOptionIdNotEqualTo(Integer value) {
            addCriterion("supplier_option_id <>", value, "supplierOptionId");
            return (Criteria) this;
        }

        public Criteria andSupplierOptionIdGreaterThan(Integer value) {
            addCriterion("supplier_option_id >", value, "supplierOptionId");
            return (Criteria) this;
        }

        public Criteria andSupplierOptionIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("supplier_option_id >=", value, "supplierOptionId");
            return (Criteria) this;
        }

        public Criteria andSupplierOptionIdLessThan(Integer value) {
            addCriterion("supplier_option_id <", value, "supplierOptionId");
            return (Criteria) this;
        }

        public Criteria andSupplierOptionIdLessThanOrEqualTo(Integer value) {
            addCriterion("supplier_option_id <=", value, "supplierOptionId");
            return (Criteria) this;
        }

        public Criteria andSupplierOptionIdIn(List<Integer> values) {
            addCriterion("supplier_option_id in", values, "supplierOptionId");
            return (Criteria) this;
        }

        public Criteria andSupplierOptionIdNotIn(List<Integer> values) {
            addCriterion("supplier_option_id not in", values, "supplierOptionId");
            return (Criteria) this;
        }

        public Criteria andSupplierOptionIdBetween(Integer value1, Integer value2) {
            addCriterion("supplier_option_id between", value1, value2, "supplierOptionId");
            return (Criteria) this;
        }

        public Criteria andSupplierOptionIdNotBetween(Integer value1, Integer value2) {
            addCriterion("supplier_option_id not between", value1, value2, "supplierOptionId");
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