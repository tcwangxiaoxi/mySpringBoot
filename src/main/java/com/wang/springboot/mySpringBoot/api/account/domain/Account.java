/**   
* @Title: Account.java 
* @Package com.wang.springboot.mySpringBoot.api.account.domain 
* @Description: TODO(用一句话描述该文件做什么) 
* @author River.W   
* @date 2016年2月6日 上午12:44:29 
* @version V1.0   
*/
package com.wang.springboot.mySpringBoot.api.account.domain;

import java.io.Serializable;

import com.wang.springboot.mySpringBoot.base.domain.AbstractAuditingEntity;

/**
 * @ClassName: Account
 * @Description: 用户对象
 * @Company:
 * @author River.W
 * @date 2016年2月6日 上午12:44:29
 * 
 */
public class Account extends AbstractAuditingEntity implements Serializable {
	/**
	 * @Fields serialVersionUID : TODO(用一句话描述这个变量表示什么)
	 */
	private static final long serialVersionUID = -2717785170437637556L;

	private String id;
	private String name;
	private String email;
	private String password;
	private boolean activated;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public boolean isActivated() {
		return activated;
	}

	public void setActivated(boolean activated) {
		this.activated = activated;
	}

	/**
	 * <p>
	 * Title:
	 * </p>
	 * <p>
	 * Description:
	 * </p>
	 */
	public Account() {
		super();
	}

	/**
	 * <p>
	 * Title:
	 * </p>
	 * <p>
	 * Description:
	 * </p>
	 * 
	 * @param id
	 * @param name
	 * @param email
	 * @param password
	 * @param activated
	 */
	public Account(String id, String name, String email, String password, boolean activated) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.password = password;
		this.activated = activated;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(getClass().getSimpleName()).append(" [").append("Hash = ").append(hashCode()).append(", id=")
				.append(id).append(", name=").append(name).append(", password=").append(password).append(", email=")
				.append(email).append(", activated=").append(activated).append(", serialVersionUID=")
				.append(serialVersionUID).append("]");
		return sb.toString();
	}
}
