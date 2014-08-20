package softwareinclude.ro.securitylockandroid.model;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteStatement;

import de.greenrobot.dao.AbstractDao;
import de.greenrobot.dao.Property;
import de.greenrobot.dao.internal.DaoConfig;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.
/** 
 * DAO for table ACCOUNT_DATA_MODEL.
*/
public class AccountDataModelDao extends AbstractDao<AccountDataModel, Long> {

    public static final String TABLENAME = "ACCOUNT_DATA_MODEL";

    /**
     * Properties of entity AccountDataModel.<br/>
     * Can be used for QueryBuilder and for referencing column names.
    */
    public static class Properties {
        public final static Property Id = new Property(0, Long.class, "id", true, "_id");
        public final static Property AccountName = new Property(1, String.class, "accountName", false, "ACCOUNT_NAME");
        public final static Property AccountPassword = new Property(2, String.class, "accountPassword", false, "ACCOUNT_PASSWORD");
        public final static Property AccountDetails = new Property(3, String.class, "accountDetails", false, "ACCOUNT_DETAILS");
    };


    public AccountDataModelDao(DaoConfig config) {
        super(config);
    }
    
    public AccountDataModelDao(DaoConfig config, DaoSession daoSession) {
        super(config, daoSession);
    }

    /** Creates the underlying database table. */
    public static void createTable(SQLiteDatabase db, boolean ifNotExists) {
        String constraint = ifNotExists? "IF NOT EXISTS ": "";
        db.execSQL("CREATE TABLE " + constraint + "'ACCOUNT_DATA_MODEL' (" + //
                "'_id' INTEGER PRIMARY KEY AUTOINCREMENT ," + // 0: id
                "'ACCOUNT_NAME' TEXT NOT NULL ," + // 1: accountName
                "'ACCOUNT_PASSWORD' TEXT NOT NULL ," + // 2: accountPassword
                "'ACCOUNT_DETAILS' TEXT NOT NULL );"); // 3: accountDetails
    }

    /** Drops the underlying database table. */
    public static void dropTable(SQLiteDatabase db, boolean ifExists) {
        String sql = "DROP TABLE " + (ifExists ? "IF EXISTS " : "") + "'ACCOUNT_DATA_MODEL'";
        db.execSQL(sql);
    }

    /** @inheritdoc */
    @Override
    protected void bindValues(SQLiteStatement stmt, AccountDataModel entity) {
        stmt.clearBindings();
 
        Long id = entity.getId();
        if (id != null) {
            stmt.bindLong(1, id);
        }
        stmt.bindString(2, entity.getAccountName());
        stmt.bindString(3, entity.getAccountPassword());
        stmt.bindString(4, entity.getAccountDetails());
    }

    /** @inheritdoc */
    @Override
    public Long readKey(Cursor cursor, int offset) {
        return cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0);
    }    

    /** @inheritdoc */
    @Override
    public AccountDataModel readEntity(Cursor cursor, int offset) {
        AccountDataModel entity = new AccountDataModel( //
            cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0), // id
            cursor.getString(offset + 1), // accountName
            cursor.getString(offset + 2), // accountPassword
            cursor.getString(offset + 3) // accountDetails
        );
        return entity;
    }
     
    /** @inheritdoc */
    @Override
    public void readEntity(Cursor cursor, AccountDataModel entity, int offset) {
        entity.setId(cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0));
        entity.setAccountName(cursor.getString(offset + 1));
        entity.setAccountPassword(cursor.getString(offset + 2));
        entity.setAccountDetails(cursor.getString(offset + 3));
     }
    
    /** @inheritdoc */
    @Override
    protected Long updateKeyAfterInsert(AccountDataModel entity, long rowId) {
        entity.setId(rowId);
        return rowId;
    }
    
    /** @inheritdoc */
    @Override
    public Long getKey(AccountDataModel entity) {
        if(entity != null) {
            return entity.getId();
        } else {
            return null;
        }
    }

    /** @inheritdoc */
    @Override    
    protected boolean isEntityUpdateable() {
        return true;
    }
    
}
