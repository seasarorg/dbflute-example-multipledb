/*
 * Copyright(c) DBFlute TestCo.,TestLtd. All Rights Reserved.
 */package com.example.dbflute.multipledb.seasar.dbflute.librarydb.bsentity.dbmeta;

import java.util.List;
import java.util.Map;

import org.seasar.dbflute.DBDef;
import org.seasar.dbflute.Entity;
import org.seasar.dbflute.dbmeta.AbstractDBMeta;
import org.seasar.dbflute.dbmeta.info.*;
import org.seasar.dbflute.dbmeta.name.*;
import org.seasar.dbflute.dbmeta.property.PropertyGateway;
import com.example.dbflute.multipledb.seasar.dbflute.librarydb.allcommon.*;
import com.example.dbflute.multipledb.seasar.dbflute.librarydb.exentity.*;

/**
 * The DB meta of PUBLISHER. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class LdPublisherDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final LdPublisherDbm _instance = new LdPublisherDbm();
    private LdPublisherDbm() {}
    public static LdPublisherDbm getInstance() { return _instance; }

    // ===================================================================================
    //                                                                       Current DBDef
    //                                                                       =============
    public DBDef getCurrentDBDef() { return LdDBCurrent.getInstance().currentDBDef(); }

    // ===================================================================================
    //                                                                    Property Gateway
    //                                                                    ================
    // -----------------------------------------------------
    //                                       Column Property
    //                                       ---------------
    protected final Map<String, PropertyGateway> _epgMap = newHashMap();
    {
        setupEpg(_epgMap, new EpgPublisherId(), "publisherId");
        setupEpg(_epgMap, new EpgPublisherName(), "publisherName");
        setupEpg(_epgMap, new EpgRUser(), "RUser");
        setupEpg(_epgMap, new EpgRModule(), "RModule");
        setupEpg(_epgMap, new EpgRTimestamp(), "RTimestamp");
        setupEpg(_epgMap, new EpgUUser(), "UUser");
        setupEpg(_epgMap, new EpgUModule(), "UModule");
        setupEpg(_epgMap, new EpgUTimestamp(), "UTimestamp");
    }
    public static class EpgPublisherId implements PropertyGateway {
        public Object read(Entity et) { return ((LdPublisher)et).getPublisherId(); }
        public void write(Entity et, Object vl) { ((LdPublisher)et).setPublisherId(cti(vl)); }
    }
    public static class EpgPublisherName implements PropertyGateway {
        public Object read(Entity et) { return ((LdPublisher)et).getPublisherName(); }
        public void write(Entity et, Object vl) { ((LdPublisher)et).setPublisherName((String)vl); }
    }
    public static class EpgRUser implements PropertyGateway {
        public Object read(Entity et) { return ((LdPublisher)et).getRUser(); }
        public void write(Entity et, Object vl) { ((LdPublisher)et).setRUser((String)vl); }
    }
    public static class EpgRModule implements PropertyGateway {
        public Object read(Entity et) { return ((LdPublisher)et).getRModule(); }
        public void write(Entity et, Object vl) { ((LdPublisher)et).setRModule((String)vl); }
    }
    public static class EpgRTimestamp implements PropertyGateway {
        public Object read(Entity et) { return ((LdPublisher)et).getRTimestamp(); }
        public void write(Entity et, Object vl) { ((LdPublisher)et).setRTimestamp((java.sql.Timestamp)vl); }
    }
    public static class EpgUUser implements PropertyGateway {
        public Object read(Entity et) { return ((LdPublisher)et).getUUser(); }
        public void write(Entity et, Object vl) { ((LdPublisher)et).setUUser((String)vl); }
    }
    public static class EpgUModule implements PropertyGateway {
        public Object read(Entity et) { return ((LdPublisher)et).getUModule(); }
        public void write(Entity et, Object vl) { ((LdPublisher)et).setUModule((String)vl); }
    }
    public static class EpgUTimestamp implements PropertyGateway {
        public Object read(Entity et) { return ((LdPublisher)et).getUTimestamp(); }
        public void write(Entity et, Object vl) { ((LdPublisher)et).setUTimestamp((java.sql.Timestamp)vl); }
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "PUBLISHER";
    protected final String _tablePropertyName = "publisher";
    protected final TableSqlName _tableSqlName = new TableSqlName("PUBLISHER", _tableDbName);
    { _tableSqlName.xacceptFilter(LdDBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnPublisherId = cci("PUBLISHER_ID", "PUBLISHER_ID", null, null, Integer.class, "publisherId", null, true, true, true, "INTEGER", 10, 0, "GENERATED_BY_DEFAULT", false, null, null, null, "bookList", null);
    protected final ColumnInfo _columnPublisherName = cci("PUBLISHER_NAME", "PUBLISHER_NAME", null, null, String.class, "publisherName", null, false, false, true, "VARCHAR", 80, 0, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnRUser = cci("R_USER", "R_USER", null, null, String.class, "RUser", null, false, false, true, "VARCHAR", 100, 0, "default-user", true, null, null, null, null, null);
    protected final ColumnInfo _columnRModule = cci("R_MODULE", "R_MODULE", null, null, String.class, "RModule", null, false, false, true, "VARCHAR", 100, 0, "default-module", true, null, null, null, null, LdCDef.DefMeta.RegisterModuleType);
    protected final ColumnInfo _columnRTimestamp = cci("R_TIMESTAMP", "R_TIMESTAMP", null, null, java.sql.Timestamp.class, "RTimestamp", null, false, false, true, "TIMESTAMP", 26, 6, "CURRENT_TIMESTAMP", true, null, null, null, null, null);
    protected final ColumnInfo _columnUUser = cci("U_USER", "U_USER", null, null, String.class, "UUser", null, false, false, true, "VARCHAR", 100, 0, "default-user", true, null, null, null, null, null);
    protected final ColumnInfo _columnUModule = cci("U_MODULE", "U_MODULE", null, null, String.class, "UModule", null, false, false, true, "VARCHAR", 100, 0, "default-module", true, null, null, null, null, LdCDef.DefMeta.UpdateModuleType);
    protected final ColumnInfo _columnUTimestamp = cci("U_TIMESTAMP", "U_TIMESTAMP", null, null, java.sql.Timestamp.class, "UTimestamp", null, false, false, true, "TIMESTAMP", 26, 6, "CURRENT_TIMESTAMP", true, OptimisticLockType.UPDATE_DATE, null, null, null, null);

    /**
     * PUBLISHER_ID: {PK, ID, NotNull, INTEGER(10)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPublisherId() { return _columnPublisherId; }
    /**
     * PUBLISHER_NAME: {NotNull, VARCHAR(80)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPublisherName() { return _columnPublisherName; }
    /**
     * R_USER: {NotNull, VARCHAR(100), default=[default-user]}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnRUser() { return _columnRUser; }
    /**
     * R_MODULE: {NotNull, VARCHAR(100), default=[default-module], classification=RegisterModuleType}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnRModule() { return _columnRModule; }
    /**
     * R_TIMESTAMP: {NotNull, TIMESTAMP(26, 6), default=[CURRENT_TIMESTAMP]}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnRTimestamp() { return _columnRTimestamp; }
    /**
     * U_USER: {NotNull, VARCHAR(100), default=[default-user]}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnUUser() { return _columnUUser; }
    /**
     * U_MODULE: {NotNull, VARCHAR(100), default=[default-module], classification=UpdateModuleType}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnUModule() { return _columnUModule; }
    /**
     * U_TIMESTAMP: {NotNull, TIMESTAMP(26, 6), default=[CURRENT_TIMESTAMP]}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnUTimestamp() { return _columnUTimestamp; }

    protected List<ColumnInfo> ccil() {
        List<ColumnInfo> ls = newArrayList();
        ls.add(columnPublisherId());
        ls.add(columnPublisherName());
        ls.add(columnRUser());
        ls.add(columnRModule());
        ls.add(columnRTimestamp());
        ls.add(columnUUser());
        ls.add(columnUModule());
        ls.add(columnUTimestamp());
        return ls;
    }

    { initializeInformationResource(); }

    // ===================================================================================
    //                                                                         Unique Info
    //                                                                         ===========
    // -----------------------------------------------------
    //                                       Primary Element
    //                                       ---------------
    protected UniqueInfo cpui() { return hpcpui(columnPublisherId()); }
    public boolean hasPrimaryKey() { return true; }
    public boolean hasCompoundPrimaryKey() { return false; }

    // ===================================================================================
    //                                                                       Relation Info
    //                                                                       =============
    // cannot cache because it uses related DB meta instance while booting
    // (instead, cached by super's collection)
    // -----------------------------------------------------
    //                                      Foreign Property
    //                                      ----------------

    // -----------------------------------------------------
    //                                     Referrer Property
    //                                     -----------------
    /**
     * BOOK by PUBLISHER_ID, named 'bookList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerBookList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnPublisherId(), LdBookDbm.getInstance().columnPublisherId());
        return cri("FK_BOOK_PUBLISHER", "bookList", this, LdBookDbm.getInstance(), mp, false, "publisher");
    }

    // ===================================================================================
    //                                                                        Various Info
    //                                                                        ============
    public boolean hasIdentity() { return true; }
    public boolean hasUpdateDate() { return true; }
    public ColumnInfo getUpdateDateColumnInfo() { return _columnUTimestamp; }
    public boolean hasCommonColumn() { return true; }
    public List<ColumnInfo> getCommonColumnInfoList()
    { return newArrayList(columnRUser(), columnRModule(), columnRTimestamp(), columnUUser(), columnUModule(), columnUTimestamp()); }
    public List<ColumnInfo> getCommonColumnInfoBeforeInsertList()
    { return newArrayList(columnRUser(), columnRModule(), columnRTimestamp(), columnUUser(), columnUModule()); }
    public List<ColumnInfo> getCommonColumnInfoBeforeUpdateList()
    { return newArrayList(columnUUser(), columnUModule()); }

    // ===================================================================================
    //                                                                           Type Name
    //                                                                           =========
    public String getEntityTypeName() { return "com.example.dbflute.multipledb.seasar.dbflute.librarydb.exentity.LdPublisher"; }
    public String getConditionBeanTypeName() { return "com.example.dbflute.multipledb.seasar.dbflute.librarydb.cbean.LdPublisherCB"; }
    public String getBehaviorTypeName() { return "com.example.dbflute.multipledb.seasar.dbflute.librarydb.exbhv.LdPublisherBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<LdPublisher> getEntityType() { return LdPublisher.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public LdPublisher newEntity() { return new LdPublisher(); }
    public LdPublisher newMyEntity() { return new LdPublisher(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((LdPublisher)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((LdPublisher)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
