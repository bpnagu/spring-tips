/**
 * This class is generated by jOOQ
 */
package com.example.jooq.tables.records;


import com.example.jooq.tables.Product;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record3;
import org.jooq.Row3;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.8.6"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class ProductRecord extends UpdatableRecordImpl<ProductRecord> implements Record3<Long, Long, String> {

    private static final long serialVersionUID = -1665855857;

    /**
     * Setter for <code>PUBLIC.PRODUCT.ID</code>.
     */
    public void setId(Long value) {
        set(0, value);
    }

    /**
     * Getter for <code>PUBLIC.PRODUCT.ID</code>.
     */
    public Long getId() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>PUBLIC.PRODUCT.CUSTOMER_ID</code>.
     */
    public void setCustomerId(Long value) {
        set(1, value);
    }

    /**
     * Getter for <code>PUBLIC.PRODUCT.CUSTOMER_ID</code>.
     */
    public Long getCustomerId() {
        return (Long) get(1);
    }

    /**
     * Setter for <code>PUBLIC.PRODUCT.SKU</code>.
     */
    public void setSku(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>PUBLIC.PRODUCT.SKU</code>.
     */
    public String getSku() {
        return (String) get(2);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Record1<Long> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record3 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row3<Long, Long, String> fieldsRow() {
        return (Row3) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row3<Long, Long, String> valuesRow() {
        return (Row3) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field1() {
        return Product.PRODUCT.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field2() {
        return Product.PRODUCT.CUSTOMER_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return Product.PRODUCT.SKU;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value1() {
        return getId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value2() {
        return getCustomerId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getSku();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ProductRecord value1(Long value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ProductRecord value2(Long value) {
        setCustomerId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ProductRecord value3(String value) {
        setSku(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ProductRecord values(Long value1, Long value2, String value3) {
        value1(value1);
        value2(value2);
        value3(value3);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached ProductRecord
     */
    public ProductRecord() {
        super(Product.PRODUCT);
    }

    /**
     * Create a detached, initialised ProductRecord
     */
    public ProductRecord(Long id, Long customerId, String sku) {
        super(Product.PRODUCT);

        set(0, id);
        set(1, customerId);
        set(2, sku);
    }
}
