package com.example.dbflute.multipledb.seasar.dbflute.memberdb.cbean.cq.bs;

import java.util.Map;

import org.seasar.dbflute.cbean.*;
import org.seasar.dbflute.cbean.chelper.*;
import org.seasar.dbflute.cbean.coption.*;
import org.seasar.dbflute.cbean.cvalue.ConditionValue;
import org.seasar.dbflute.cbean.sqlclause.SqlClause;
import org.seasar.dbflute.exception.IllegalConditionBeanOperationException;
import com.example.dbflute.multipledb.seasar.dbflute.memberdb.cbean.cq.ciq.*;
import com.example.dbflute.multipledb.seasar.dbflute.memberdb.cbean.*;
import com.example.dbflute.multipledb.seasar.dbflute.memberdb.cbean.cq.*;

/**
 * The base condition-query of MEMBER.
 * @author DBFlute(AutoGenerator)
 */
public class MbBsMemberCQ extends MbAbstractBsMemberCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected MbMemberCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public MbBsMemberCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
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
    public MbMemberCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected MbMemberCIQ xcreateCIQ() {
        MbMemberCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected MbMemberCIQ xnewCIQ() {
        return new MbMemberCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
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
    public MbMemberCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        MbMemberCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====

    protected ConditionValue _memberId;
    public ConditionValue getMemberId() {
        if (_memberId == null) { _memberId = nCV(); }
        return _memberId;
    }
    protected ConditionValue getCValueMemberId() { return getMemberId(); }

    protected Map<String, MbMemberAddressCQ> _memberId_ExistsReferrer_MemberAddressListMap;
    public Map<String, MbMemberAddressCQ> getMemberId_ExistsReferrer_MemberAddressList() { return _memberId_ExistsReferrer_MemberAddressListMap; }
    public String keepMemberId_ExistsReferrer_MemberAddressList(MbMemberAddressCQ sq) {
        if (_memberId_ExistsReferrer_MemberAddressListMap == null) { _memberId_ExistsReferrer_MemberAddressListMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_memberId_ExistsReferrer_MemberAddressListMap.size() + 1);
        _memberId_ExistsReferrer_MemberAddressListMap.put(ky, sq); return "memberId_ExistsReferrer_MemberAddressList." + ky;
    }

    protected Map<String, MbMemberLoginCQ> _memberId_ExistsReferrer_MemberLoginListMap;
    public Map<String, MbMemberLoginCQ> getMemberId_ExistsReferrer_MemberLoginList() { return _memberId_ExistsReferrer_MemberLoginListMap; }
    public String keepMemberId_ExistsReferrer_MemberLoginList(MbMemberLoginCQ sq) {
        if (_memberId_ExistsReferrer_MemberLoginListMap == null) { _memberId_ExistsReferrer_MemberLoginListMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_memberId_ExistsReferrer_MemberLoginListMap.size() + 1);
        _memberId_ExistsReferrer_MemberLoginListMap.put(ky, sq); return "memberId_ExistsReferrer_MemberLoginList." + ky;
    }

    protected Map<String, MbMemberSecurityCQ> _memberId_ExistsReferrer_MemberSecurityAsOneMap;
    public Map<String, MbMemberSecurityCQ> getMemberId_ExistsReferrer_MemberSecurityAsOne() { return _memberId_ExistsReferrer_MemberSecurityAsOneMap; }
    public String keepMemberId_ExistsReferrer_MemberSecurityAsOne(MbMemberSecurityCQ sq) {
        if (_memberId_ExistsReferrer_MemberSecurityAsOneMap == null) { _memberId_ExistsReferrer_MemberSecurityAsOneMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_memberId_ExistsReferrer_MemberSecurityAsOneMap.size() + 1);
        _memberId_ExistsReferrer_MemberSecurityAsOneMap.put(ky, sq); return "memberId_ExistsReferrer_MemberSecurityAsOne." + ky;
    }

    protected Map<String, MbMemberServiceCQ> _memberId_ExistsReferrer_MemberServiceAsOneMap;
    public Map<String, MbMemberServiceCQ> getMemberId_ExistsReferrer_MemberServiceAsOne() { return _memberId_ExistsReferrer_MemberServiceAsOneMap; }
    public String keepMemberId_ExistsReferrer_MemberServiceAsOne(MbMemberServiceCQ sq) {
        if (_memberId_ExistsReferrer_MemberServiceAsOneMap == null) { _memberId_ExistsReferrer_MemberServiceAsOneMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_memberId_ExistsReferrer_MemberServiceAsOneMap.size() + 1);
        _memberId_ExistsReferrer_MemberServiceAsOneMap.put(ky, sq); return "memberId_ExistsReferrer_MemberServiceAsOne." + ky;
    }

    protected Map<String, MbMemberWithdrawalCQ> _memberId_ExistsReferrer_MemberWithdrawalAsOneMap;
    public Map<String, MbMemberWithdrawalCQ> getMemberId_ExistsReferrer_MemberWithdrawalAsOne() { return _memberId_ExistsReferrer_MemberWithdrawalAsOneMap; }
    public String keepMemberId_ExistsReferrer_MemberWithdrawalAsOne(MbMemberWithdrawalCQ sq) {
        if (_memberId_ExistsReferrer_MemberWithdrawalAsOneMap == null) { _memberId_ExistsReferrer_MemberWithdrawalAsOneMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_memberId_ExistsReferrer_MemberWithdrawalAsOneMap.size() + 1);
        _memberId_ExistsReferrer_MemberWithdrawalAsOneMap.put(ky, sq); return "memberId_ExistsReferrer_MemberWithdrawalAsOne." + ky;
    }

    protected Map<String, MbPurchaseCQ> _memberId_ExistsReferrer_PurchaseListMap;
    public Map<String, MbPurchaseCQ> getMemberId_ExistsReferrer_PurchaseList() { return _memberId_ExistsReferrer_PurchaseListMap; }
    public String keepMemberId_ExistsReferrer_PurchaseList(MbPurchaseCQ sq) {
        if (_memberId_ExistsReferrer_PurchaseListMap == null) { _memberId_ExistsReferrer_PurchaseListMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_memberId_ExistsReferrer_PurchaseListMap.size() + 1);
        _memberId_ExistsReferrer_PurchaseListMap.put(ky, sq); return "memberId_ExistsReferrer_PurchaseList." + ky;
    }

    protected Map<String, MbMemberAddressCQ> _memberId_NotExistsReferrer_MemberAddressListMap;
    public Map<String, MbMemberAddressCQ> getMemberId_NotExistsReferrer_MemberAddressList() { return _memberId_NotExistsReferrer_MemberAddressListMap; }
    public String keepMemberId_NotExistsReferrer_MemberAddressList(MbMemberAddressCQ sq) {
        if (_memberId_NotExistsReferrer_MemberAddressListMap == null) { _memberId_NotExistsReferrer_MemberAddressListMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_memberId_NotExistsReferrer_MemberAddressListMap.size() + 1);
        _memberId_NotExistsReferrer_MemberAddressListMap.put(ky, sq); return "memberId_NotExistsReferrer_MemberAddressList." + ky;
    }

    protected Map<String, MbMemberLoginCQ> _memberId_NotExistsReferrer_MemberLoginListMap;
    public Map<String, MbMemberLoginCQ> getMemberId_NotExistsReferrer_MemberLoginList() { return _memberId_NotExistsReferrer_MemberLoginListMap; }
    public String keepMemberId_NotExistsReferrer_MemberLoginList(MbMemberLoginCQ sq) {
        if (_memberId_NotExistsReferrer_MemberLoginListMap == null) { _memberId_NotExistsReferrer_MemberLoginListMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_memberId_NotExistsReferrer_MemberLoginListMap.size() + 1);
        _memberId_NotExistsReferrer_MemberLoginListMap.put(ky, sq); return "memberId_NotExistsReferrer_MemberLoginList." + ky;
    }

    protected Map<String, MbMemberSecurityCQ> _memberId_NotExistsReferrer_MemberSecurityAsOneMap;
    public Map<String, MbMemberSecurityCQ> getMemberId_NotExistsReferrer_MemberSecurityAsOne() { return _memberId_NotExistsReferrer_MemberSecurityAsOneMap; }
    public String keepMemberId_NotExistsReferrer_MemberSecurityAsOne(MbMemberSecurityCQ sq) {
        if (_memberId_NotExistsReferrer_MemberSecurityAsOneMap == null) { _memberId_NotExistsReferrer_MemberSecurityAsOneMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_memberId_NotExistsReferrer_MemberSecurityAsOneMap.size() + 1);
        _memberId_NotExistsReferrer_MemberSecurityAsOneMap.put(ky, sq); return "memberId_NotExistsReferrer_MemberSecurityAsOne." + ky;
    }

    protected Map<String, MbMemberServiceCQ> _memberId_NotExistsReferrer_MemberServiceAsOneMap;
    public Map<String, MbMemberServiceCQ> getMemberId_NotExistsReferrer_MemberServiceAsOne() { return _memberId_NotExistsReferrer_MemberServiceAsOneMap; }
    public String keepMemberId_NotExistsReferrer_MemberServiceAsOne(MbMemberServiceCQ sq) {
        if (_memberId_NotExistsReferrer_MemberServiceAsOneMap == null) { _memberId_NotExistsReferrer_MemberServiceAsOneMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_memberId_NotExistsReferrer_MemberServiceAsOneMap.size() + 1);
        _memberId_NotExistsReferrer_MemberServiceAsOneMap.put(ky, sq); return "memberId_NotExistsReferrer_MemberServiceAsOne." + ky;
    }

    protected Map<String, MbMemberWithdrawalCQ> _memberId_NotExistsReferrer_MemberWithdrawalAsOneMap;
    public Map<String, MbMemberWithdrawalCQ> getMemberId_NotExistsReferrer_MemberWithdrawalAsOne() { return _memberId_NotExistsReferrer_MemberWithdrawalAsOneMap; }
    public String keepMemberId_NotExistsReferrer_MemberWithdrawalAsOne(MbMemberWithdrawalCQ sq) {
        if (_memberId_NotExistsReferrer_MemberWithdrawalAsOneMap == null) { _memberId_NotExistsReferrer_MemberWithdrawalAsOneMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_memberId_NotExistsReferrer_MemberWithdrawalAsOneMap.size() + 1);
        _memberId_NotExistsReferrer_MemberWithdrawalAsOneMap.put(ky, sq); return "memberId_NotExistsReferrer_MemberWithdrawalAsOne." + ky;
    }

    protected Map<String, MbPurchaseCQ> _memberId_NotExistsReferrer_PurchaseListMap;
    public Map<String, MbPurchaseCQ> getMemberId_NotExistsReferrer_PurchaseList() { return _memberId_NotExistsReferrer_PurchaseListMap; }
    public String keepMemberId_NotExistsReferrer_PurchaseList(MbPurchaseCQ sq) {
        if (_memberId_NotExistsReferrer_PurchaseListMap == null) { _memberId_NotExistsReferrer_PurchaseListMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_memberId_NotExistsReferrer_PurchaseListMap.size() + 1);
        _memberId_NotExistsReferrer_PurchaseListMap.put(ky, sq); return "memberId_NotExistsReferrer_PurchaseList." + ky;
    }

    protected Map<String, MbMemberAddressCQ> _memberId_SpecifyDerivedReferrer_MemberAddressListMap;
    public Map<String, MbMemberAddressCQ> getMemberId_SpecifyDerivedReferrer_MemberAddressList() { return _memberId_SpecifyDerivedReferrer_MemberAddressListMap; }
    public String keepMemberId_SpecifyDerivedReferrer_MemberAddressList(MbMemberAddressCQ sq) {
        if (_memberId_SpecifyDerivedReferrer_MemberAddressListMap == null) { _memberId_SpecifyDerivedReferrer_MemberAddressListMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_memberId_SpecifyDerivedReferrer_MemberAddressListMap.size() + 1);
        _memberId_SpecifyDerivedReferrer_MemberAddressListMap.put(ky, sq); return "memberId_SpecifyDerivedReferrer_MemberAddressList." + ky;
    }

    protected Map<String, MbMemberLoginCQ> _memberId_SpecifyDerivedReferrer_MemberLoginListMap;
    public Map<String, MbMemberLoginCQ> getMemberId_SpecifyDerivedReferrer_MemberLoginList() { return _memberId_SpecifyDerivedReferrer_MemberLoginListMap; }
    public String keepMemberId_SpecifyDerivedReferrer_MemberLoginList(MbMemberLoginCQ sq) {
        if (_memberId_SpecifyDerivedReferrer_MemberLoginListMap == null) { _memberId_SpecifyDerivedReferrer_MemberLoginListMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_memberId_SpecifyDerivedReferrer_MemberLoginListMap.size() + 1);
        _memberId_SpecifyDerivedReferrer_MemberLoginListMap.put(ky, sq); return "memberId_SpecifyDerivedReferrer_MemberLoginList." + ky;
    }

    protected Map<String, MbPurchaseCQ> _memberId_SpecifyDerivedReferrer_PurchaseListMap;
    public Map<String, MbPurchaseCQ> getMemberId_SpecifyDerivedReferrer_PurchaseList() { return _memberId_SpecifyDerivedReferrer_PurchaseListMap; }
    public String keepMemberId_SpecifyDerivedReferrer_PurchaseList(MbPurchaseCQ sq) {
        if (_memberId_SpecifyDerivedReferrer_PurchaseListMap == null) { _memberId_SpecifyDerivedReferrer_PurchaseListMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_memberId_SpecifyDerivedReferrer_PurchaseListMap.size() + 1);
        _memberId_SpecifyDerivedReferrer_PurchaseListMap.put(ky, sq); return "memberId_SpecifyDerivedReferrer_PurchaseList." + ky;
    }

    protected Map<String, MbMemberAddressCQ> _memberId_InScopeRelation_MemberAddressListMap;
    public Map<String, MbMemberAddressCQ> getMemberId_InScopeRelation_MemberAddressList() { return _memberId_InScopeRelation_MemberAddressListMap; }
    public String keepMemberId_InScopeRelation_MemberAddressList(MbMemberAddressCQ sq) {
        if (_memberId_InScopeRelation_MemberAddressListMap == null) { _memberId_InScopeRelation_MemberAddressListMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_memberId_InScopeRelation_MemberAddressListMap.size() + 1);
        _memberId_InScopeRelation_MemberAddressListMap.put(ky, sq); return "memberId_InScopeRelation_MemberAddressList." + ky;
    }

    protected Map<String, MbMemberLoginCQ> _memberId_InScopeRelation_MemberLoginListMap;
    public Map<String, MbMemberLoginCQ> getMemberId_InScopeRelation_MemberLoginList() { return _memberId_InScopeRelation_MemberLoginListMap; }
    public String keepMemberId_InScopeRelation_MemberLoginList(MbMemberLoginCQ sq) {
        if (_memberId_InScopeRelation_MemberLoginListMap == null) { _memberId_InScopeRelation_MemberLoginListMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_memberId_InScopeRelation_MemberLoginListMap.size() + 1);
        _memberId_InScopeRelation_MemberLoginListMap.put(ky, sq); return "memberId_InScopeRelation_MemberLoginList." + ky;
    }

    protected Map<String, MbMemberSecurityCQ> _memberId_InScopeRelation_MemberSecurityAsOneMap;
    public Map<String, MbMemberSecurityCQ> getMemberId_InScopeRelation_MemberSecurityAsOne() { return _memberId_InScopeRelation_MemberSecurityAsOneMap; }
    public String keepMemberId_InScopeRelation_MemberSecurityAsOne(MbMemberSecurityCQ sq) {
        if (_memberId_InScopeRelation_MemberSecurityAsOneMap == null) { _memberId_InScopeRelation_MemberSecurityAsOneMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_memberId_InScopeRelation_MemberSecurityAsOneMap.size() + 1);
        _memberId_InScopeRelation_MemberSecurityAsOneMap.put(ky, sq); return "memberId_InScopeRelation_MemberSecurityAsOne." + ky;
    }

    protected Map<String, MbMemberServiceCQ> _memberId_InScopeRelation_MemberServiceAsOneMap;
    public Map<String, MbMemberServiceCQ> getMemberId_InScopeRelation_MemberServiceAsOne() { return _memberId_InScopeRelation_MemberServiceAsOneMap; }
    public String keepMemberId_InScopeRelation_MemberServiceAsOne(MbMemberServiceCQ sq) {
        if (_memberId_InScopeRelation_MemberServiceAsOneMap == null) { _memberId_InScopeRelation_MemberServiceAsOneMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_memberId_InScopeRelation_MemberServiceAsOneMap.size() + 1);
        _memberId_InScopeRelation_MemberServiceAsOneMap.put(ky, sq); return "memberId_InScopeRelation_MemberServiceAsOne." + ky;
    }

    protected Map<String, MbMemberWithdrawalCQ> _memberId_InScopeRelation_MemberWithdrawalAsOneMap;
    public Map<String, MbMemberWithdrawalCQ> getMemberId_InScopeRelation_MemberWithdrawalAsOne() { return _memberId_InScopeRelation_MemberWithdrawalAsOneMap; }
    public String keepMemberId_InScopeRelation_MemberWithdrawalAsOne(MbMemberWithdrawalCQ sq) {
        if (_memberId_InScopeRelation_MemberWithdrawalAsOneMap == null) { _memberId_InScopeRelation_MemberWithdrawalAsOneMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_memberId_InScopeRelation_MemberWithdrawalAsOneMap.size() + 1);
        _memberId_InScopeRelation_MemberWithdrawalAsOneMap.put(ky, sq); return "memberId_InScopeRelation_MemberWithdrawalAsOne." + ky;
    }

    protected Map<String, MbPurchaseCQ> _memberId_InScopeRelation_PurchaseListMap;
    public Map<String, MbPurchaseCQ> getMemberId_InScopeRelation_PurchaseList() { return _memberId_InScopeRelation_PurchaseListMap; }
    public String keepMemberId_InScopeRelation_PurchaseList(MbPurchaseCQ sq) {
        if (_memberId_InScopeRelation_PurchaseListMap == null) { _memberId_InScopeRelation_PurchaseListMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_memberId_InScopeRelation_PurchaseListMap.size() + 1);
        _memberId_InScopeRelation_PurchaseListMap.put(ky, sq); return "memberId_InScopeRelation_PurchaseList." + ky;
    }

    protected Map<String, MbMemberAddressCQ> _memberId_NotInScopeRelation_MemberAddressListMap;
    public Map<String, MbMemberAddressCQ> getMemberId_NotInScopeRelation_MemberAddressList() { return _memberId_NotInScopeRelation_MemberAddressListMap; }
    public String keepMemberId_NotInScopeRelation_MemberAddressList(MbMemberAddressCQ sq) {
        if (_memberId_NotInScopeRelation_MemberAddressListMap == null) { _memberId_NotInScopeRelation_MemberAddressListMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_memberId_NotInScopeRelation_MemberAddressListMap.size() + 1);
        _memberId_NotInScopeRelation_MemberAddressListMap.put(ky, sq); return "memberId_NotInScopeRelation_MemberAddressList." + ky;
    }

    protected Map<String, MbMemberLoginCQ> _memberId_NotInScopeRelation_MemberLoginListMap;
    public Map<String, MbMemberLoginCQ> getMemberId_NotInScopeRelation_MemberLoginList() { return _memberId_NotInScopeRelation_MemberLoginListMap; }
    public String keepMemberId_NotInScopeRelation_MemberLoginList(MbMemberLoginCQ sq) {
        if (_memberId_NotInScopeRelation_MemberLoginListMap == null) { _memberId_NotInScopeRelation_MemberLoginListMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_memberId_NotInScopeRelation_MemberLoginListMap.size() + 1);
        _memberId_NotInScopeRelation_MemberLoginListMap.put(ky, sq); return "memberId_NotInScopeRelation_MemberLoginList." + ky;
    }

    protected Map<String, MbMemberSecurityCQ> _memberId_NotInScopeRelation_MemberSecurityAsOneMap;
    public Map<String, MbMemberSecurityCQ> getMemberId_NotInScopeRelation_MemberSecurityAsOne() { return _memberId_NotInScopeRelation_MemberSecurityAsOneMap; }
    public String keepMemberId_NotInScopeRelation_MemberSecurityAsOne(MbMemberSecurityCQ sq) {
        if (_memberId_NotInScopeRelation_MemberSecurityAsOneMap == null) { _memberId_NotInScopeRelation_MemberSecurityAsOneMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_memberId_NotInScopeRelation_MemberSecurityAsOneMap.size() + 1);
        _memberId_NotInScopeRelation_MemberSecurityAsOneMap.put(ky, sq); return "memberId_NotInScopeRelation_MemberSecurityAsOne." + ky;
    }

    protected Map<String, MbMemberServiceCQ> _memberId_NotInScopeRelation_MemberServiceAsOneMap;
    public Map<String, MbMemberServiceCQ> getMemberId_NotInScopeRelation_MemberServiceAsOne() { return _memberId_NotInScopeRelation_MemberServiceAsOneMap; }
    public String keepMemberId_NotInScopeRelation_MemberServiceAsOne(MbMemberServiceCQ sq) {
        if (_memberId_NotInScopeRelation_MemberServiceAsOneMap == null) { _memberId_NotInScopeRelation_MemberServiceAsOneMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_memberId_NotInScopeRelation_MemberServiceAsOneMap.size() + 1);
        _memberId_NotInScopeRelation_MemberServiceAsOneMap.put(ky, sq); return "memberId_NotInScopeRelation_MemberServiceAsOne." + ky;
    }

    protected Map<String, MbMemberWithdrawalCQ> _memberId_NotInScopeRelation_MemberWithdrawalAsOneMap;
    public Map<String, MbMemberWithdrawalCQ> getMemberId_NotInScopeRelation_MemberWithdrawalAsOne() { return _memberId_NotInScopeRelation_MemberWithdrawalAsOneMap; }
    public String keepMemberId_NotInScopeRelation_MemberWithdrawalAsOne(MbMemberWithdrawalCQ sq) {
        if (_memberId_NotInScopeRelation_MemberWithdrawalAsOneMap == null) { _memberId_NotInScopeRelation_MemberWithdrawalAsOneMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_memberId_NotInScopeRelation_MemberWithdrawalAsOneMap.size() + 1);
        _memberId_NotInScopeRelation_MemberWithdrawalAsOneMap.put(ky, sq); return "memberId_NotInScopeRelation_MemberWithdrawalAsOne." + ky;
    }

    protected Map<String, MbPurchaseCQ> _memberId_NotInScopeRelation_PurchaseListMap;
    public Map<String, MbPurchaseCQ> getMemberId_NotInScopeRelation_PurchaseList() { return _memberId_NotInScopeRelation_PurchaseListMap; }
    public String keepMemberId_NotInScopeRelation_PurchaseList(MbPurchaseCQ sq) {
        if (_memberId_NotInScopeRelation_PurchaseListMap == null) { _memberId_NotInScopeRelation_PurchaseListMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_memberId_NotInScopeRelation_PurchaseListMap.size() + 1);
        _memberId_NotInScopeRelation_PurchaseListMap.put(ky, sq); return "memberId_NotInScopeRelation_PurchaseList." + ky;
    }

    protected Map<String, MbMemberAddressCQ> _memberId_QueryDerivedReferrer_MemberAddressListMap;
    public Map<String, MbMemberAddressCQ> getMemberId_QueryDerivedReferrer_MemberAddressList() { return _memberId_QueryDerivedReferrer_MemberAddressListMap; }
    public String keepMemberId_QueryDerivedReferrer_MemberAddressList(MbMemberAddressCQ sq) {
        if (_memberId_QueryDerivedReferrer_MemberAddressListMap == null) { _memberId_QueryDerivedReferrer_MemberAddressListMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_memberId_QueryDerivedReferrer_MemberAddressListMap.size() + 1);
        _memberId_QueryDerivedReferrer_MemberAddressListMap.put(ky, sq); return "memberId_QueryDerivedReferrer_MemberAddressList." + ky;
    }
    protected Map<String, Object> _memberId_QueryDerivedReferrer_MemberAddressListParameterMap;
    public Map<String, Object> getMemberId_QueryDerivedReferrer_MemberAddressListParameter() { return _memberId_QueryDerivedReferrer_MemberAddressListParameterMap; }
    public String keepMemberId_QueryDerivedReferrer_MemberAddressListParameter(Object vl) {
        if (_memberId_QueryDerivedReferrer_MemberAddressListParameterMap == null) { _memberId_QueryDerivedReferrer_MemberAddressListParameterMap = newLinkedHashMapSized(4); }
        String ky = "subQueryParameterKey" + (_memberId_QueryDerivedReferrer_MemberAddressListParameterMap.size() + 1);
        _memberId_QueryDerivedReferrer_MemberAddressListParameterMap.put(ky, vl); return "memberId_QueryDerivedReferrer_MemberAddressListParameter." + ky;
    }

    protected Map<String, MbMemberLoginCQ> _memberId_QueryDerivedReferrer_MemberLoginListMap;
    public Map<String, MbMemberLoginCQ> getMemberId_QueryDerivedReferrer_MemberLoginList() { return _memberId_QueryDerivedReferrer_MemberLoginListMap; }
    public String keepMemberId_QueryDerivedReferrer_MemberLoginList(MbMemberLoginCQ sq) {
        if (_memberId_QueryDerivedReferrer_MemberLoginListMap == null) { _memberId_QueryDerivedReferrer_MemberLoginListMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_memberId_QueryDerivedReferrer_MemberLoginListMap.size() + 1);
        _memberId_QueryDerivedReferrer_MemberLoginListMap.put(ky, sq); return "memberId_QueryDerivedReferrer_MemberLoginList." + ky;
    }
    protected Map<String, Object> _memberId_QueryDerivedReferrer_MemberLoginListParameterMap;
    public Map<String, Object> getMemberId_QueryDerivedReferrer_MemberLoginListParameter() { return _memberId_QueryDerivedReferrer_MemberLoginListParameterMap; }
    public String keepMemberId_QueryDerivedReferrer_MemberLoginListParameter(Object vl) {
        if (_memberId_QueryDerivedReferrer_MemberLoginListParameterMap == null) { _memberId_QueryDerivedReferrer_MemberLoginListParameterMap = newLinkedHashMapSized(4); }
        String ky = "subQueryParameterKey" + (_memberId_QueryDerivedReferrer_MemberLoginListParameterMap.size() + 1);
        _memberId_QueryDerivedReferrer_MemberLoginListParameterMap.put(ky, vl); return "memberId_QueryDerivedReferrer_MemberLoginListParameter." + ky;
    }

    protected Map<String, MbPurchaseCQ> _memberId_QueryDerivedReferrer_PurchaseListMap;
    public Map<String, MbPurchaseCQ> getMemberId_QueryDerivedReferrer_PurchaseList() { return _memberId_QueryDerivedReferrer_PurchaseListMap; }
    public String keepMemberId_QueryDerivedReferrer_PurchaseList(MbPurchaseCQ sq) {
        if (_memberId_QueryDerivedReferrer_PurchaseListMap == null) { _memberId_QueryDerivedReferrer_PurchaseListMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_memberId_QueryDerivedReferrer_PurchaseListMap.size() + 1);
        _memberId_QueryDerivedReferrer_PurchaseListMap.put(ky, sq); return "memberId_QueryDerivedReferrer_PurchaseList." + ky;
    }
    protected Map<String, Object> _memberId_QueryDerivedReferrer_PurchaseListParameterMap;
    public Map<String, Object> getMemberId_QueryDerivedReferrer_PurchaseListParameter() { return _memberId_QueryDerivedReferrer_PurchaseListParameterMap; }
    public String keepMemberId_QueryDerivedReferrer_PurchaseListParameter(Object vl) {
        if (_memberId_QueryDerivedReferrer_PurchaseListParameterMap == null) { _memberId_QueryDerivedReferrer_PurchaseListParameterMap = newLinkedHashMapSized(4); }
        String ky = "subQueryParameterKey" + (_memberId_QueryDerivedReferrer_PurchaseListParameterMap.size() + 1);
        _memberId_QueryDerivedReferrer_PurchaseListParameterMap.put(ky, vl); return "memberId_QueryDerivedReferrer_PurchaseListParameter." + ky;
    }

    /** 
     * Add order-by as ascend. <br />
     * MEMBER_ID: {PK, ID, NotNull, INTEGER(10), FK to MEMBER_LOGIN}
     * @return this. (NotNull)
     */
    public MbBsMemberCQ addOrderBy_MemberId_Asc() { regOBA("MEMBER_ID"); return this; }

    /**
     * Add order-by as descend. <br />
     * MEMBER_ID: {PK, ID, NotNull, INTEGER(10), FK to MEMBER_LOGIN}
     * @return this. (NotNull)
     */
    public MbBsMemberCQ addOrderBy_MemberId_Desc() { regOBD("MEMBER_ID"); return this; }

    protected ConditionValue _memberName;
    public ConditionValue getMemberName() {
        if (_memberName == null) { _memberName = nCV(); }
        return _memberName;
    }
    protected ConditionValue getCValueMemberName() { return getMemberName(); }

    /** 
     * Add order-by as ascend. <br />
     * MEMBER_NAME: {IX, NotNull, VARCHAR(200)}
     * @return this. (NotNull)
     */
    public MbBsMemberCQ addOrderBy_MemberName_Asc() { regOBA("MEMBER_NAME"); return this; }

    /**
     * Add order-by as descend. <br />
     * MEMBER_NAME: {IX, NotNull, VARCHAR(200)}
     * @return this. (NotNull)
     */
    public MbBsMemberCQ addOrderBy_MemberName_Desc() { regOBD("MEMBER_NAME"); return this; }

    protected ConditionValue _memberAccount;
    public ConditionValue getMemberAccount() {
        if (_memberAccount == null) { _memberAccount = nCV(); }
        return _memberAccount;
    }
    protected ConditionValue getCValueMemberAccount() { return getMemberAccount(); }

    /** 
     * Add order-by as ascend. <br />
     * MEMBER_ACCOUNT: {UQ, NotNull, VARCHAR(50)}
     * @return this. (NotNull)
     */
    public MbBsMemberCQ addOrderBy_MemberAccount_Asc() { regOBA("MEMBER_ACCOUNT"); return this; }

    /**
     * Add order-by as descend. <br />
     * MEMBER_ACCOUNT: {UQ, NotNull, VARCHAR(50)}
     * @return this. (NotNull)
     */
    public MbBsMemberCQ addOrderBy_MemberAccount_Desc() { regOBD("MEMBER_ACCOUNT"); return this; }

    protected ConditionValue _memberStatusCode;
    public ConditionValue getMemberStatusCode() {
        if (_memberStatusCode == null) { _memberStatusCode = nCV(); }
        return _memberStatusCode;
    }
    protected ConditionValue getCValueMemberStatusCode() { return getMemberStatusCode(); }

    protected Map<String, MbMemberStatusCQ> _memberStatusCode_InScopeRelation_MemberStatusMap;
    public Map<String, MbMemberStatusCQ> getMemberStatusCode_InScopeRelation_MemberStatus() { return _memberStatusCode_InScopeRelation_MemberStatusMap; }
    public String keepMemberStatusCode_InScopeRelation_MemberStatus(MbMemberStatusCQ sq) {
        if (_memberStatusCode_InScopeRelation_MemberStatusMap == null) { _memberStatusCode_InScopeRelation_MemberStatusMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_memberStatusCode_InScopeRelation_MemberStatusMap.size() + 1);
        _memberStatusCode_InScopeRelation_MemberStatusMap.put(ky, sq); return "memberStatusCode_InScopeRelation_MemberStatus." + ky;
    }

    protected Map<String, MbMemberStatusCQ> _memberStatusCode_NotInScopeRelation_MemberStatusMap;
    public Map<String, MbMemberStatusCQ> getMemberStatusCode_NotInScopeRelation_MemberStatus() { return _memberStatusCode_NotInScopeRelation_MemberStatusMap; }
    public String keepMemberStatusCode_NotInScopeRelation_MemberStatus(MbMemberStatusCQ sq) {
        if (_memberStatusCode_NotInScopeRelation_MemberStatusMap == null) { _memberStatusCode_NotInScopeRelation_MemberStatusMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_memberStatusCode_NotInScopeRelation_MemberStatusMap.size() + 1);
        _memberStatusCode_NotInScopeRelation_MemberStatusMap.put(ky, sq); return "memberStatusCode_NotInScopeRelation_MemberStatus." + ky;
    }

    /** 
     * Add order-by as ascend. <br />
     * MEMBER_STATUS_CODE: {IX, NotNull, CHAR(3), FK to MEMBER_STATUS, classification=MemberStatus}
     * @return this. (NotNull)
     */
    public MbBsMemberCQ addOrderBy_MemberStatusCode_Asc() { regOBA("MEMBER_STATUS_CODE"); return this; }

    /**
     * Add order-by as descend. <br />
     * MEMBER_STATUS_CODE: {IX, NotNull, CHAR(3), FK to MEMBER_STATUS, classification=MemberStatus}
     * @return this. (NotNull)
     */
    public MbBsMemberCQ addOrderBy_MemberStatusCode_Desc() { regOBD("MEMBER_STATUS_CODE"); return this; }

    protected ConditionValue _formalizedDatetime;
    public ConditionValue getFormalizedDatetime() {
        if (_formalizedDatetime == null) { _formalizedDatetime = nCV(); }
        return _formalizedDatetime;
    }
    protected ConditionValue getCValueFormalizedDatetime() { return getFormalizedDatetime(); }

    /** 
     * Add order-by as ascend. <br />
     * FORMALIZED_DATETIME: {IX, TIMESTAMP(23, 10)}
     * @return this. (NotNull)
     */
    public MbBsMemberCQ addOrderBy_FormalizedDatetime_Asc() { regOBA("FORMALIZED_DATETIME"); return this; }

    /**
     * Add order-by as descend. <br />
     * FORMALIZED_DATETIME: {IX, TIMESTAMP(23, 10)}
     * @return this. (NotNull)
     */
    public MbBsMemberCQ addOrderBy_FormalizedDatetime_Desc() { regOBD("FORMALIZED_DATETIME"); return this; }

    protected ConditionValue _birthdate;
    public ConditionValue getBirthdate() {
        if (_birthdate == null) { _birthdate = nCV(); }
        return _birthdate;
    }
    protected ConditionValue getCValueBirthdate() { return getBirthdate(); }

    /** 
     * Add order-by as ascend. <br />
     * BIRTHDATE: {DATE(8)}
     * @return this. (NotNull)
     */
    public MbBsMemberCQ addOrderBy_Birthdate_Asc() { regOBA("BIRTHDATE"); return this; }

    /**
     * Add order-by as descend. <br />
     * BIRTHDATE: {DATE(8)}
     * @return this. (NotNull)
     */
    public MbBsMemberCQ addOrderBy_Birthdate_Desc() { regOBD("BIRTHDATE"); return this; }

    protected ConditionValue _registerDatetime;
    public ConditionValue getRegisterDatetime() {
        if (_registerDatetime == null) { _registerDatetime = nCV(); }
        return _registerDatetime;
    }
    protected ConditionValue getCValueRegisterDatetime() { return getRegisterDatetime(); }

    /** 
     * Add order-by as ascend. <br />
     * REGISTER_DATETIME: {NotNull, TIMESTAMP(23, 10)}
     * @return this. (NotNull)
     */
    public MbBsMemberCQ addOrderBy_RegisterDatetime_Asc() { regOBA("REGISTER_DATETIME"); return this; }

    /**
     * Add order-by as descend. <br />
     * REGISTER_DATETIME: {NotNull, TIMESTAMP(23, 10)}
     * @return this. (NotNull)
     */
    public MbBsMemberCQ addOrderBy_RegisterDatetime_Desc() { regOBD("REGISTER_DATETIME"); return this; }

    protected ConditionValue _registerUser;
    public ConditionValue getRegisterUser() {
        if (_registerUser == null) { _registerUser = nCV(); }
        return _registerUser;
    }
    protected ConditionValue getCValueRegisterUser() { return getRegisterUser(); }

    /** 
     * Add order-by as ascend. <br />
     * REGISTER_USER: {NotNull, VARCHAR(200)}
     * @return this. (NotNull)
     */
    public MbBsMemberCQ addOrderBy_RegisterUser_Asc() { regOBA("REGISTER_USER"); return this; }

    /**
     * Add order-by as descend. <br />
     * REGISTER_USER: {NotNull, VARCHAR(200)}
     * @return this. (NotNull)
     */
    public MbBsMemberCQ addOrderBy_RegisterUser_Desc() { regOBD("REGISTER_USER"); return this; }

    protected ConditionValue _updateDatetime;
    public ConditionValue getUpdateDatetime() {
        if (_updateDatetime == null) { _updateDatetime = nCV(); }
        return _updateDatetime;
    }
    protected ConditionValue getCValueUpdateDatetime() { return getUpdateDatetime(); }

    /** 
     * Add order-by as ascend. <br />
     * UPDATE_DATETIME: {NotNull, TIMESTAMP(23, 10)}
     * @return this. (NotNull)
     */
    public MbBsMemberCQ addOrderBy_UpdateDatetime_Asc() { regOBA("UPDATE_DATETIME"); return this; }

    /**
     * Add order-by as descend. <br />
     * UPDATE_DATETIME: {NotNull, TIMESTAMP(23, 10)}
     * @return this. (NotNull)
     */
    public MbBsMemberCQ addOrderBy_UpdateDatetime_Desc() { regOBD("UPDATE_DATETIME"); return this; }

    protected ConditionValue _updateUser;
    public ConditionValue getUpdateUser() {
        if (_updateUser == null) { _updateUser = nCV(); }
        return _updateUser;
    }
    protected ConditionValue getCValueUpdateUser() { return getUpdateUser(); }

    /** 
     * Add order-by as ascend. <br />
     * UPDATE_USER: {NotNull, VARCHAR(200)}
     * @return this. (NotNull)
     */
    public MbBsMemberCQ addOrderBy_UpdateUser_Asc() { regOBA("UPDATE_USER"); return this; }

    /**
     * Add order-by as descend. <br />
     * UPDATE_USER: {NotNull, VARCHAR(200)}
     * @return this. (NotNull)
     */
    public MbBsMemberCQ addOrderBy_UpdateUser_Desc() { regOBD("UPDATE_USER"); return this; }

    protected ConditionValue _versionNo;
    public ConditionValue getVersionNo() {
        if (_versionNo == null) { _versionNo = nCV(); }
        return _versionNo;
    }
    protected ConditionValue getCValueVersionNo() { return getVersionNo(); }

    /** 
     * Add order-by as ascend. <br />
     * VERSION_NO: {NotNull, BIGINT(19)}
     * @return this. (NotNull)
     */
    public MbBsMemberCQ addOrderBy_VersionNo_Asc() { regOBA("VERSION_NO"); return this; }

    /**
     * Add order-by as descend. <br />
     * VERSION_NO: {NotNull, BIGINT(19)}
     * @return this. (NotNull)
     */
    public MbBsMemberCQ addOrderBy_VersionNo_Desc() { regOBD("VERSION_NO"); return this; }

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
    public MbBsMemberCQ addSpecifiedDerivedOrderBy_Asc(String aliasName)
    { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }

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
    public MbBsMemberCQ addSpecifiedDerivedOrderBy_Desc(String aliasName)
    { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

    // ===================================================================================
    //                                                                         Union Query
    //                                                                         ===========
    public void reflectRelationOnUnionQuery(ConditionQuery bqs, ConditionQuery uqs) {
        MbMemberCQ bq = (MbMemberCQ)bqs;
        MbMemberCQ uq = (MbMemberCQ)uqs;
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
    public MbMemberStatusCQ queryMemberStatus() {
        return getConditionQueryMemberStatus();
    }
    protected MbMemberStatusCQ _conditionQueryMemberStatus;
    public MbMemberStatusCQ getConditionQueryMemberStatus() {
        if (_conditionQueryMemberStatus == null) {
            _conditionQueryMemberStatus = xcreateQueryMemberStatus();
            xsetupOuterJoinMemberStatus();
        }
        return _conditionQueryMemberStatus;
    }
    protected MbMemberStatusCQ xcreateQueryMemberStatus() {
        String nrp = resolveNextRelationPath("MEMBER", "memberStatus");
        String jan = resolveJoinAliasName(nrp, xgetNextNestLevel());
        MbMemberStatusCQ cq = new MbMemberStatusCQ(this, xgetSqlClause(), jan, xgetNextNestLevel());
        cq.xsetBaseCB(_baseCB);
        cq.xsetForeignPropertyName("memberStatus");
        cq.xsetRelationPath(nrp); return cq;
    }
    protected void xsetupOuterJoinMemberStatus() {
        MbMemberStatusCQ cq = getConditionQueryMemberStatus();
        Map<String, String> joinOnMap = newLinkedHashMapSized(4);
        joinOnMap.put("MEMBER_STATUS_CODE", "MEMBER_STATUS_CODE");
        registerOuterJoin(cq, joinOnMap, "memberStatus");
    }
    public boolean hasConditionQueryMemberStatus() {
        return _conditionQueryMemberStatus != null;
    }

    /**
     * Get the condition-query for relation table. <br />
     * MEMBER_LOGIN by my MEMBER_ID, named 'memberLoginAsLatest'.
     * @return The instance of condition-query. (NotNull)
     */
    public MbMemberLoginCQ queryMemberLoginAsLatest() {
        return getConditionQueryMemberLoginAsLatest();
    }
    protected MbMemberLoginCQ _conditionQueryMemberLoginAsLatest;
    public MbMemberLoginCQ getConditionQueryMemberLoginAsLatest() {
        if (_conditionQueryMemberLoginAsLatest == null) {
            _conditionQueryMemberLoginAsLatest = xcreateQueryMemberLoginAsLatest();
            xsetupOuterJoinMemberLoginAsLatest();
        }
        return _conditionQueryMemberLoginAsLatest;
    }
    protected MbMemberLoginCQ xcreateQueryMemberLoginAsLatest() {
        String nrp = resolveNextRelationPath("MEMBER", "memberLoginAsLatest");
        String jan = resolveJoinAliasName(nrp, xgetNextNestLevel());
        MbMemberLoginCQ cq = new MbMemberLoginCQ(this, xgetSqlClause(), jan, xgetNextNestLevel());
        cq.xsetBaseCB(_baseCB);
        cq.xsetForeignPropertyName("memberLoginAsLatest");
        cq.xsetRelationPath(nrp); return cq;
    }
    protected void xsetupOuterJoinMemberLoginAsLatest() {
        MbMemberLoginCQ cq = getConditionQueryMemberLoginAsLatest();
        Map<String, String> joinOnMap = newLinkedHashMapSized(4);
        joinOnMap.put("MEMBER_ID", "MEMBER_ID");
        registerOuterJoin(cq, joinOnMap, "memberLoginAsLatest");
    }
    public boolean hasConditionQueryMemberLoginAsLatest() {
        return _conditionQueryMemberLoginAsLatest != null;
    }

    /**
     * Get the condition-query for relation table. <br />
     * MEMBER_SECURITY by MEMBER_ID, named 'memberSecurityAsOne'.
     * @return The instance of condition-query. (NotNull)
     */
    public MbMemberSecurityCQ queryMemberSecurityAsOne() {
        return getConditionQueryMemberSecurityAsOne();
    }
    protected MbMemberSecurityCQ _conditionQueryMemberSecurityAsOne;
    public MbMemberSecurityCQ getConditionQueryMemberSecurityAsOne() {
        if (_conditionQueryMemberSecurityAsOne == null) {
            _conditionQueryMemberSecurityAsOne = xcreateQueryMemberSecurityAsOne();
            xsetupOuterJoinMemberSecurityAsOne();
        }
        return _conditionQueryMemberSecurityAsOne;
    }
    protected MbMemberSecurityCQ xcreateQueryMemberSecurityAsOne() {
        String nrp = resolveNextRelationPath("MEMBER", "memberSecurityAsOne");
        String jan = resolveJoinAliasName(nrp, xgetNextNestLevel());
        MbMemberSecurityCQ cq = new MbMemberSecurityCQ(this, xgetSqlClause(), jan, xgetNextNestLevel());
        cq.xsetBaseCB(_baseCB);
        cq.xsetForeignPropertyName("memberSecurityAsOne");
        cq.xsetRelationPath(nrp); return cq;
    }
    protected void xsetupOuterJoinMemberSecurityAsOne() {
        MbMemberSecurityCQ cq = getConditionQueryMemberSecurityAsOne();
        Map<String, String> joinOnMap = newLinkedHashMapSized(4);
        joinOnMap.put("MEMBER_ID", "MEMBER_ID");
        registerOuterJoin(cq, joinOnMap, "memberSecurityAsOne");
    }
    public boolean hasConditionQueryMemberSecurityAsOne() {
        return _conditionQueryMemberSecurityAsOne != null;
    }

    /**
     * Get the condition-query for relation table. <br />
     * MEMBER_SERVICE by MEMBER_ID, named 'memberServiceAsOne'.
     * @return The instance of condition-query. (NotNull)
     */
    public MbMemberServiceCQ queryMemberServiceAsOne() {
        return getConditionQueryMemberServiceAsOne();
    }
    protected MbMemberServiceCQ _conditionQueryMemberServiceAsOne;
    public MbMemberServiceCQ getConditionQueryMemberServiceAsOne() {
        if (_conditionQueryMemberServiceAsOne == null) {
            _conditionQueryMemberServiceAsOne = xcreateQueryMemberServiceAsOne();
            xsetupOuterJoinMemberServiceAsOne();
        }
        return _conditionQueryMemberServiceAsOne;
    }
    protected MbMemberServiceCQ xcreateQueryMemberServiceAsOne() {
        String nrp = resolveNextRelationPath("MEMBER", "memberServiceAsOne");
        String jan = resolveJoinAliasName(nrp, xgetNextNestLevel());
        MbMemberServiceCQ cq = new MbMemberServiceCQ(this, xgetSqlClause(), jan, xgetNextNestLevel());
        cq.xsetBaseCB(_baseCB);
        cq.xsetForeignPropertyName("memberServiceAsOne");
        cq.xsetRelationPath(nrp); return cq;
    }
    protected void xsetupOuterJoinMemberServiceAsOne() {
        MbMemberServiceCQ cq = getConditionQueryMemberServiceAsOne();
        Map<String, String> joinOnMap = newLinkedHashMapSized(4);
        joinOnMap.put("MEMBER_ID", "MEMBER_ID");
        registerOuterJoin(cq, joinOnMap, "memberServiceAsOne");
    }
    public boolean hasConditionQueryMemberServiceAsOne() {
        return _conditionQueryMemberServiceAsOne != null;
    }

    /**
     * Get the condition-query for relation table. <br />
     * MEMBER_WITHDRAWAL by MEMBER_ID, named 'memberWithdrawalAsOne'.
     * @return The instance of condition-query. (NotNull)
     */
    public MbMemberWithdrawalCQ queryMemberWithdrawalAsOne() {
        return getConditionQueryMemberWithdrawalAsOne();
    }
    protected MbMemberWithdrawalCQ _conditionQueryMemberWithdrawalAsOne;
    public MbMemberWithdrawalCQ getConditionQueryMemberWithdrawalAsOne() {
        if (_conditionQueryMemberWithdrawalAsOne == null) {
            _conditionQueryMemberWithdrawalAsOne = xcreateQueryMemberWithdrawalAsOne();
            xsetupOuterJoinMemberWithdrawalAsOne();
        }
        return _conditionQueryMemberWithdrawalAsOne;
    }
    protected MbMemberWithdrawalCQ xcreateQueryMemberWithdrawalAsOne() {
        String nrp = resolveNextRelationPath("MEMBER", "memberWithdrawalAsOne");
        String jan = resolveJoinAliasName(nrp, xgetNextNestLevel());
        MbMemberWithdrawalCQ cq = new MbMemberWithdrawalCQ(this, xgetSqlClause(), jan, xgetNextNestLevel());
        cq.xsetBaseCB(_baseCB);
        cq.xsetForeignPropertyName("memberWithdrawalAsOne");
        cq.xsetRelationPath(nrp); return cq;
    }
    protected void xsetupOuterJoinMemberWithdrawalAsOne() {
        MbMemberWithdrawalCQ cq = getConditionQueryMemberWithdrawalAsOne();
        Map<String, String> joinOnMap = newLinkedHashMapSized(4);
        joinOnMap.put("MEMBER_ID", "MEMBER_ID");
        registerOuterJoin(cq, joinOnMap, "memberWithdrawalAsOne");
    }
    public boolean hasConditionQueryMemberWithdrawalAsOne() {
        return _conditionQueryMemberWithdrawalAsOne != null;
    }

    protected Map<String, Object> xfindFixedConditionDynamicParameterMap(String property) {
        return null;
    }

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    protected Map<String, MbMemberCQ> _scalarConditionMap;
    public Map<String, MbMemberCQ> getScalarCondition() { return _scalarConditionMap; }
    public String keepScalarCondition(MbMemberCQ sq) {
        if (_scalarConditionMap == null) { _scalarConditionMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_scalarConditionMap.size() + 1);
        _scalarConditionMap.put(ky, sq); return "scalarCondition." + ky;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    protected Map<String, MbMemberCQ> _specifyMyselfDerivedMap;
    public Map<String, MbMemberCQ> getSpecifyMyselfDerived() { return _specifyMyselfDerivedMap; }
    public String keepSpecifyMyselfDerived(MbMemberCQ sq) {
        if (_specifyMyselfDerivedMap == null) { _specifyMyselfDerivedMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_specifyMyselfDerivedMap.size() + 1);
        _specifyMyselfDerivedMap.put(ky, sq); return "specifyMyselfDerived." + ky;
    }

    protected Map<String, MbMemberCQ> _queryMyselfDerivedMap;
    public Map<String, MbMemberCQ> getQueryMyselfDerived() { return _queryMyselfDerivedMap; }
    public String keepQueryMyselfDerived(MbMemberCQ sq) {
        if (_queryMyselfDerivedMap == null) { _queryMyselfDerivedMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_queryMyselfDerivedMap.size() + 1);
        _queryMyselfDerivedMap.put(ky, sq); return "queryMyselfDerived." + ky;
    }
    protected Map<String, Object> _qyeryMyselfDerivedParameterMap;
    public Map<String, Object> getQueryMyselfDerivedParameter() { return _qyeryMyselfDerivedParameterMap; }
    public String keepQueryMyselfDerivedParameter(Object vl) {
        if (_qyeryMyselfDerivedParameterMap == null) { _qyeryMyselfDerivedParameterMap = newLinkedHashMapSized(4); }
        String ky = "subQueryParameterKey" + (_qyeryMyselfDerivedParameterMap.size() + 1);
        _qyeryMyselfDerivedParameterMap.put(ky, vl); return "queryMyselfDerivedParameter." + ky;
    }

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    protected Map<String, MbMemberCQ> _myselfExistsMap;
    public Map<String, MbMemberCQ> getMyselfExists() { return _myselfExistsMap; }
    public String keepMyselfExists(MbMemberCQ sq) {
        if (_myselfExistsMap == null) { _myselfExistsMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_myselfExistsMap.size() + 1);
        _myselfExistsMap.put(ky, sq); return "myselfExists." + ky;
    }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    protected Map<String, MbMemberCQ> _myselfInScopeMap;
    public Map<String, MbMemberCQ> getMyselfInScope() { return _myselfInScopeMap; }
    public String keepMyselfInScope(MbMemberCQ sq) {
        if (_myselfInScopeMap == null) { _myselfInScopeMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_myselfInScopeMap.size() + 1);
        _myselfInScopeMap.put(ky, sq); return "myselfInScope." + ky;
    }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return MbMemberCB.class.getName(); }
    protected String xCQ() { return MbMemberCQ.class.getName(); }
    protected String xCHp() { return HpCalculator.class.getName(); }
    protected String xCOp() { return ConditionOption.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
