/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.liferay.gradle.plugins.extensions;

import com.liferay.gradle.plugins.internal.util.GradleUtil;

import org.gradle.api.Project;

/**
 * @author Andrea Di Giorgi
 */
public class TomcatAppServer extends AppServer {

	public TomcatAppServer(Project project) {
		super("tomcat", project);
	}

	public String getManagerPassword() {
		return GradleUtil.toString(_managerPassword);
	}

	public String getManagerUserName() {
		return GradleUtil.toString(_managerUserName);
	}

	public void setManagerPassword(Object managerPassword) {
		_managerPassword = managerPassword;
	}

	public void setManagerUserName(Object managerUserName) {
		_managerUserName = managerUserName;
	}

	private Object _managerPassword;
	private Object _managerUserName;

}