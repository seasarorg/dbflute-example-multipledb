/*
 * Copyright(c) DBFlute TestCo.,TestLtd. All Rights Reserved.
 */package com.example.dbflute.multipledb.spring.dbflute.librarydb.cbean.cq.bs;

import java.util.*;

import org.seasar.dbflute.cbean.*;
import org.seasar.dbflute.cbean.chelper.*;
import org.seasar.dbflute.cbean.ckey.*;
import org.seasar.dbflute.cbean.coption.*;
import org.seasar.dbflute.cbean.cvalue.ConditionValue;
import org.seasar.dbflute.cbean.sqlclause.SqlClause;
import org.seasar.dbflute.dbmeta.DBMetaProvider;
import com.example.dbflute.multipledb.spring.dbflute.librarydb.allcommon.*;
import com.example.dbflute.multipledb.spring.dbflute.librarydb.cbean.*;
import com.example.dbflute.multipledb.spring.dbflute.librarydb.cbean.cq.*;

/**
 * The abstract condition-query of VENDOR_CHECK.
 * @author DBFlute(AutoGenerator)
 */
public abstract class LdAbstractBsVendorCheckCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public LdAbstractBsVendorCheckCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                     DBMeta Provider
    //                                                                     ===============
    @Override
    protected DBMetaProvider xgetDBMetaProvider() {
        return LdDBMetaInstanceHandler.getProvider();
    }

    // ===================================================================================
    //                                                                          Table Name
    //                                                                          ==========
    public String getTableDbName() {
        return "VENDOR_CHECK";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br />
     * VENDOR_CHECK_ID: {NotNull, BIGINT(19)}
     * @param vendorCheckId The value of vendorCheckId as equal. (NullAllowed: if null, no condition)
     */
    public void setVendorCheckId_Equal(Long vendorCheckId) {
        doSetVendorCheckId_Equal(vendorCheckId);
    }

    protected void doSetVendorCheckId_Equal(Long vendorCheckId) {
        regVendorCheckId(CK_EQ, vendorCheckId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br />
     * VENDOR_CHECK_ID: {NotNull, BIGINT(19)}
     * @param vendorCheckId The value of vendorCheckId as notEqual. (NullAllowed: if null, no condition)
     */
    public void setVendorCheckId_NotEqual(Long vendorCheckId) {
        doSetVendorCheckId_NotEqual(vendorCheckId);
    }

    protected void doSetVendorCheckId_NotEqual(Long vendorCheckId) {
        regVendorCheckId(CK_NES, vendorCheckId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br />
     * VENDOR_CHECK_ID: {NotNull, BIGINT(19)}
     * @param vendorCheckId The value of vendorCheckId as greaterThan. (NullAllowed: if null, no condition)
     */
    public void setVendorCheckId_GreaterThan(Long vendorCheckId) {
        regVendorCheckId(CK_GT, vendorCheckId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br />
     * VENDOR_CHECK_ID: {NotNull, BIGINT(19)}
     * @param vendorCheckId The value of vendorCheckId as lessThan. (NullAllowed: if null, no condition)
     */
    public void setVendorCheckId_LessThan(Long vendorCheckId) {
        regVendorCheckId(CK_LT, vendorCheckId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * VENDOR_CHECK_ID: {NotNull, BIGINT(19)}
     * @param vendorCheckId The value of vendorCheckId as greaterEqual. (NullAllowed: if null, no condition)
     */
    public void setVendorCheckId_GreaterEqual(Long vendorCheckId) {
        regVendorCheckId(CK_GE, vendorCheckId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * VENDOR_CHECK_ID: {NotNull, BIGINT(19)}
     * @param vendorCheckId The value of vendorCheckId as lessEqual. (NullAllowed: if null, no condition)
     */
    public void setVendorCheckId_LessEqual(Long vendorCheckId) {
        regVendorCheckId(CK_LE, vendorCheckId);
    }

    /**
     * RangeOf with various options. (versatile) <br />
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br />
     * And NullIgnored, OnlyOnceRegistered. <br />
     * VENDOR_CHECK_ID: {NotNull, BIGINT(19)}
     * @param minNumber The min number of vendorCheckId. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of vendorCheckId. (NullAllowed: if null, no to-condition)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setVendorCheckId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, getCValueVendorCheckId(), "VENDOR_CHECK_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * VENDOR_CHECK_ID: {NotNull, BIGINT(19)}
     * @param vendorCheckIdList The collection of vendorCheckId as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setVendorCheckId_InScope(Collection<Long> vendorCheckIdList) {
        doSetVendorCheckId_InScope(vendorCheckIdList);
    }

    protected void doSetVendorCheckId_InScope(Collection<Long> vendorCheckIdList) {
        regINS(CK_INS, cTL(vendorCheckIdList), getCValueVendorCheckId(), "VENDOR_CHECK_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * VENDOR_CHECK_ID: {NotNull, BIGINT(19)}
     * @param vendorCheckIdList The collection of vendorCheckId as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setVendorCheckId_NotInScope(Collection<Long> vendorCheckIdList) {
        doSetVendorCheckId_NotInScope(vendorCheckIdList);
    }

    protected void doSetVendorCheckId_NotInScope(Collection<Long> vendorCheckIdList) {
        regINS(CK_NINS, cTL(vendorCheckIdList), getCValueVendorCheckId(), "VENDOR_CHECK_ID");
    }

    protected void regVendorCheckId(ConditionKey ky, Object vl) { regQ(ky, vl, getCValueVendorCheckId(), "VENDOR_CHECK_ID"); }
    protected abstract ConditionValue getCValueVendorCheckId();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * TYPE_OF_CHAR: {CHAR(3)}
     * @param typeOfChar The value of typeOfChar as equal. (NullAllowed: if null (or empty), no condition)
     */
    public void setTypeOfChar_Equal(String typeOfChar) {
        doSetTypeOfChar_Equal(fRES(typeOfChar));
    }

    protected void doSetTypeOfChar_Equal(String typeOfChar) {
        regTypeOfChar(CK_EQ, typeOfChar);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * TYPE_OF_CHAR: {CHAR(3)}
     * @param typeOfChar The value of typeOfChar as notEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setTypeOfChar_NotEqual(String typeOfChar) {
        doSetTypeOfChar_NotEqual(fRES(typeOfChar));
    }

    protected void doSetTypeOfChar_NotEqual(String typeOfChar) {
        regTypeOfChar(CK_NES, typeOfChar);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * TYPE_OF_CHAR: {CHAR(3)}
     * @param typeOfChar The value of typeOfChar as greaterThan. (NullAllowed: if null (or empty), no condition)
     */
    public void setTypeOfChar_GreaterThan(String typeOfChar) {
        regTypeOfChar(CK_GT, fRES(typeOfChar));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * TYPE_OF_CHAR: {CHAR(3)}
     * @param typeOfChar The value of typeOfChar as lessThan. (NullAllowed: if null (or empty), no condition)
     */
    public void setTypeOfChar_LessThan(String typeOfChar) {
        regTypeOfChar(CK_LT, fRES(typeOfChar));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * TYPE_OF_CHAR: {CHAR(3)}
     * @param typeOfChar The value of typeOfChar as greaterEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setTypeOfChar_GreaterEqual(String typeOfChar) {
        regTypeOfChar(CK_GE, fRES(typeOfChar));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * TYPE_OF_CHAR: {CHAR(3)}
     * @param typeOfChar The value of typeOfChar as lessEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setTypeOfChar_LessEqual(String typeOfChar) {
        regTypeOfChar(CK_LE, fRES(typeOfChar));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * TYPE_OF_CHAR: {CHAR(3)}
     * @param typeOfCharList The collection of typeOfChar as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setTypeOfChar_InScope(Collection<String> typeOfCharList) {
        doSetTypeOfChar_InScope(typeOfCharList);
    }

    public void doSetTypeOfChar_InScope(Collection<String> typeOfCharList) {
        regINS(CK_INS, cTL(typeOfCharList), getCValueTypeOfChar(), "TYPE_OF_CHAR");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * TYPE_OF_CHAR: {CHAR(3)}
     * @param typeOfCharList The collection of typeOfChar as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setTypeOfChar_NotInScope(Collection<String> typeOfCharList) {
        doSetTypeOfChar_NotInScope(typeOfCharList);
    }

    public void doSetTypeOfChar_NotInScope(Collection<String> typeOfCharList) {
        regINS(CK_NINS, cTL(typeOfCharList), getCValueTypeOfChar(), "TYPE_OF_CHAR");
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br />
     * TYPE_OF_CHAR: {CHAR(3)}
     * @param typeOfChar The value of typeOfChar as prefixSearch. (NullAllowed: if null (or empty), no condition)
     */
    public void setTypeOfChar_PrefixSearch(String typeOfChar) {
        setTypeOfChar_LikeSearch(typeOfChar, cLSOP());
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br />
     * TYPE_OF_CHAR: {CHAR(3)} <br />
     * <pre>e.g. setTypeOfChar_LikeSearch("xxx", new <span style="color: #DD4747">LikeSearchOption</span>().likeContain());</pre>
     * @param typeOfChar The value of typeOfChar as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setTypeOfChar_LikeSearch(String typeOfChar, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(typeOfChar), getCValueTypeOfChar(), "TYPE_OF_CHAR", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br />
     * And NullOrEmptyIgnored, SeveralRegistered. <br />
     * TYPE_OF_CHAR: {CHAR(3)}
     * @param typeOfChar The value of typeOfChar as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setTypeOfChar_NotLikeSearch(String typeOfChar, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(typeOfChar), getCValueTypeOfChar(), "TYPE_OF_CHAR", likeSearchOption);
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br />
     * TYPE_OF_CHAR: {CHAR(3)}
     */
    public void setTypeOfChar_IsNull() { regTypeOfChar(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br />
     * TYPE_OF_CHAR: {CHAR(3)}
     */
    public void setTypeOfChar_IsNullOrEmpty() { regTypeOfChar(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br />
     * TYPE_OF_CHAR: {CHAR(3)}
     */
    public void setTypeOfChar_IsNotNull() { regTypeOfChar(CK_ISNN, DOBJ); }

    protected void regTypeOfChar(ConditionKey ky, Object vl) { regQ(ky, vl, getCValueTypeOfChar(), "TYPE_OF_CHAR"); }
    protected abstract ConditionValue getCValueTypeOfChar();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * TYPE_OF_VARCHAR: {VARCHAR(32)}
     * @param typeOfVarchar The value of typeOfVarchar as equal. (NullAllowed: if null (or empty), no condition)
     */
    public void setTypeOfVarchar_Equal(String typeOfVarchar) {
        doSetTypeOfVarchar_Equal(fRES(typeOfVarchar));
    }

    protected void doSetTypeOfVarchar_Equal(String typeOfVarchar) {
        regTypeOfVarchar(CK_EQ, typeOfVarchar);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * TYPE_OF_VARCHAR: {VARCHAR(32)}
     * @param typeOfVarchar The value of typeOfVarchar as notEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setTypeOfVarchar_NotEqual(String typeOfVarchar) {
        doSetTypeOfVarchar_NotEqual(fRES(typeOfVarchar));
    }

    protected void doSetTypeOfVarchar_NotEqual(String typeOfVarchar) {
        regTypeOfVarchar(CK_NES, typeOfVarchar);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * TYPE_OF_VARCHAR: {VARCHAR(32)}
     * @param typeOfVarchar The value of typeOfVarchar as greaterThan. (NullAllowed: if null (or empty), no condition)
     */
    public void setTypeOfVarchar_GreaterThan(String typeOfVarchar) {
        regTypeOfVarchar(CK_GT, fRES(typeOfVarchar));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * TYPE_OF_VARCHAR: {VARCHAR(32)}
     * @param typeOfVarchar The value of typeOfVarchar as lessThan. (NullAllowed: if null (or empty), no condition)
     */
    public void setTypeOfVarchar_LessThan(String typeOfVarchar) {
        regTypeOfVarchar(CK_LT, fRES(typeOfVarchar));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * TYPE_OF_VARCHAR: {VARCHAR(32)}
     * @param typeOfVarchar The value of typeOfVarchar as greaterEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setTypeOfVarchar_GreaterEqual(String typeOfVarchar) {
        regTypeOfVarchar(CK_GE, fRES(typeOfVarchar));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * TYPE_OF_VARCHAR: {VARCHAR(32)}
     * @param typeOfVarchar The value of typeOfVarchar as lessEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setTypeOfVarchar_LessEqual(String typeOfVarchar) {
        regTypeOfVarchar(CK_LE, fRES(typeOfVarchar));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * TYPE_OF_VARCHAR: {VARCHAR(32)}
     * @param typeOfVarcharList The collection of typeOfVarchar as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setTypeOfVarchar_InScope(Collection<String> typeOfVarcharList) {
        doSetTypeOfVarchar_InScope(typeOfVarcharList);
    }

    public void doSetTypeOfVarchar_InScope(Collection<String> typeOfVarcharList) {
        regINS(CK_INS, cTL(typeOfVarcharList), getCValueTypeOfVarchar(), "TYPE_OF_VARCHAR");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * TYPE_OF_VARCHAR: {VARCHAR(32)}
     * @param typeOfVarcharList The collection of typeOfVarchar as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setTypeOfVarchar_NotInScope(Collection<String> typeOfVarcharList) {
        doSetTypeOfVarchar_NotInScope(typeOfVarcharList);
    }

    public void doSetTypeOfVarchar_NotInScope(Collection<String> typeOfVarcharList) {
        regINS(CK_NINS, cTL(typeOfVarcharList), getCValueTypeOfVarchar(), "TYPE_OF_VARCHAR");
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br />
     * TYPE_OF_VARCHAR: {VARCHAR(32)}
     * @param typeOfVarchar The value of typeOfVarchar as prefixSearch. (NullAllowed: if null (or empty), no condition)
     */
    public void setTypeOfVarchar_PrefixSearch(String typeOfVarchar) {
        setTypeOfVarchar_LikeSearch(typeOfVarchar, cLSOP());
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br />
     * TYPE_OF_VARCHAR: {VARCHAR(32)} <br />
     * <pre>e.g. setTypeOfVarchar_LikeSearch("xxx", new <span style="color: #DD4747">LikeSearchOption</span>().likeContain());</pre>
     * @param typeOfVarchar The value of typeOfVarchar as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setTypeOfVarchar_LikeSearch(String typeOfVarchar, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(typeOfVarchar), getCValueTypeOfVarchar(), "TYPE_OF_VARCHAR", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br />
     * And NullOrEmptyIgnored, SeveralRegistered. <br />
     * TYPE_OF_VARCHAR: {VARCHAR(32)}
     * @param typeOfVarchar The value of typeOfVarchar as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setTypeOfVarchar_NotLikeSearch(String typeOfVarchar, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(typeOfVarchar), getCValueTypeOfVarchar(), "TYPE_OF_VARCHAR", likeSearchOption);
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br />
     * TYPE_OF_VARCHAR: {VARCHAR(32)}
     */
    public void setTypeOfVarchar_IsNull() { regTypeOfVarchar(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br />
     * TYPE_OF_VARCHAR: {VARCHAR(32)}
     */
    public void setTypeOfVarchar_IsNullOrEmpty() { regTypeOfVarchar(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br />
     * TYPE_OF_VARCHAR: {VARCHAR(32)}
     */
    public void setTypeOfVarchar_IsNotNull() { regTypeOfVarchar(CK_ISNN, DOBJ); }

    protected void regTypeOfVarchar(ConditionKey ky, Object vl) { regQ(ky, vl, getCValueTypeOfVarchar(), "TYPE_OF_VARCHAR"); }
    protected abstract ConditionValue getCValueTypeOfVarchar();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * TYPE_OF_LONG_VARCHAR: {LONG VARCHAR(32700)}
     * @param typeOfLongVarchar The value of typeOfLongVarchar as equal. (NullAllowed: if null (or empty), no condition)
     */
    public void setTypeOfLongVarchar_Equal(String typeOfLongVarchar) {
        doSetTypeOfLongVarchar_Equal(fRES(typeOfLongVarchar));
    }

    protected void doSetTypeOfLongVarchar_Equal(String typeOfLongVarchar) {
        regTypeOfLongVarchar(CK_EQ, typeOfLongVarchar);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * TYPE_OF_LONG_VARCHAR: {LONG VARCHAR(32700)}
     * @param typeOfLongVarchar The value of typeOfLongVarchar as notEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setTypeOfLongVarchar_NotEqual(String typeOfLongVarchar) {
        doSetTypeOfLongVarchar_NotEqual(fRES(typeOfLongVarchar));
    }

    protected void doSetTypeOfLongVarchar_NotEqual(String typeOfLongVarchar) {
        regTypeOfLongVarchar(CK_NES, typeOfLongVarchar);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * TYPE_OF_LONG_VARCHAR: {LONG VARCHAR(32700)}
     * @param typeOfLongVarchar The value of typeOfLongVarchar as greaterThan. (NullAllowed: if null (or empty), no condition)
     */
    public void setTypeOfLongVarchar_GreaterThan(String typeOfLongVarchar) {
        regTypeOfLongVarchar(CK_GT, fRES(typeOfLongVarchar));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * TYPE_OF_LONG_VARCHAR: {LONG VARCHAR(32700)}
     * @param typeOfLongVarchar The value of typeOfLongVarchar as lessThan. (NullAllowed: if null (or empty), no condition)
     */
    public void setTypeOfLongVarchar_LessThan(String typeOfLongVarchar) {
        regTypeOfLongVarchar(CK_LT, fRES(typeOfLongVarchar));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * TYPE_OF_LONG_VARCHAR: {LONG VARCHAR(32700)}
     * @param typeOfLongVarchar The value of typeOfLongVarchar as greaterEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setTypeOfLongVarchar_GreaterEqual(String typeOfLongVarchar) {
        regTypeOfLongVarchar(CK_GE, fRES(typeOfLongVarchar));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * TYPE_OF_LONG_VARCHAR: {LONG VARCHAR(32700)}
     * @param typeOfLongVarchar The value of typeOfLongVarchar as lessEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setTypeOfLongVarchar_LessEqual(String typeOfLongVarchar) {
        regTypeOfLongVarchar(CK_LE, fRES(typeOfLongVarchar));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * TYPE_OF_LONG_VARCHAR: {LONG VARCHAR(32700)}
     * @param typeOfLongVarcharList The collection of typeOfLongVarchar as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setTypeOfLongVarchar_InScope(Collection<String> typeOfLongVarcharList) {
        doSetTypeOfLongVarchar_InScope(typeOfLongVarcharList);
    }

    public void doSetTypeOfLongVarchar_InScope(Collection<String> typeOfLongVarcharList) {
        regINS(CK_INS, cTL(typeOfLongVarcharList), getCValueTypeOfLongVarchar(), "TYPE_OF_LONG_VARCHAR");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * TYPE_OF_LONG_VARCHAR: {LONG VARCHAR(32700)}
     * @param typeOfLongVarcharList The collection of typeOfLongVarchar as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setTypeOfLongVarchar_NotInScope(Collection<String> typeOfLongVarcharList) {
        doSetTypeOfLongVarchar_NotInScope(typeOfLongVarcharList);
    }

    public void doSetTypeOfLongVarchar_NotInScope(Collection<String> typeOfLongVarcharList) {
        regINS(CK_NINS, cTL(typeOfLongVarcharList), getCValueTypeOfLongVarchar(), "TYPE_OF_LONG_VARCHAR");
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br />
     * TYPE_OF_LONG_VARCHAR: {LONG VARCHAR(32700)}
     * @param typeOfLongVarchar The value of typeOfLongVarchar as prefixSearch. (NullAllowed: if null (or empty), no condition)
     */
    public void setTypeOfLongVarchar_PrefixSearch(String typeOfLongVarchar) {
        setTypeOfLongVarchar_LikeSearch(typeOfLongVarchar, cLSOP());
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br />
     * TYPE_OF_LONG_VARCHAR: {LONG VARCHAR(32700)} <br />
     * <pre>e.g. setTypeOfLongVarchar_LikeSearch("xxx", new <span style="color: #DD4747">LikeSearchOption</span>().likeContain());</pre>
     * @param typeOfLongVarchar The value of typeOfLongVarchar as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setTypeOfLongVarchar_LikeSearch(String typeOfLongVarchar, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(typeOfLongVarchar), getCValueTypeOfLongVarchar(), "TYPE_OF_LONG_VARCHAR", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br />
     * And NullOrEmptyIgnored, SeveralRegistered. <br />
     * TYPE_OF_LONG_VARCHAR: {LONG VARCHAR(32700)}
     * @param typeOfLongVarchar The value of typeOfLongVarchar as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setTypeOfLongVarchar_NotLikeSearch(String typeOfLongVarchar, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(typeOfLongVarchar), getCValueTypeOfLongVarchar(), "TYPE_OF_LONG_VARCHAR", likeSearchOption);
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br />
     * TYPE_OF_LONG_VARCHAR: {LONG VARCHAR(32700)}
     */
    public void setTypeOfLongVarchar_IsNull() { regTypeOfLongVarchar(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br />
     * TYPE_OF_LONG_VARCHAR: {LONG VARCHAR(32700)}
     */
    public void setTypeOfLongVarchar_IsNullOrEmpty() { regTypeOfLongVarchar(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br />
     * TYPE_OF_LONG_VARCHAR: {LONG VARCHAR(32700)}
     */
    public void setTypeOfLongVarchar_IsNotNull() { regTypeOfLongVarchar(CK_ISNN, DOBJ); }

    protected void regTypeOfLongVarchar(ConditionKey ky, Object vl) { regQ(ky, vl, getCValueTypeOfLongVarchar(), "TYPE_OF_LONG_VARCHAR"); }
    protected abstract ConditionValue getCValueTypeOfLongVarchar();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * TYPE_OF_CLOB: {CLOB(2147483647)}
     * @param typeOfClob The value of typeOfClob as equal. (NullAllowed: if null (or empty), no condition)
     */
    public void setTypeOfClob_Equal(String typeOfClob) {
        doSetTypeOfClob_Equal(fRES(typeOfClob));
    }

    protected void doSetTypeOfClob_Equal(String typeOfClob) {
        regTypeOfClob(CK_EQ, typeOfClob);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * TYPE_OF_CLOB: {CLOB(2147483647)}
     * @param typeOfClob The value of typeOfClob as notEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setTypeOfClob_NotEqual(String typeOfClob) {
        doSetTypeOfClob_NotEqual(fRES(typeOfClob));
    }

    protected void doSetTypeOfClob_NotEqual(String typeOfClob) {
        regTypeOfClob(CK_NES, typeOfClob);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * TYPE_OF_CLOB: {CLOB(2147483647)}
     * @param typeOfClob The value of typeOfClob as greaterThan. (NullAllowed: if null (or empty), no condition)
     */
    public void setTypeOfClob_GreaterThan(String typeOfClob) {
        regTypeOfClob(CK_GT, fRES(typeOfClob));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * TYPE_OF_CLOB: {CLOB(2147483647)}
     * @param typeOfClob The value of typeOfClob as lessThan. (NullAllowed: if null (or empty), no condition)
     */
    public void setTypeOfClob_LessThan(String typeOfClob) {
        regTypeOfClob(CK_LT, fRES(typeOfClob));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * TYPE_OF_CLOB: {CLOB(2147483647)}
     * @param typeOfClob The value of typeOfClob as greaterEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setTypeOfClob_GreaterEqual(String typeOfClob) {
        regTypeOfClob(CK_GE, fRES(typeOfClob));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * TYPE_OF_CLOB: {CLOB(2147483647)}
     * @param typeOfClob The value of typeOfClob as lessEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setTypeOfClob_LessEqual(String typeOfClob) {
        regTypeOfClob(CK_LE, fRES(typeOfClob));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * TYPE_OF_CLOB: {CLOB(2147483647)}
     * @param typeOfClobList The collection of typeOfClob as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setTypeOfClob_InScope(Collection<String> typeOfClobList) {
        doSetTypeOfClob_InScope(typeOfClobList);
    }

    public void doSetTypeOfClob_InScope(Collection<String> typeOfClobList) {
        regINS(CK_INS, cTL(typeOfClobList), getCValueTypeOfClob(), "TYPE_OF_CLOB");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * TYPE_OF_CLOB: {CLOB(2147483647)}
     * @param typeOfClobList The collection of typeOfClob as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setTypeOfClob_NotInScope(Collection<String> typeOfClobList) {
        doSetTypeOfClob_NotInScope(typeOfClobList);
    }

    public void doSetTypeOfClob_NotInScope(Collection<String> typeOfClobList) {
        regINS(CK_NINS, cTL(typeOfClobList), getCValueTypeOfClob(), "TYPE_OF_CLOB");
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br />
     * TYPE_OF_CLOB: {CLOB(2147483647)}
     * @param typeOfClob The value of typeOfClob as prefixSearch. (NullAllowed: if null (or empty), no condition)
     */
    public void setTypeOfClob_PrefixSearch(String typeOfClob) {
        setTypeOfClob_LikeSearch(typeOfClob, cLSOP());
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br />
     * TYPE_OF_CLOB: {CLOB(2147483647)} <br />
     * <pre>e.g. setTypeOfClob_LikeSearch("xxx", new <span style="color: #DD4747">LikeSearchOption</span>().likeContain());</pre>
     * @param typeOfClob The value of typeOfClob as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setTypeOfClob_LikeSearch(String typeOfClob, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(typeOfClob), getCValueTypeOfClob(), "TYPE_OF_CLOB", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br />
     * And NullOrEmptyIgnored, SeveralRegistered. <br />
     * TYPE_OF_CLOB: {CLOB(2147483647)}
     * @param typeOfClob The value of typeOfClob as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setTypeOfClob_NotLikeSearch(String typeOfClob, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(typeOfClob), getCValueTypeOfClob(), "TYPE_OF_CLOB", likeSearchOption);
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br />
     * TYPE_OF_CLOB: {CLOB(2147483647)}
     */
    public void setTypeOfClob_IsNull() { regTypeOfClob(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br />
     * TYPE_OF_CLOB: {CLOB(2147483647)}
     */
    public void setTypeOfClob_IsNotNull() { regTypeOfClob(CK_ISNN, DOBJ); }

    protected void regTypeOfClob(ConditionKey ky, Object vl) { regQ(ky, vl, getCValueTypeOfClob(), "TYPE_OF_CLOB"); }
    protected abstract ConditionValue getCValueTypeOfClob();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br />
     * TYPE_OF_DECIMAL_INTEGER: {DECIMAL(5)}
     * @param typeOfDecimalInteger The value of typeOfDecimalInteger as equal. (NullAllowed: if null, no condition)
     */
    public void setTypeOfDecimalInteger_Equal(java.math.BigDecimal typeOfDecimalInteger) {
        doSetTypeOfDecimalInteger_Equal(typeOfDecimalInteger);
    }

    protected void doSetTypeOfDecimalInteger_Equal(java.math.BigDecimal typeOfDecimalInteger) {
        regTypeOfDecimalInteger(CK_EQ, typeOfDecimalInteger);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br />
     * TYPE_OF_DECIMAL_INTEGER: {DECIMAL(5)}
     * @param typeOfDecimalInteger The value of typeOfDecimalInteger as notEqual. (NullAllowed: if null, no condition)
     */
    public void setTypeOfDecimalInteger_NotEqual(java.math.BigDecimal typeOfDecimalInteger) {
        doSetTypeOfDecimalInteger_NotEqual(typeOfDecimalInteger);
    }

    protected void doSetTypeOfDecimalInteger_NotEqual(java.math.BigDecimal typeOfDecimalInteger) {
        regTypeOfDecimalInteger(CK_NES, typeOfDecimalInteger);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br />
     * TYPE_OF_DECIMAL_INTEGER: {DECIMAL(5)}
     * @param typeOfDecimalInteger The value of typeOfDecimalInteger as greaterThan. (NullAllowed: if null, no condition)
     */
    public void setTypeOfDecimalInteger_GreaterThan(java.math.BigDecimal typeOfDecimalInteger) {
        regTypeOfDecimalInteger(CK_GT, typeOfDecimalInteger);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br />
     * TYPE_OF_DECIMAL_INTEGER: {DECIMAL(5)}
     * @param typeOfDecimalInteger The value of typeOfDecimalInteger as lessThan. (NullAllowed: if null, no condition)
     */
    public void setTypeOfDecimalInteger_LessThan(java.math.BigDecimal typeOfDecimalInteger) {
        regTypeOfDecimalInteger(CK_LT, typeOfDecimalInteger);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * TYPE_OF_DECIMAL_INTEGER: {DECIMAL(5)}
     * @param typeOfDecimalInteger The value of typeOfDecimalInteger as greaterEqual. (NullAllowed: if null, no condition)
     */
    public void setTypeOfDecimalInteger_GreaterEqual(java.math.BigDecimal typeOfDecimalInteger) {
        regTypeOfDecimalInteger(CK_GE, typeOfDecimalInteger);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * TYPE_OF_DECIMAL_INTEGER: {DECIMAL(5)}
     * @param typeOfDecimalInteger The value of typeOfDecimalInteger as lessEqual. (NullAllowed: if null, no condition)
     */
    public void setTypeOfDecimalInteger_LessEqual(java.math.BigDecimal typeOfDecimalInteger) {
        regTypeOfDecimalInteger(CK_LE, typeOfDecimalInteger);
    }

    /**
     * RangeOf with various options. (versatile) <br />
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br />
     * And NullIgnored, OnlyOnceRegistered. <br />
     * TYPE_OF_DECIMAL_INTEGER: {DECIMAL(5)}
     * @param minNumber The min number of typeOfDecimalInteger. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of typeOfDecimalInteger. (NullAllowed: if null, no to-condition)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setTypeOfDecimalInteger_RangeOf(java.math.BigDecimal minNumber, java.math.BigDecimal maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, getCValueTypeOfDecimalInteger(), "TYPE_OF_DECIMAL_INTEGER", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * TYPE_OF_DECIMAL_INTEGER: {DECIMAL(5)}
     * @param typeOfDecimalIntegerList The collection of typeOfDecimalInteger as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setTypeOfDecimalInteger_InScope(Collection<java.math.BigDecimal> typeOfDecimalIntegerList) {
        doSetTypeOfDecimalInteger_InScope(typeOfDecimalIntegerList);
    }

    protected void doSetTypeOfDecimalInteger_InScope(Collection<java.math.BigDecimal> typeOfDecimalIntegerList) {
        regINS(CK_INS, cTL(typeOfDecimalIntegerList), getCValueTypeOfDecimalInteger(), "TYPE_OF_DECIMAL_INTEGER");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * TYPE_OF_DECIMAL_INTEGER: {DECIMAL(5)}
     * @param typeOfDecimalIntegerList The collection of typeOfDecimalInteger as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setTypeOfDecimalInteger_NotInScope(Collection<java.math.BigDecimal> typeOfDecimalIntegerList) {
        doSetTypeOfDecimalInteger_NotInScope(typeOfDecimalIntegerList);
    }

    protected void doSetTypeOfDecimalInteger_NotInScope(Collection<java.math.BigDecimal> typeOfDecimalIntegerList) {
        regINS(CK_NINS, cTL(typeOfDecimalIntegerList), getCValueTypeOfDecimalInteger(), "TYPE_OF_DECIMAL_INTEGER");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br />
     * TYPE_OF_DECIMAL_INTEGER: {DECIMAL(5)}
     */
    public void setTypeOfDecimalInteger_IsNull() { regTypeOfDecimalInteger(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br />
     * TYPE_OF_DECIMAL_INTEGER: {DECIMAL(5)}
     */
    public void setTypeOfDecimalInteger_IsNotNull() { regTypeOfDecimalInteger(CK_ISNN, DOBJ); }

    protected void regTypeOfDecimalInteger(ConditionKey ky, Object vl) { regQ(ky, vl, getCValueTypeOfDecimalInteger(), "TYPE_OF_DECIMAL_INTEGER"); }
    protected abstract ConditionValue getCValueTypeOfDecimalInteger();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br />
     * TYPE_OF_DECIMAL_BIGINT: {DECIMAL(12)}
     * @param typeOfDecimalBigint The value of typeOfDecimalBigint as equal. (NullAllowed: if null, no condition)
     */
    public void setTypeOfDecimalBigint_Equal(java.math.BigDecimal typeOfDecimalBigint) {
        doSetTypeOfDecimalBigint_Equal(typeOfDecimalBigint);
    }

    protected void doSetTypeOfDecimalBigint_Equal(java.math.BigDecimal typeOfDecimalBigint) {
        regTypeOfDecimalBigint(CK_EQ, typeOfDecimalBigint);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br />
     * TYPE_OF_DECIMAL_BIGINT: {DECIMAL(12)}
     * @param typeOfDecimalBigint The value of typeOfDecimalBigint as notEqual. (NullAllowed: if null, no condition)
     */
    public void setTypeOfDecimalBigint_NotEqual(java.math.BigDecimal typeOfDecimalBigint) {
        doSetTypeOfDecimalBigint_NotEqual(typeOfDecimalBigint);
    }

    protected void doSetTypeOfDecimalBigint_NotEqual(java.math.BigDecimal typeOfDecimalBigint) {
        regTypeOfDecimalBigint(CK_NES, typeOfDecimalBigint);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br />
     * TYPE_OF_DECIMAL_BIGINT: {DECIMAL(12)}
     * @param typeOfDecimalBigint The value of typeOfDecimalBigint as greaterThan. (NullAllowed: if null, no condition)
     */
    public void setTypeOfDecimalBigint_GreaterThan(java.math.BigDecimal typeOfDecimalBigint) {
        regTypeOfDecimalBigint(CK_GT, typeOfDecimalBigint);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br />
     * TYPE_OF_DECIMAL_BIGINT: {DECIMAL(12)}
     * @param typeOfDecimalBigint The value of typeOfDecimalBigint as lessThan. (NullAllowed: if null, no condition)
     */
    public void setTypeOfDecimalBigint_LessThan(java.math.BigDecimal typeOfDecimalBigint) {
        regTypeOfDecimalBigint(CK_LT, typeOfDecimalBigint);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * TYPE_OF_DECIMAL_BIGINT: {DECIMAL(12)}
     * @param typeOfDecimalBigint The value of typeOfDecimalBigint as greaterEqual. (NullAllowed: if null, no condition)
     */
    public void setTypeOfDecimalBigint_GreaterEqual(java.math.BigDecimal typeOfDecimalBigint) {
        regTypeOfDecimalBigint(CK_GE, typeOfDecimalBigint);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * TYPE_OF_DECIMAL_BIGINT: {DECIMAL(12)}
     * @param typeOfDecimalBigint The value of typeOfDecimalBigint as lessEqual. (NullAllowed: if null, no condition)
     */
    public void setTypeOfDecimalBigint_LessEqual(java.math.BigDecimal typeOfDecimalBigint) {
        regTypeOfDecimalBigint(CK_LE, typeOfDecimalBigint);
    }

    /**
     * RangeOf with various options. (versatile) <br />
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br />
     * And NullIgnored, OnlyOnceRegistered. <br />
     * TYPE_OF_DECIMAL_BIGINT: {DECIMAL(12)}
     * @param minNumber The min number of typeOfDecimalBigint. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of typeOfDecimalBigint. (NullAllowed: if null, no to-condition)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setTypeOfDecimalBigint_RangeOf(java.math.BigDecimal minNumber, java.math.BigDecimal maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, getCValueTypeOfDecimalBigint(), "TYPE_OF_DECIMAL_BIGINT", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * TYPE_OF_DECIMAL_BIGINT: {DECIMAL(12)}
     * @param typeOfDecimalBigintList The collection of typeOfDecimalBigint as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setTypeOfDecimalBigint_InScope(Collection<java.math.BigDecimal> typeOfDecimalBigintList) {
        doSetTypeOfDecimalBigint_InScope(typeOfDecimalBigintList);
    }

    protected void doSetTypeOfDecimalBigint_InScope(Collection<java.math.BigDecimal> typeOfDecimalBigintList) {
        regINS(CK_INS, cTL(typeOfDecimalBigintList), getCValueTypeOfDecimalBigint(), "TYPE_OF_DECIMAL_BIGINT");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * TYPE_OF_DECIMAL_BIGINT: {DECIMAL(12)}
     * @param typeOfDecimalBigintList The collection of typeOfDecimalBigint as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setTypeOfDecimalBigint_NotInScope(Collection<java.math.BigDecimal> typeOfDecimalBigintList) {
        doSetTypeOfDecimalBigint_NotInScope(typeOfDecimalBigintList);
    }

    protected void doSetTypeOfDecimalBigint_NotInScope(Collection<java.math.BigDecimal> typeOfDecimalBigintList) {
        regINS(CK_NINS, cTL(typeOfDecimalBigintList), getCValueTypeOfDecimalBigint(), "TYPE_OF_DECIMAL_BIGINT");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br />
     * TYPE_OF_DECIMAL_BIGINT: {DECIMAL(12)}
     */
    public void setTypeOfDecimalBigint_IsNull() { regTypeOfDecimalBigint(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br />
     * TYPE_OF_DECIMAL_BIGINT: {DECIMAL(12)}
     */
    public void setTypeOfDecimalBigint_IsNotNull() { regTypeOfDecimalBigint(CK_ISNN, DOBJ); }

    protected void regTypeOfDecimalBigint(ConditionKey ky, Object vl) { regQ(ky, vl, getCValueTypeOfDecimalBigint(), "TYPE_OF_DECIMAL_BIGINT"); }
    protected abstract ConditionValue getCValueTypeOfDecimalBigint();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br />
     * TYPE_OF_DECIMAL_DECIMAL: {DECIMAL(5, 3)}
     * @param typeOfDecimalDecimal The value of typeOfDecimalDecimal as equal. (NullAllowed: if null, no condition)
     */
    public void setTypeOfDecimalDecimal_Equal(java.math.BigDecimal typeOfDecimalDecimal) {
        doSetTypeOfDecimalDecimal_Equal(typeOfDecimalDecimal);
    }

    protected void doSetTypeOfDecimalDecimal_Equal(java.math.BigDecimal typeOfDecimalDecimal) {
        regTypeOfDecimalDecimal(CK_EQ, typeOfDecimalDecimal);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br />
     * TYPE_OF_DECIMAL_DECIMAL: {DECIMAL(5, 3)}
     * @param typeOfDecimalDecimal The value of typeOfDecimalDecimal as notEqual. (NullAllowed: if null, no condition)
     */
    public void setTypeOfDecimalDecimal_NotEqual(java.math.BigDecimal typeOfDecimalDecimal) {
        doSetTypeOfDecimalDecimal_NotEqual(typeOfDecimalDecimal);
    }

    protected void doSetTypeOfDecimalDecimal_NotEqual(java.math.BigDecimal typeOfDecimalDecimal) {
        regTypeOfDecimalDecimal(CK_NES, typeOfDecimalDecimal);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br />
     * TYPE_OF_DECIMAL_DECIMAL: {DECIMAL(5, 3)}
     * @param typeOfDecimalDecimal The value of typeOfDecimalDecimal as greaterThan. (NullAllowed: if null, no condition)
     */
    public void setTypeOfDecimalDecimal_GreaterThan(java.math.BigDecimal typeOfDecimalDecimal) {
        regTypeOfDecimalDecimal(CK_GT, typeOfDecimalDecimal);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br />
     * TYPE_OF_DECIMAL_DECIMAL: {DECIMAL(5, 3)}
     * @param typeOfDecimalDecimal The value of typeOfDecimalDecimal as lessThan. (NullAllowed: if null, no condition)
     */
    public void setTypeOfDecimalDecimal_LessThan(java.math.BigDecimal typeOfDecimalDecimal) {
        regTypeOfDecimalDecimal(CK_LT, typeOfDecimalDecimal);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * TYPE_OF_DECIMAL_DECIMAL: {DECIMAL(5, 3)}
     * @param typeOfDecimalDecimal The value of typeOfDecimalDecimal as greaterEqual. (NullAllowed: if null, no condition)
     */
    public void setTypeOfDecimalDecimal_GreaterEqual(java.math.BigDecimal typeOfDecimalDecimal) {
        regTypeOfDecimalDecimal(CK_GE, typeOfDecimalDecimal);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * TYPE_OF_DECIMAL_DECIMAL: {DECIMAL(5, 3)}
     * @param typeOfDecimalDecimal The value of typeOfDecimalDecimal as lessEqual. (NullAllowed: if null, no condition)
     */
    public void setTypeOfDecimalDecimal_LessEqual(java.math.BigDecimal typeOfDecimalDecimal) {
        regTypeOfDecimalDecimal(CK_LE, typeOfDecimalDecimal);
    }

    /**
     * RangeOf with various options. (versatile) <br />
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br />
     * And NullIgnored, OnlyOnceRegistered. <br />
     * TYPE_OF_DECIMAL_DECIMAL: {DECIMAL(5, 3)}
     * @param minNumber The min number of typeOfDecimalDecimal. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of typeOfDecimalDecimal. (NullAllowed: if null, no to-condition)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setTypeOfDecimalDecimal_RangeOf(java.math.BigDecimal minNumber, java.math.BigDecimal maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, getCValueTypeOfDecimalDecimal(), "TYPE_OF_DECIMAL_DECIMAL", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * TYPE_OF_DECIMAL_DECIMAL: {DECIMAL(5, 3)}
     * @param typeOfDecimalDecimalList The collection of typeOfDecimalDecimal as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setTypeOfDecimalDecimal_InScope(Collection<java.math.BigDecimal> typeOfDecimalDecimalList) {
        doSetTypeOfDecimalDecimal_InScope(typeOfDecimalDecimalList);
    }

    protected void doSetTypeOfDecimalDecimal_InScope(Collection<java.math.BigDecimal> typeOfDecimalDecimalList) {
        regINS(CK_INS, cTL(typeOfDecimalDecimalList), getCValueTypeOfDecimalDecimal(), "TYPE_OF_DECIMAL_DECIMAL");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * TYPE_OF_DECIMAL_DECIMAL: {DECIMAL(5, 3)}
     * @param typeOfDecimalDecimalList The collection of typeOfDecimalDecimal as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setTypeOfDecimalDecimal_NotInScope(Collection<java.math.BigDecimal> typeOfDecimalDecimalList) {
        doSetTypeOfDecimalDecimal_NotInScope(typeOfDecimalDecimalList);
    }

    protected void doSetTypeOfDecimalDecimal_NotInScope(Collection<java.math.BigDecimal> typeOfDecimalDecimalList) {
        regINS(CK_NINS, cTL(typeOfDecimalDecimalList), getCValueTypeOfDecimalDecimal(), "TYPE_OF_DECIMAL_DECIMAL");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br />
     * TYPE_OF_DECIMAL_DECIMAL: {DECIMAL(5, 3)}
     */
    public void setTypeOfDecimalDecimal_IsNull() { regTypeOfDecimalDecimal(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br />
     * TYPE_OF_DECIMAL_DECIMAL: {DECIMAL(5, 3)}
     */
    public void setTypeOfDecimalDecimal_IsNotNull() { regTypeOfDecimalDecimal(CK_ISNN, DOBJ); }

    protected void regTypeOfDecimalDecimal(ConditionKey ky, Object vl) { regQ(ky, vl, getCValueTypeOfDecimalDecimal(), "TYPE_OF_DECIMAL_DECIMAL"); }
    protected abstract ConditionValue getCValueTypeOfDecimalDecimal();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br />
     * TYPE_OF_BIGINT: {BIGINT(19)}
     * @param typeOfBigint The value of typeOfBigint as equal. (NullAllowed: if null, no condition)
     */
    public void setTypeOfBigint_Equal(Long typeOfBigint) {
        doSetTypeOfBigint_Equal(typeOfBigint);
    }

    protected void doSetTypeOfBigint_Equal(Long typeOfBigint) {
        regTypeOfBigint(CK_EQ, typeOfBigint);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br />
     * TYPE_OF_BIGINT: {BIGINT(19)}
     * @param typeOfBigint The value of typeOfBigint as notEqual. (NullAllowed: if null, no condition)
     */
    public void setTypeOfBigint_NotEqual(Long typeOfBigint) {
        doSetTypeOfBigint_NotEqual(typeOfBigint);
    }

    protected void doSetTypeOfBigint_NotEqual(Long typeOfBigint) {
        regTypeOfBigint(CK_NES, typeOfBigint);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br />
     * TYPE_OF_BIGINT: {BIGINT(19)}
     * @param typeOfBigint The value of typeOfBigint as greaterThan. (NullAllowed: if null, no condition)
     */
    public void setTypeOfBigint_GreaterThan(Long typeOfBigint) {
        regTypeOfBigint(CK_GT, typeOfBigint);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br />
     * TYPE_OF_BIGINT: {BIGINT(19)}
     * @param typeOfBigint The value of typeOfBigint as lessThan. (NullAllowed: if null, no condition)
     */
    public void setTypeOfBigint_LessThan(Long typeOfBigint) {
        regTypeOfBigint(CK_LT, typeOfBigint);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * TYPE_OF_BIGINT: {BIGINT(19)}
     * @param typeOfBigint The value of typeOfBigint as greaterEqual. (NullAllowed: if null, no condition)
     */
    public void setTypeOfBigint_GreaterEqual(Long typeOfBigint) {
        regTypeOfBigint(CK_GE, typeOfBigint);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * TYPE_OF_BIGINT: {BIGINT(19)}
     * @param typeOfBigint The value of typeOfBigint as lessEqual. (NullAllowed: if null, no condition)
     */
    public void setTypeOfBigint_LessEqual(Long typeOfBigint) {
        regTypeOfBigint(CK_LE, typeOfBigint);
    }

    /**
     * RangeOf with various options. (versatile) <br />
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br />
     * And NullIgnored, OnlyOnceRegistered. <br />
     * TYPE_OF_BIGINT: {BIGINT(19)}
     * @param minNumber The min number of typeOfBigint. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of typeOfBigint. (NullAllowed: if null, no to-condition)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setTypeOfBigint_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, getCValueTypeOfBigint(), "TYPE_OF_BIGINT", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * TYPE_OF_BIGINT: {BIGINT(19)}
     * @param typeOfBigintList The collection of typeOfBigint as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setTypeOfBigint_InScope(Collection<Long> typeOfBigintList) {
        doSetTypeOfBigint_InScope(typeOfBigintList);
    }

    protected void doSetTypeOfBigint_InScope(Collection<Long> typeOfBigintList) {
        regINS(CK_INS, cTL(typeOfBigintList), getCValueTypeOfBigint(), "TYPE_OF_BIGINT");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * TYPE_OF_BIGINT: {BIGINT(19)}
     * @param typeOfBigintList The collection of typeOfBigint as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setTypeOfBigint_NotInScope(Collection<Long> typeOfBigintList) {
        doSetTypeOfBigint_NotInScope(typeOfBigintList);
    }

    protected void doSetTypeOfBigint_NotInScope(Collection<Long> typeOfBigintList) {
        regINS(CK_NINS, cTL(typeOfBigintList), getCValueTypeOfBigint(), "TYPE_OF_BIGINT");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br />
     * TYPE_OF_BIGINT: {BIGINT(19)}
     */
    public void setTypeOfBigint_IsNull() { regTypeOfBigint(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br />
     * TYPE_OF_BIGINT: {BIGINT(19)}
     */
    public void setTypeOfBigint_IsNotNull() { regTypeOfBigint(CK_ISNN, DOBJ); }

    protected void regTypeOfBigint(ConditionKey ky, Object vl) { regQ(ky, vl, getCValueTypeOfBigint(), "TYPE_OF_BIGINT"); }
    protected abstract ConditionValue getCValueTypeOfBigint();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br />
     * TYPE_OF_INTEGER: {INTEGER(10)}
     * @param typeOfInteger The value of typeOfInteger as equal. (NullAllowed: if null, no condition)
     */
    public void setTypeOfInteger_Equal(Integer typeOfInteger) {
        doSetTypeOfInteger_Equal(typeOfInteger);
    }

    protected void doSetTypeOfInteger_Equal(Integer typeOfInteger) {
        regTypeOfInteger(CK_EQ, typeOfInteger);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br />
     * TYPE_OF_INTEGER: {INTEGER(10)}
     * @param typeOfInteger The value of typeOfInteger as notEqual. (NullAllowed: if null, no condition)
     */
    public void setTypeOfInteger_NotEqual(Integer typeOfInteger) {
        doSetTypeOfInteger_NotEqual(typeOfInteger);
    }

    protected void doSetTypeOfInteger_NotEqual(Integer typeOfInteger) {
        regTypeOfInteger(CK_NES, typeOfInteger);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br />
     * TYPE_OF_INTEGER: {INTEGER(10)}
     * @param typeOfInteger The value of typeOfInteger as greaterThan. (NullAllowed: if null, no condition)
     */
    public void setTypeOfInteger_GreaterThan(Integer typeOfInteger) {
        regTypeOfInteger(CK_GT, typeOfInteger);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br />
     * TYPE_OF_INTEGER: {INTEGER(10)}
     * @param typeOfInteger The value of typeOfInteger as lessThan. (NullAllowed: if null, no condition)
     */
    public void setTypeOfInteger_LessThan(Integer typeOfInteger) {
        regTypeOfInteger(CK_LT, typeOfInteger);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * TYPE_OF_INTEGER: {INTEGER(10)}
     * @param typeOfInteger The value of typeOfInteger as greaterEqual. (NullAllowed: if null, no condition)
     */
    public void setTypeOfInteger_GreaterEqual(Integer typeOfInteger) {
        regTypeOfInteger(CK_GE, typeOfInteger);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * TYPE_OF_INTEGER: {INTEGER(10)}
     * @param typeOfInteger The value of typeOfInteger as lessEqual. (NullAllowed: if null, no condition)
     */
    public void setTypeOfInteger_LessEqual(Integer typeOfInteger) {
        regTypeOfInteger(CK_LE, typeOfInteger);
    }

    /**
     * RangeOf with various options. (versatile) <br />
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br />
     * And NullIgnored, OnlyOnceRegistered. <br />
     * TYPE_OF_INTEGER: {INTEGER(10)}
     * @param minNumber The min number of typeOfInteger. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of typeOfInteger. (NullAllowed: if null, no to-condition)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setTypeOfInteger_RangeOf(Integer minNumber, Integer maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, getCValueTypeOfInteger(), "TYPE_OF_INTEGER", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * TYPE_OF_INTEGER: {INTEGER(10)}
     * @param typeOfIntegerList The collection of typeOfInteger as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setTypeOfInteger_InScope(Collection<Integer> typeOfIntegerList) {
        doSetTypeOfInteger_InScope(typeOfIntegerList);
    }

    protected void doSetTypeOfInteger_InScope(Collection<Integer> typeOfIntegerList) {
        regINS(CK_INS, cTL(typeOfIntegerList), getCValueTypeOfInteger(), "TYPE_OF_INTEGER");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * TYPE_OF_INTEGER: {INTEGER(10)}
     * @param typeOfIntegerList The collection of typeOfInteger as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setTypeOfInteger_NotInScope(Collection<Integer> typeOfIntegerList) {
        doSetTypeOfInteger_NotInScope(typeOfIntegerList);
    }

    protected void doSetTypeOfInteger_NotInScope(Collection<Integer> typeOfIntegerList) {
        regINS(CK_NINS, cTL(typeOfIntegerList), getCValueTypeOfInteger(), "TYPE_OF_INTEGER");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br />
     * TYPE_OF_INTEGER: {INTEGER(10)}
     */
    public void setTypeOfInteger_IsNull() { regTypeOfInteger(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br />
     * TYPE_OF_INTEGER: {INTEGER(10)}
     */
    public void setTypeOfInteger_IsNotNull() { regTypeOfInteger(CK_ISNN, DOBJ); }

    protected void regTypeOfInteger(ConditionKey ky, Object vl) { regQ(ky, vl, getCValueTypeOfInteger(), "TYPE_OF_INTEGER"); }
    protected abstract ConditionValue getCValueTypeOfInteger();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br />
     * TYPE_OF_DATE: {DATE(10)}
     * @param typeOfDate The value of typeOfDate as equal. (NullAllowed: if null, no condition)
     */
    public void setTypeOfDate_Equal(java.util.Date typeOfDate) {
        regTypeOfDate(CK_EQ,  fCTPD(typeOfDate));
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br />
     * TYPE_OF_DATE: {DATE(10)}
     * @param typeOfDate The value of typeOfDate as notEqual. (NullAllowed: if null, no condition)
     */
    public void setTypeOfDate_NotEqual(java.util.Date typeOfDate) {
        regTypeOfDate(CK_NES,  fCTPD(typeOfDate));
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br />
     * TYPE_OF_DATE: {DATE(10)}
     * @param typeOfDate The value of typeOfDate as greaterThan. (NullAllowed: if null, no condition)
     */
    public void setTypeOfDate_GreaterThan(java.util.Date typeOfDate) {
        regTypeOfDate(CK_GT,  fCTPD(typeOfDate));
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br />
     * TYPE_OF_DATE: {DATE(10)}
     * @param typeOfDate The value of typeOfDate as lessThan. (NullAllowed: if null, no condition)
     */
    public void setTypeOfDate_LessThan(java.util.Date typeOfDate) {
        regTypeOfDate(CK_LT,  fCTPD(typeOfDate));
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * TYPE_OF_DATE: {DATE(10)}
     * @param typeOfDate The value of typeOfDate as greaterEqual. (NullAllowed: if null, no condition)
     */
    public void setTypeOfDate_GreaterEqual(java.util.Date typeOfDate) {
        regTypeOfDate(CK_GE,  fCTPD(typeOfDate));
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * TYPE_OF_DATE: {DATE(10)}
     * @param typeOfDate The value of typeOfDate as lessEqual. (NullAllowed: if null, no condition)
     */
    public void setTypeOfDate_LessEqual(java.util.Date typeOfDate) {
        regTypeOfDate(CK_LE, fCTPD(typeOfDate));
    }

    /**
     * FromTo with various options. (versatile) {(default) fromDatetime &lt;= column &lt;= toDatetime} <br />
     * And NullIgnored, OnlyOnceRegistered. <br />
     * TYPE_OF_DATE: {DATE(10)}
     * <pre>e.g. setTypeOfDate_FromTo(fromDate, toDate, new <span style="color: #DD4747">FromToOption</span>().compareAsDate());</pre>
     * @param fromDatetime The from-datetime(yyyy/MM/dd HH:mm:ss.SSS) of typeOfDate. (NullAllowed: if null, no from-condition)
     * @param toDatetime The to-datetime(yyyy/MM/dd HH:mm:ss.SSS) of typeOfDate. (NullAllowed: if null, no to-condition)
     * @param fromToOption The option of from-to. (NotNull)
     */
    public void setTypeOfDate_FromTo(Date fromDatetime, Date toDatetime, FromToOption fromToOption) {
        regFTQ(fCTPD(fromDatetime), fCTPD(toDatetime), getCValueTypeOfDate(), "TYPE_OF_DATE", fromToOption);
    }

    /**
     * DateFromTo. (Date means yyyy/MM/dd) {fromDate &lt;= column &lt; toDate + 1 day} <br />
     * And NullIgnored, OnlyOnceRegistered. <br />
     * TYPE_OF_DATE: {DATE(10)}
     * <pre>
     * e.g. from:{2007/04/10 08:24:53} to:{2007/04/16 14:36:29}
     *  column &gt;= '2007/04/10 00:00:00' and column <span style="color: #DD4747">&lt; '2007/04/17 00:00:00'</span>
     * </pre>
     * @param fromDate The from-date(yyyy/MM/dd) of typeOfDate. (NullAllowed: if null, no from-condition)
     * @param toDate The to-date(yyyy/MM/dd) of typeOfDate. (NullAllowed: if null, no to-condition)
     */
    public void setTypeOfDate_DateFromTo(Date fromDate, Date toDate) {
        setTypeOfDate_FromTo(fromDate, toDate, new FromToOption().compareAsDate());
    }

    /**
     * InScope {in ('1965-03-03', '1966-09-15')}. And NullOrEmptyIgnored, NullElementIgnored, SeveralRegistered. <br />
     * TYPE_OF_DATE: {DATE(10)}
     * @param typeOfDateList The collection of typeOfDate as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setTypeOfDate_InScope(Collection<java.util.Date> typeOfDateList) {
        doSetTypeOfDate_InScope(typeOfDateList);
    }

    protected void doSetTypeOfDate_InScope(Collection<java.util.Date> typeOfDateList) {
        regINS(CK_INS, cTL(typeOfDateList), getCValueTypeOfDate(), "TYPE_OF_DATE");
    }

    /**
     * NotInScope {not in ('1965-03-03', '1966-09-15')}. And NullOrEmptyIgnored, NullElementIgnored, SeveralRegistered. <br />
     * TYPE_OF_DATE: {DATE(10)}
     * @param typeOfDateList The collection of typeOfDate as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setTypeOfDate_NotInScope(Collection<java.util.Date> typeOfDateList) {
        doSetTypeOfDate_NotInScope(typeOfDateList);
    }

    protected void doSetTypeOfDate_NotInScope(Collection<java.util.Date> typeOfDateList) {
        regINS(CK_NINS, cTL(typeOfDateList), getCValueTypeOfDate(), "TYPE_OF_DATE");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br />
     * TYPE_OF_DATE: {DATE(10)}
     */
    public void setTypeOfDate_IsNull() { regTypeOfDate(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br />
     * TYPE_OF_DATE: {DATE(10)}
     */
    public void setTypeOfDate_IsNotNull() { regTypeOfDate(CK_ISNN, DOBJ); }

    protected void regTypeOfDate(ConditionKey ky, Object vl) { regQ(ky, vl, getCValueTypeOfDate(), "TYPE_OF_DATE"); }
    protected abstract ConditionValue getCValueTypeOfDate();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br />
     * TYPE_OF_TIMESTAMP: {TIMESTAMP(26, 6)}
     * @param typeOfTimestamp The value of typeOfTimestamp as equal. (NullAllowed: if null, no condition)
     */
    public void setTypeOfTimestamp_Equal(java.sql.Timestamp typeOfTimestamp) {
        regTypeOfTimestamp(CK_EQ,  typeOfTimestamp);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br />
     * TYPE_OF_TIMESTAMP: {TIMESTAMP(26, 6)}
     * @param typeOfTimestamp The value of typeOfTimestamp as notEqual. (NullAllowed: if null, no condition)
     */
    public void setTypeOfTimestamp_NotEqual(java.sql.Timestamp typeOfTimestamp) {
        regTypeOfTimestamp(CK_NES,  typeOfTimestamp);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br />
     * TYPE_OF_TIMESTAMP: {TIMESTAMP(26, 6)}
     * @param typeOfTimestamp The value of typeOfTimestamp as greaterThan. (NullAllowed: if null, no condition)
     */
    public void setTypeOfTimestamp_GreaterThan(java.sql.Timestamp typeOfTimestamp) {
        regTypeOfTimestamp(CK_GT,  typeOfTimestamp);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br />
     * TYPE_OF_TIMESTAMP: {TIMESTAMP(26, 6)}
     * @param typeOfTimestamp The value of typeOfTimestamp as lessThan. (NullAllowed: if null, no condition)
     */
    public void setTypeOfTimestamp_LessThan(java.sql.Timestamp typeOfTimestamp) {
        regTypeOfTimestamp(CK_LT,  typeOfTimestamp);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * TYPE_OF_TIMESTAMP: {TIMESTAMP(26, 6)}
     * @param typeOfTimestamp The value of typeOfTimestamp as greaterEqual. (NullAllowed: if null, no condition)
     */
    public void setTypeOfTimestamp_GreaterEqual(java.sql.Timestamp typeOfTimestamp) {
        regTypeOfTimestamp(CK_GE,  typeOfTimestamp);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * TYPE_OF_TIMESTAMP: {TIMESTAMP(26, 6)}
     * @param typeOfTimestamp The value of typeOfTimestamp as lessEqual. (NullAllowed: if null, no condition)
     */
    public void setTypeOfTimestamp_LessEqual(java.sql.Timestamp typeOfTimestamp) {
        regTypeOfTimestamp(CK_LE, typeOfTimestamp);
    }

    /**
     * FromTo with various options. (versatile) {(default) fromDatetime &lt;= column &lt;= toDatetime} <br />
     * And NullIgnored, OnlyOnceRegistered. <br />
     * TYPE_OF_TIMESTAMP: {TIMESTAMP(26, 6)}
     * <pre>e.g. setTypeOfTimestamp_FromTo(fromDate, toDate, new <span style="color: #DD4747">FromToOption</span>().compareAsDate());</pre>
     * @param fromDatetime The from-datetime(yyyy/MM/dd HH:mm:ss.SSS) of typeOfTimestamp. (NullAllowed: if null, no from-condition)
     * @param toDatetime The to-datetime(yyyy/MM/dd HH:mm:ss.SSS) of typeOfTimestamp. (NullAllowed: if null, no to-condition)
     * @param fromToOption The option of from-to. (NotNull)
     */
    public void setTypeOfTimestamp_FromTo(Date fromDatetime, Date toDatetime, FromToOption fromToOption) {
        regFTQ((fromDatetime != null ? new java.sql.Timestamp(fromDatetime.getTime()) : null), (toDatetime != null ? new java.sql.Timestamp(toDatetime.getTime()) : null), getCValueTypeOfTimestamp(), "TYPE_OF_TIMESTAMP", fromToOption);
    }

    /**
     * DateFromTo. (Date means yyyy/MM/dd) {fromDate &lt;= column &lt; toDate + 1 day} <br />
     * And NullIgnored, OnlyOnceRegistered. <br />
     * TYPE_OF_TIMESTAMP: {TIMESTAMP(26, 6)}
     * <pre>
     * e.g. from:{2007/04/10 08:24:53} to:{2007/04/16 14:36:29}
     *  column &gt;= '2007/04/10 00:00:00' and column <span style="color: #DD4747">&lt; '2007/04/17 00:00:00'</span>
     * </pre>
     * @param fromDate The from-date(yyyy/MM/dd) of typeOfTimestamp. (NullAllowed: if null, no from-condition)
     * @param toDate The to-date(yyyy/MM/dd) of typeOfTimestamp. (NullAllowed: if null, no to-condition)
     */
    public void setTypeOfTimestamp_DateFromTo(Date fromDate, Date toDate) {
        setTypeOfTimestamp_FromTo(fromDate, toDate, new FromToOption().compareAsDate());
    }

    /**
     * InScope {in ('1965-03-03', '1966-09-15')}. And NullOrEmptyIgnored, NullElementIgnored, SeveralRegistered. <br />
     * TYPE_OF_TIMESTAMP: {TIMESTAMP(26, 6)}
     * @param typeOfTimestampList The collection of typeOfTimestamp as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setTypeOfTimestamp_InScope(Collection<java.sql.Timestamp> typeOfTimestampList) {
        doSetTypeOfTimestamp_InScope(typeOfTimestampList);
    }

    protected void doSetTypeOfTimestamp_InScope(Collection<java.sql.Timestamp> typeOfTimestampList) {
        regINS(CK_INS, cTL(typeOfTimestampList), getCValueTypeOfTimestamp(), "TYPE_OF_TIMESTAMP");
    }

    /**
     * NotInScope {not in ('1965-03-03', '1966-09-15')}. And NullOrEmptyIgnored, NullElementIgnored, SeveralRegistered. <br />
     * TYPE_OF_TIMESTAMP: {TIMESTAMP(26, 6)}
     * @param typeOfTimestampList The collection of typeOfTimestamp as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setTypeOfTimestamp_NotInScope(Collection<java.sql.Timestamp> typeOfTimestampList) {
        doSetTypeOfTimestamp_NotInScope(typeOfTimestampList);
    }

    protected void doSetTypeOfTimestamp_NotInScope(Collection<java.sql.Timestamp> typeOfTimestampList) {
        regINS(CK_NINS, cTL(typeOfTimestampList), getCValueTypeOfTimestamp(), "TYPE_OF_TIMESTAMP");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br />
     * TYPE_OF_TIMESTAMP: {TIMESTAMP(26, 6)}
     */
    public void setTypeOfTimestamp_IsNull() { regTypeOfTimestamp(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br />
     * TYPE_OF_TIMESTAMP: {TIMESTAMP(26, 6)}
     */
    public void setTypeOfTimestamp_IsNotNull() { regTypeOfTimestamp(CK_ISNN, DOBJ); }

    protected void regTypeOfTimestamp(ConditionKey ky, Object vl) { regQ(ky, vl, getCValueTypeOfTimestamp(), "TYPE_OF_TIMESTAMP"); }
    protected abstract ConditionValue getCValueTypeOfTimestamp();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br />
     * TYPE_OF_TIME: {TIME(8)}
     * @param typeOfTime The value of typeOfTime as equal. (NullAllowed: if null, no condition)
     */
    public void setTypeOfTime_Equal(java.sql.Time typeOfTime) {
        regTypeOfTime(CK_EQ,  typeOfTime);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br />
     * TYPE_OF_TIME: {TIME(8)}
     * @param typeOfTime The value of typeOfTime as notEqual. (NullAllowed: if null, no condition)
     */
    public void setTypeOfTime_NotEqual(java.sql.Time typeOfTime) {
        regTypeOfTime(CK_NES,  typeOfTime);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br />
     * TYPE_OF_TIME: {TIME(8)}
     * @param typeOfTime The value of typeOfTime as greaterThan. (NullAllowed: if null, no condition)
     */
    public void setTypeOfTime_GreaterThan(java.sql.Time typeOfTime) {
        regTypeOfTime(CK_GT,  typeOfTime);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br />
     * TYPE_OF_TIME: {TIME(8)}
     * @param typeOfTime The value of typeOfTime as lessThan. (NullAllowed: if null, no condition)
     */
    public void setTypeOfTime_LessThan(java.sql.Time typeOfTime) {
        regTypeOfTime(CK_LT,  typeOfTime);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * TYPE_OF_TIME: {TIME(8)}
     * @param typeOfTime The value of typeOfTime as greaterEqual. (NullAllowed: if null, no condition)
     */
    public void setTypeOfTime_GreaterEqual(java.sql.Time typeOfTime) {
        regTypeOfTime(CK_GE,  typeOfTime);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * TYPE_OF_TIME: {TIME(8)}
     * @param typeOfTime The value of typeOfTime as lessEqual. (NullAllowed: if null, no condition)
     */
    public void setTypeOfTime_LessEqual(java.sql.Time typeOfTime) {
        regTypeOfTime(CK_LE, typeOfTime);
    }

    /**
     * InScope {in ('1965-03-03', '1966-09-15')}. And NullOrEmptyIgnored, NullElementIgnored, SeveralRegistered. <br />
     * TYPE_OF_TIME: {TIME(8)}
     * @param typeOfTimeList The collection of typeOfTime as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setTypeOfTime_InScope(Collection<java.sql.Time> typeOfTimeList) {
        doSetTypeOfTime_InScope(typeOfTimeList);
    }

    protected void doSetTypeOfTime_InScope(Collection<java.sql.Time> typeOfTimeList) {
        regINS(CK_INS, cTL(typeOfTimeList), getCValueTypeOfTime(), "TYPE_OF_TIME");
    }

    /**
     * NotInScope {not in ('1965-03-03', '1966-09-15')}. And NullOrEmptyIgnored, NullElementIgnored, SeveralRegistered. <br />
     * TYPE_OF_TIME: {TIME(8)}
     * @param typeOfTimeList The collection of typeOfTime as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setTypeOfTime_NotInScope(Collection<java.sql.Time> typeOfTimeList) {
        doSetTypeOfTime_NotInScope(typeOfTimeList);
    }

    protected void doSetTypeOfTime_NotInScope(Collection<java.sql.Time> typeOfTimeList) {
        regINS(CK_NINS, cTL(typeOfTimeList), getCValueTypeOfTime(), "TYPE_OF_TIME");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br />
     * TYPE_OF_TIME: {TIME(8)}
     */
    public void setTypeOfTime_IsNull() { regTypeOfTime(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br />
     * TYPE_OF_TIME: {TIME(8)}
     */
    public void setTypeOfTime_IsNotNull() { regTypeOfTime(CK_ISNN, DOBJ); }

    protected void regTypeOfTime(ConditionKey ky, Object vl) { regQ(ky, vl, getCValueTypeOfTime(), "TYPE_OF_TIME"); }
    protected abstract ConditionValue getCValueTypeOfTime();

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    /**
     * Prepare ScalarCondition as equal. <br />
     * {where FOO = (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #DD4747">scalar_Equal()</span>.max(new SubQuery&lt;LdVendorCheckCB&gt;() {
     *     public void query(LdVendorCheckCB subCB) {
     *         subCB.specify().setXxx... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setYyy...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<LdVendorCheckCB> scalar_Equal() {
        return xcreateSSQFunction(CK_EQ, LdVendorCheckCB.class);
    }

    /**
     * Prepare ScalarCondition as equal. <br />
     * {where FOO &lt;&gt; (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #DD4747">scalar_NotEqual()</span>.max(new SubQuery&lt;LdVendorCheckCB&gt;() {
     *     public void query(LdVendorCheckCB subCB) {
     *         subCB.specify().setXxx... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setYyy...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<LdVendorCheckCB> scalar_NotEqual() {
        return xcreateSSQFunction(CK_NES, LdVendorCheckCB.class);
    }

    /**
     * Prepare ScalarCondition as greaterThan. <br />
     * {where FOO &gt; (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #DD4747">scalar_GreaterThan()</span>.max(new SubQuery&lt;LdVendorCheckCB&gt;() {
     *     public void query(LdVendorCheckCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<LdVendorCheckCB> scalar_GreaterThan() {
        return xcreateSSQFunction(CK_GT, LdVendorCheckCB.class);
    }

    /**
     * Prepare ScalarCondition as lessThan. <br />
     * {where FOO &lt; (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #DD4747">scalar_LessThan()</span>.max(new SubQuery&lt;LdVendorCheckCB&gt;() {
     *     public void query(LdVendorCheckCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<LdVendorCheckCB> scalar_LessThan() {
        return xcreateSSQFunction(CK_LT, LdVendorCheckCB.class);
    }

    /**
     * Prepare ScalarCondition as greaterEqual. <br />
     * {where FOO &gt;= (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #DD4747">scalar_GreaterEqual()</span>.max(new SubQuery&lt;LdVendorCheckCB&gt;() {
     *     public void query(LdVendorCheckCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<LdVendorCheckCB> scalar_GreaterEqual() {
        return xcreateSSQFunction(CK_GE, LdVendorCheckCB.class);
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br />
     * {where FOO &lt;= (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #DD4747">scalar_LessEqual()</span>.max(new SubQuery&lt;LdVendorCheckCB&gt;() {
     *     public void query(LdVendorCheckCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<LdVendorCheckCB> scalar_LessEqual() {
        return xcreateSSQFunction(CK_LE, LdVendorCheckCB.class);
    }

    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xscalarCondition(String fn, SubQuery<CB> sq, String rd, HpSSQOption<CB> op) {
        assertObjectNotNull("subQuery", sq);
        LdVendorCheckCB cb = xcreateScalarConditionCB(); sq.query((CB)cb);
        String pp = keepScalarCondition(cb.query()); // for saving query-value
        op.setPartitionByCBean((CB)xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(fn, cb.query(), pp, rd, op);
    }
    public abstract String keepScalarCondition(LdVendorCheckCQ sq);

    protected LdVendorCheckCB xcreateScalarConditionCB() {
        LdVendorCheckCB cb = newMyCB(); cb.xsetupForScalarCondition(this); return cb;
    }

    protected LdVendorCheckCB xcreateScalarConditionPartitionByCB() {
        LdVendorCheckCB cb = newMyCB(); cb.xsetupForScalarConditionPartitionBy(this); return cb;
    }

    // ===================================================================================
    //                                                                        Manual Order
    //                                                                        ============
    /**
     * Order along manual ordering information.
     * <pre>
     * MemberCB cb = new MemberCB();
     * ManualOrderBean mob = new ManualOrderBean();
     * mob.<span style="color: #DD4747">when_GreaterEqual</span>(priorityDate); <span style="color: #3F7E5E">// e.g. 2000/01/01</span>
     * cb.query().addOrderBy_Birthdate_Asc().<span style="color: #DD4747">withManualOrder(mob)</span>;
     * <span style="color: #3F7E5E">// order by </span>
     * <span style="color: #3F7E5E">//   case</span>
     * <span style="color: #3F7E5E">//     when BIRTHDATE &gt;= '2000/01/01' then 0</span>
     * <span style="color: #3F7E5E">//     else 1</span>
     * <span style="color: #3F7E5E">//   end asc, ...</span>
     *
     * MemberCB cb = new MemberCB();
     * ManualOrderBean mob = new ManualOrderBean();
     * mob.<span style="color: #DD4747">when_Equal</span>(CDef.MemberStatus.Withdrawal);
     * mob.<span style="color: #DD4747">when_Equal</span>(CDef.MemberStatus.Formalized);
     * mob.<span style="color: #DD4747">when_Equal</span>(CDef.MemberStatus.Provisional);
     * cb.query().addOrderBy_MemberStatusCode_Asc().<span style="color: #DD4747">withManualOrder(mob)</span>;
     * <span style="color: #3F7E5E">// order by </span>
     * <span style="color: #3F7E5E">//   case</span>
     * <span style="color: #3F7E5E">//     when MEMBER_STATUS_CODE = 'WDL' then 0</span>
     * <span style="color: #3F7E5E">//     when MEMBER_STATUS_CODE = 'FML' then 1</span>
     * <span style="color: #3F7E5E">//     when MEMBER_STATUS_CODE = 'PRV' then 2</span>
     * <span style="color: #3F7E5E">//     else 3</span>
     * <span style="color: #3F7E5E">//   end asc, ...</span>
     * </pre>
     * <p>This function with Union is unsupported!</p>
     * <p>The order values are bound (treated as bind parameter).</p>
     * @param mob The bean of manual order containing order values. (NotNull)
     */
    public void withManualOrder(ManualOrderBean mob) { // is user public!
        xdoWithManualOrder(mob);
    }

    // ===================================================================================
    //                                                                    Small Adjustment
    //                                                                    ================
    /**
     * Order along the list of manual values. #beforejava8 <br />
     * This function with Union is unsupported! <br />
     * The order values are bound (treated as bind parameter).
     * <pre>
     * MemberCB cb = new MemberCB();
     * List&lt;CDef.MemberStatus&gt; orderValueList = new ArrayList&lt;CDef.MemberStatus&gt;();
     * orderValueList.add(CDef.MemberStatus.Withdrawal);
     * orderValueList.add(CDef.MemberStatus.Formalized);
     * orderValueList.add(CDef.MemberStatus.Provisional);
     * cb.query().addOrderBy_MemberStatusCode_Asc().<span style="color: #DD4747">withManualOrder(orderValueList)</span>;
     * <span style="color: #3F7E5E">// order by </span>
     * <span style="color: #3F7E5E">//   case</span>
     * <span style="color: #3F7E5E">//     when MEMBER_STATUS_CODE = 'WDL' then 0</span>
     * <span style="color: #3F7E5E">//     when MEMBER_STATUS_CODE = 'FML' then 1</span>
     * <span style="color: #3F7E5E">//     when MEMBER_STATUS_CODE = 'PRV' then 2</span>
     * <span style="color: #3F7E5E">//     else 3</span>
     * <span style="color: #3F7E5E">//   end asc, ...</span>
     * </pre>
     * @param orderValueList The list of order values for manual ordering. (NotNull)
     */
    public void withManualOrder(List<? extends Object> orderValueList) { // is user public!
        assertObjectNotNull("withManualOrder(orderValueList)", orderValueList);
        final ManualOrderBean manualOrderBean = new ManualOrderBean();
        manualOrderBean.acceptOrderValueList(orderValueList);
        withManualOrder(manualOrderBean);
    }

    @Override
    protected void filterFromToOption(FromToOption option) {
        option.allowOneSide();
    }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    protected LdVendorCheckCB newMyCB() {
        return new LdVendorCheckCB();
    }
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabUDT() { return Date.class.getName(); }
    protected String xabCQ() { return LdVendorCheckCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSSQS() { return HpSSQSetupper.class.getName(); }
}
