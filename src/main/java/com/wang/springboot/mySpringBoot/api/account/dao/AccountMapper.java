/**   
* @Title: AccountDao.java 
* @Package com.wang.springboot.mySpringBoot.api.account.dao 
* @Description: TODO(用一句话描述该文件做什么) 
* @author River.W   
* @date 2016年2月6日 上午1:38:55 
* @version V1.0   
*/
package com.wang.springboot.mySpringBoot.api.account.dao;

import com.wang.springboot.mySpringBoot.api.account.domain.Account;
import com.wang.springboot.mySpringBoot.api.account.domain.AccountCriteria;
import com.wang.springboot.mySpringBoot.base.dao.BaseDao;

/**
 * @ClassName: AccountDao
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @Company:
 * @author River.W
 * @date 2016年2月6日 上午1:38:55
 * 
 */
public interface AccountMapper extends BaseDao<Account, AccountCriteria, String> {

}
