package com.example.dbflute.multipledb.spring.dbflute.memberdb.cbean.cq.bs;

import java.util.Map;

import org.seasar.dbflute.cbean.*;
import org.seasar.dbflute.cbean.chelper.*;
import org.seasar.dbflute.cbean.coption.*;
import org.seasar.dbflute.cbean.cvalue.ConditionValue;
import org.seasar.dbflute.cbean.sqlclause.SqlClause;
import org.seasar.dbflute.exception.IllegalConditionBeanOperationException;
import com.example.dbflute.multipledb.spring.dbflute.memberdb.cbean.cq.ciq.*;
import com.example.dbflute.multipledb.spring.dbflute.memberdb.cbean.*;
import com.example.dbflute.multipledb.spring.dbflute.memberdb.cbean.cq.*;

/**
 * The base condition-query of MEMBER.
 * @author DBFlute(AutoGenerator)
 */
public class BsMemberCQ extends AbstractBsMemberCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected MemberCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsMemberCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br />
     * {select ... from ... left outer join (select * from MEMBER) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #DD4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public MemberCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected MemberCIQ xcreateCIQ() {
        MemberCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected MemberCIQ xnewCIQ() {
        return new MemberCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br />
     * {select ... from ... left outer join MEMBER on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #DD4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public MemberCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        MemberCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    protected ConditionValue _memberId;
    public ConditionValue getMemberId()
    { if (_memberId == null) { _memberId = nCV(); }
      return _memberId; }
    protected ConditionValue getCValueMemberId() { return getMemberId(); }

    public Map<String, MemberAddressCQ> getMemberId_ExistsReferrer_MemberAddressList() { return xgetSQueMap("memberId_ExistsReferrer_MemberAddressList"); }
    public String keepMemberId_ExistsReferrer_MemberAddressList(MemberAddressCQ sq) { return xkeepSQue("memberId_ExistsReferrer_MemberAddressList", sq); }

    public Map<String, MemberLoginCQ> getMemberId_ExistsReferrer_MemberLoginList() { return xgetSQueMap("memberId_ExistsReferrer_MemberLoginList"); }
    public String keepMemberId_ExistsReferrer_MemberLoginList(MemberLoginCQ sq) { return xkeepSQue("memberId_ExistsReferrer_MemberLoginList", sq); }

    public Map<String, MemberSecurityCQ> getMemberId_ExistsReferrer_MemberSecurityAsOne() { return xgetSQueMap("memberId_ExistsReferrer_MemberSecurityAsOne"); }
    public String keepMemberId_ExistsReferrer_MemberSecurityAsOne(MemberSecurityCQ sq) { return xkeepSQue("memberId_ExistsReferrer_MemberSecurityAsOne", sq); }

    public Map<String, MemberServiceCQ> getMemberId_ExistsReferrer_MemberServiceAsOne() { return xgetSQueMap("memberId_ExistsReferrer_MemberServiceAsOne"); }
    public String keepMemberId_ExistsReferrer_MemberServiceAsOne(MemberServiceCQ sq) { return xkeepSQue("memberId_ExistsReferrer_MemberServiceAsOne", sq); }

    public Map<String, MemberWithdrawalCQ> getMemberId_ExistsReferrer_MemberWithdrawalAsOne() { return xgetSQueMap("memberId_ExistsReferrer_MemberWithdrawalAsOne"); }
    public String keepMemberId_ExistsReferrer_MemberWithdrawalAsOne(MemberWithdrawalCQ sq) { return xkeepSQue("memberId_ExistsReferrer_MemberWithdrawalAsOne", sq); }

    public Map<String, PurchaseCQ> getMemberId_ExistsReferrer_PurchaseList() { return xgetSQueMap("memberId_ExistsReferrer_PurchaseList"); }
    public String keepMemberId_ExistsReferrer_PurchaseList(PurchaseCQ sq) { return xkeepSQue("memberId_ExistsReferrer_PurchaseList", sq); }

    public Map<String, MemberAddressCQ> getMemberId_NotExistsReferrer_MemberAddressList() { return xgetSQueMap("memberId_NotExistsReferrer_MemberAddressList"); }
    public String keepMemberId_NotExistsReferrer_MemberAddressList(MemberAddressCQ sq) { return xkeepSQue("memberId_NotExistsReferrer_MemberAddressList", sq); }

    public Map<String, MemberLoginCQ> getMemberId_NotExistsReferrer_MemberLoginList() { return xgetSQueMap("memberId_NotExistsReferrer_MemberLoginList"); }
    public String keepMemberId_NotExistsReferrer_MemberLoginList(MemberLoginCQ sq) { return xkeepSQue("memberId_NotExistsReferrer_MemberLoginList", sq); }

    public Map<String, MemberSecurityCQ> getMemberId_NotExistsReferrer_MemberSecurityAsOne() { return xgetSQueMap("memberId_NotExistsReferrer_MemberSecurityAsOne"); }
    public String keepMemberId_NotExistsReferrer_MemberSecurityAsOne(MemberSecurityCQ sq) { return xkeepSQue("memberId_NotExistsReferrer_MemberSecurityAsOne", sq); }

    public Map<String, MemberServiceCQ> getMemberId_NotExistsReferrer_MemberServiceAsOne() { return xgetSQueMap("memberId_NotExistsReferrer_MemberServiceAsOne"); }
    public String keepMemberId_NotExistsReferrer_MemberServiceAsOne(MemberServiceCQ sq) { return xkeepSQue("memberId_NotExistsReferrer_MemberServiceAsOne", sq); }

    public Map<String, MemberWithdrawalCQ> getMemberId_NotExistsReferrer_MemberWithdrawalAsOne() { return xgetSQueMap("memberId_NotExistsReferrer_MemberWithdrawalAsOne"); }
    public String keepMemberId_NotExistsReferrer_MemberWithdrawalAsOne(MemberWithdrawalCQ sq) { return xkeepSQue("memberId_NotExistsReferrer_MemberWithdrawalAsOne", sq); }

    public Map<String, PurchaseCQ> getMemberId_NotExistsReferrer_PurchaseList() { return xgetSQueMap("memberId_NotExistsReferrer_PurchaseList"); }
    public String keepMemberId_NotExistsReferrer_PurchaseList(PurchaseCQ sq) { return xkeepSQue("memberId_NotExistsReferrer_PurchaseList", sq); }

    public Map<String, MemberAddressCQ> getMemberId_SpecifyDerivedReferrer_MemberAddressList() { return xgetSQueMap("memberId_SpecifyDerivedReferrer_MemberAddressList"); }
    public String keepMemberId_SpecifyDerivedReferrer_MemberAddressList(MemberAddressCQ sq) { return xkeepSQue("memberId_SpecifyDerivedReferrer_MemberAddressList", sq); }

    public Map<String, MemberLoginCQ> getMemberId_SpecifyDerivedReferrer_MemberLoginList() { return xgetSQueMap("memberId_SpecifyDerivedReferrer_MemberLoginList"); }
    public String keepMemberId_SpecifyDerivedReferrer_MemberLoginList(MemberLoginCQ sq) { return xkeepSQue("memberId_SpecifyDerivedReferrer_MemberLoginList", sq); }

    public Map<String, PurchaseCQ> getMemberId_SpecifyDerivedReferrer_PurchaseList() { return xgetSQueMap("memberId_SpecifyDerivedReferrer_PurchaseList"); }
    public String keepMemberId_SpecifyDerivedReferrer_PurchaseList(PurchaseCQ sq) { return xkeepSQue("memberId_SpecifyDerivedReferrer_PurchaseList", sq); }

    public Map<String, MemberAddressCQ> getMemberId_InScopeRelation_MemberAddressList() { return xgetSQueMap("memberId_InScopeRelation_MemberAddressList"); }
    public String keepMemberId_InScopeRelation_MemberAddressList(MemberAddressCQ sq) { return xkeepSQue("memberId_InScopeRelation_MemberAddressList", sq); }

    public Map<String, MemberLoginCQ> getMemberId_InScopeRelation_MemberLoginList() { return xgetSQueMap("memberId_InScopeRelation_MemberLoginList"); }
    public String keepMemberId_InScopeRelation_MemberLoginList(MemberLoginCQ sq) { return xkeepSQue("memberId_InScopeRelation_MemberLoginList", sq); }

    public Map<String, MemberSecurityCQ> getMemberId_InScopeRelation_MemberSecurityAsOne() { return xgetSQueMap("memberId_InScopeRelation_MemberSecurityAsOne"); }
    public String keepMemberId_InScopeRelation_MemberSecurityAsOne(MemberSecurityCQ sq) { return xkeepSQue("memberId_InScopeRelation_MemberSecurityAsOne", sq); }

    public Map<String, MemberServiceCQ> getMemberId_InScopeRelation_MemberServiceAsOne() { return xgetSQueMap("memberId_InScopeRelation_MemberServiceAsOne"); }
    public String keepMemberId_InScopeRelation_MemberServiceAsOne(MemberServiceCQ sq) { return xkeepSQue("memberId_InScopeRelation_MemberServiceAsOne", sq); }

    public Map<String, MemberWithdrawalCQ> getMemberId_InScopeRelation_MemberWithdrawalAsOne() { return xgetSQueMap("memberId_InScopeRelation_MemberWithdrawalAsOne"); }
    public String keepMemberId_InScopeRelation_MemberWithdrawalAsOne(MemberWithdrawalCQ sq) { return xkeepSQue("memberId_InScopeRelation_MemberWithdrawalAsOne", sq); }

    public Map<String, PurchaseCQ> getMemberId_InScopeRelation_PurchaseList() { return xgetSQueMap("memberId_InScopeRelation_PurchaseList"); }
    public String keepMemberId_InScopeRelation_PurchaseList(PurchaseCQ sq) { return xkeepSQue("memberId_InScopeRelation_PurchaseList", sq); }

    public Map<String, MemberAddressCQ> getMemberId_NotInScopeRelation_MemberAddressList() { return xgetSQueMap("memberId_NotInScopeRelation_MemberAddressList"); }
    public String keepMemberId_NotInScopeRelation_MemberAddressList(MemberAddressCQ sq) { return xkeepSQue("memberId_NotInScopeRelation_MemberAddressList", sq); }

    public Map<String, MemberLoginCQ> getMemberId_NotInScopeRelation_MemberLoginList() { return xgetSQueMap("memberId_NotInScopeRelation_MemberLoginList"); }
    public String keepMemberId_NotInScopeRelation_MemberLoginList(MemberLoginCQ sq) { return xkeepSQue("memberId_NotInScopeRelation_MemberLoginList", sq); }

    public Map<String, MemberSecurityCQ> getMemberId_NotInScopeRelation_MemberSecurityAsOne() { return xgetSQueMap("memberId_NotInScopeRelation_MemberSecurityAsOne"); }
    public String keepMemberId_NotInScopeRelation_MemberSecurityAsOne(MemberSecurityCQ sq) { return xkeepSQue("memberId_NotInScopeRelation_MemberSecurityAsOne", sq); }

    public Map<String, MemberServiceCQ> getMemberId_NotInScopeRelation_MemberServiceAsOne() { return xgetSQueMap("memberId_NotInScopeRelation_MemberServiceAsOne"); }
    public String keepMemberId_NotInScopeRelation_MemberServiceAsOne(MemberServiceCQ sq) { return xkeepSQue("memberId_NotInScopeRelation_MemberServiceAsOne", sq); }

    public Map<String, MemberWithdrawalCQ> getMemberId_NotInScopeRelation_MemberWithdrawalAsOne() { return xgetSQueMap("memberId_NotInScopeRelation_MemberWithdrawalAsOne"); }
    public String keepMemberId_NotInScopeRelation_MemberWithdrawalAsOne(MemberWithdrawalCQ sq) { return xkeepSQue("memberId_NotInScopeRelation_MemberWithdrawalAsOne", sq); }

    public Map<String, PurchaseCQ> getMemberId_NotInScopeRelation_PurchaseList() { return xgetSQueMap("memberId_NotInScopeRelation_PurchaseList"); }
    public String keepMemberId_NotInScopeRelation_PurchaseList(PurchaseCQ sq) { return xkeepSQue("memberId_NotInScopeRelation_PurchaseList", sq); }

    public Map<String, MemberAddressCQ> getMemberId_QueryDerivedReferrer_MemberAddressList() { return xgetSQueMap("memberId_QueryDerivedReferrer_MemberAddressList"); }
    public String keepMemberId_QueryDerivedReferrer_MemberAddressList(MemberAddressCQ sq) { return xkeepSQue("memberId_QueryDerivedReferrer_MemberAddressList", sq); }
    public Map<String, Object> getMemberId_QueryDerivedReferrer_MemberAddressListParameter() { return xgetSQuePmMap("memberId_QueryDerivedReferrer_MemberAddressList"); }
    public String keepMemberId_QueryDerivedReferrer_MemberAddressListParameter(Object pm) { return xkeepSQuePm("memberId_QueryDerivedReferrer_MemberAddressList", pm); }

    public Map<String, MemberLoginCQ> getMemberId_QueryDerivedReferrer_MemberLoginList() { return xgetSQueMap("memberId_QueryDerivedReferrer_MemberLoginList"); }
    public String keepMemberId_QueryDerivedReferrer_MemberLoginList(MemberLoginCQ sq) { return xkeepSQue("memberId_QueryDerivedReferrer_MemberLoginList", sq); }
    public Map<String, Object> getMemberId_QueryDerivedReferrer_MemberLoginListParameter() { return xgetSQuePmMap("memberId_QueryDerivedReferrer_MemberLoginList"); }
    public String keepMemberId_QueryDerivedReferrer_MemberLoginListParameter(Object pm) { return xkeepSQuePm("memberId_QueryDerivedReferrer_MemberLoginList", pm); }

    public Map<String, PurchaseCQ> getMemberId_QueryDerivedReferrer_PurchaseList() { return xgetSQueMap("memberId_QueryDerivedReferrer_PurchaseList"); }
    public String keepMemberId_QueryDerivedReferrer_PurchaseList(PurchaseCQ sq) { return xkeepSQue("memberId_QueryDerivedReferrer_PurchaseList", sq); }
    public Map<String, Object> getMemberId_QueryDerivedReferrer_PurchaseListParameter() { return xgetSQuePmMap("memberId_QueryDerivedReferrer_PurchaseList"); }
    public String keepMemberId_QueryDerivedReferrer_PurchaseListParameter(Object pm) { return xkeepSQuePm("memberId_QueryDerivedReferrer_PurchaseList", pm); }

    /** 
     * Add order-by as ascend. <br />
     * MEMBER_ID: {PK, ID, NotNull, INTEGER(10), FK to MEMBER_LOGIN}
     * @return this. (NotNull)
     */
    public BsMemberCQ addOrderBy_MemberId_Asc() { regOBA("MEMBER_ID"); return this; }

    /**
     * Add order-by as descend. <br />
     * MEMBER_ID: {PK, ID, NotNull, INTEGER(10), FK to MEMBER_LOGIN}
     * @return this. (NotNull)
     */
    public BsMemberCQ addOrderBy_MemberId_Desc() { regOBD("MEMBER_ID"); return this; }

    protected ConditionValue _memberName;
    public ConditionValue getMemberName()
    { if (_memberName == null) { _memberName = nCV(); }
      return _memberName; }
    protected ConditionValue getCValueMemberName() { return getMemberName(); }

    /** 
     * Add order-by as ascend. <br />
     * MEMBER_NAME: {IX, NotNull, VARCHAR(200)}
     * @return this. (NotNull)
     */
    public BsMemberCQ addOrderBy_MemberName_Asc() { regOBA("MEMBER_NAME"); return this; }

    /**
     * Add order-by as descend. <br />
     * MEMBER_NAME: {IX, NotNull, VARCHAR(200)}
     * @return this. (NotNull)
     */
    public BsMemberCQ addOrderBy_MemberName_Desc() { regOBD("MEMBER_NAME"); return this; }

    protected ConditionValue _memberAccount;
    public ConditionValue getMemberAccount()
    { if (_memberAccount == null) { _memberAccount = nCV(); }
      return _memberAccount; }
    protected ConditionValue getCValueMemberAccount() { return getMemberAccount(); }

    /** 
     * Add order-by as ascend. <br />
     * MEMBER_ACCOUNT: {UQ, NotNull, VARCHAR(50)}
     * @return this. (NotNull)
     */
    public BsMemberCQ addOrderBy_MemberAccount_Asc() { regOBA("MEMBER_ACCOUNT"); return this; }

    /**
     * Add order-by as descend. <br />
     * MEMBER_ACCOUNT: {UQ, NotNull, VARCHAR(50)}
     * @return this. (NotNull)
     */
    public BsMemberCQ addOrderBy_MemberAccount_Desc() { regOBD("MEMBER_ACCOUNT"); return this; }

    protected ConditionValue _memberStatusCode;
    public ConditionValue getMemberStatusCode()
    { if (_memberStatusCode == null) { _memberStatusCode = nCV(); }
      return _memberStatusCode; }
    protected ConditionValue getCValueMemberStatusCode() { return getMemberStatusCode(); }

    public Map<String, MemberStatusCQ> getMemberStatusCode_InScopeRelation_MemberStatus() { return xgetSQueMap("memberStatusCode_InScopeRelation_MemberStatus"); }
    public String keepMemberStatusCode_InScopeRelation_MemberStatus(MemberStatusCQ sq) { return xkeepSQue("memberStatusCode_InScopeRelation_MemberStatus", sq); }

    public Map<String, MemberStatusCQ> getMemberStatusCode_NotInScopeRelation_MemberStatus() { return xgetSQueMap("memberStatusCode_NotInScopeRelation_MemberStatus"); }
    public String keepMemberStatusCode_NotInScopeRelation_MemberStatus(MemberStatusCQ sq) { return xkeepSQue("memberStatusCode_NotInScopeRelation_MemberStatus", sq); }

    /** 
     * Add order-by as ascend. <br />
     * MEMBER_STATUS_CODE: {IX, NotNull, CHAR(3), FK to MEMBER_STATUS, classification=MemberStatus}
     * @return this. (NotNull)
     */
    public BsMemberCQ addOrderBy_MemberStatusCode_Asc() { regOBA("MEMBER_STATUS_CODE"); return this; }

    /**
     * Add order-by as descend. <br />
     * MEMBER_STATUS_CODE: {IX, NotNull, CHAR(3), FK to MEMBER_STATUS, classification=MemberStatus}
     * @return this. (NotNull)
     */
    public BsMemberCQ addOrderBy_MemberStatusCode_Desc() { regOBD("MEMBER_STATUS_CODE"); return this; }

    protected ConditionValue _formalizedDatetime;
    public ConditionValue getFormalizedDatetime()
    { if (_formalizedDatetime == null) { _formalizedDatetime = nCV(); }
      return _formalizedDatetime; }
    protected ConditionValue getCValueFormalizedDatetime() { return getFormalizedDatetime(); }

    /** 
     * Add order-by as ascend. <br />
     * FORMALIZED_DATETIME: {IX, TIMESTAMP(23, 10)}
     * @return this. (NotNull)
     */
    public BsMemberCQ addOrderBy_FormalizedDatetime_Asc() { regOBA("FORMALIZED_DATETIME"); return this; }

    /**
     * Add order-by as descend. <br />
     * FORMALIZED_DATETIME: {IX, TIMESTAMP(23, 10)}
     * @return this. (NotNull)
     */
    public BsMemberCQ addOrderBy_FormalizedDatetime_Desc() { regOBD("FORMALIZED_DATETIME"); return this; }

    protected ConditionValue _birthdate;
    public ConditionValue getBirthdate()
    { if (_birthdate == null) { _birthdate = nCV(); }
      return _birthdate; }
    protected ConditionValue getCValueBirthdate() { return getBirthdate(); }

    /** 
     * Add order-by as ascend. <br />
     * BIRTHDATE: {DATE(8)}
     * @return this. (NotNull)
     */
    public BsMemberCQ addOrderBy_Birthdate_Asc() { regOBA("BIRTHDATE"); return this; }

    /**
     * Add order-by as descend. <br />
     * BIRTHDATE: {DATE(8)}
     * @return this. (NotNull)
     */
    public BsMemberCQ addOrderBy_Birthdate_Desc() { regOBD("BIRTHDATE"); return this; }

    protected ConditionValue _registerDatetime;
    public ConditionValue getRegisterDatetime()
    { if (_registerDatetime == null) { _registerDatetime = nCV(); }
      return _registerDatetime; }
    protected ConditionValue getCValueRegisterDatetime() { return getRegisterDatetime(); }

    /** 
     * Add order-by as ascend. <br />
     * REGISTER_DATETIME: {NotNull, TIMESTAMP(23, 10)}
     * @return this. (NotNull)
     */
    public BsMemberCQ addOrderBy_RegisterDatetime_Asc() { regOBA("REGISTER_DATETIME"); return this; }

    /**
     * Add order-by as descend. <br />
     * REGISTER_DATETIME: {NotNull, TIMESTAMP(23, 10)}
     * @return this. (NotNull)
     */
    public BsMemberCQ addOrderBy_RegisterDatetime_Desc() { regOBD("REGISTER_DATETIME"); return this; }

    protected ConditionValue _registerUser;
    public ConditionValue getRegisterUser()
    { if (_registerUser == null) { _registerUser = nCV(); }
      return _registerUser; }
    protected ConditionValue getCValueRegisterUser() { return getRegisterUser(); }

    /** 
     * Add order-by as ascend. <br />
     * REGISTER_USER: {NotNull, VARCHAR(200)}
     * @return this. (NotNull)
     */
    public BsMemberCQ addOrderBy_RegisterUser_Asc() { regOBA("REGISTER_USER"); return this; }

    /**
     * Add order-by as descend. <br />
     * REGISTER_USER: {NotNull, VARCHAR(200)}
     * @return this. (NotNull)
     */
    public BsMemberCQ addOrderBy_RegisterUser_Desc() { regOBD("REGISTER_USER"); return this; }

    protected ConditionValue _updateDatetime;
    public ConditionValue getUpdateDatetime()
    { if (_updateDatetime == null) { _updateDatetime = nCV(); }
      return _updateDatetime; }
    protected ConditionValue getCValueUpdateDatetime() { return getUpdateDatetime(); }

    /** 
     * Add order-by as ascend. <br />
     * UPDATE_DATETIME: {NotNull, TIMESTAMP(23, 10)}
     * @return this. (NotNull)
     */
    public BsMemberCQ addOrderBy_UpdateDatetime_Asc() { regOBA("UPDATE_DATETIME"); return this; }

    /**
     * Add order-by as descend. <br />
     * UPDATE_DATETIME: {NotNull, TIMESTAMP(23, 10)}
     * @return this. (NotNull)
     */
    public BsMemberCQ addOrderBy_UpdateDatetime_Desc() { regOBD("UPDATE_DATETIME"); return this; }

    protected ConditionValue _updateUser;
    public ConditionValue getUpdateUser()
    { if (_updateUser == null) { _updateUser = nCV(); }
      return _updateUser; }
    protected ConditionValue getCValueUpdateUser() { return getUpdateUser(); }

    /** 
     * Add order-by as ascend. <br />
     * UPDATE_USER: {NotNull, VARCHAR(200)}
     * @return this. (NotNull)
     */
    public BsMemberCQ addOrderBy_UpdateUser_Asc() { regOBA("UPDATE_USER"); return this; }

    /**
     * Add order-by as descend. <br />
     * UPDATE_USER: {NotNull, VARCHAR(200)}
     * @return this. (NotNull)
     */
    public BsMemberCQ addOrderBy_UpdateUser_Desc() { regOBD("UPDATE_USER"); return this; }

    protected ConditionValue _versionNo;
    public ConditionValue getVersionNo()
    { if (_versionNo == null) { _versionNo = nCV(); }
      return _versionNo; }
    protected ConditionValue getCValueVersionNo() { return getVersionNo(); }

    /** 
     * Add order-by as ascend. <br />
     * VERSION_NO: {NotNull, BIGINT(19)}
     * @return this. (NotNull)
     */
    public BsMemberCQ addOrderBy_VersionNo_Asc() { regOBA("VERSION_NO"); return this; }

    /**
     * Add order-by as descend. <br />
     * VERSION_NO: {NotNull, BIGINT(19)}
     * @return this. (NotNull)
     */
    public BsMemberCQ addOrderBy_VersionNo_Desc() { regOBD("VERSION_NO"); return this; }

    // ===================================================================================
    //                                                             SpecifiedDerivedOrderBy
    //                                                             =======================
    /**
     * Add order-by for specified derived column as ascend.
     * <pre>
     * cb.specify().derivedPurchaseList().max(new SubQuery&lt;PurchaseCB&gt;() {
     *     public void query(PurchaseCB subCB) {
     *         subCB.specify().columnPurchaseDatetime();
     *     }
     * }, <span style="color: #DD4747">aliasName</span>);
     * <span style="color: #3F7E5E">// order by [alias-name] asc</span>
     * cb.<span style="color: #DD4747">addSpecifiedDerivedOrderBy_Asc</span>(<span style="color: #DD4747">aliasName</span>);
     * </pre>
     * @param aliasName The alias name specified at (Specify)DerivedReferrer. (NotNull)
     * @return this. (NotNull)
     */
    public BsMemberCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }

    /**
     * Add order-by for specified derived column as descend.
     * <pre>
     * cb.specify().derivedPurchaseList().max(new SubQuery&lt;PurchaseCB&gt;() {
     *     public void query(PurchaseCB subCB) {
     *         subCB.specify().columnPurchaseDatetime();
     *     }
     * }, <span style="color: #DD4747">aliasName</span>);
     * <span style="color: #3F7E5E">// order by [alias-name] desc</span>
     * cb.<span style="color: #DD4747">addSpecifiedDerivedOrderBy_Desc</span>(<span style="color: #DD4747">aliasName</span>);
     * </pre>
     * @param aliasName The alias name specified at (Specify)DerivedReferrer. (NotNull)
     * @return this. (NotNull)
     */
    public BsMemberCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

    // ===================================================================================
    //                                                                         Union Query
    //                                                                         ===========
    public void reflectRelationOnUnionQuery(ConditionQuery bqs, ConditionQuery uqs) {
        MemberCQ bq = (MemberCQ)bqs;
        MemberCQ uq = (MemberCQ)uqs;
        if (bq.hasConditionQueryMemberStatus()) {
            uq.queryMemberStatus().reflectRelationOnUnionQuery(bq.queryMemberStatus(), uq.queryMemberStatus());
        }
        if (bq.hasConditionQueryMemberLoginAsLatest()) {
            uq.queryMemberLoginAsLatest().reflectRelationOnUnionQuery(bq.queryMemberLoginAsLatest(), uq.queryMemberLoginAsLatest());
        }
        if (bq.hasConditionQueryMemberSecurityAsOne()) {
            uq.queryMemberSecurityAsOne().reflectRelationOnUnionQuery(bq.queryMemberSecurityAsOne(), uq.queryMemberSecurityAsOne());
        }
        if (bq.hasConditionQueryMemberServiceAsOne()) {
            uq.queryMemberServiceAsOne().reflectRelationOnUnionQuery(bq.queryMemberServiceAsOne(), uq.queryMemberServiceAsOne());
        }
        if (bq.hasConditionQueryMemberWithdrawalAsOne()) {
            uq.queryMemberWithdrawalAsOne().reflectRelationOnUnionQuery(bq.queryMemberWithdrawalAsOne(), uq.queryMemberWithdrawalAsOne());
        }
    }

    // ===================================================================================
    //                                                                       Foreign Query
    //                                                                       =============
    /**
     * Get the condition-query for relation table. <br />
     * MEMBER_STATUS by my MEMBER_STATUS_CODE, named 'memberStatus'.
     * @return The instance of condition-query. (NotNull)
     */
    public MemberStatusCQ queryMemberStatus() {
        return getConditionQueryMemberStatus();
    }
    public MemberStatusCQ getConditionQueryMemberStatus() {
        String prop = "memberStatus";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryMemberStatus()); xsetupOuterJoinMemberStatus(); }
        return xgetQueRlMap(prop);
    }
    protected MemberStatusCQ xcreateQueryMemberStatus() {
        String nrp = xresolveNRP("MEMBER", "memberStatus"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new MemberStatusCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "memberStatus", nrp);
    }
    protected void xsetupOuterJoinMemberStatus() { xregOutJo("memberStatus"); }
    public boolean hasConditionQueryMemberStatus() { return xhasQueRlMap("memberStatus"); }

    /**
     * Get the condition-query for relation table. <br />
     * MEMBER_LOGIN by my MEMBER_ID, named 'memberLoginAsLatest'.
     * @return The instance of condition-query. (NotNull)
     */
    public MemberLoginCQ queryMemberLoginAsLatest() {
        return getConditionQueryMemberLoginAsLatest();
    }
    public MemberLoginCQ getConditionQueryMemberLoginAsLatest() {
        String prop = "memberLoginAsLatest";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryMemberLoginAsLatest()); xsetupOuterJoinMemberLoginAsLatest(); }
        return xgetQueRlMap(prop);
    }
    protected MemberLoginCQ xcreateQueryMemberLoginAsLatest() {
        String nrp = xresolveNRP("MEMBER", "memberLoginAsLatest"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new MemberLoginCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "memberLoginAsLatest", nrp);
    }
    protected void xsetupOuterJoinMemberLoginAsLatest() { xregOutJo("memberLoginAsLatest"); }
    public boolean hasConditionQueryMemberLoginAsLatest() { return xhasQueRlMap("memberLoginAsLatest"); }

    /**
     * Get the condition-query for relation table. <br />
     * MEMBER_SECURITY by MEMBER_ID, named 'memberSecurityAsOne'.
     * @return The instance of condition-query. (NotNull)
     */
    public MemberSecurityCQ queryMemberSecurityAsOne() { return getConditionQueryMemberSecurityAsOne(); }
    public MemberSecurityCQ getConditionQueryMemberSecurityAsOne() {
        String prop = "memberSecurityAsOne";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryMemberSecurityAsOne()); xsetupOuterJoinMemberSecurityAsOne(); }
        return xgetQueRlMap(prop);
    }
    protected MemberSecurityCQ xcreateQueryMemberSecurityAsOne() {
        String nrp = xresolveNRP("MEMBER", "memberSecurityAsOne"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new MemberSecurityCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "memberSecurityAsOne", nrp);
    }
    protected void xsetupOuterJoinMemberSecurityAsOne() { xregOutJo("memberSecurityAsOne"); }
    public boolean hasConditionQueryMemberSecurityAsOne() { return xhasQueRlMap("memberSecurityAsOne"); }

    /**
     * Get the condition-query for relation table. <br />
     * MEMBER_SERVICE by MEMBER_ID, named 'memberServiceAsOne'.
     * @return The instance of condition-query. (NotNull)
     */
    public MemberServiceCQ queryMemberServiceAsOne() { return getConditionQueryMemberServiceAsOne(); }
    public MemberServiceCQ getConditionQueryMemberServiceAsOne() {
        String prop = "memberServiceAsOne";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryMemberServiceAsOne()); xsetupOuterJoinMemberServiceAsOne(); }
        return xgetQueRlMap(prop);
    }
    protected MemberServiceCQ xcreateQueryMemberServiceAsOne() {
        String nrp = xresolveNRP("MEMBER", "memberServiceAsOne"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new MemberServiceCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "memberServiceAsOne", nrp);
    }
    protected void xsetupOuterJoinMemberServiceAsOne() { xregOutJo("memberServiceAsOne"); }
    public boolean hasConditionQueryMemberServiceAsOne() { return xhasQueRlMap("memberServiceAsOne"); }

    /**
     * Get the condition-query for relation table. <br />
     * MEMBER_WITHDRAWAL by MEMBER_ID, named 'memberWithdrawalAsOne'.
     * @return The instance of condition-query. (NotNull)
     */
    public MemberWithdrawalCQ queryMemberWithdrawalAsOne() { return getConditionQueryMemberWithdrawalAsOne(); }
    public MemberWithdrawalCQ getConditionQueryMemberWithdrawalAsOne() {
        String prop = "memberWithdrawalAsOne";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryMemberWithdrawalAsOne()); xsetupOuterJoinMemberWithdrawalAsOne(); }
        return xgetQueRlMap(prop);
    }
    protected MemberWithdrawalCQ xcreateQueryMemberWithdrawalAsOne() {
        String nrp = xresolveNRP("MEMBER", "memberWithdrawalAsOne"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new MemberWithdrawalCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "memberWithdrawalAsOne", nrp);
    }
    protected void xsetupOuterJoinMemberWithdrawalAsOne() { xregOutJo("memberWithdrawalAsOne"); }
    public boolean hasConditionQueryMemberWithdrawalAsOne() { return xhasQueRlMap("memberWithdrawalAsOne"); }

    protected Map<String, Object> xfindFixedConditionDynamicParameterMap(String property) {
        return null;
    }

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    public Map<String, MemberCQ> getScalarCondition() { return xgetSQueMap("scalarCondition"); }
    public String keepScalarCondition(MemberCQ sq) { return xkeepSQue("scalarCondition", sq); }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public Map<String, MemberCQ> getSpecifyMyselfDerived() { return xgetSQueMap("specifyMyselfDerived"); }
    public String keepSpecifyMyselfDerived(MemberCQ sq) { return xkeepSQue("specifyMyselfDerived", sq); }

    public Map<String, MemberCQ> getQueryMyselfDerived() { return xgetSQueMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerived(MemberCQ sq) { return xkeepSQue("queryMyselfDerived", sq); }
    public Map<String, Object> getQueryMyselfDerivedParameter() { return xgetSQuePmMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerivedParameter(Object pm) { return xkeepSQuePm("queryMyselfDerived", pm); }

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    protected Map<String, MemberCQ> _myselfExistsMap;
    public Map<String, MemberCQ> getMyselfExists() { return xgetSQueMap("myselfExists"); }
    public String keepMyselfExists(MemberCQ sq) { return xkeepSQue("myselfExists", sq); }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    public Map<String, MemberCQ> getMyselfInScope() { return xgetSQueMap("myselfInScope"); }
    public String keepMyselfInScope(MemberCQ sq) { return xkeepSQue("myselfInScope", sq); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return MemberCB.class.getName(); }
    protected String xCQ() { return MemberCQ.class.getName(); }
    protected String xCHp() { return HpCalculator.class.getName(); }
    protected String xCOp() { return ConditionOption.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
