package softwareinclude.ro.securitylockandroid.model;

import android.database.sqlite.SQLiteDatabase;

import java.util.Map;

import de.greenrobot.dao.AbstractDao;
import de.greenrobot.dao.AbstractDaoSession;
import de.greenrobot.dao.identityscope.IdentityScopeType;
import de.greenrobot.dao.internal.DaoConfig;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.

/**
 * {@inheritDoc}
 * 
 * @see de.greenrobot.dao.AbstractDaoSession
 */
public class DaoSession extends AbstractDaoSession {

    private final DaoConfig accountDataModelDaoConfig;

    private final AccountDataModelDao accountDataModelDao;

    public DaoSession(SQLiteDatabase db, IdentityScopeType type, Map<Class<? extends AbstractDao<?, ?>>, DaoConfig>
            daoConfigMap) {
        super(db);

        accountDataModelDaoConfig = daoConfigMap.get(AccountDataModelDao.class).clone();
        accountDataModelDaoConfig.initIdentityScope(type);

        accountDataModelDao = new AccountDataModelDao(accountDataModelDaoConfig, this);

        registerDao(AccountDataModel.class, accountDataModelDao);
    }
    
    public void clear() {
        accountDataModelDaoConfig.getIdentityScope().clear();
    }

    public AccountDataModelDao getAccountDataModelDao() {
        return accountDataModelDao;
    }

}
