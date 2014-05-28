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
 * The base condition-query of WITHDRAWAL_REASON.
 * @author DBFlute(AutoGenerator)
 */
public class MbBsWithdrawalReasonCQ extends MbAbstractBsWithdrawalReasonCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected MbWithdrawalReasonCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public MbBsWithdrawalReasonCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br />
     * {select ... from ... left outer join (select * from WITHDRAWAL_REASON) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #DD4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public MbWithdrawalReasonCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected MbWithdrawalReasonCIQ xcreateCIQ() {
        MbWithdrawalReasonCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected MbWithdrawalReasonCIQ xnewCIQ() {
        return new MbWithdrawalReasonCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br />
     * {select ... from ... left outer join WITHDRAWAL_REASON on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #DD4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public MbWithdrawalReasonCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        MbWithdrawalReasonCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====

    protected ConditionValue _withdrawalReasonCode;
    public ConditionValue getWithdrawalReasonCode() {
        if (_withdrawalReasonCode == null) { _withdrawalReasonCode = nCV(); }
        return _withdrawalReasonCode;
    }
    protected ConditionValue getCValueWithdrawalReasonCode() { return getWithdrawalReasonCode(); }

    protected Map<String, MbMemberWithdrawalCQ> _withdrawalReasonCode_ExistsReferrer_MemberWithdrawalListMap;
    public Map<String, MbMemberWithdrawalCQ> getWithdrawalReasonCode_ExistsReferrer_MemberWithdrawalList() { return _withdrawalReasonCode_ExistsReferrer_MemberWithdrawalListMap; }
    public String keepWithdrawalReasonCode_ExistsReferrer_MemberWithdrawalList(MbMemberWithdrawalCQ sq) {
        if (_withdrawalReasonCode_ExistsReferrer_MemberWithdrawalListMap == null) { _withdrawalReasonCode_ExistsReferrer_MemberWithdrawalListMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_withdrawalReasonCode_ExistsReferrer_MemberWithdrawalListMap.size() + 1);
        _withdrawalReasonCode_ExistsReferrer_MemberWithdrawalListMap.put(ky, sq); return "withdrawalReasonCode_ExistsReferrer_MemberWithdrawalList." + ky;
    }

    protected Map<String, MbMemberWithdrawalCQ> _withdrawalReasonCode_NotExistsReferrer_MemberWithdrawalListMap;
    public Map<String, MbMemberWithdrawalCQ> getWithdrawalReasonCode_NotExistsReferrer_MemberWithdrawalList() { return _withdrawalReasonCode_NotExistsReferrer_MemberWithdrawalListMap; }
    public String keepWithdrawalReasonCode_NotExistsReferrer_MemberWithdrawalList(MbMemberWithdrawalCQ sq) {
        if (_withdrawalReasonCode_NotExistsReferrer_MemberWithdrawalListMap == null) { _withdrawalReasonCode_NotExistsReferrer_MemberWithdrawalListMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_withdrawalReasonCode_NotExistsReferrer_MemberWithdrawalListMap.size() + 1);
        _withdrawalReasonCode_NotExistsReferrer_MemberWithdrawalListMap.put(ky, sq); return "withdrawalReasonCode_NotExistsReferrer_MemberWithdrawalList." + ky;
    }

    protected Map<String, MbMemberWithdrawalCQ> _withdrawalReasonCode_InScopeRelation_MemberWithdrawalListMap;
    public Map<String, MbMemberWithdrawalCQ> getWithdrawalReasonCode_InScopeRelation_MemberWithdrawalList() { return _withdrawalReasonCode_InScopeRelation_MemberWithdrawalListMap; }
    public String keepWithdrawalReasonCode_InScopeRelation_MemberWithdrawalList(MbMemberWithdrawalCQ sq) {
        if (_withdrawalReasonCode_InScopeRelation_MemberWithdrawalListMap == null) { _withdrawalReasonCode_InScopeRelation_MemberWithdrawalListMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_withdrawalReasonCode_InScopeRelation_MemberWithdrawalListMap.size() + 1);
        _withdrawalReasonCode_InScopeRelation_MemberWithdrawalListMap.put(ky, sq); return "withdrawalReasonCode_InScopeRelation_MemberWithdrawalList." + ky;
    }

    protected Map<String, MbMemberWithdrawalCQ> _withdrawalReasonCode_NotInScopeRelation_MemberWithdrawalListMap;
    public Map<String, MbMemberWithdrawalCQ> getWithdrawalReasonCode_NotInScopeRelation_MemberWithdrawalList() { return _withdrawalReasonCode_NotInScopeRelation_MemberWithdrawalListMap; }
    public String keepWithdrawalReasonCode_NotInScopeRelation_MemberWithdrawalList(MbMemberWithdrawalCQ sq) {
        if (_withdrawalReasonCode_NotInScopeRelation_MemberWithdrawalListMap == null) { _withdrawalReasonCode_NotInScopeRelation_MemberWithdrawalListMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_withdrawalReasonCode_NotInScopeRelation_MemberWithdrawalListMap.size() + 1);
        _withdrawalReasonCode_NotInScopeRelation_MemberWithdrawalListMap.put(ky, sq); return "withdrawalReasonCode_NotInScopeRelation_MemberWithdrawalList." + ky;
    }

    protected Map<String, MbMemberWithdrawalCQ> _withdrawalReasonCode_SpecifyDerivedReferrer_MemberWithdrawalListMap;
    public Map<String, MbMemberWithdrawalCQ> getWithdrawalReasonCode_SpecifyDerivedReferrer_MemberWithdrawalList() { return _withdrawalReasonCode_SpecifyDerivedReferrer_MemberWithdrawalListMap; }
    public String keepWithdrawalReasonCode_SpecifyDerivedReferrer_MemberWithdrawalList(MbMemberWithdrawalCQ sq) {
        if (_withdrawalReasonCode_SpecifyDerivedReferrer_MemberWithdrawalListMap == null) { _withdrawalReasonCode_SpecifyDerivedReferrer_MemberWithdrawalListMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_withdrawalReasonCode_SpecifyDerivedReferrer_MemberWithdrawalListMap.size() + 1);
        _withdrawalReasonCode_SpecifyDerivedReferrer_MemberWithdrawalListMap.put(ky, sq); return "withdrawalReasonCode_SpecifyDerivedReferrer_MemberWithdrawalList." + ky;
    }

    protected Map<String, MbMemberWithdrawalCQ> _withdrawalReasonCode_QueryDerivedReferrer_MemberWithdrawalListMap;
    public Map<String, MbMemberWithdrawalCQ> getWithdrawalReasonCode_QueryDerivedReferrer_MemberWithdrawalList() { return _withdrawalReasonCode_QueryDerivedReferrer_MemberWithdrawalListMap; }
    public String keepWithdrawalReasonCode_QueryDerivedReferrer_MemberWithdrawalList(MbMemberWithdrawalCQ sq) {
        if (_withdrawalReasonCode_QueryDerivedReferrer_MemberWithdrawalListMap == null) { _withdrawalReasonCode_QueryDerivedReferrer_MemberWithdrawalListMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_withdrawalReasonCode_QueryDerivedReferrer_MemberWithdrawalListMap.size() + 1);
        _withdrawalReasonCode_QueryDerivedReferrer_MemberWithdrawalListMap.put(ky, sq); return "withdrawalReasonCode_QueryDerivedReferrer_MemberWithdrawalList." + ky;
    }
    protected Map<String, Object> _withdrawalReasonCode_QueryDerivedReferrer_MemberWithdrawalListParameterMap;
    public Map<String, Object> getWithdrawalReasonCode_QueryDerivedReferrer_MemberWithdrawalListParameter() { return _withdrawalReasonCode_QueryDerivedReferrer_MemberWithdrawalListParameterMap; }
    public String keepWithdrawalReasonCode_QueryDerivedReferrer_MemberWithdrawalListParameter(Object vl) {
        if (_withdrawalReasonCode_QueryDerivedReferrer_MemberWithdrawalListParameterMap == null) { _withdrawalReasonCode_QueryDerivedReferrer_MemberWithdrawalListParameterMap = newLinkedHashMapSized(4); }
        String ky = "subQueryParameterKey" + (_withdrawalReasonCode_QueryDerivedReferrer_MemberWithdrawalListParameterMap.size() + 1);
        _withdrawalReasonCode_QueryDerivedReferrer_MemberWithdrawalListParameterMap.put(ky, vl); return "withdrawalReasonCode_QueryDerivedReferrer_MemberWithdrawalListParameter." + ky;
    }

    /** 
     * Add order-by as ascend. <br />
     * WITHDRAWAL_REASON_CODE: {PK, NotNull, CHAR(3)}
     * @return this. (NotNull)
     */
    public MbBsWithdrawalReasonCQ addOrderBy_WithdrawalReasonCode_Asc() { regOBA("WITHDRAWAL_REASON_CODE"); return this; }

    /**
     * Add order-by as descend. <br />
     * WITHDRAWAL_REASON_CODE: {PK, NotNull, CHAR(3)}
     * @return this. (NotNull)
     */
    public MbBsWithdrawalReasonCQ addOrderBy_WithdrawalReasonCode_Desc() { regOBD("WITHDRAWAL_REASON_CODE"); return this; }

    protected ConditionValue _withdrawalReasonText;
    public ConditionValue getWithdrawalReasonText() {
        if (_withdrawalReasonText == null) { _withdrawalReasonText = nCV(); }
        return _withdrawalReasonText;
    }
    protected ConditionValue getCValueWithdrawalReasonText() { return getWithdrawalReasonText(); }

    /** 
     * Add order-by as ascend. <br />
     * WITHDRAWAL_REASON_TEXT: {NotNull, CLOB(2147483647)}
     * @return this. (NotNull)
     */
    public MbBsWithdrawalReasonCQ addOrderBy_WithdrawalReasonText_Asc() { regOBA("WITHDRAWAL_REASON_TEXT"); return this; }

    /**
     * Add order-by as descend. <br />
     * WITHDRAWAL_REASON_TEXT: {NotNull, CLOB(2147483647)}
     * @return this. (NotNull)
     */
    public MbBsWithdrawalReasonCQ addOrderBy_WithdrawalReasonText_Desc() { regOBD("WITHDRAWAL_REASON_TEXT"); return this; }

    protected ConditionValue _displayOrder;
    public ConditionValue getDisplayOrder() {
        if (_displayOrder == null) { _displayOrder = nCV(); }
        return _displayOrder;
    }
    protected ConditionValue getCValueDisplayOrder() { return getDisplayOrder(); }

    /** 
     * Add order-by as ascend. <br />
     * DISPLAY_ORDER: {UQ, NotNull, INTEGER(10)}
     * @return this. (NotNull)
     */
    public MbBsWithdrawalReasonCQ addOrderBy_DisplayOrder_Asc() { regOBA("DISPLAY_ORDER"); return this; }

    /**
     * Add order-by as descend. <br />
     * DISPLAY_ORDER: {UQ, NotNull, INTEGER(10)}
     * @return this. (NotNull)
     */
    public MbBsWithdrawalReasonCQ addOrderBy_DisplayOrder_Desc() { regOBD("DISPLAY_ORDER"); return this; }

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
    public MbBsWithdrawalReasonCQ addSpecifiedDerivedOrderBy_Asc(String aliasName)
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
    public MbBsWithdrawalReasonCQ addSpecifiedDerivedOrderBy_Desc(String aliasName)
    { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

    // ===================================================================================
    //                                                                         Union Query
    //                                                                         ===========
    public void reflectRelationOnUnionQuery(ConditionQuery bqs, ConditionQuery uqs) {
    }

    // ===================================================================================
    //                                                                       Foreign Query
    //                                                                       =============
    protected Map<String, Object> xfindFixedConditionDynamicParameterMap(String property) {
        return null;
    }

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    protected Map<String, MbWithdrawalReasonCQ> _scalarConditionMap;
    public Map<String, MbWithdrawalReasonCQ> getScalarCondition() { return _scalarConditionMap; }
    public String keepScalarCondition(MbWithdrawalReasonCQ sq) {
        if (_scalarConditionMap == null) { _scalarConditionMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_scalarConditionMap.size() + 1);
        _scalarConditionMap.put(ky, sq); return "scalarCondition." + ky;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    protected Map<String, MbWithdrawalReasonCQ> _specifyMyselfDerivedMap;
    public Map<String, MbWithdrawalReasonCQ> getSpecifyMyselfDerived() { return _specifyMyselfDerivedMap; }
    public String keepSpecifyMyselfDerived(MbWithdrawalReasonCQ sq) {
        if (_specifyMyselfDerivedMap == null) { _specifyMyselfDerivedMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_specifyMyselfDerivedMap.size() + 1);
        _specifyMyselfDerivedMap.put(ky, sq); return "specifyMyselfDerived." + ky;
    }

    protected Map<String, MbWithdrawalReasonCQ> _queryMyselfDerivedMap;
    public Map<String, MbWithdrawalReasonCQ> getQueryMyselfDerived() { return _queryMyselfDerivedMap; }
    public String keepQueryMyselfDerived(MbWithdrawalReasonCQ sq) {
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
    protected Map<String, MbWithdrawalReasonCQ> _myselfExistsMap;
    public Map<String, MbWithdrawalReasonCQ> getMyselfExists() { return _myselfExistsMap; }
    public String keepMyselfExists(MbWithdrawalReasonCQ sq) {
        if (_myselfExistsMap == null) { _myselfExistsMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_myselfExistsMap.size() + 1);
        _myselfExistsMap.put(ky, sq); return "myselfExists." + ky;
    }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    protected Map<String, MbWithdrawalReasonCQ> _myselfInScopeMap;
    public Map<String, MbWithdrawalReasonCQ> getMyselfInScope() { return _myselfInScopeMap; }
    public String keepMyselfInScope(MbWithdrawalReasonCQ sq) {
        if (_myselfInScopeMap == null) { _myselfInScopeMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_myselfInScopeMap.size() + 1);
        _myselfInScopeMap.put(ky, sq); return "myselfInScope." + ky;
    }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return MbWithdrawalReasonCB.class.getName(); }
    protected String xCQ() { return MbWithdrawalReasonCQ.class.getName(); }
    protected String xCHp() { return HpCalculator.class.getName(); }
    protected String xCOp() { return ConditionOption.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
