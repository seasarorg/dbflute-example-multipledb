/*
 * Copyright(c) DBFlute TestCo.,TestLtd. All Rights Reserved.
 */package com.example.dbflute.multipledb.spring.dbflute.librarydb.bsentity;

import java.io.Serializable;
import java.util.List;
import java.util.ArrayList;
import java.util.Set;

import org.seasar.dbflute.dbmeta.DBMeta;
import org.seasar.dbflute.Entity;
import com.example.dbflute.multipledb.spring.dbflute.librarydb.allcommon.LdDBMetaInstanceHandler;
import com.example.dbflute.multipledb.spring.dbflute.librarydb.exentity.*;

/**
 * The entity of COLLECTION as TABLE. <br />
 * <pre>
 * [primary-key]
 *     COLLECTION_ID
 * 
 * [column]
 *     COLLECTION_ID, LIBRARY_ID, BOOK_ID, ARRIVAL_DATE, R_USER, R_MODULE, R_TIMESTAMP, U_USER, U_MODULE, U_TIMESTAMP
 * 
 * [sequence]
 *     
 * 
 * [identity]
 *     COLLECTION_ID
 * 
 * [version-no]
 *     
 * 
 * [foreign table]
 *     BOOK, LIBRARY, COLLECTION_STATUS(AsOne)
 * 
 * [referrer table]
 *     LENDING_COLLECTION, COLLECTION_STATUS
 * 
 * [foreign property]
 *     book, library, collectionStatusAsOne
 * 
 * [referrer property]
 *     lendingCollectionList
 * 
 * [get/set template]
 * /= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =
 * Integer collectionId = entity.getCollectionId();
 * Integer libraryId = entity.getLibraryId();
 * Integer bookId = entity.getBookId();
 * java.sql.Timestamp arrivalDate = entity.getArrivalDate();
 * String rUser = entity.getRUser();
 * String rModule = entity.getRModule();
 * java.sql.Timestamp rTimestamp = entity.getRTimestamp();
 * String uUser = entity.getUUser();
 * String uModule = entity.getUModule();
 * java.sql.Timestamp uTimestamp = entity.getUTimestamp();
 * entity.setCollectionId(collectionId);
 * entity.setLibraryId(libraryId);
 * entity.setBookId(bookId);
 * entity.setArrivalDate(arrivalDate);
 * entity.setRUser(rUser);
 * entity.setRModule(rModule);
 * entity.setRTimestamp(rTimestamp);
 * entity.setUUser(uUser);
 * entity.setUModule(uModule);
 * entity.setUTimestamp(uTimestamp);
 * = = = = = = = = = =/
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class LdBsCollection implements Entity, Serializable, Cloneable {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** Serial version UID. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    // -----------------------------------------------------
    //                                                Column
    //                                                ------
    /** COLLECTION_ID: {PK, ID, NotNull, INTEGER(10)} */
    protected Integer _collectionId;

    /** LIBRARY_ID: {UQ+, IX, NotNull, SMALLINT(5), FK to LIBRARY} */
    protected Integer _libraryId;

    /** BOOK_ID: {+UQ, IX, NotNull, INTEGER(10), FK to BOOK} */
    protected Integer _bookId;

    /** ARRIVAL_DATE: {NotNull, TIMESTAMP(26, 6)} */
    protected java.sql.Timestamp _arrivalDate;

    /** R_USER: {NotNull, VARCHAR(100), default=[default-user]} */
    protected String _rUser;

    /** R_MODULE: {NotNull, VARCHAR(100), default=[default-module]} */
    protected String _rModule;

    /** R_TIMESTAMP: {NotNull, TIMESTAMP(26, 6), default=[CURRENT_TIMESTAMP]} */
    protected java.sql.Timestamp _rTimestamp;

    /** U_USER: {NotNull, VARCHAR(100), default=[default-user]} */
    protected String _uUser;

    /** U_MODULE: {NotNull, VARCHAR(100), default=[default-module]} */
    protected String _uModule;

    /** U_TIMESTAMP: {NotNull, TIMESTAMP(26, 6), default=[CURRENT_TIMESTAMP]} */
    protected java.sql.Timestamp _uTimestamp;

    // -----------------------------------------------------
    //                                              Internal
    //                                              --------
    /** The unique-driven properties for this entity. (NotNull) */
    protected final EntityUniqueDrivenProperties __uniqueDrivenProperties = newUniqueDrivenProperties();

    /** The modified properties for this entity. (NotNull) */
    protected final EntityModifiedProperties __modifiedProperties = newModifiedProperties();

    /** Is the entity created by DBFlute select process? */
    protected boolean __createdBySelect;

    // ===================================================================================
    //                                                                          Table Name
    //                                                                          ==========
    /**
     * {@inheritDoc}
     */
    public String getTableDbName() {
        return "COLLECTION";
    }

    /**
     * {@inheritDoc}
     */
    public String getTablePropertyName() { // according to Java Beans rule
        return "collection";
    }

    // ===================================================================================
    //                                                                              DBMeta
    //                                                                              ======
    /**
     * {@inheritDoc}
     */
    public DBMeta getDBMeta() {
        return LdDBMetaInstanceHandler.findDBMeta(getTableDbName());
    }

    // ===================================================================================
    //                                                                         Primary Key
    //                                                                         ===========
    /**
     * {@inheritDoc}
     */
    public boolean hasPrimaryKeyValue() {
        if (getCollectionId() == null) { return false; }
        return true;
    }

    /**
     * To be unique by the unique column. <br />
     * You can update the entity by the key when entity update (NOT batch update).
     * @param libraryId : UQ+, IX, NotNull, SMALLINT(5), FK to LIBRARY. (NotNull)
     * @param bookId : +UQ, IX, NotNull, INTEGER(10), FK to BOOK. (NotNull)
     */
    public void uniqueBy(Integer libraryId, Integer bookId) {
        __uniqueDrivenProperties.clear();
        __uniqueDrivenProperties.addPropertyName("libraryId");
        __uniqueDrivenProperties.addPropertyName("bookId");
        setLibraryId(libraryId);setBookId(bookId);
    }

    /**
     * {@inheritDoc}
     */
    public Set<String> myuniqueDrivenProperties() {
        return __uniqueDrivenProperties.getPropertyNames();
    }

    protected EntityUniqueDrivenProperties newUniqueDrivenProperties() {
        return new EntityUniqueDrivenProperties();
    }

    // ===================================================================================
    //                                                                    Foreign Property
    //                                                                    ================
    /** BOOK by my BOOK_ID, named 'book'. */
    protected LdBook _book;

    /**
     * BOOK by my BOOK_ID, named 'book'.
     * @return The entity of foreign property 'book'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public LdBook getBook() {
        return _book;
    }

    /**
     * BOOK by my BOOK_ID, named 'book'.
     * @param book The entity of foreign property 'book'. (NullAllowed)
     */
    public void setBook(LdBook book) {
        _book = book;
    }

    /** LIBRARY by my LIBRARY_ID, named 'library'. */
    protected LdLibrary _library;

    /**
     * LIBRARY by my LIBRARY_ID, named 'library'.
     * @return The entity of foreign property 'library'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public LdLibrary getLibrary() {
        return _library;
    }

    /**
     * LIBRARY by my LIBRARY_ID, named 'library'.
     * @param library The entity of foreign property 'library'. (NullAllowed)
     */
    public void setLibrary(LdLibrary library) {
        _library = library;
    }

    /** COLLECTION_STATUS by COLLECTION_ID, named 'collectionStatusAsOne'. */
    protected LdCollectionStatus _collectionStatusAsOne;

    /**
     * COLLECTION_STATUS by COLLECTION_ID, named 'collectionStatusAsOne'.
     * @return the entity of foreign property(referrer-as-one) 'collectionStatusAsOne'. (NullAllowed: when e.g. no data, no setupSelect)
     */
    public LdCollectionStatus getCollectionStatusAsOne() {
        return _collectionStatusAsOne;
    }

    /**
     * COLLECTION_STATUS by COLLECTION_ID, named 'collectionStatusAsOne'.
     * @param collectionStatusAsOne The entity of foreign property(referrer-as-one) 'collectionStatusAsOne'. (NullAllowed)
     */
    public void setCollectionStatusAsOne(LdCollectionStatus collectionStatusAsOne) {
        _collectionStatusAsOne = collectionStatusAsOne;
    }

    // ===================================================================================
    //                                                                   Referrer Property
    //                                                                   =================
    /** LENDING_COLLECTION by COLLECTION_ID, named 'lendingCollectionList'. */
    protected List<LdLendingCollection> _lendingCollectionList;

    /**
     * LENDING_COLLECTION by COLLECTION_ID, named 'lendingCollectionList'.
     * @return The entity list of referrer property 'lendingCollectionList'. (NotNull: even if no loading, returns empty list)
     */
    public List<LdLendingCollection> getLendingCollectionList() {
        if (_lendingCollectionList == null) { _lendingCollectionList = newReferrerList(); }
        return _lendingCollectionList;
    }

    /**
     * LENDING_COLLECTION by COLLECTION_ID, named 'lendingCollectionList'.
     * @param lendingCollectionList The entity list of referrer property 'lendingCollectionList'. (NullAllowed)
     */
    public void setLendingCollectionList(List<LdLendingCollection> lendingCollectionList) {
        _lendingCollectionList = lendingCollectionList;
    }

    protected <ELEMENT> List<ELEMENT> newReferrerList() {
        return new ArrayList<ELEMENT>();
    }

    // ===================================================================================
    //                                                                 Modified Properties
    //                                                                 ===================
    /**
     * {@inheritDoc}
     */
    public Set<String> modifiedProperties() {
        return __modifiedProperties.getPropertyNames();
    }

    /**
     * {@inheritDoc}
     */
    public void clearModifiedInfo() {
        __modifiedProperties.clear();
    }

    /**
     * {@inheritDoc}
     */
    public boolean hasModification() {
        return !__modifiedProperties.isEmpty();
    }

    protected EntityModifiedProperties newModifiedProperties() {
        return new EntityModifiedProperties();
    }

    // ===================================================================================
    //                                                                     Birthplace Mark
    //                                                                     ===============
    /**
     * {@inheritDoc}
     */
    public void markAsSelect() {
        __createdBySelect = true;
    }

    /**
     * {@inheritDoc}
     */
    public boolean createdBySelect() {
        return __createdBySelect;
    }

    // ===================================================================================
    //                                                                      Basic Override
    //                                                                      ==============
    /**
     * Determine the object is equal with this. <br />
     * If primary-keys or columns of the other are same as this one, returns true.
     * @param obj The object as other entity. (NullAllowed: if null, returns false fixedly)
     * @return Comparing result.
     */
    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof LdBsCollection)) { return false; }
        LdBsCollection other = (LdBsCollection)obj;
        if (!xSV(getCollectionId(), other.getCollectionId())) { return false; }
        return true;
    }
    protected boolean xSV(Object v1, Object v2) {
        return FunCustodial.isSameValue(v1, v2);
    }

    /**
     * Calculate the hash-code from primary-keys or columns.
     * @return The hash-code from primary-key or columns.
     */
    public int hashCode() {
        int hs = 17;
        hs = xCH(hs, getTableDbName());
        hs = xCH(hs, getCollectionId());
        return hs;
    }
    protected int xCH(int hs, Object vl) {
        return FunCustodial.calculateHashcode(hs, vl);
    }

    /**
     * {@inheritDoc}
     */
    public int instanceHash() {
        return super.hashCode();
    }

    /**
     * Convert to display string of entity's data. (no relation data)
     * @return The display string of all columns and relation existences. (NotNull)
     */
    public String toString() {
        return buildDisplayString(FunCustodial.toClassTitle(this), true, true);
    }

    /**
     * {@inheritDoc}
     */
    public String toStringWithRelation() {
        StringBuilder sb = new StringBuilder();
        sb.append(toString());
        String li = "\n  ";
        if (_book != null)
        { sb.append(li).append(xbRDS(_book, "book")); }
        if (_library != null)
        { sb.append(li).append(xbRDS(_library, "library")); }
        if (_collectionStatusAsOne != null)
        { sb.append(li).append(xbRDS(_collectionStatusAsOne, "collectionStatusAsOne")); }
        if (_lendingCollectionList != null) { for (Entity et : _lendingCollectionList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "lendingCollectionList")); } } }
        return sb.toString();
    }
    protected String xbRDS(Entity et, String name) { // buildRelationDisplayString()
        return et.buildDisplayString(name, true, true);
    }

    /**
     * {@inheritDoc}
     */
    public String buildDisplayString(String name, boolean column, boolean relation) {
        StringBuilder sb = new StringBuilder();
        if (name != null) { sb.append(name).append(column || relation ? ":" : ""); }
        if (column) { sb.append(buildColumnString()); }
        if (relation) { sb.append(buildRelationString()); }
        sb.append("@").append(Integer.toHexString(hashCode()));
        return sb.toString();
    }
    protected String buildColumnString() {
        StringBuilder sb = new StringBuilder();
        String dm = ", ";
        sb.append(dm).append(getCollectionId());
        sb.append(dm).append(getLibraryId());
        sb.append(dm).append(getBookId());
        sb.append(dm).append(getArrivalDate());
        sb.append(dm).append(getRUser());
        sb.append(dm).append(getRModule());
        sb.append(dm).append(getRTimestamp());
        sb.append(dm).append(getUUser());
        sb.append(dm).append(getUModule());
        sb.append(dm).append(getUTimestamp());
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length());
        }
        sb.insert(0, "{").append("}");
        return sb.toString();
    }
    protected String buildRelationString() {
        StringBuilder sb = new StringBuilder();
        String cm = ",";
        if (_book != null) { sb.append(cm).append("book"); }
        if (_library != null) { sb.append(cm).append("library"); }
        if (_collectionStatusAsOne != null) { sb.append(cm).append("collectionStatusAsOne"); }
        if (_lendingCollectionList != null && !_lendingCollectionList.isEmpty())
        { sb.append(cm).append("lendingCollectionList"); }
        if (sb.length() > cm.length()) {
            sb.delete(0, cm.length()).insert(0, "(").append(")");
        }
        return sb.toString();
    }

    /**
     * Clone entity instance using super.clone(). (shallow copy) 
     * @return The cloned instance of this entity. (NotNull)
     */
    public LdCollection clone() {
        try {
            return (LdCollection)super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Failed to clone the entity: " + toString(), e);
        }
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] COLLECTION_ID: {PK, ID, NotNull, INTEGER(10)} <br />
     * @return The value of the column 'COLLECTION_ID'. (basically NotNull if selected: for the constraint)
     */
    public Integer getCollectionId() {
        return _collectionId;
    }

    /**
     * [set] COLLECTION_ID: {PK, ID, NotNull, INTEGER(10)} <br />
     * @param collectionId The value of the column 'COLLECTION_ID'. (basically NotNull if update: for the constraint)
     */
    public void setCollectionId(Integer collectionId) {
        __modifiedProperties.addPropertyName("collectionId");
        this._collectionId = collectionId;
    }

    /**
     * [get] LIBRARY_ID: {UQ+, IX, NotNull, SMALLINT(5), FK to LIBRARY} <br />
     * @return The value of the column 'LIBRARY_ID'. (basically NotNull if selected: for the constraint)
     */
    public Integer getLibraryId() {
        return _libraryId;
    }

    /**
     * [set] LIBRARY_ID: {UQ+, IX, NotNull, SMALLINT(5), FK to LIBRARY} <br />
     * @param libraryId The value of the column 'LIBRARY_ID'. (basically NotNull if update: for the constraint)
     */
    public void setLibraryId(Integer libraryId) {
        __modifiedProperties.addPropertyName("libraryId");
        this._libraryId = libraryId;
    }

    /**
     * [get] BOOK_ID: {+UQ, IX, NotNull, INTEGER(10), FK to BOOK} <br />
     * @return The value of the column 'BOOK_ID'. (basically NotNull if selected: for the constraint)
     */
    public Integer getBookId() {
        return _bookId;
    }

    /**
     * [set] BOOK_ID: {+UQ, IX, NotNull, INTEGER(10), FK to BOOK} <br />
     * @param bookId The value of the column 'BOOK_ID'. (basically NotNull if update: for the constraint)
     */
    public void setBookId(Integer bookId) {
        __modifiedProperties.addPropertyName("bookId");
        this._bookId = bookId;
    }

    /**
     * [get] ARRIVAL_DATE: {NotNull, TIMESTAMP(26, 6)} <br />
     * @return The value of the column 'ARRIVAL_DATE'. (basically NotNull if selected: for the constraint)
     */
    public java.sql.Timestamp getArrivalDate() {
        return _arrivalDate;
    }

    /**
     * [set] ARRIVAL_DATE: {NotNull, TIMESTAMP(26, 6)} <br />
     * @param arrivalDate The value of the column 'ARRIVAL_DATE'. (basically NotNull if update: for the constraint)
     */
    public void setArrivalDate(java.sql.Timestamp arrivalDate) {
        __modifiedProperties.addPropertyName("arrivalDate");
        this._arrivalDate = arrivalDate;
    }

    /**
     * [get] R_USER: {NotNull, VARCHAR(100), default=[default-user]} <br />
     * @return The value of the column 'R_USER'. (basically NotNull if selected: for the constraint)
     */
    public String getRUser() {
        return _rUser;
    }

    /**
     * [set] R_USER: {NotNull, VARCHAR(100), default=[default-user]} <br />
     * @param rUser The value of the column 'R_USER'. (basically NotNull if update: for the constraint)
     */
    public void setRUser(String rUser) {
        __modifiedProperties.addPropertyName("RUser");
        this._rUser = rUser;
    }

    /**
     * [get] R_MODULE: {NotNull, VARCHAR(100), default=[default-module]} <br />
     * @return The value of the column 'R_MODULE'. (basically NotNull if selected: for the constraint)
     */
    public String getRModule() {
        return _rModule;
    }

    /**
     * [set] R_MODULE: {NotNull, VARCHAR(100), default=[default-module]} <br />
     * @param rModule The value of the column 'R_MODULE'. (basically NotNull if update: for the constraint)
     */
    public void setRModule(String rModule) {
        __modifiedProperties.addPropertyName("RModule");
        this._rModule = rModule;
    }

    /**
     * [get] R_TIMESTAMP: {NotNull, TIMESTAMP(26, 6), default=[CURRENT_TIMESTAMP]} <br />
     * @return The value of the column 'R_TIMESTAMP'. (basically NotNull if selected: for the constraint)
     */
    public java.sql.Timestamp getRTimestamp() {
        return _rTimestamp;
    }

    /**
     * [set] R_TIMESTAMP: {NotNull, TIMESTAMP(26, 6), default=[CURRENT_TIMESTAMP]} <br />
     * @param rTimestamp The value of the column 'R_TIMESTAMP'. (basically NotNull if update: for the constraint)
     */
    public void setRTimestamp(java.sql.Timestamp rTimestamp) {
        __modifiedProperties.addPropertyName("RTimestamp");
        this._rTimestamp = rTimestamp;
    }

    /**
     * [get] U_USER: {NotNull, VARCHAR(100), default=[default-user]} <br />
     * @return The value of the column 'U_USER'. (basically NotNull if selected: for the constraint)
     */
    public String getUUser() {
        return _uUser;
    }

    /**
     * [set] U_USER: {NotNull, VARCHAR(100), default=[default-user]} <br />
     * @param uUser The value of the column 'U_USER'. (basically NotNull if update: for the constraint)
     */
    public void setUUser(String uUser) {
        __modifiedProperties.addPropertyName("UUser");
        this._uUser = uUser;
    }

    /**
     * [get] U_MODULE: {NotNull, VARCHAR(100), default=[default-module]} <br />
     * @return The value of the column 'U_MODULE'. (basically NotNull if selected: for the constraint)
     */
    public String getUModule() {
        return _uModule;
    }

    /**
     * [set] U_MODULE: {NotNull, VARCHAR(100), default=[default-module]} <br />
     * @param uModule The value of the column 'U_MODULE'. (basically NotNull if update: for the constraint)
     */
    public void setUModule(String uModule) {
        __modifiedProperties.addPropertyName("UModule");
        this._uModule = uModule;
    }

    /**
     * [get] U_TIMESTAMP: {NotNull, TIMESTAMP(26, 6), default=[CURRENT_TIMESTAMP]} <br />
     * @return The value of the column 'U_TIMESTAMP'. (basically NotNull if selected: for the constraint)
     */
    public java.sql.Timestamp getUTimestamp() {
        return _uTimestamp;
    }

    /**
     * [set] U_TIMESTAMP: {NotNull, TIMESTAMP(26, 6), default=[CURRENT_TIMESTAMP]} <br />
     * @param uTimestamp The value of the column 'U_TIMESTAMP'. (basically NotNull if update: for the constraint)
     */
    public void setUTimestamp(java.sql.Timestamp uTimestamp) {
        __modifiedProperties.addPropertyName("UTimestamp");
        this._uTimestamp = uTimestamp;
    }
}
